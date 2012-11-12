package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ManipulateXMLTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		//String path = "src/edu/gmu/swe/account.xml";
		String path = "data/vendingMachineMappings.xml";
		createXMLFile("data/", "vendingMachineMappings");
		Document doc = readXMLFile(path);
		System.out.println(doc);
		createObjectMapping(doc, "vMachineInit", "vm", "vendingMachine", "vendingMachine vm = new vendingMachine();", path);
	}
	
	/**
	 * create an XML file named after the parameter "fileName" in the specified directory
	 * 
	 * directory can be absolute or relate
	 * e.g. src/edu/gmu/swe/
	 * 
	 * fileName e.g. vendingMachineMappings
	 * no need to add .xml
	 * 
	 * @param directory
	 * @param fileName
	 * @throws ParserConfigurationException
	 * @throws TransformerException
	 */
	public void createXMLFile(String directory, String fileName) throws ParserConfigurationException, TransformerException{
		File file = new File(directory + fileName + ".xml");
		if(!file.exists()){
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("mappings");
			doc.appendChild(rootElement);
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(file);
			 
			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
			 
			transformer.transform(source, result);
			 
			System.out.println("File saved!");
		}
		else{
			System.out.println(directory + fileName + ".xml has existed");
		}
	}
	
	/**
	 * read an XML file and return an XML Document object
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public Document readXMLFile(String path) throws Exception{
		if(path == null){
			throw new Exception("No path for reading XML");
		}
		
		//Document doc;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//	dbf.setAttribute(path, schema);
			DocumentBuilder db = dbf.newDocumentBuilder();
			//used for absolutepath
			//String uri = "file:" + new File(path).getAbsolutePath();
			Document doc = db.parse(path);
			doc.normalize();
			return doc;
		}
		catch (SAXParseException ex) {
		    System.out.println("SAXParseException: " + ex);
		    System.out.println("SAXParse error in XMLParser.readDoc(" + path + ")");
		    return null;
		} 
		catch (SAXException ex) {
		    System.out.println("SAXException: " + ex);
		    System.out.println("SAXParse error in XMLParser.readDoc(" + path + ")");
		    return null;
		} 		
	}
	
	/**
	 * 
	 * @param doc
	 * @param userName
	 * @param digest
	 * @param salt
	 * @throws TransformerException
	 */
	public boolean createObjectMapping(Document doc, String mappingName, String objectName, String className, String testCode, String path) throws TransformerException{
		
		//Check whether the user has existed in the database
		boolean isExisted = false;
		NodeList sectionUserName = doc.getElementsByTagName("name");
		for(int i = 0; i < sectionUserName.getLength();i++){
			System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase(mappingName)){
				isExisted = true;
				break;
			}
		}
		if(!isExisted){
			Element root = doc.getDocumentElement();
			Element accountNode = doc.createElement("mapping");
			//Node lastNode = doc.getLastChild();
			//add user name node
			Element nameNode = doc.createElement("name");
			Text nameText = doc.createTextNode(mappingName);
			nameNode.appendChild(nameText);
			accountNode.appendChild(nameNode);
			//add password node
			Element objectNameNode = doc.createElement("object-name");
			Text objectNameText = doc.createTextNode(objectName);
			objectNameNode.appendChild(objectNameText);
			accountNode.appendChild(objectNameNode);
			//add salt node
			Element classNameNode = doc.createElement("class-name");
			Text classNameText = doc.createTextNode(className);
			classNameNode.appendChild(classNameText);
			accountNode.appendChild(classNameNode);
			
			//add salt node
			Element codeNode = doc.createElement("code");
			Text codeText = doc.createTextNode(testCode);
			codeNode.appendChild(codeText);
			accountNode.appendChild(codeNode);
			
			root.appendChild(accountNode);
			//root.insertBefore(accountNode, lastNode);
			rewriteXml(doc,path);
			return true;
		}
		System.out.println("The user account has existed");
		return false;
	}
	
	/**
	 * rewrite the Xml file based on the new DOM tree
	 * @param sourceDocument
	 * @param destinationXml
	 * @throws TransformerException
	 */
	private void rewriteXml(Document sourceDocument, String destinationXml) throws TransformerException{
		//write the new child nodes to the xml file
		TransformerFactory tFactory =TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		DOMSource source = new DOMSource(sourceDocument);
		StreamResult result = new StreamResult(new File(destinationXml));
		transformer.transform(source, result);
	}

}
