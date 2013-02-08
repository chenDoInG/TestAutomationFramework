package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
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
	String tempTestName = "tempTest";
	
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
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "HelloWorld");
		assertEquals(tempTestDirectory, concreteTestGenerator.getDirectory());
		assertEquals("HelloWorld", concreteTestGenerator.getName());
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
		List<Vertex> vertexes = AbstractTestGenerator.getPathByState(paths.get(0), stateMachine);
		AbstractTestGenerator abstractTestGenerator = new AbstractTestGenerator();
		AbstractTestGenerator.constraintSolver constraintSolver = abstractTestGenerator. new constraintSolver();
		List<Transition> mappings = constraintSolver.convertToTransitions(vertexes, stateMachine);
		
		String methodContent = constraintSolver.solveConstraints(mappings, xmlPath);
		
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, tempTestName);
		concreteTestGenerator.generateConcreteTests(methodContent);
	}

	@Test
	public void testCreateConcreteTest() throws IOException {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "HelloWorld");
		String methodContent = "System.out.println(\"Hello World\");";
		File file = new File(tempTestDirectory + "HelloWorld" + ".java");
		concreteTestGenerator.createConcreteTest(tempTestDirectory, file, "HelloWorld", methodContent);
	}

	@Test
	public void testCompileJavaFile() throws Exception {
		ConcreteTestGenerator concreteTestGenerator = new ConcreteTestGenerator(tempTestDirectory, "HelloWorld");
		File file = new File(tempTestDirectory + "HelloWorld" + ".java");
		concreteTestGenerator.compileJavaFile(tempTestDirectory, file);
	}

}
