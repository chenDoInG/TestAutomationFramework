/**
 * 
 */
package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.Parameter;

/**
 * A JUnit test case for class {@link Parameter}
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 *
 */
public class ParameterTest {

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
	public void testConstructorAndGettersAndSetters() {
		String type = "int";
		String name = "c";
		
		Parameter parameter = new Parameter(type, name);
		
		assertEquals(parameter.getType(), "int");
		assertEquals(parameter.getName(), "c");
	}

}
