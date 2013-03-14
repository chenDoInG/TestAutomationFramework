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
import edu.gmu.swe.taf.IdentifiableElementType;
import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.ObjectMapping;
import edu.gmu.swe.taf.StateMachineAccessor;
import edu.gmu.swe.taf.TestCoverageCriteria;
import edu.gmu.swe.taf.XmlManipulator;
import edu.gmu.swe.taf.AbstractTestGenerator.constraintSolver;

public class ConcreteTestGeneratorTest {

	String vendingMachineUMLPath;
	String vendingMachineXmlPath;
	String vendingMachineDirectory = "testData/VendingMachine/";
	String vendingMachineTestName = "VendingMachineTest";
	String parserUMLPath = "testData/DynamicParser/model/SimplifiedParserFSM.uml";;
	String parserXmlPath = "testData/DynamicParser/xml/SimplifiedParserFSM.xml";;
	String parserDirectory = "testData/DynamicParser/";
	String parserTestName = "DynamicParserTest";
	String ticTacToePath = "testData/TicTacToe/model/TicTacToeFSM.uml";
	String ticTacToeXmlPath = "testData/TicTacToe/xml/TicTacToeFSM.xml";
	String ticTacToeDirectory = "testData/TicTacToe/";
	String ticTacToeTestName = "TicTacToeTest";
	String treePath = "testData/Tree/model/TreeFSM.uml";
	String treeXmlPath = "testData/Tree/xml/TreeFSM.xml";
	String treeDirectory = "testData/Tree/";
	String treeTestName = "TreeTest";
	
	@Before
	public void setUp() throws Exception {
		vendingMachineUMLPath = "testData/VendingMachine/model/VendingMachineFSM.uml";
		vendingMachineXmlPath = "testData/VendingMachine/xml/vendingMachineMappings.xml";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConcreteTestGenerator() throws Exception {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "HelloWorld", vendingMachineXmlPath, "", "");
		assertEquals(vendingMachineDirectory, concreteTestGenerator.getDirectory());
		assertEquals("HelloWorld", concreteTestGenerator.getTestName());
	}

