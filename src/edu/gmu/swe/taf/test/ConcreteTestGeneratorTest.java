package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coverage.graph.InvalidGraphException;
import coverage.graph.Path;
import coverage.web.InvalidInputException;
import edu.gmu.swe.taf.AbstractTestGenerator;
import edu.gmu.swe.taf.ConcreteTestGenerator;
import edu.gmu.swe.taf.StateMachineAccessor;
import edu.gmu.swe.taf.AbstractTestGenerator.constraintSolver;

public class ConcreteTestGeneratorTest {

	String path;
	String xmlPath;
	String tempTestDirectory = "testData/test/temp/";
	String tempTestName = "VendingMachineTest";
	
	@Before
	public void setUp() throws Exception {
		path = "testData/model/VendingMachineFSM.uml";
		xmlPath = "testData/xml/vendingMachineMappings.xml";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConcreteTestGenerator() throws Exception {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "HelloWorld", xmlPath);
		assertEquals(tempTestDirectory, concreteTestGenerator.getDirectory());
		assertEquals("HelloWorld", concreteTestGenerator.getTestName());
	}

	@Test
	public void testGenerateConcreteTests() throws Exception {
		
		EObject object = StateMachineAccessor.getModelObject(path);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPathsForEdgeCoverage(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates());
		//System.out.println(paths.get(0));
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		List<edu.gmu.swe.taf.Test> tests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(int i = 0; i < paths.size();i++){
			System.out.println("path: " + paths.get(i));
			AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
			List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(i), stateMachine), stateMachine);
			
			String pathName = "";
			for(Transition transition: transitions){
				System.out.println(transition);
				pathName += transition.getName() + " ";
			}
			edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest(String.valueOf(i), "The test for the path " + pathName, transitions);
			test = abstractTestGenerator.updateTest(xmlPath, test);
			tests.add(test);
		}
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, tempTestName, xmlPath);
		concreteTestGenerator.generateConcreteTests(tests);
	}
	
	/**
	 * The test for the method "createConcreteTestCase(String, File, Test)"
	 * @throws Exception
	 */

	@Test
	public void testCreateConcreteTestCase() throws Exception {
		
		/**
		 * Computes the test
		 */
		EObject object = StateMachineAccessor.getModelObject(path);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPathsForEdgeCoverage(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates());
		//System.out.println(paths.get(0));
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(9), stateMachine), stateMachine);
		
		String pathName = "";
		for(Transition transition: transitions){
			System.out.println(transition);
			pathName += transition.getName() + " ";
		}
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("1", "The test for the path " + pathName, transitions);
		test = abstractTestGenerator.updateTest(xmlPath, test);
		
		/**
		 * Generates the concrete test
		 */
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "VendingMachineTest", xmlPath);

		File file = new File(tempTestDirectory + "VendingMachineTest" + ".java");
		concreteTestGenerator.createConcreteTestCase(tempTestDirectory, file, concreteTestGenerator.updateConcreteTest(test));
	}
	
	/**
	 * The test for the method "createConcreteTestCase(String, File, List<? extends Test>)"
	 * @throws Exception
	 */

	@Test
	public void testCreateConcreteTestCaseFromListOfTests() throws Exception {
		
		/**
		 * Computes the test
		 */
		EObject object = StateMachineAccessor.getModelObject(path);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPathsForEdgeCoverage(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates());
		
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		List<edu.gmu.swe.taf.Test> tests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(int i = 0; i < paths.size();i++){
			System.out.println("path: " + paths.get(i));
			AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
			List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(i), stateMachine), stateMachine);
			
			String pathName = "";
			for(Transition transition: transitions){
				System.out.println(transition);
				pathName += transition.getName() + " ";
			}
			edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest(String.valueOf(i), "The test for the path " + pathName, transitions);
			test = abstractTestGenerator.updateTest(xmlPath, test);
			tests.add(test);
		}
		/**
		 * Generates the concrete test
		 */
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "VendingMachineTest", xmlPath);

		File file = new File(tempTestDirectory + "VendingMachineTest" + ".java");
		List<edu.gmu.swe.taf.Test> finalTests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(edu.gmu.swe.taf.Test test: tests)
			finalTests.add(concreteTestGenerator.updateConcreteTest(test));
		
		concreteTestGenerator.createConcreteTestCase(tempTestDirectory, file, finalTests);
		//concreteTestGenerator.createConcreteTestCase(tempTestDirectory, file, concreteTestGenerator.updateConcreteTest(test));
	}
	
	/**
	 * Tests the method updateConcreteTest
	 * @throws Exception 
	 */
	@Test
	public void testUpdateConcreteTest() throws Exception {
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest();
		test.setTestName("1");
		test.setTestComment("This is a test");
		test.setTestCode("System.out.println(\"Hello World\");");
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "HelloWorld", xmlPath);
		String priorTestCode = test.getTestCode();
		String testCodeAfter = concreteTestGenerator.updateConcreteTest(test).getTestCode();
		assertFalse(testCodeAfter.equals(priorTestCode));
		//System.out.println(testCodeAfter);
		
	}

	@Test
	public void testCompileJavaFile() throws Exception {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "HelloWorld", xmlPath);
		File file = new File(tempTestDirectory + "HelloWorld" + ".java");
		concreteTestGenerator.compileJavaFile(tempTestDirectory, file);
	}

}
