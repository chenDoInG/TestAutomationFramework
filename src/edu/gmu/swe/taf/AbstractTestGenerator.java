/**
 * 
 */
package edu.gmu.swe.taf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.w3c.dom.NodeList;

import coverage.graph.Edge;
import coverage.graph.Graph;
import coverage.graph.GraphUtil;
import coverage.graph.InvalidGraphException;
import coverage.graph.Node;
import coverage.graph.Path;
import coverage.web.InvalidInputException;
import edu.gmu.swe.taf.util.JavaSupporter;

/**
 * A class that generates abstract tests (that is, test paths) based on UML models
 * 
 * @author Nan Li
 * @version 1.0 Nov 28, 2012
 *
 */
public class AbstractTestGenerator {
	String globalDirectory = "Users/nli/Documents/workspace/github/TestAutomationFramework/";
	String tempTestDirectory = "testData/test/temp/";
	String tempTestName = "tempTest";

	//Maps a transition to the mappings
	private HashMap<Transition, List<Mapping>> hashedTransitionMappings;
	
	/**
	 * Constructs an AbstractTestGenerator with no detailed directories
	 */
	public AbstractTestGenerator() {
		hashedTransitionMappings = new HashMap<Transition, List<Mapping>>();
	}
	
	/**
	 * Constructs an AbstractTestGenerator with the global directory
	 */
	public AbstractTestGenerator(String globalDirectory) {
		this.globalDirectory = globalDirectory;
		hashedTransitionMappings = new HashMap<Transition, List<Mapping>>();
	}
	
