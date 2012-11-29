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

import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.ModelAccessor;

/**
 * A JUnit test case for class {@link ModelAccessor}
 * @author Nan Li
 * @version 1.0 Nov 14, 2012
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
		//String path = "C:\\Users\\nanli\\Desktop\\temp\\VendingMachine";
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

}
