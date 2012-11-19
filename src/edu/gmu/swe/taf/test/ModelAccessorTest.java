/**
 * 
 */
package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gmu.swe.taf.ModelAccessor;

/**
 * @author Nan
 *
 */
public class ModelAccessorTest {

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
	public void testGetModelObject() throws IOException {
		String path = "testData/model/VendingMachineFSM.uml";
		EObject object = ModelAccessor.getModelObject(path);
		assertNotNull(object);
	}
	
	@Test
	public void testGetStateMachines() throws IOException{
		String path = "testData/model/VendingMachineFSM.uml";
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		assertEquals(1, statemachines.size());
	}
	
	@Test
	public void testGetRegions() throws IOException{
		String path = "testData/model/VendingMachineFSM.uml";
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		List<Region> regions = ModelAccessor.getRegions(statemachines.get(0));
		assertEquals(1, regions.size());
	}
	
	@Test
	public void testGetInitialStates() throws IOException{
		String path = "testData/model/VendingMachineFSM.uml";
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		List<Region> regions = ModelAccessor.getRegions(statemachines.get(0));
		List<Pseudostate> initialStates = ModelAccessor.getInitialStates(regions.get(0));
		assertEquals(1, initialStates.size());
	}
	
	@Test
	public void testGetFinalStates() throws IOException{
		String path = "testData/model/VendingMachineFSM.uml";
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		List<Region> regions = ModelAccessor.getRegions(statemachines.get(0));
		List<FinalState> finalStates = ModelAccessor.getFinalStates(regions.get(0));
		assertEquals(1, finalStates.size());
	}
	
	@Test
	public void testGetStates() throws IOException{
		String path = "testData/model/VendingMachineFSM.uml";
		EObject object = ModelAccessor.getModelObject(path);
		List<StateMachine> statemachines = ModelAccessor.getStateMachines(object);
		List<Region> regions = ModelAccessor.getRegions(statemachines.get(0));
		List<State> states = ModelAccessor.getStates(regions.get(0));
		assertEquals(9, states.size());
	}
}
