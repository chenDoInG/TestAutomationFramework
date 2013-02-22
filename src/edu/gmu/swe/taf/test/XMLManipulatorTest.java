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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import edu.gmu.swe.taf.ConstraintMapping;
import edu.gmu.swe.taf.ObjectMapping;
import edu.gmu.swe.taf.IdentifiableElementType;
import edu.gmu.swe.taf.Mapping;
import edu.gmu.swe.taf.Parameter;
import edu.gmu.swe.taf.XmlManipulator;

/**
 * A JUnit test case for class {@link XmlManipulator}
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 *
 */

public class XmlManipulatorTest {

	String xmlPath;
	String xmlDirectory;
	String fileName;
	@Before
	public void setUp() throws Exception {
		xmlPath = "testData/xml/vendingMachineMappings.xml";
		xmlDirectory = "testData/xml/";
		fileName = "vendingMachineMappings";
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
		XmlManipulator.createXmlFile(xmlDirectory, fileName);
		File file = new File(xmlDirectory + fileName + ".xml");
		assertEquals(file.exists(), true);
	}
	
	/**
	 * Tests the method ReadXMLFile()
	 * @throws Exception
	 */
	@Test
	public void testReadXMLFile() throws Exception{

		Document doc = XmlManipulator.readXmlFile(xmlPath);
		assertNotNull(doc);
	}
	
	/**
	 * Tests the method CreateMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateMapping() throws Exception{
		String mappingName = "addChocolate";
		String identifiedElementName = "addChocs";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vm.addChoc(\"MM\");";
		List<String> mappings = new ArrayList<String>();
		mappings.add("vMachineInit");
		List<String> parameters = new ArrayList<String>();

		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters, null, null);

		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		XmlManipulator xm = new XmlManipulator();

		xm.createMapping(doc, mapping, xmlPath);

		//Check if the mapping "addChocolate" has been added to the Document object in the XML file specified by path
		doc = XmlManipulator.readXmlFile(xmlPath);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			//System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("addChocolate")){
				isExisted = true;
			}
		}
		assertEquals(true, isExisted);
	}
	
	/**
	 * Creates a mapping for the transition initialize
	 * @throws Exception
	 */
	@Test
	
	public void testCreateMappingInitialize() throws Exception{
		String mappingName = "initializeVendingMachine";
		String identifiedElementName = "initialize";
		String objectName = "vm";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, null, null, null);

		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		XmlManipulator xm = new XmlManipulator();

