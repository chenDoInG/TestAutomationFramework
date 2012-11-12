package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

	@Test
	public void testCreateXMLFile() throws ParserConfigurationException, TransformerException {
		String directory = "data/";
		String fileName = "vendingMachineMappings";
		XMLManipulator.createXMLFile(directory, fileName);
		File file = new File(directory + fileName + ".xml");
		assertEquals(file.exists(), true);
	}

}