	@Test
	public void testGenerateConcreteTests() throws Exception {
		
		EObject object = StateMachineAccessor.getModelObject(vendingMachineUMLPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		//List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
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
			test = abstractTestGenerator.updateTest(vendingMachineXmlPath, test, XmlManipulator.getConstraintMappings(vendingMachineXmlPath));
			tests.add(test);
		}
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, vendingMachineTestName, vendingMachineXmlPath, "", "");
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
		EObject object = StateMachineAccessor.getModelObject(vendingMachineUMLPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		//System.out.println(paths.get(0));
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(5), stateMachine), stateMachine);

		//add the test comments
		String pathName = "" + transitions.get(0).getSource().getName() + " ";
		for(Transition transition: transitions){
			//System.out.println(transition.getSource().getName());
			//System.out.println(transition);	
			//System.out.println(transition.getTarget().getName());	
			pathName += transition.getName() + " ";
			pathName += transition.getTarget().getName() + " ";
		}
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("1", "The test for the path " + pathName, transitions);
		test = abstractTestGenerator.updateTest(vendingMachineXmlPath, test, XmlManipulator.getConstraintMappings(vendingMachineXmlPath));
		
		/**
		 * Generates the concrete test
		 */
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "VendingMachineTest", vendingMachineXmlPath, "", "");

		File file = new File(vendingMachineDirectory + "VendingMachineTest" + ".java");
		//I should refactoring the this method by moving updateConcreteTest method inside
		concreteTestGenerator.createConcreteTestCase(vendingMachineDirectory, file, concreteTestGenerator.updateConcreteTest(test));
	}
	
	/**
	 * The test for the method "createConcreteTestCase(String, File, Test)" for the program Dynamic Parser
	 * @throws Exception
	 */

	@Test
	public void testCreateConcreteTestCaseParser() throws Exception {
		
		/**
		 * Computes the test
		 */
		EObject object = StateMachineAccessor.getModelObject(parserUMLPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		//System.out.println(paths.get(0));
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(5), stateMachine), stateMachine);

		//add the test comments
		String pathName = "" + transitions.get(0).getSource().getName() + " ";
		for(Transition transition: transitions){
			//System.out.println(transition.getSource().getName());
			//System.out.println(transition);	
			//System.out.println(transition.getTarget().getName());	
			pathName += transition.getName() + " ";
			pathName += transition.getTarget().getName() + " ";
		}
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("1", "The test for the path " + pathName, transitions);
		test = abstractTestGenerator.updateTest(parserXmlPath, test, XmlManipulator.getConstraintMappings(parserXmlPath));
		System.out.println(pathName);

		/**
		 * Generates the concrete test
		 */
		String imports = "import javax.swing.*;\n";
		String packageName = "package osa.ora;\n";
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(parserDirectory, parserTestName, parserXmlPath, packageName, imports);

		File file = new File(parserDirectory + "test/" + parserTestName + ".java");
		//I should refactoring the this method by moving updateConcreteTest method inside
		concreteTestGenerator.createConcreteTestCase(parserDirectory, file, concreteTestGenerator.updateConcreteTest(test));
		
		List<edu.gmu.swe.taf.Test> tests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(int i = 0; i < paths.size();i++){
			System.out.println("path: " + paths.get(i));
			List<Transition> transitions1 = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(i), stateMachine), stateMachine);
			
		    pathName = "";
			for(Transition transition: transitions1){
				System.out.println(transition);
				pathName += transition.getName() + " ";
			}
			edu.gmu.swe.taf.Test test1 = new edu.gmu.swe.taf.FsmTest(String.valueOf(i), "The test for the path " + pathName, transitions1);
			test1 = abstractTestGenerator.updateTest(parserXmlPath, test1, XmlManipulator.getConstraintMappings(parserXmlPath));
			tests.add(test1);
		}
		
		concreteTestGenerator.generateConcreteTests(tests);
	}
	
	/**
	 * The test for the method "createConcreteTestCase(String, File, Test)" for the program TicTacToe
	 * @throws Exception
	 */

	@Test
	public void testCreateConcreteTestCaseTicTacToe() throws Exception {
		
		/**
		 * Computes the test
		 */
		EObject object = StateMachineAccessor.getModelObject(ticTacToePath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		//System.out.println(paths.get(0));
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(1), stateMachine), stateMachine);

		//add the test comments
		String pathName = "" + transitions.get(0).getSource().getName() + " ";
		for(Transition transition: transitions){
			//System.out.println(transition.getSource().getName());
			//System.out.println(transition);	
			//System.out.println(transition.getTarget().getName());	
			pathName += transition.getName() + " ";
			pathName += transition.getTarget().getName() + " ";
		}
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("1", "The test for the path " + pathName, transitions);
		test = abstractTestGenerator.updateTest(ticTacToeXmlPath, test, XmlManipulator.getConstraintMappings(ticTacToeXmlPath));
		System.out.println(pathName);

		/**
		 * Generates the concrete test
		 */
		String imports = "\n";
		String packageName = "\n";
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(ticTacToeDirectory, ticTacToeTestName, ticTacToeXmlPath, packageName, imports);

		File file = new File(ticTacToeDirectory + "test/" + ticTacToeTestName + ".java");
		//I should refactoring the this method by moving updateConcreteTest method inside
		concreteTestGenerator.createConcreteTestCase(ticTacToeDirectory, file, concreteTestGenerator.updateConcreteTest(test));
		
		List<edu.gmu.swe.taf.Test> tests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(int i = 0; i < paths.size();i++){
			AbstractTestGenerator abstractTestGenerator1 = new AbstractTestGenerator();
			System.out.println("path: " + paths.get(i));
			List<Transition> transitions1 = abstractTestGenerator1.convertVerticesToTransitions(abstractTestGenerator1.getPathByState(paths.get(i), stateMachine), stateMachine);
			
			pathName = "" + transitions1.get(0).getSource().getName() + " ";
			for(Transition transition: transitions1){	
				pathName += transition.getName() + " ";
				pathName += transition.getTarget().getName() + " ";
			}
			
			edu.gmu.swe.taf.Test test1 = new edu.gmu.swe.taf.FsmTest(String.valueOf(i), "The test for the path " + pathName, transitions1);
			test1 = abstractTestGenerator1.updateTest(ticTacToeXmlPath, test1, XmlManipulator.getConstraintMappings(ticTacToeXmlPath));
			tests.add(test1);
		}
		
		concreteTestGenerator.generateConcreteTests(tests);
	}
	
	
	/**
	 * The test for the method "createConcreteTestCase(String, File, Test)" for the program Tree
	 * @throws Exception
	 */

	@Test
	public void testCreateConcreteTestCaseTree() throws Exception {
		
		/**
		 * Computes the test
		 */
		EObject object = StateMachineAccessor.getModelObject(treePath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		for(Transition transition : stateMachine.getTransitions())
			System.out.println(transition);
		System.out.println(stateMachine.getEdges());
		System.out.println(paths.get(1));
		System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(2), stateMachine), stateMachine);
		
		//add the test comments
		String pathName = "" + transitions.get(0).getSource().getName() + " ";
		for(Transition transition: transitions){
			//System.out.println(transition.getSource().getName());
			System.out.println(transition);	
			//System.out.println(transition.getTarget().getName());	
			pathName += transition.getName() + " ";
			pathName += transition.getTarget().getName() + " ";
		}
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("1", "The test for the path " + pathName, transitions);
		test = abstractTestGenerator.updateTest(treeXmlPath, test, XmlManipulator.getConstraintMappings(treeXmlPath));
		System.out.println(pathName);

		/**
		 * Generates the concrete test
		 */
		
		String imports = "\n";
		String packageName = "\n";
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(treeDirectory, treeTestName, treeXmlPath, packageName, imports);

		File file = new File(treeDirectory + "test/" + treeTestName + ".java");
		//I should refactoring the this method by moving updateConcreteTest method inside
		concreteTestGenerator.createConcreteTestCase(treeDirectory, file, concreteTestGenerator.updateConcreteTest(test));
		
		List<edu.gmu.swe.taf.Test> tests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(int i = 0; i < paths.size();i++){
			AbstractTestGenerator abstractTestGenerator1 = new AbstractTestGenerator();
			System.out.println("path: " + paths.get(i));
			List<Transition> transitions1 = abstractTestGenerator1.convertVerticesToTransitions(abstractTestGenerator1.getPathByState(paths.get(i), stateMachine), stateMachine);
			
			pathName = "" + transitions1.get(0).getSource().getName() + " ";
			for(Transition transition: transitions1){	
				pathName += transition.getName() + " ";
				pathName += transition.getTarget().getName() + " ";
			}
			
			edu.gmu.swe.taf.Test test1 = new edu.gmu.swe.taf.FsmTest(String.valueOf(i), "The test for the path " + pathName, transitions1);
			test1 = abstractTestGenerator1.updateTest(treeXmlPath, test1, XmlManipulator.getConstraintMappings(treeXmlPath));
			tests.add(test1);
		}
		
		concreteTestGenerator.generateConcreteTests(tests);
	}
	
	/**
	 * The test for the method "createConcreteTestCase(String, File, Test)"
	 * @throws Exception
	 */

	@Test
	public void testCreateConcreteTestCaseForFifthPathOfEdgeCoverage() throws Exception {
		
		/**
		 * Computes the test
		 */
		EObject object = StateMachineAccessor.getModelObject(vendingMachineUMLPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		
		//get the vertices from a path and return a list of transitions based on the vertices

		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(5), stateMachine), stateMachine);

		//add the test comments
		String pathName = "" + transitions.get(0).getSource().getName() + " ";
		for(Transition transition: transitions){

			pathName += transition.getName() + " ";
			pathName += transition.getTarget().getName() + " ";
		}
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("1", "The test for the path " + pathName, transitions);
		test = abstractTestGenerator.updateTest(vendingMachineXmlPath, test, XmlManipulator.getConstraintMappings(vendingMachineXmlPath));
		
		/**
		 * Generates the concrete test
		 */
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "VendingMachineTest", vendingMachineXmlPath, "", "");

		File file = new File(vendingMachineDirectory + "VendingMachineTest" + ".java");
		//I should refactoring the this method by moving updateConcreteTest method inside
		concreteTestGenerator.createConcreteTestCase(vendingMachineDirectory, file, concreteTestGenerator.updateConcreteTest(test));
	}
	
	/**
	 * The test for the method "createConcreteTestCase(String, File, Test)"
	 * @throws Exception
	 */

	@Test
	public void testCreateConcreteTestCasePrimePathCoverage() throws Exception {
		
		/**
		 * Computes the test
		 */
		EObject object = StateMachineAccessor.getModelObject(vendingMachineUMLPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.PRIMEPATHCOVERAGE);
		System.out.println(paths.get(1));
		System.out.println(paths.get(1).size());
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		//List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(abstractTestGenerator.getPathByState(paths.get(1), stateMachine), stateMachine);

		//add the test comments
		String pathName = "" + transitions.get(0).getSource().getName() + " ";
		for(Transition transition: transitions){
			//System.out.println(transition.getSource().getName());
			//System.out.println(transition);	
			//System.out.println(transition.getTarget().getName());	
			pathName += transition.getName() + " ";
			pathName += transition.getTarget().getName() + " ";
		}
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("1", "The test for the path " + pathName, transitions);
		test = abstractTestGenerator.updateTest(vendingMachineXmlPath, test, XmlManipulator.getConstraintMappings(vendingMachineXmlPath));
		
		/**
		 * Generates the concrete test
		 */
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "VendingMachineTest", vendingMachineXmlPath, "", "");

		File file = new File(vendingMachineDirectory + "VendingMachineTest" + ".java");
		//I should refactoring the this method by moving updateConcreteTest method inside
		concreteTestGenerator.createConcreteTestCase(vendingMachineDirectory, file, concreteTestGenerator.updateConcreteTest(test));
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
		EObject object = StateMachineAccessor.getModelObject(vendingMachineUMLPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		
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
			test = abstractTestGenerator.updateTest(vendingMachineXmlPath, test, null);
			tests.add(test);
		}
		/**
		 * Generates the concrete test
		 */
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "VendingMachineTest", vendingMachineXmlPath, "", "");

		File file = new File(vendingMachineDirectory + "VendingMachineTest" + ".java");
		List<edu.gmu.swe.taf.Test> finalTests = new ArrayList<edu.gmu.swe.taf.Test>();
		for(edu.gmu.swe.taf.Test test: tests)
			finalTests.add(concreteTestGenerator.updateConcreteTest(test));
		
		concreteTestGenerator.createConcreteTestCase(vendingMachineDirectory, file, finalTests);
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
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "HelloWorld", vendingMachineXmlPath, "", "");
		String priorTestCode = test.getTestCode();
		String testCodeAfter = concreteTestGenerator.updateConcreteTest(test).getTestCode();
		assertFalse(testCodeAfter.equals(priorTestCode));
		//System.out.println(testCodeAfter);
		
	}
	
	/**
	 * Tests the method calculateRequiredMappings
	 * @throws Exception 
	 */
	@Test
	public void testCalculateRequiredMappings() throws Exception{
		List<String> initialMappings = new ArrayList<String>();
		initialMappings.add("vMachineInit");
		initialMappings.add("stringBufferInit");
		initialMappings.add("intCInit");
		List<ObjectMapping> finalMappings = new ArrayList<ObjectMapping>();
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "HelloWorld", vendingMachineXmlPath, "", "");
		finalMappings = concreteTestGenerator.calculateRequiredMappings(finalMappings, initialMappings);
		for(Mapping s: finalMappings){
			//System.out.println(s.getMappingName());
			//System.out.println(s.getTestCode());
			//System.out.println(s.getRequiredMappings());
			//System.out.println(s.getParameters());
		}
		assertEquals(4, finalMappings.size());
	}
	
	/**
	 * Tests the method computeVarialbeInitialization()
	 * @throws Exception 
	 */
	@Test
	public void testComputeVarialbeInitialization() throws Exception{
		List<Mapping> mappings = new ArrayList<Mapping>();
		Mapping mapping = new Mapping();
		mappings.add(mapping);
		
		List<String> initialMappings = new ArrayList<String>();
		initialMappings.add("vMachineInit");
		initialMappings.add("stringBufferInit");
		initialMappings.add("intCInit");
		
		mapping.setRequiredMappings(initialMappings);

		StringBuffer variableInitialization = new StringBuffer("");
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "HelloWorld", vendingMachineXmlPath, "", "");
		variableInitialization = concreteTestGenerator.computeVariableInitialization(mappings);
		System.out.println(variableInitialization);
		assertEquals(true, variableInitialization.length() > 0);
	}
	
	/**
	 * Tests the method isContraintSatisfied()
	 * @throws Exception
	 */
	@Test
	public void testIsConstraintSatisfied() throws Exception {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "TempTest", vendingMachineXmlPath, "", "");

		List<Mapping> mappings = new ArrayList<Mapping>();
		mappings.add(new Mapping(null, null, null, "vendingMachine vm = new vendingMachine();", null, null, null, null));
		mappings.add(new Mapping(null, null, null, "vm.addChoc(\"MM\");", null, null, null, null));
		mappings.add(new Mapping(null, IdentifiableElementType.STATEINVARIANT, null, "(vm.getStock().size() < 10 && vm.getStock().size() > 0);", null, null, null, null));
		
		boolean sign = concreteTestGenerator.isConstraintSatisfied(mappings);
		assertEquals(true, sign);
	}
	
	/**
	 * Tests the method writeTempTest()
	 * @throws Exception
	 */
	@Test
	public void testWriteTempTest() throws Exception {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "TempTest", vendingMachineXmlPath, "", "");
		String testContent = "        vendingMachine vm = new vendingMachine();\n        vm.addChoc(\"MM\")\n";
		concreteTestGenerator.writeTempTest(testContent);

	}
	
	@Test
	public void testCompileJavaFile() throws Exception {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(vendingMachineDirectory, "VendingMachineTest", vendingMachineXmlPath, "", "");
		File file = new File(vendingMachineDirectory + "VendingMachineTest" + ".java");
		concreteTestGenerator.compileJavaFile(vendingMachineDirectory, file);
	}

}