		xm.createMapping(doc, mapping, xmlPath);
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
		String testCode = "vm.coin(10);\n" +"vm.coin(25);\n" + "vm.coin(25);\n" + "vm.coin(25);\n" + "vm.coin(25);\n";
		List<String> mappings = new ArrayList<String>();
		mappings.add("vMachineInit");
		List<String> parameters = new ArrayList<String>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters, null, null);

		Document doc = XmlManipulator.readXmlFile(xmlPath);		
		XmlManipulator xm = new XmlManipulator();
		xm.createMapping(doc, mapping, xmlPath);
		
		//Check if the mapping "addChocolate" has been added to the Document object in the XML file specified by path
		doc = XmlManipulator.readXmlFile(xmlPath);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			//System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
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
		List<Mapping> parameters = new ArrayList<Mapping>();
		Parameter p = new Parameter("int", "c");
		//parameters.add(p);
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, null, null, null);

		Document doc = XmlManipulator.readXmlFile(xmlPath);		
		XmlManipulator xm = new XmlManipulator();
		xm.createMapping(doc, mapping, xmlPath);
		
		//Check if the mapping "coinAnyCredit" has been added to the Document object in the XML file specified by path
		doc = XmlManipulator.readXmlFile(xmlPath);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			//System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("coinAnyCredit")){
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
	public void testCreateMappingForTransitionCoinThreeValues() throws Exception{
		//Insert the mapping "coinAnyCredit" into an XML file
		String mappingName = "coinThreeValues";
		String identifiedElementName = "coin";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vm.coin(c);";
		List<String> mappings = new ArrayList<String>();
		mappings.add("vMachineInit");
		List<String> parameters = new ArrayList<String>();
		parameters.add("intCInit");
		
		//a parameter mapping for int c
		String parameterMappingName = "intCInit";
		String paramterIdentifiableElementName = "c";		
		IdentifiableElementType parameterType = IdentifiableElementType.OBJECT;
		String parameterTestCode = "10,25,100";
		
		ObjectMapping parameterMapping = new ObjectMapping(parameterMappingName, parameterType, paramterIdentifiableElementName, "int", parameterTestCode, null, null);
		
		//parameters.add(parameterMapping);
		mappings.add("intCInit");
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters, null, null);

		Document doc = XmlManipulator.readXmlFile(xmlPath);		
		XmlManipulator xm = new XmlManipulator();
		xm.createObjectMapping(doc, parameterMapping, xmlPath);
		xm.createMapping(doc, mapping, xmlPath);
		
		//Check if the mapping "coinAnyCredit" has been added to the Document object in the XML file specified by path
		doc = XmlManipulator.readXmlFile(xmlPath);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			//System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("coinThreeValues")){
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
	public void testCreateMappingForTransitionGetChocs() throws Exception{
		//Insert the mapping "getChocs" into an XML file
		String mappingName = "getChocolate";
		String identifiedElementName = "getChocs";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "StringBuffer sb = new StringBuffer(\"MM\");\n" + "vm.getChoc(sb);\n";
		
		List<String> required = new ArrayList<String>();
		required.add("vMachineInit");
		
		//add parameters
		/*
		List<Parameter> parameters = new ArrayList<Parameter>();
		Parameter p = new Parameter("int", "c");
		parameters.add(p);
		*/
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, required, null, null, null);
		
		Document doc = XmlManipulator.readXmlFile(xmlPath);		
		XmlManipulator xm = new XmlManipulator();
		xm.createMapping(doc, mapping, xmlPath);
		
		//Check if the mapping "getChocolate" has been added to the Document object in the XML file specified by path
		doc = XmlManipulator.readXmlFile(xmlPath);
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		
		for(int i = 0; i < sectionUserName.getLength();i++){
			//System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase("getChocolate")){
				isExisted = true;
			}
		}
		assertEquals(true, isExisted);
	}
	
	/**
	 * Tests the method CreateObjectMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateObjectMapping() throws Exception{
		String mappingName = "vMachineInit";
		String className = "VendingMachine";
		String identifiedElementName = "vm";
		IdentifiableElementType type = IdentifiableElementType.OBJECT;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<String> parameters = new ArrayList<String>();
		
		ObjectMapping mapping = new ObjectMapping(mappingName, type, identifiedElementName, className, testCode, mappings, parameters);

		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		XmlManipulator xm = new XmlManipulator();

		xm.createObjectMapping(doc, mapping, xmlPath);
	}
	
	/**
	 * Tests the method CreateObjectMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateObjectMapping1() throws Exception{
		String mappingName = "stringBufferInit";
		String className = "StringBuffer";
		String identifiedElementName = "sb";
		IdentifiableElementType type = IdentifiableElementType.OBJECT;
		String testCode = "StringBuffer sb = new StringBuffer(\"MM\");";
		List<String> mappings = new ArrayList<String>();
		List<String> parameters = new ArrayList<String>();
		
		ObjectMapping mapping = new ObjectMapping(mappingName, type, identifiedElementName, className, testCode, mappings, parameters);

		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		XmlManipulator xm = new XmlManipulator();

		xm.createObjectMapping(doc, mapping, xmlPath);
	}
	
	/**
	 * Tests the method CreateConstraintMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateConstraintMapping() throws Exception{
		String mappingName = "constraintStockEqualsTenMapping";
		String identifiedElementName = "ConstraintStockEqualsTen";
		IdentifiableElementType type = IdentifiableElementType.CONSTRAINT;
		String testCode = "vm.getStock() == 10;";
		List<String> requiredMappings = new ArrayList<String>();
		requiredMappings.add("vMachineInit");
		List<String> parameters = new ArrayList<String>();
		List<String> stateinvariants = new ArrayList<String>();
		stateinvariants.add("State7");
		stateinvariants.add("State8");
		stateinvariants.add("State9");
		
		ConstraintMapping mapping = new ConstraintMapping(mappingName, type, identifiedElementName, testCode, requiredMappings, parameters, requiredMappings, null, null, null, null, stateinvariants);

		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		XmlManipulator xm = new XmlManipulator();

		xm.createConstraintMapping(doc, mapping, xmlPath);
	}
	
	/**
	 * Tests the method CreateConstraintMapping()
	 * @throws Exception
	 */
	@Test
	public void testCreateConstraintMapping1() throws Exception{
		String mappingName = "constraintStockBetweenOneAndTen";
		String identifiedElementName = "ConstraintStockBetweenOneAndTen";
		IdentifiableElementType type = IdentifiableElementType.CONSTRAINT;
		String testCode = "vm.getStock().size() > 0 && vm.getStock().size() < 10;";
		List<String> requiredMappings = new ArrayList<String>();
		requiredMappings.add("vMachineInit");
		List<String> parameters = new ArrayList<String>();
		List<String> stateinvariants = new ArrayList<String>();
		stateinvariants.add("State4");
		stateinvariants.add("State5");
		stateinvariants.add("State6");
		
		ConstraintMapping mapping = new ConstraintMapping(mappingName, type, identifiedElementName, testCode, requiredMappings, parameters, requiredMappings, null, null, null, null, stateinvariants);

		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		XmlManipulator xm = new XmlManipulator();

		xm.createConstraintMapping(doc, mapping, xmlPath);
	}
	
	@Test
	public void testRemoveMapping() throws Exception{
		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		String mappingName = "vMachineInit";
		String className = "VendingMachine";
		String identifiedElementName = "vm";
		IdentifiableElementType type = IdentifiableElementType.OBJECT;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<String> parameters = new ArrayList<String>();
		
		Mapping mapping = new ObjectMapping(mappingName, type, identifiedElementName, className, testCode, mappings, parameters);
		
		NodeList mappingNames = doc.getElementsByTagName("mapping");
		for(int i = 0; i < mappingNames.getLength(); i++){
			Node node = mappingNames.item(i);
			NodeList allFields = node.getChildNodes();
			
			for(int j = 0; j < allFields.getLength();j++){
				if(allFields.item(j).getNodeName().equalsIgnoreCase("name")){
					if(allFields.item(j).getTextContent().equalsIgnoreCase(mapping.getMappingName())){
						
						node.getParentNode().removeChild(node);
						doc.normalize();
						XmlManipulator.rewriteXml(doc, xmlPath);
						
						break;
					}	
				}
				else{
					break;
				}
			}
		}
	}
	
	/**
	 * Tests the method rewriteXml
	 * @throws Exception
	 */
	@Test
	public void testRewriteXml() throws Exception{
		Document doc = XmlManipulator.readXmlFile(xmlPath);
		
		String mappingName = "vMachineInit";
		String className = "VendingMachine";
		String identifiedElementName = "vm";
		IdentifiableElementType type = IdentifiableElementType.OBJECT;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<String> parameters = new ArrayList<String>();
		
		Mapping mapping = new ObjectMapping(mappingName, type, identifiedElementName, className, testCode, mappings, parameters);
		
		//String mappingName = mapping.getMappingName();
		NodeList mappingNames = doc.getElementsByTagName("mapping");
		//System.out.println("size: " + mappingNames.getLength());
		for(int i = 0; i < mappingNames.getLength(); i++){
			Node node = mappingNames.item(i);
			//System.out.println("child size: " + node.getChildNodes().getLength());
			NodeList allFields = node.getChildNodes();
			boolean flag = false;
			for(int j = 0; j < allFields.getLength();j++){
				//System.out.println(allFields.item(j).getNodeName() + ": " + allFields.item(j).getTextContent());
				
				if(allFields.item(j).getNodeName().equalsIgnoreCase("name")){
					if(allFields.item(j).getTextContent().equalsIgnoreCase(mapping.getMappingName())){
						flag = true;
					}
					else{
						break;
					}
				}
				
				if(flag == true){
					node.getParentNode().removeChild(node);
					doc.normalize();
					XmlManipulator.rewriteXml(doc, xmlPath);
					
					break;
				}
				
				
			}
		}
	}
	
	/**
	 * Tests the method GetMatchedTransitionMappings
	 * @throws Exception 
	 */
	@Test
	public void testGetMatchedMappings() throws Exception{
		List<Node> nodes = XmlManipulator.getMatchedTransitionMappings(xmlPath, "coin");
		assertEquals(2, nodes.size());
		List<Node> nodes1 = XmlManipulator.getMatchedTransitionMappings(xmlPath, "initialize");
		assertEquals(1, nodes1.size());
	}
	
	/**
	 * Tests the method GetMappingsByTransition
	 * @throws Exception 
	 */
	@Test
	public void testGetMappingsByTransition() throws Exception{
		List<Mapping> nodes = XmlManipulator.getMappingsByTransition(xmlPath, "coin");
		//System.out.println(nodes.get(0).getTestCode());
		assertEquals(2, nodes.size());
	}
	
	/**
	 * Tests the method GetConstraintMappings
	 * @throws Exception 
	 */
	@Test
	public void testGetConstraintMappings() throws Exception{
		List<ConstraintMapping> nodes = XmlManipulator.getConstraintMappings(xmlPath);
		//System.out.println(nodes.get(0).getTestCode());
		assertEquals(1, nodes.size());
	}
	
	/**
	 * Tests the method UpdateMapping
	 * @throws Exception 
	 * 
	 */
	@Test
	public void testUpdateMapping() throws Exception{
		//Insert the mapping "getChocs" into an XML file
		String mappingName = "getChocolate";
		String identifiedElementName = "getChocs";
		IdentifiableElementType type = IdentifiableElementType.TRANSITION;
		String testCode = "vm.getChoc(sb);\n";
		
		List<String> required = new ArrayList<String>();
		required.add("vMachineInit");
		required.add("stringBufferInit");
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, required, null, null, null);
		
		Document doc = XmlManipulator.readXmlFile(xmlPath);		
		XmlManipulator xm = new XmlManipulator();
		xm.updateMapping(doc, mapping, xmlPath);
	}
	
	/**
	 * Tests the method getClassMappingByName()
	 * @throws Exception 
	 */
	@Test
	public void testGetObjectMappingByName() throws Exception{

		Mapping cm = XmlManipulator.getObjectMappingByName(xmlPath, "vMachineInit");
		assertEquals(cm.getMappingName(), "vMachineInit");
	}

}
