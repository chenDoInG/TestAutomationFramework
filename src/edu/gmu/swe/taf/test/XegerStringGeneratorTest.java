package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import nl.flotsam.xeger.Xeger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class XegerStringGeneratorTest {

	private Xeger generator;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenerateString() {
		String regex = "[ab]{4,6}c";
		generator = new Xeger(regex);
		String result = generator.generate();
		assertEquals(true, result.matches(regex));
	}

}
