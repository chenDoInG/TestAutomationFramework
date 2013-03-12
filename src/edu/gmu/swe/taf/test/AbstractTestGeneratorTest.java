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
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import coverage.graph.InvalidGraphException;
import coverage.graph.Path;
import coverage.web.InvalidInputException;

import edu.gmu.swe.taf.AbstractTestGenerator;
import edu.gmu.swe.taf.ConstraintMapping;
import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.ModelAccessor;
import edu.gmu.swe.taf.StateMachineAccessor;
import edu.gmu.swe.taf.TestCoverageCriteria;
import edu.gmu.swe.taf.XmlManipulator;

/**
 * A JUnit test case for class {@link AbstractTestGenerator}
 * @author Nan Li
 * @version 1.0 Nov 28, 2012
 *
 */
public class AbstractTestGeneratorTest {
	
	String vendingMachinePath;
	String parserPath;
	String vendingMachineXmlPath;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		vendingMachinePath = "testData/model/VendingMachineFSM.uml";
		vendingMachineXmlPath = "testData/xml/vendingMachineMappings.xml";
		parserPath = "testData/DynamicParser/model/SimplifiedParserFSM.uml";
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTestPaths() throws IOException, InvalidInputException, InvalidGraphException {
		
		EObject object = StateMachineAccessor.getModelObject(vendingMachinePath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.PRIMEPATHCOVERAGE);
		
		/*
		String[] edges = stateMachine.getEdges().split("\n");
		for(String edge : edges){
			String[] vertices = edge.split(" ");
			//System.out.println(vertices[0]+ " :: " + vertices[1]);
			System.out.println(stateMachine.getReversedStateMappings().get(vertices[0]).getName() + " :: " + stateMachine.getReversedStateMappings().get(vertices[1]).getName());
			//System.out.println(stateMachine.getReversedStateMappings().get(vertices[1]).getName());
		}*/
		assertNotNull(paths);
		System.out.println(paths);
	}
	
	@Test
	public void testGetPathByVertex() throws IOException, InvalidInputException, InvalidGraphException{
		
		EObject object = StateMachineAccessor.getModelObject(vendingMachinePath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		System.out.println(vertexes);
		assertEquals(vertexes.size(), 3);
	}

	@Test
	public void testConvertToTransitions() throws IOException, InvalidInputException, InvalidGraphException{
		
		EObject object = StateMachineAccessor.getModelObject(vendingMachinePath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		AbstractTestGenerator.constraintSolver constraintSolver = abstractTestGenerator. new constraintSolver();
		List<Transition> mappings = abstractTestGenerator.convertVerticesToTransitions(vertexes, stateMachine);
		assertEquals(mappings.size(), 2);
	}
	
	/*
	@Test
	public void testSolveConstraints() throws Exception{
		
		EObject object = StateMachineAccessor.getModelObject(path);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		List<Path> paths = AbstractTestGenerator.getTestPathsForEdgeCoverage(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		System.out.println(paths.get(0));
		System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		AbstractTestGenerator.constraintSolver constraintSolver = abstractTestGenerator. new constraintSolver();
		List<Transition> mappings = abstractTestGenerator.convertVerticesToTransitions(vertexes, stateMachine);
		
		constraintSolver.solveConstraints(mappings, vendingMachineXmlPath);
		assertEquals(mappings.size(), 2);
	}
	*/
	
	/**
	 * Test the method UpdateTest()
	 * @throws Exception
	 */
	@Test
	public void testUpdateTest() throws Exception{
		
		EObject object = StateMachineAccessor.getModelObject(vendingMachinePath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		//System.out.println(stateMachine.getStateMappings());
		//System.out.println(stateMachine.getEdges());
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		//System.out.println(paths.get(0));
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(AbstractTestGenerator.getPathByState(paths.get(9), stateMachine), stateMachine);
		
		for(Transition transition: transitions)
			System.out.println(transition);
		
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("test", "", transitions);
		test = abstractTestGenerator.updateTest(vendingMachineXmlPath, test, XmlManipulator.getConstraintMappings(vendingMachineXmlPath));
		
		System.out.println(test.getTestCode());
		assertEquals(test.getMappings().size(), 19);
	}
	
	/**
	 * Test the method UpdateTest() using the parserPath
	 * @throws Exception
	 */
	@Test
	public void testUpdateTestParser() throws Exception{
		
		EObject object = StateMachineAccessor.getModelObject(parserPath);
		List<StateMachine> statemachines = StateMachineAccessor.getStateMachines(object);
		List<Region> regions = StateMachineAccessor.getRegions(statemachines.get(0));
		//System.out.println("region before : " + regions.get(0).getTransitions().size());
		StateMachineAccessor stateMachine = new StateMachineAccessor(regions.get(0));
		System.out.println("region after : " + regions.get(0).getTransitions().size());
		System.out.println("edges : " + stateMachine.getEdges());
		System.out.println(stateMachine.getStateMappings());
		/*
		for(Transition t1 : regions.get(0).getTransitions()){
			System.out.println(t1.getName() + " " + t1.getSource().getName() + " " + t1.getTarget().getName());
		}*/
		List<Path> paths = AbstractTestGenerator.getTestPaths(stateMachine.getEdges(), stateMachine.getInitialStates(), stateMachine.getFinalStates(), TestCoverageCriteria.EDGECOVERAGE);
		System.out.println(stateMachine.getInitialStates());
		System.out.println(stateMachine.getFinalStates());
		System.out.println(paths);
		//System.out.println(stateMachine.getStateMappings());
		
		//get the vertices from a path and return a list of transitions based on the vertices
		
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		List<Transition> transitions = abstractTestGenerator.convertVerticesToTransitions(AbstractTestGenerator.getPathByState(paths.get(0), stateMachine), stateMachine);
		
		for(Transition transition: transitions)
			System.out.println(transition);
		/*
		edu.gmu.swe.taf.Test test = new edu.gmu.swe.taf.FsmTest("test", "", transitions);
		test = abstractTestGenerator.updateTest(vendingMachineXmlPath, test, XmlManipulator.getConstraintMappings(vendingMachineXmlPath));
		
		System.out.println(test.getTestCode());
		assertEquals(test.getMappings().size(), 19);*/
	}
	
	/**
	 * Test the method getConstraints()
	 * @throws Exception 
	 */
	@Test
	public void testGetConstraints() throws Exception{
		List<ConstraintMapping> nodes = XmlManipulator.getConstraintMappings(vendingMachineXmlPath);
		List<Mapping> mappings = AbstractTestGenerator.getConstraints(nodes);
		/*
		for(Mapping mapping: mappings){
			System.out.println(mapping.getMappingName() + " " + mapping.getIdentifiableElementName() + " " + mapping.getTestCode());
		}*/
		assertEquals(6, mappings.size());
	}
}
