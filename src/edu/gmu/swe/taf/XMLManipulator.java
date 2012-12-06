package edu.gmu.swe.taf;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
import org.w3c.dom.Node;
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

	/*
	public static void main() throws Exception {
		//String path = "src/edu/gmu/swe/account.xml";
		String path = "data/vendingMachineMappings.xml";
		createXMLFile("data/", "vendingMachineMappings");
		XMLManipulator xm = new XMLManipulator();
		Document doc = xm.readXMLFile(path);
		System.out.println(doc);
		
		String mappingName = "vMachineInit";
		String identifiedElementName = "vm";
		IdentifiableElementType type = IdentifiableElementType.CLASS;
		String testCode = "vendingMachine vm = new vendingMachine();";
		List<String> mappings = new ArrayList<String>();
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		Mapping mapping = new Mapping(mappingName, type, identifiedElementName, testCode, mappings, parameters);
		xm.createMapping(doc, mapping, path);
	}
	*/
	
	public XMLManipulator(){
		
	}
	/**
	 * Creates an XML file named after the parameter "fileName" in the specified directory. 
	 * The directory can be absolute or relative.
	 * 
	 * 
	 * @param directory							a string representation of the directory e.g. "data/"
	 * @param fileName							a string representation of the file name e.g. "vendingMachineMappings" do not add .xml at the end of the file name
	 * @throws ParserConfigurationException
	 * @throws TransformerException
	 */
	public static void createXMLFile(String directory, String fileName) throws ParserConfigurationException, TransformerException{
		
		File file = new File(directory + fileName + ".xml");
		
		if(!file.exists()){
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
	 
			//root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("mappings");
			doc.appendChild(rootElement);
			
			//write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(file);
			 
			//Output to console for testing			 
			transformer.transform(source, result);
			 
			System.out.println("File saved!");
		}
		else{
			System.out.println(directory + fileName + ".xml has existed");
		}
	}
	
	/**
	 * Reads an XML file and returns an XML Document object.
	 * @param path	a String representation of the path of an XML file
	 * @return an {@link org.w3c.dom.Document} object of an XML file specified by the path e.g. data/vendingMachineMappings.xml
	 * @throws Exception
	 */
	public static Document readXMLFile(String path) throws Exception{
		if(path == null){
			throw new Exception("No path for reading XML");
		}
		
		Document doc = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			DocumentBuilder db = dbf.newDocumentBuilder();

			doc = db.parse(path);
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
	 * Inserts a {@link Mapping} to an {@link org.w3c.dom.Document} object and writes the {@link org.w3c.dom.Document} object 
	 * to an XML file specified by the argument path.
	 * 
	 * @param doc		an {@link org.w3c.dom.Document} object in which a new mapping will be inserted
	 * @param mapping	a {@link ClassMapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @throws TransformerException
	 */
	public boolean createClassMapping(Document doc, ClassMapping mapping, String path) throws TransformerException{
		
		
		if(!isMappingExisted(doc, mapping)){
			Element root = doc.getDocumentElement();
			Element mappingNode = doc.createElement("mapping");

			//add mapping name node
			Element nameNode = doc.createElement("name");
			Text nameText = doc.createTextNode(mapping.getMappingName());
			nameNode.appendChild(nameText);
			mappingNode.appendChild(nameNode);
			
			//add class name node
			Element objectNameNode = doc.createElement("class-name");
			Text objectNameText = doc.createTextNode(mapping.getIdentifiableElementName());
			objectNameNode.appendChild(objectNameText);
			mappingNode.appendChild(objectNameNode);
			
			//add object name node			
			Element classNameNode = doc.createElement("object-name");
			Text classNameText = doc.createTextNode(mapping.getObjectName());
			classNameNode.appendChild(classNameText);
			mappingNode.appendChild(classNameNode);
			
			//add test code node
			Element codeNode = doc.createElement("code");
			Text codeText = doc.createTextNode(mapping.getTestCode());
			codeNode.appendChild(codeText);
			mappingNode.appendChild(codeNode);
			
			root.appendChild(mappingNode);

			rewriteXML(doc,path);
			return true;
		}
		System.out.println("The user account has existed");
		return false;
	}
	
	/**
	 * Inserts a {@link Mapping} to an {@link org.w3c.dom.Document} object and writes the {@link org.w3c.dom.Document} object 
	 * to an XML file specified by the argument path.
	 * 
	 * @param doc		an {@link org.w3c.dom.Document} object in which a new mapping will be inserted
	 * @param mapping	a {@link Mapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @throws TransformerException
	 */
	public boolean createMapping(Document doc, Mapping mapping, String path) throws TransformerException{
		
		if(!isMappingExisted(doc, mapping)){
			Element root = doc.getDocumentElement();
			Element mappingNode = doc.createElement("mapping");

			//add mapping name node
			Element nameNode = doc.createElement("name");
			Text nameText = doc.createTextNode(mapping.getMappingName());
			nameNode.appendChild(nameText);
			mappingNode.appendChild(nameNode);
			
			//add type node
			String type = "";
			type = getTypeName(mapping.getType());
			
			Element typeNode = doc.createElement(type);
			Text typeText = doc.createTextNode(mapping.getIdentifiableElementName());
			typeNode.appendChild(typeText);
			mappingNode.appendChild(typeNode);

			//add test code node
			Element codeNode = doc.createElement("code");
			Text codeText = doc.createTextNode(mapping.getTestCode());
			codeNode.appendChild(codeText);
			mappingNode.appendChild(codeNode);
			
			//add required mappings node
			if(mapping.getRequiredMappings() != null && mapping.getRequiredMappings().size() > 0){
				Element requiredMappingsNode = doc.createElement("required-mappings");
				
				String requiredMappings = "";
				for(String s: mapping.getRequiredMappings()){
					//add comma if there are more than one required mapping
					if(!requiredMappings.equals(""))
						requiredMappings = ", ";
					
					requiredMappings += s;
				}
				
				Text requiredMappingsText = doc.createTextNode(requiredMappings);
				requiredMappingsNode.appendChild(requiredMappingsText);
				mappingNode.appendChild(requiredMappingsNode);
			}
			
			//add parameters node
			if(mapping.getParameters() != null && mapping.getParameters().size() > 0){
				Element parametersNode = doc.createElement("parameters");
				
				String parameters = "";
				for(Parameter p: mapping.getParameters()){
					//add comma if there are more than one parameter
					if(!parameters.equals(""))
						parameters = ", ";
					
					parameters += p.getType() + " " + p.getName();
				}
				
				Text parametersText = doc.createTextNode(parameters);
				parametersNode.appendChild(parametersText);
				mappingNode.appendChild(parametersNode);
			}
			
			root.appendChild(mappingNode);

			rewriteXML(doc,path);
			return true;
		}
		System.out.println("The user account has existed");
		return false;
	}
	
	/*
	public boolean updateMapping(Document doc, Mapping mapping, String path) throws TransformerException{
		if(!isMappingExisted(doc, mapping)){
			createMapping(doc, mapping, path);
		}
		else{
			String mappingName = mapping.getMappingName();
			NodeList mappingNames = doc.getElementsByTagName("mapping");
			
			for(int i = 0; i < mappingNames.item(i).getFirstChild().getNodeValue().equalsIgnoreCase(mappingName)){
				Element element1 = (Element)doc.getElementsByTagName("")
			}
		}
	}*/
	
	/**
	 * Returns the name of an XML node specified by elementType
	 * 
	 * @param elementType	type of an identifiable element from a model
	 * @return the name of an XML node that represents the type of an identifiable element. This is not the content of an XML node.
	 */
	private String getTypeName(IdentifiableElementType elementType){
		String type = "";
		
		switch(elementType){
		case CLASS:
			type = "class-name";
			break;
		case TRANSITION:
			type = "transition-name";
			break;
		case STATE:
			type = "state-name";
			break;
		case GUARD:
			type = "guard-name";
			break;
		case CONSTRAINT:
			type = "constraint-name";
			break;
		case PARAMETER:
			type = "parameter-name";
			break;
		case FIELD:
			type = "field-name";
			break;
		}
		
		return type;
	}
	
	/**
	 * Fills the XML file with an {@link org.w3c.dom.Document} object.
	 * @param sourceDocument	the {@link org.w3c.dom.Document} object that will be written in the XML file specified 
	 * @param destinationXML	the target XML file specified by destinationXML
	 * @throws TransformerException
	 */
	public static void rewriteXML(Document sourceDocument, String destinationXML) throws TransformerException{
		//write the new child nodes to the XML file
		TransformerFactory tFactory =TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		DOMSource source = new DOMSource(sourceDocument);
		StreamResult result = new StreamResult(new File(destinationXML));
		transformer.transform(source, result);
	}
	
	/**
	 * Checks the name of the mapping and decides if the mapping has existed in the {@link org.w3c.dom.Document} object specified by doc. 
	 * @param doc		an {@link org.w3c.dom.Document} object 
	 * @param mapping	a {@link Mapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @return	true if the mapping has existed by name in the doc; otherwise return false
	 */
	private boolean isMappingExisted(Document doc, Mapping mapping){
		
		//Check whether the user has existed in the XML files
		boolean isExisted = false;
		
		NodeList sectionUserName = doc.getElementsByTagName("name");
		for(int i = 0; i < sectionUserName.getLength();i++){
			//System.out.println(sectionUserName.item(i).getFirstChild().getNodeValue());
			if(sectionUserName.item(i).getFirstChild().getNodeValue().equalsIgnoreCase(mapping.getMappingName())){
				isExisted = true;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns the mappings created for the identifiable element, specified by name
	 * @param path a String representation of the path of an XML file
	 * @param name a String representation of the name of an element in an XML model
	 * @return     a list of {@link org.w3c.dom.Node} objects of
	 * @throws Exception 
	 */
	public static List<Node> getMatchedTransitionMappings(String path, String name) throws Exception{
		List<Node> matchedNodes = new ArrayList<Node>();
		Document doc = readXMLFile(path);
		NodeList mappings = doc.getElementsByTagName("mapping");
		//System.out.println("size mapping: " + mappings.getLength());
		//System.out.println("path: " + path);
		//System.out.println("name: " + name);
		
		for(int i = 0; i < mappings.getLength();i++){
			NodeList nodes = mappings.item(i).getChildNodes();
			for(int j = 0; j < nodes.getLength();j++){
				if(nodes.item(j).getNodeName().equals("transition-name") && nodes.item(j).getFirstChild().getNodeValue().equalsIgnoreCase(name)){
					matchedNodes.add(mappings.item(i));
				}
			}
			
		}
		return matchedNodes;
	}

}
