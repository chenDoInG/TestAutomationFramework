/**
 * 
 */
package edu.gmu.swe.taf;

import java.util.List;

import coverage.graph.Graph;
import coverage.graph.GraphUtil;
import coverage.graph.InvalidGraphException;
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
	 * An inner class that helps solve constraints in abstract tests
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
