package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gmu.swe.taf.TestOracleLevel;
import edu.gmu.swe.taf.TestOracleMapping;

public class TestOracleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		TestOracleMapping to = new TestOracleMapping("firstTestOracle", "assertTrue(currentTransaction == null);", "initializaMapping", TestOracleLevel.TO1);
		assertEquals("firstTestOracle", to.getName());
		assertEquals("initializaMapping", to.getMappingName());
		assertEquals("assertTrue(currentTransaction == null);", to.getTestCode());
		assertEquals(TestOracleLevel.TO1, to.getToLevel());
	}

}
