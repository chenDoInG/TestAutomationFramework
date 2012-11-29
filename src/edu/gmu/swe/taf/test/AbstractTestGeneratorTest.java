/**
 * 
 */
package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coverage.graph.InvalidGraphException;
import coverage.graph.Path;
import coverage.web.InvalidInputException;

import edu.gmu.swe.taf.AbstractTestGenerator;
import edu.gmu.swe.taf.ModelAccessor;
import edu.gmu.swe.taf.StateMachineAccessor;

/**
 * A JUnit test case for class {@link AbstractTestGenerator}
 * @author Nan Li
 * @version 1.0 Nov 28, 2012
 *
 */
public class AbstractTestGeneratorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTestPathsForEdgeCoverage() throws IOException, InvalidInputException, InvalidGraphException {
		String path = "testData/model/VendingMachineFSM.uml";
		EObject object = StateMachineAccessor.getModelObject(path);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		//HashMap<String, String> stateMappings = stateMachine.getStateMappings();
		List<Path> paths = AbstractTestGenerator.getTestPathsForEdgeCoverage(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates());
		assertNotNull(paths);
		System.out.println(paths);
	}

}
