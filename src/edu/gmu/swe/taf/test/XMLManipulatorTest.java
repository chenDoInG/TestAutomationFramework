package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;

import edu.gmu.swe.taf.IdentifiableElementType;
import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.Parameter;
import edu.gmu.swe.taf.XMLManipulator;

/**
 * A JUnit test case for class {@link XMLManipulator}
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 *
 */

public class XMLManipulatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests the method CreateXMLFile()
	 * @throws ParserConfigurationException
	 * @throws TransformerException
	 */
	@Test
	public void testCreateXMLFile() throws ParserConfigurationException, TransformerException {
		String directory = "data/";
		String fileName = "vendingMachineMappings";
		
		XMLManipulator.createXMLFile(directory, fileName);
		File file = new File(directory + fileName + ".xml");
		assertEquals(file.exists(), true);
	}
	
	/**
	 * Tests the method ReadXMLFile()
	 * @throws Exception
	 */
	@Test
	public void testReadXMLFile() throws Exception{
		String path = "data/vendingMachineMappings.xml";

		Document doc = XMLManipulator.readXMLFile(path);
		assertNotNull(doc);
	}
	
	@Test
	public void testCreateMapping() throws Exception{
		String mappingName = "vMachineInit";
		String identifiedElementName = "vm";
		IdentifiableElementType type = IdentifiableElementType.CLASSOBJECT;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters);
		
		String path = "data/vendingMachineMappings.xml";

		Document doc = XMLManipulator.readXMLFile(path);
		
		XMLManipulator xm = new XMLManipulator();
		xm.createObjectMapping(doc, mapping, path);
	}

}
