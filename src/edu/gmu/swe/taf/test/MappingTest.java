/**
 * 
 */
package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gmu.swe.taf.IdentifiableElementType;
import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.Parameter;

/**
 * A JUnit test case for class {@link Mapping}
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 *
 */
public class MappingTest {

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
		String mappingName = "vMachineInit";
		String identifiedElementName = "vm";
		IdentifiableElementType type = IdentifiableElementType.CLASSOBJECT;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters);
		
		assertEquals(mapping.getMappingName(), "vMachineInit");
		assertEquals(mapping.getIdentifiableElementName(), "vm");
		assertEquals(mapping.getType(), IdentifiableElementType.CLASSOBJECT);
		assertEquals(mapping.getTestCode(), "vendingMachine vm = new vendingMachine();");
		assertEquals(mapping.getRequiredMappings().size(), 0);
		assertEquals(mapping.getParameters().size(), 0);
	}

}
