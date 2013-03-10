package edu.gmu.swe.taf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

/**
 * A class that provides functions to access UML State Machine models. Classes in Acceleo are used to be helpers to access the models.
 * 
 * @author Nan Li
 * @version 1.0 Nov 28, 2012
 *
 */

public class StateMachineAccessor extends ModelAccessor {
	
	/**
	 * the key is a state; the value is an integer number used in {@link coverage.web.Path}
	 */
	private HashMap<Vertex, String> stateMappings = new HashMap<Vertex, String>();
	
	/**
	 * the key is an integer number used in {@link coverage.web.Path}; the value is a state
	 */
	private HashMap<String, Vertex> reversedStateMappings = new HashMap<String, Vertex>();
	//the initial states
	private String initialStates = "";
	//the final states
	private String finalStates = "";
	
	//transitions in a String format
	//1 2
	//2 3
	//... etc.
	private String edges = "";
	
	/**
	 * Constructs an StateMachineAccessor object with a Region object
	 * @param region	a {@link org.eclipse.uml2.uml.Region} Region object
	 */
	public StateMachineAccessor(Region region) {
		createStateMappings(region);	
		createEdges(region);
	}
	
	/**
	 * Creates the one mapping from vertexes to integers and another mapping from integers to vertexes.
	 * This method cannot be overridden.
	 * @param region	a {@link org.eclipse.uml2.uml.Region} Region object
	 */
	private void createStateMappings(Region region){
		int stateNumber = 1;
		EList<Vertex> vertices = region.getSubvertices();
		
		//check if all states are simple
		boolean isSimple = true;
		for(Vertex vertex: vertices){
			if(vertex instanceof State){
				if(((State)vertex).isComposite())
					isSimple = false;
			}
			else if(vertex instanceof FinalState){
				if(((FinalState)vertex).isComposite())
					isSimple = false;
			}	
		}
		//if all states are simple, do the if block; otherwise, do the else block
		if(isSimple){
			for(Vertex vertex: vertices){
				if(vertex instanceof Pseudostate && ((Pseudostate)vertex).getKind() == PseudostateKind.INITIAL_LITERAL){
					EList<Transition> outgoings = vertex.getOutgoings();
					if(outgoings.size() > 0){
						getStateMappings().put(vertex, new Integer(stateNumber).toString());
						getReversedStateMappings().put(new Integer(stateNumber).toString(), vertex);
						setInitialStates(getInitialStates() + new Integer(stateNumber).toString());
					}
				}
				else if(vertex instanceof FinalState){
					getStateMappings().put(vertex, new Integer(stateNumber).toString());	
					getReversedStateMappings().put(new Integer(stateNumber).toString(), vertex);
					setFinalStates(getFinalStates() + new Integer(stateNumber).toString());
				}
				else{
					getStateMappings().put(vertex, new Integer(stateNumber).toString());	
					getReversedStateMappings().put(new Integer(stateNumber).toString(), vertex);
				}	
				stateNumber++;
			}		
		}
		else{
			List<Vertex> compositeStates = new ArrayList<Vertex>();
			compositeStates.addAll(vertices);
			System.out.println(compositeStates.size());
			System.out.println(compositeStates);
			do{
					Vertex aVertex = compositeStates.get(0);
					if(aVertex instanceof Pseudostate && ((Pseudostate)aVertex).getKind() == PseudostateKind.INITIAL_LITERAL){
						EList<Transition> outgoings = aVertex.getOutgoings();
						if(outgoings.size() > 0){
							getStateMappings().put(aVertex, new Integer(stateNumber).toString());
							getReversedStateMappings().put(new Integer(stateNumber).toString(), aVertex);
							//set the initial if this initial is at the top level of the region
							//initials states in composite states are not considered as initials in the whole graph
							if(aVertex.getOwner() == region)
								setInitialStates(getInitialStates() + new Integer(stateNumber).toString());
							compositeStates.remove(0);
						}
					}
					else if(aVertex instanceof FinalState){
						getStateMappings().put(aVertex, new Integer(stateNumber).toString());	
						getReversedStateMappings().put(new Integer(stateNumber).toString(), aVertex);
						//set the final if this final is at the top level of the region
						//final states in composite states are not considered as finals in the whole graph
						if(aVertex.getOwner() == region)
							setFinalStates(getFinalStates() + new Integer(stateNumber).toString());
						compositeStates.remove(0);
					}
					else if(((State)aVertex).isSimple()){
						getStateMappings().put(aVertex, new Integer(stateNumber).toString());	
						getReversedStateMappings().put(new Integer(stateNumber).toString(), aVertex);
						compositeStates.remove(0);
					}	
					else if(((State)aVertex).isComposite()){
						List<Vertex> localVertices = getStates(((State)aVertex));
						compositeStates.addAll(localVertices);
						compositeStates.remove(0);
					}
					stateNumber++;
			System.out.println(compositeStates.size());
			System.out.println(compositeStates);
			}while(compositeStates.size() > 0);
		}
		
	}
	
