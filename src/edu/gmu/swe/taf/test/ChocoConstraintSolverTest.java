package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gmu.swe.taf.util.ChocoConstraintSolver;

public class ChocoConstraintSolverTest {

	private ChocoConstraintSolver choco;
	
	@Before
	public void setUp() throws Exception {
		choco = new ChocoConstraintSolver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testChocoConstraintSolver() {
		//choco = new ChocoConstraintSolver();
	}

	@Test
	public void testSolveIntegerConstraint() {
		String[] conditions = {"> 0 "};
		String value = choco.solveIntegerConstraint(conditions);
		System.out.println(value);
		assertEquals("1", value);
	}

}
