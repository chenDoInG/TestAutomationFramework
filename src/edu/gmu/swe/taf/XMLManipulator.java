package edu.gmu.swe.taf;

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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;


/**
 * A class provides methods to manipulate XML files such as creating a new XML file, inserting a new node, 
 * deleting a node, and searching a node.
 * 
 * In this class, a node is a mapping.
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 *
 */
public class XMLManipulator {

	public void test() throws Exception {
		//String path = "src/edu/gmu/swe/account.xml";
		String path = "data/vendingMachineMappings.xml";
		createXMLFile("data/", "vendingMachineMappings");
		Document doc = readXMLFile(path);
		System.out.println(doc);
		createObjectMapping(doc, "vMachineInit", "vm", "vendingMachine", "vendingMachine vm = new vendingMachine();", path);
	}
	
	/**
	 * Creates an XML file named after the parameter "fileName" in the specified directory. 
	 * The directory can be absolute or relative.
	 * e.g. src/edu/gmu/swe/
	 * 
	 * fileName e.g. vendingMachineMappings
	 * No need to add .xml at the end of 
	 * 
	 * @param directory
	 * @param fileName
	 * @throws ParserConfigurationException
	 * @throws TransformerException
	 */
	public static void createXMLFile(String directory, String fileName) throws ParserConfigurationException, TransformerException{
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
	 * @param doc - a Document
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
	 * Rewrite the XML file based on the new DOM tree
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