	/**
	 * Creates the edges based on the transitions
	 * edges are in a String format
	 * 1 2
	 * 2 3
	 * ...
	 * 
	 * This method cannot be overridden.
	 * @param region	a {@link org.eclipse.uml2.uml.Region} Region object
	 */
	private void createEdges(Region region){
		EList<Transition> transitions = region.getTransitions();
		
		for(Transition transition: transitions){
			//transitions may not have a source or target because some of them are leftover
			//they do not appear in the UML diagram but they do exist in the UML model
			if(transition.getSource() != null && transition.getTarget() != null){
				//System.out.println(transition.getSource().getName() + "; " + transition.getTarget().getName());
				
				//redundant edges are not allowed
				String edge = stateMappings.get(transition.getSource()) + " " + stateMappings.get(transition.getTarget());
				
				if(edges.indexOf(edge) == -1){
					if(stateMappings.containsKey(transition.getSource())){
						edges = edges + stateMappings.get(transition.getSource());
					}
					if(stateMappings.containsKey(transition.getTarget())){
						edges = edges + " " + stateMappings.get(transition.getTarget());
					}				
					edges = edges + "\n"; 
				}
			}
		}
	}

	/**
	 * Gets all objects of {@link org.eclipse.uml2.uml.Region} in the stateMachine
	 * @param stateMachine
	 * @return a list of {@link org.eclipse.uml2.uml.Region} in the stateMachine
	 */
	public static List<Region> getRegions(StateMachine stateMachine){
		List<Region> result = new ArrayList<Region>();
		EList<Region> regions = stateMachine.getRegions();
		
		for(Region region: regions){
			result.add(region);
		}
		
		return result;
	}

	/**
	 * Gets all objects of {@link org.eclipse.uml2.uml.State} except {@link org.eclipse.uml2.uml.FinalState} and {@link org.eclipse.uml2.uml.Pseudostate} in the region
	 * @param region
	 * @return a list of {@link org.eclipse.uml2.uml.State} in the region
	 */
	public static List<State> getStates(Region region){
		List<State> result = new ArrayList<State>();
		
		EList<Vertex> vertexes = region.getSubvertices();
		for(Vertex vertex: vertexes){
			if(!(vertex instanceof FinalState) && !(vertex instanceof Pseudostate)){			
				result.add(((State)vertex));			
			}
		}
		
		return result;
	}
	
	/**
	 * Gets all {@link org.eclipse.uml2.uml.Vertex} objects in the region
	 * @param state
	 * @return a list of {@link org.eclipse.uml2.uml.Vertex} objects in the region
	 */
	public static List<Vertex> getStates(State state){
		List<Vertex> result = new ArrayList<Vertex>();
		
		if(state.isComposite()){
			EList<Vertex> vertexes = state.getRegions().get(0).getSubvertices();
			for(Vertex vertex: vertexes){
				if((vertex instanceof FinalState) || vertex instanceof Pseudostate || vertex instanceof State)
					result.add(vertex);
			}
		}		
		return result;
	}

	/**
	 * Gets all objects of {@link org.eclipse.uml2.uml.FinalState} in the region
	 * @param region
	 * @return a list of {@link org.eclipse.uml2.uml.FinalState} in the region
	 */
	public static List<FinalState> getFinalStates(Region region){
		List<FinalState> result = new ArrayList<FinalState>();
		
		EList<Vertex> vertexes = region.getSubvertices();
		for(Vertex vertex: vertexes){
			if(vertex instanceof FinalState){			
				result.add(((FinalState)vertex));			
			}
		}
		
		return result;
	}

