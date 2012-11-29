package edu.gmu.swe.taf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
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

	private static HashMap<String, String> stateMappings = new HashMap<String, String>();
	private static String initialStates = "";
	private static String finalStates = "";
	//transitions in a String format
	//1, 2
	//2, 3
	//... etc.
	private static String edges = "";
	
	public StateMachineAccessor(Region region) {
		createStateMappings(region);	
		createEdges(region);
	}
	
	/**
	 * Creates the mapping between state names and numbers
	 * @param region
	 */
	private void createStateMappings(Region region){
		int stateNumber = 1;
		EList<Vertex> vertexes = region.getSubvertices();
		
		for(Vertex vertex: vertexes){
			if(vertex instanceof Pseudostate){
				EList<Transition> outgoings = vertex.getOutgoings();
				if(outgoings.size() > 0){
					getStateMappings().put(vertex.getName(), new Integer(stateNumber).toString());
					setInitialStates(getInitialStates() + new Integer(stateNumber).toString());
				}
			}
			else if(vertex instanceof FinalState){
				getStateMappings().put(vertex.getName(), new Integer(stateNumber).toString());	
				setFinalStates(getFinalStates() + new Integer(stateNumber).toString());
			}
			else{
				getStateMappings().put(vertex.getName(), new Integer(stateNumber).toString());	
			}
		
			stateNumber++;
		}		
	}
	
	/**
	 * Creates the edges based on the transitions
	 * edges are in a String format
	 * 1, 2
	 * 2, 3
	 * ...
	 * @param region
	 */
	private void createEdges(Region region){
		EList<Transition> transitions = region.getTransitions();
		
		for(Transition transition: transitions){
			//transitions may not have a source or target because some of them are leftover
			//they do not appear in the UML diagram but they do exist in the UML model
			if(transition.getSource() != null && transition.getTarget() != null){
				System.out.println(transition.getSource().getName() + "; " + transition.getTarget().getName());

				if(stateMappings.containsKey(transition.getSource().getName())){
					edges = edges + stateMappings.get(transition.getSource().getName());
				}
				if(stateMappings.containsKey(transition.getTarget().getName())){
					edges = edges + " " + stateMappings.get(transition.getTarget().getName());
				}
				edges = edges + "\n"; 
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
	 * is examined and if an object of Pseudostate is connected with other states, it is treated to be an initial state.
	 */
	public static List<Pseudostate> getInitialStates(Region region){
		List<Pseudostate> result = new ArrayList<Pseudostate>();
		
		EList<Vertex> vertexes = region.getSubvertices();
		for(Vertex vertex: vertexes){
			if(vertex instanceof Pseudostate){
				EList<Transition> outgoings = vertex.getOutgoings();
				if(outgoings.size() > 0){
					result.add(((Pseudostate)vertex));
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Gets the mappings of states to numbers
	 * @return the state-number mappings
	 */
	public static HashMap<String, String> getStateMappings() {
		return stateMappings;
	}

	/**
	 * Sets a new state-number mapping to the field of this class: stateMapping
	 */
	public static void setStateMappings(HashMap<String, String> stateMappings) {
		StateMachineAccessor.stateMappings = stateMappings;
	}

	/**
	 * Gets the edges in a String format
	 * @return edges
	 */
	public static String getEdges() {
		return edges;
	}

	/**
	 * Sets new edges
	 * @param edges
	 */
	public static void setEdges(String edges) {
		StateMachineAccessor.edges = edges;
	}

	/**
	 * Gets the final states in a String format
	 * @return a String representation of final states
	 */
	public static String getFinalStates() {
		return finalStates;
	}

	public static void setFinalStates(String finalStates) {
		StateMachineAccessor.finalStates = finalStates;
	}

	/**
	 * Gets the initial states in a String format
	 * @return a String representation of initial states
	 */
	public static String getInitialStates() {
		return initialStates;
	}

	public static void setInitialStates(String initialStates) {
		StateMachineAccessor.initialStates = initialStates;
	}

}