	/**
	 * Generates test paths to satisfy the edge coverage criterion
	 * 
	 * @param edges				edges of a control flow graph in a String format "1 2 \n 2 3 \n"
	 * @param initialNodes		initial nodes of a control flow graph in a String format "1 2 ... etc."
	 * @param finalNodes		final nodes of a control flow graph in a String format "1 2 ... etc."
	 * @return a list of {@link coverage.graph.Path} objects that satisfy edge coverage
	 * @throws InvalidInputException
	 * @throws InvalidGraphException
	 */
	public static List<Path> getTestPathsForEdgeCoverage(String edges, String initialNodes, String finalNodes) throws InvalidInputException, InvalidGraphException{
		
		Graph g = GraphUtil.readGraph(edges, initialNodes, finalNodes);
		try {
			g.validate();
		} catch (InvalidGraphException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return g.findEdgeCoverage();	
	}
	
	/**
	 * Transforms a {@link coverage.graph.Path} to a list of {@link org.eclipse.uml2.uml.Vertex} in a UML state machine
	 * 
	 * @param path			a path of a control flow graph in a String format "1, 2, 3, ... etc."
	 * @param stateMachine	a StateMachineAccessor object
	 * @return a list of {@link org.eclipse.uml2.uml.Vertex}
	 */
	public static List<Vertex> getPathByState(Path path, StateMachineAccessor stateMachine){
		List<Vertex> vertices = new ArrayList<Vertex>();
		Iterator<Node> nodes = path.getNodeIterator();
		
		while(nodes.hasNext()){
			Node node = nodes.next();
			vertices.add(stateMachine.getReversedStateMappings().get(node.toString()));			
		}
		return vertices;		
	}
	
	/**
	 * Transforms a list of {@link org.eclipse.uml2.uml.Vertex} to a list of {@link org.eclipse.uml2.uml.Transition}s in a UML state machine
	 * @param vertices		a list of {@link org.eclipse.uml2.uml.Vertex}
	 * @param stateMachine	a {@link StateMachineAccessor} object
	 * @return	a list of {@link org.eclipse.uml2.uml.Transition}s
	 */
	public List<Transition> convertVerticesToTransitions(List<Vertex> vertices, StateMachineAccessor stateMachine){
		List<Mapping> mappings = new ArrayList<Mapping>();
		List<Transition> transitions = new ArrayList<Transition>();
		
		for(int i = 0; i < vertices.size();){
			Vertex source = vertices.get(i);
			if(i == vertices.size() - 1)
				break;
			else
				i++;
			
			Vertex destination = vertices.get(i);
			for(Transition transition: source.getOutgoings()){
				if(transition.getTarget().getName().equals(destination.getName())){
					transitions.add(transition);
					break;//a bug is fixed; without break statement, extra transitions may be added
				}
			}
		}
		return transitions;
	}
	
	/**
	 * Generates tests from the paths of a graph
	 * 
	 * @param paths			a list of {@link coverage.graph.Path}
	 * @param modelAccessor	a {@link StateMachineAccessor} object
	 * @return	a list of {@link edu.gmu.swe.taf.Test} objects
	 */
	public List<Test> generateTests(List<Path> paths, ModelAccessor modelAccessor){
		List<Test> tests = new ArrayList<Test>();
		
		for(int i = 0; i < paths.size(); i++){
			Test test = null;
			
			if(modelAccessor instanceof StateMachineAccessor){
				List<Transition> transitions = convertVerticesToTransitions(getPathByState(paths.get(i), (StateMachineAccessor)modelAccessor), (StateMachineAccessor)modelAccessor);
				String testComment = "/** A test for the path " + paths.get(i).toString() + "**/";
				test = new Test("test" + i, testComment);
			}
			tests.add(test);
		}
		return tests;
	}

	/**
	 * Updates a {@link edu.gmu.swe.taf.Test} object with adding mappings and test code
	 * @param path	the path of the XML file storing the mappings in a String format
	 * @param test	a {@link edu.gmu.swe.taf.Test} object that is modified by this method
	 * @param constraints TODO
	 * @return		a {@link edu.gmu.swe.taf.Test} object
	 * @throws Exception 
	 */
	public Test updateTest(String path, Test test, List<ConstraintMapping> constraints) throws Exception{
		//return concrete test code that are mapped to each transition

		List<Mapping> mappings = test.getMappings();
		if(mappings == null)
			mappings = new ArrayList<Mapping>();
		
		//System.out.println("transition size: " + test.getPath().size());
		
		//get the mappings for preconditions, state invariants, and postconditions
		List<Mapping> constraintMappings = getConstraints(constraints);

		if(test instanceof FsmTest){
			//checking the very first vertex
			Vertex firstVertex = ((FsmTest)test).getPath().get(0).getSource();
			if(constraintMappings != null){
				mappings = addPreconditionStateInvariantMappings(firstVertex, mappings, constraintMappings);
				mappings = addPostconditionMappings(firstVertex, mappings, constraintMappings);
			}
			
			for(Transition transition: ((FsmTest)test).getPath()){
				if(constraintMappings != null)
					mappings = addPreconditionStateInvariantMappings(transition, mappings, constraintMappings);
				
				Vertex destination = transition.getTarget();
				
				List<Mapping> nodes = null;
				//System.out.println("transition name: " + transition.getName());
				if(transition.getName() != null && !transition.getName().equals("")){
					nodes = XmlManipulator.getMappingsByTransition(path, transition.getName());
					//System.out.println("size: " + nodes.size());
					
					//if more mappings exist for one transition, pick one
					//if only one mapping exists, add this one to the list
					//otherwise, throw "No mapping found" exception
					if(nodes.size() > 1)
						//this section will be updated later for picking one out of many mappings
						//to be updated: if a precondition or state invariant after this element, check if the constraint has 
						//specified any particular mapping to solve the constraint; if it does, use this specified mapping;
						//otherwise, use a mapping arbitrarily
						mappings.add(nodes.get(0));
					else if(nodes.size() == 1)
						mappings.add(nodes.get(0));
					else
						throw new Exception("No mapping found");	
					
					//store the transition and its mappings
					if(!hashedTransitionMappings.containsKey(transition))
						hashedTransitionMappings.put(transition, nodes);
				}	
				
				if(constraintMappings != null)
					mappings = addPostconditionMappings(destination, mappings, constraintMappings);		
				
				if(constraintMappings != null){
					mappings = addPreconditionStateInvariantMappings(destination, mappings, constraintMappings);
					mappings = addPostconditionMappings(destination, mappings, constraintMappings);
				}
			}
		}
		
		test.setMappings(mappings);
		
		//retrieve the test code from the XML nodes
		String testCode = "";
		
		for(Mapping mapping: mappings){
			testCode += mapping.getTestCode() + "\n";
			//System.out.println("mapping name: " + mapping.getMappingName());
		}
		
		test.setTestCode(testCode);	
		mappings = null;
		
		return test;
	}
	
	/**
	 * Adds preconditions, state invariants, and postconditions of an element to the mappings.
	 * @param element		a {@link Element} object that owns the constraints
	 * @param finalMappings	a list of {@link Mapping} objects that represents the path of the abstract test
	 * @param constraints	a list of {@link Mapping} objects that represents preconditions, state invariants, and postconditions	
	 * @return				a list of {@link Element} objects
	 */
	public List<Mapping> addPreconditionStateInvariantMappings(Element element, List<Mapping> finalMappings, List<Mapping> constraints){

		if(element instanceof Vertex){
			for(Mapping precondition : constraints){
				if(precondition.getIdentifiableElementName().equalsIgnoreCase(((Vertex) element).getName()) && precondition.getType() == IdentifiableElementType.PRECONDITION)
					finalMappings.add(precondition);
			}
			
			for(Mapping stateinvariant : constraints){
				//System.out.println(((Vertex) element).getName() + " " + stateinvariant.getIdentifiableElementName());
				if(stateinvariant.getIdentifiableElementName().equalsIgnoreCase(((Vertex) element).getName()) && stateinvariant.getType() == IdentifiableElementType.STATEINVARIANT)
					finalMappings.add(stateinvariant);
			}		
		}
		
		if(element instanceof Transition){
			for(Mapping precondition : constraints){
				if(precondition.getIdentifiableElementName().equalsIgnoreCase(((Transition) element).getName()) && precondition.getType() == IdentifiableElementType.PRECONDITION)
					finalMappings.add(precondition);
			}
			
			for(Mapping stateinvariant : constraints){
				if(stateinvariant.getIdentifiableElementName().equalsIgnoreCase(((Transition) element).getName()) && stateinvariant.getType() == IdentifiableElementType.STATEINVARIANT)
					finalMappings.add(stateinvariant);
			}
		}
		return finalMappings;
	}
	
	/**
	 * Adds postconditions of an element to the mappings.
	 * @param element		a {@link Element} object that owns the constraints
	 * @param finalMappings	a list of {@link Mapping} objects that represents the path of the abstract test
	 * @param constraints	a list of {@link Mapping} objects that represents postconditions	
	 * @return				a list of {@link Element} objects
	 */
	public List<Mapping> addPostconditionMappings(Element element, List<Mapping> finalMappings, List<Mapping> constraints){
		if(element instanceof Vertex){
			for(Mapping postcondition : constraints){
				if(postcondition.getIdentifiableElementName().equalsIgnoreCase(((Vertex) element).getName()) && postcondition.getType() == IdentifiableElementType.POSTCONDITION)
					finalMappings.add(postcondition);
			}		
		}
		
		if(element instanceof Transition){
			for(Mapping postcondition : constraints){
				if(postcondition.getIdentifiableElementName().equalsIgnoreCase(((Transition) element).getName()) && postcondition.getType() == IdentifiableElementType.POSTCONDITION)
					finalMappings.add(postcondition);
			}			
		}
		return finalMappings;
	}
	
	/**
	 * Gets all constraints from the XML file and creates precondition, stateinvariant, postcondition mappings.
	 * @param constraints	a list of {@link ConstraintMapping} objects
	 * @return				a list of {@link Mapping} objects
	 */
	public static List<Mapping> getConstraints(List<ConstraintMapping> constraints){
		//a list of mappings to be returned: precondition, stateinvariant, postcondition mappings 
		List<Mapping> mappings = new ArrayList<Mapping>();
		
		if(constraints != null){
			for(ConstraintMapping constraint: constraints){
				//add precondition mappings
				if(constraint.getPreconditions() != null){
					if(constraint.getPreconditions().size() > 0){
						for(String precondition: constraint.getPreconditions()){
							mappings.add(new Mapping(constraint.getMappingName(), IdentifiableElementType.PRECONDITION, precondition, constraint.getTestCode(), 
									constraint.getRequiredMappings(), constraint.getParameters(), constraint.getCallers(), constraint.getReturnObjects()));
						}
					}
				}
				//add state invariant mappings
				if(constraint.getStateinvariants() != null){
					if(constraint.getStateinvariants().size() > 0){
						for(String stateinvariant: constraint.getStateinvariants()){
							mappings.add(new Mapping(constraint.getMappingName(), IdentifiableElementType.STATEINVARIANT, stateinvariant, constraint.getTestCode(), 
									constraint.getRequiredMappings(), constraint.getParameters(), constraint.getCallers(), constraint.getReturnObjects()));
						}
					}
				}
				//add postcondition mappings
				if(constraint.getPostconditions() != null){
					if(constraint.getPostconditions().size() > 0){
						for(String postcondition: constraint.getPostconditions()){
							mappings.add(new Mapping(constraint.getMappingName(), IdentifiableElementType.POSTCONDITION, postcondition, constraint.getTestCode(), 
									constraint.getRequiredMappings(), constraint.getParameters(), constraint.getCallers(), constraint.getReturnObjects()));
						}
					}
				}
			}
		}
		
		return mappings;
	}
	
	/**
	 * An inner class that is used to solve constraints in abstract tests
	 * 
	 * @author Nan Li
	 * @version 1.0 Nov 28, 2012
	 *
	 */
	public class constraintSolver{

		/**
		 * 
		 * @param transitions
		 * @param path
		 * @throws Exception
		 */
		public String solveConstraints(List<Transition> transitions, String path) throws Exception{			
			//return concrete test code that are mapped to each transition
			
			//a list of nodes that keeps concrete test code in an order of transitions
			List<org.w3c.dom.Node> result_nodes = new ArrayList<org.w3c.dom.Node>();
			for(Transition transition: transitions){
				List<org.w3c.dom.Node> nodes = null;
				//System.out.println("transition name: " + transition.getName());
				if(transition.getName() != null && !transition.getName().equals("")){
					nodes = XmlManipulator.getMatchedTransitionMappings(path, transition.getName());
					//System.out.println("size: " + nodes.size());
					
					//if more mappings exist for one transition, pick one
					//if only one mapping exists, add this one to the list of concrete test code
					//otherwise, throw "No mapping found" exception
					if(nodes.size() > 1)
						//this section will be updated later for picking one out of many mappings
						result_nodes.add(nodes.get(0));
					else if(nodes.size() == 1)
						result_nodes.add(nodes.get(0));
					else
						throw new Exception("No mapping found");	
				}												
			}
			
			//retrieve the test code from the XML nodes
			String methodContent = "";
			for(int i = 0; i < result_nodes.size(); i++){
				NodeList nodes = result_nodes.get(i).getChildNodes();
				for(int j = 0; j < nodes.getLength(); j++){
					if(nodes.item(j).getNodeName().equals("code")){
						System.out.println(nodes.item(j).getFirstChild().getNodeValue());
						methodContent += nodes.item(j).getFirstChild().getNodeValue() + "\n";
					}
				}
			}
			return methodContent;
		}
	}

}
