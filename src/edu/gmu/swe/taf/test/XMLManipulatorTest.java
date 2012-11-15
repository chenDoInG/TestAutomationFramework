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
import org.w3c.dom.NodeList;

import edu.gmu.swe.taf.ClassMapping;
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
	
	/**
	 * Tests the method CreateMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateMapping() throws Exception{
		String mappingName = "addChocolate";
		String identifiedElementName = "addChoc";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vm.addChoc(\"MM\");";
		List<String> mappings = new ArrayList<String>();
		mappings.add("vMachineInit");
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters);
		
		String path = "data/vendingMachineMappings.xml";

		Document doc = XMLManipulator.readXMLFile(path);
		
		XMLManipulator xm = new XMLManipulator();

		xm.createMapping(doc, mapping, path);
		
		//Check if the mapping "addChocolate" has been added to the Document object in the XML file specified by path
		doc = XMLManipulator.readXMLFile(path);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("addChocolate")){
				isExisted = true;
			}
		}
		assertEquals(true, isExisted);
	}
	
	/**
	 * Tests the method CreateMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateMappingForTransitionAddChoc() throws Exception{
		//Insert the mapping "coinOneDollarAndTen" into an XML file
		String mappingName = "coinOneDollarAndTen";
		String identifiedElementName = "coin";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vm.coin(10); vm.coin(25); vm.coin(25); vm.coin(25); vm.coin(25);";
		List<String> mappings = new ArrayList<String>();
		mappings.add("vMachineInit");
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters);
		
		String path = "data/vendingMachineMappings.xml";

		Document doc = XMLManipulator.readXMLFile(path);		
		XMLManipulator xm = new XMLManipulator();
		xm.createMapping(doc, mapping, path);
		
		//Check if the mapping "addChocolate" has been added to the Document object in the XML file specified by path
		doc = XMLManipulator.readXMLFile(path);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("coinOneDollarAndTen")){
				isExisted = true;
			}
		}
		assertEquals(true, isExisted);
	}
	
	/**
	 * Tests the method CreateMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateMappingForTransitionCoin() throws Exception{
		//Insert the mapping "coinOneDollarAndTen" into an XML file
		String mappingName = "coinOneDollarAndTen";
		String identifiedElementName = "coin";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vm.coin(10); vm.coin(25); vm.coin(25); vm.coin(25); vm.coin(25);";
		List<String> mappings = new ArrayList<String>();
		mappings.add("vMachineInit");
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters);
		
		String path = "data/vendingMachineMappings.xml";

		Document doc = XMLManipulator.readXMLFile(path);		
		XMLManipulator xm = new XMLManipulator();
		xm.createMapping(doc, mapping, path);
		
		//Check if the mapping "addChocolate" has been added to the Document object in the XML file specified by path
		doc = XMLManipulator.readXMLFile(path);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("coinOneDollarAndTen")){
				isExisted = true;
			}
		}
		assertEquals(true, isExisted);
	}
	
	/**
	 * Tests the method CreateMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateMappingForTransitionCoinAnyCredit() throws Exception{
		//Insert the mapping "coinAnyCredit" into an XML file
		String mappingName = "coinAnyCredit";
		String identifiedElementName = "coin";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vm.coin(c);";
		List<String> mappings = new ArrayList<String>();
		mappings.add("vMachineInit");
		List<Parameter> parameters = new ArrayList<Parameter>();
		Parameter p = new Parameter("int", "c");
		parameters.add(p);
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters);
		
		String path = "data/vendingMachineMappings.xml";

		Document doc = XMLManipulator.readXMLFile(path);		
		XMLManipulator xm = new XMLManipulator();
		xm.createMapping(doc, mapping, path);
		
		//Check if the mapping "addChocolate" has been added to the Document object in the XML file specified by path
		doc = XMLManipulator.readXMLFile(path);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("coinOneDollarAndTen")){
				isExisted = true;
			}
		}
		assertEquals(true, isExisted);
	}
	
	/**
	 * Tests the method CreateClassMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateClassMapping() throws Exception{
		String mappingName = "vMachineInit";
		String identifiedElementName = "VendingMachine";
		String objectName = "vm";
		IdentifiableElementType type = IdentifiableElementType.CLASS;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		ClassMapping mapping = new ClassMapping(mappingName, type, identifiedElementName, objectName, testCode, mappings, parameters);
		
		String path = "data/vendingMachineMappings.xml";

		Document doc = XMLManipulator.readXMLFile(path);
		
		XMLManipulator xm = new XMLManipulator();

		xm.createClassMapping(doc, mapping, path);
	}

}
