/**
 * 
 */
package edu.gmu.swe.taf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;

import coverage.graph.Edge;
import coverage.graph.Graph;
import coverage.graph.GraphUtil;
import coverage.graph.InvalidGraphException;
import coverage.graph.Node;
import coverage.graph.Path;
import coverage.web.InvalidInputException;

/**
 * A class that generates abstract tests (that is, test paths) based on UML models
 * 
 * @author Nan Li
 * @version 1.0 Nov 28, 2012
 *
 */
public class AbstractTestGenerator {

	/**
	 * 
	 */
	public AbstractTestGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Generates test paths to satisfy the edge coverage criterion
	 * 
	 * @param edges
	 * @param initialNodes
	 * @param finalNodes
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
	 * @param path
	 * @param stateMachine
	 * @return a list of {@link org.eclipse.uml2.uml.Vertex}
	 */
	public static List<Vertex> getPathByVertex(Path path, StateMachineAccessor stateMachine){
		List<Vertex> vertexes = new ArrayList<Vertex>();
		Iterator<Node> nodes = path.getNodeIterator();
		
		while(nodes.hasNext()){
			Node node = nodes.next();
			Vertex vertex = stateMachine.getReversedStateMappings().get(node.toString());
			vertexes.add(vertex);
		}
		
		return vertexes;		
	}
	
	/**
	 * An inner class that is used to solve constraints in abstract tests
	 * 
	 * @author Nan Li
	 * @version 1.0 Nov 28, 2012
	 *
	 */
	public class constraintSolver{
		
		public Path verifyConstraints(Path path){
			
			return null;
		}
		
		
	}

}