	/**
	 * Gets all objects of {@link org.eclipse.uml2.uml.Pseudostate} in the region
	 * @param region
	 * @return a list of {@link org.eclipse.uml2.uml.Pseudostate} in the region
	 * 
	 * Initial states in state machine diagrams are of Pseudostate, in this method, each object of Pseudostate
	 * is examined. If an object of Pseudostate is connected with other states, it is treated to be an initial state.
	 */
	public static List<Pseudostate> getInitialStates(Region region){
		List<Pseudostate> result = new ArrayList<Pseudostate>();
		
		EList<Vertex> vertexes = region.getSubvertices();
		for(Vertex vertex: vertexes){
			if(vertex instanceof Pseudostate){
				//check if the initial node is connected with other nodes
				if(((Pseudostate) vertex).getKind() == PseudostateKind.INITIAL_LITERAL){
					EList<Transition> outgoings = vertex.getOutgoings();
					if(outgoings.size() > 0){
						result.add(((Pseudostate)vertex));
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Gets all identifiable elements that can be mapped from a region of a state machine.
	 * So far only transitions, constraints, and states are to be returned.
	 * 
	 * @param region	a {@link org.eclipse.uml2.uml.Region} object
	 * @return			a list of {@link org.eclipse.uml2.uml.NamedElement} objects
	 */
	public static List<NamedElement> getAllIdentifiableElements(Region region){
		List<NamedElement> result = new ArrayList<NamedElement>();
		
		//add distinct transitions to the result
		EList<Transition> transitions = region.getTransitions();
		for(Transition transition: transitions){
			boolean hasSameName = false;
			for(NamedElement element: result){
				if(element.getName().equals(transition.getName())){
					hasSameName = true;
				}
			}
			if(hasSameName == false)
				result.add(transition);
		}
		
		//add distinct constraints to the result
		EList<Constraint> constraints = region.getOwnedRules();
		for(Constraint constraint: constraints){
			boolean hasSameName = false;
			for(NamedElement element: result){
				if(element.getName().equals(constraint.getName())){
					hasSameName = true;
				}
			}
			if(hasSameName == false)
				result.add(constraint);
		}
		
		//add distinct vertices to the result
		EList<Vertex> vertices = region.getSubvertices();
		for(Vertex vertex: vertices){
			boolean hasSameName = false;
			for(NamedElement element: result){
				if(element.getName().equals(vertex.getName())){
					hasSameName = true;
				}
			}
			
			if(hasSameName == false){
				if(vertex instanceof Pseudostate){
					EList<Transition> outgoings = vertex.getOutgoings();
					if(outgoings.size() > 0){
						result.add(((Pseudostate)vertex));
					}
				}
				else if(vertex instanceof FinalState){
						result.add(((FinalState)vertex));
				}else{
					result.add(vertex);
				}	
			}
			
		}
		
		return result;
	}
	
	/**
	 * Gets the mappings of states to numbers
	 * @return the state-number mappings
	 */
	public HashMap<Vertex, String> getStateMappings() {
		return stateMappings;
	}

	/**
	 * Sets a new state-number mapping to the field of this class: stateMapping
	 */
	public void setStateMappings(HashMap<Vertex, String> stateMappings) {
		this.stateMappings = stateMappings;
	}

	/**
	 * Gets the edges in a String format
	 * @return edges
	 */
	public String getEdges() {
		return edges;
	}

	/**
	 * Sets new edges
	 * @param edges
	 */
	public void setEdges(String edges) {
		this.edges = edges;
	}

	/**
	 * Gets the final states in a String format
	 * @return a String representation of final states
	 */
	public String getFinalStates() {
		return finalStates;
	}

	public void setFinalStates(String finalStates) {
		this.finalStates = finalStates;
	}

	/**
	 * Gets the initial states in a String format
	 * @return a String representation of initial states
	 */
	public String getInitialStates() {
		return initialStates;
	}

	public void setInitialStates(String initialStates) {
		this.initialStates = initialStates;
	}
	
	/**
	 * Gets the mappings from integers to vertexes
	 * @return the number-state mappings
	 */
	public HashMap<String, Vertex> getReversedStateMappings() {
		return reversedStateMappings;
	}
	/**
	 * Sets a new number-state mapping to the field of this class: reversedStateMapping
	 */
	public void setReversedStateMappings(HashMap<String, Vertex> reversedStateMappings) {
		this.reversedStateMappings = reversedStateMappings;
	}

}
