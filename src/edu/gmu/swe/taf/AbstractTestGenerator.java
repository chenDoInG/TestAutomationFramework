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
		this.globalDirectory = globalDirectory;
		hashedTransitionMappings = new HashMap<Transition, List<Mapping>>();
	}
	
	/**
	 * Constructs an AbstractTestGenerator with the global directory
	 */
	public AbstractTestGenerator(String globalDirectory) {
		this.globalDirectory = globalDirectory;
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
		List<Vertex> vertexes = new ArrayList<Vertex>();
		Iterator<Node> nodes = path.getNodeIterator();
		
		while(nodes.hasNext()){
			Node node = nodes.next();
			vertexes.add(stateMachine.getReversedStateMappings().get(node.toString()));
		}
		
		return vertexes;		
	}
	
	/**
	 * Transforms a list of {@link org.eclipse.uml2.uml.Vertex} to a list of {@link org.eclipse.uml2.uml.Transition}s in a UML state machine
	 * @param vertexes		a list of {@link org.eclipse.uml2.uml.Vertex}
	 * @param stateMachine	a {@link StateMachineAccessor} object
	 * @return	a list of {@link org.eclipse.uml2.uml.Transition}s
	 */
	public List<Transition> convertVerticesToTransitions(List<Vertex> vertexes, StateMachineAccessor stateMachine){
		List<Mapping> mappings = new ArrayList<Mapping>();
		List<Transition> transitions = new ArrayList<Transition>();
		
		for(int i = 0; i < vertexes.size();){
			Vertex source = vertexes.get(i);
			if(i == vertexes.size() - 1)
				break;
			else
				i++;
			
			Vertex destination = vertexes.get(i);
			for(Transition transition: source.getOutgoings()){
				if(transition.getTarget().getName().equals(destination.getName())){
					transitions.add(transition);
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
	 * @return		a {@link edu.gmu.swe.taf.Test} object
	 * @throws Exception 
	 */
	public Test updateTest(String path, Test test) throws Exception{
		//return concrete test code that are mapped to each transition

		List<Mapping> mappings = test.getMappings();
		if(mappings == null)
			mappings = new ArrayList<Mapping>();
		
		//System.out.println("transition size: " + test.getPath().size());
		
		if(test instanceof FsmTest){
			for(Transition transition: ((FsmTest)test).getPath()){
				List<Mapping> nodes = null;
				//System.out.println("transition name: " + transition.getName());
				if(transition.getName() != null && !transition.getName().equals("")){
					nodes = XmlManipulator.getMappingsByTransition(path, transition.getName());
					//System.out.println("size: " + nodes.size());
					
					//if more mappings exist for one transition, pick one
					//if only one mapping exists, add this one to the list of concrete test code
					//otherwise, throw "No mapping found" exception
					if(nodes.size() > 1)
						//this section will be updated later for picking one out of many mappings
						mappings.add(nodes.get(0));
					else if(nodes.size() == 1)
						mappings.add(nodes.get(0));
					else
						throw new Exception("No mapping found");	
					
					//store the transition and its mappings
					if(!hashedTransitionMappings.containsKey(transition))
						hashedTransitionMappings.put(transition, nodes);
				}			
			}
		}
		
		test.setMappings(mappings);
		//retrieve the test code from the XML nodes
		String testCode = "";
		
		for(Mapping mapping: mappings)
			testCode += mapping.getTestCode() + "\n";
		
		test.setTestCode(testCode);	
		mappings = null;
		
		return test;
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
