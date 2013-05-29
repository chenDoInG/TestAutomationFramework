package edu.gmu.swe.taf;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
public class XmlManipulator {

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
	
	public XmlManipulator(){
		
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
	public static void createXmlFile(String directory, String fileName) throws ParserConfigurationException, TransformerException{
		
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
			 
			System.out.println(fileName + " has been saved!");
			System.out.println(fileName + " is located at " + file.getAbsolutePath());
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
	public static Document readXmlFile(String path) throws Exception{
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
	 * @param mapping	a {@link ObjectMapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @throws TransformerException
	 */
	public boolean createObjectMapping(Document doc, ObjectMapping mapping, String path) throws TransformerException{
		
		
		if(!isMappingExisted(doc, mapping)){
			Element root = doc.getDocumentElement();
			Element mappingNode = doc.createElement("mapping");

			//add mapping name node
			Element nameNode = doc.createElement("name");
			Text nameText = doc.createTextNode(mapping.getMappingName());
			nameNode.appendChild(nameText);
			mappingNode.appendChild(nameNode);
			
			//add class name node
			Element objectNameNode = doc.createElement("object-name");
			Text objectNameText = doc.createTextNode(mapping.getIdentifiableElementName());
			objectNameNode.appendChild(objectNameText);
			mappingNode.appendChild(objectNameNode);
			
			//add object name node			
			Element classNameNode = doc.createElement("class-name");
			Text classNameText = doc.createTextNode(mapping.getClassType());
			classNameNode.appendChild(classNameText);
			mappingNode.appendChild(classNameNode);
			
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
						requiredMappings += ",";
					
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
				for(String p: mapping.getParameters()){
					//add comma if there are more than one parameter
					if(!parameters.equals(""))
						parameters += ",";
					
					parameters += p;
				}
				
				Text parametersText = doc.createTextNode(parameters);
				parametersNode.appendChild(parametersText);
				mappingNode.appendChild(parametersNode);
				
			}
			
			root.appendChild(mappingNode);

			rewriteXml(doc,path);
			return true;
		}
		System.out.println("The user account has existed");
		return false;
	}
	
	/**
	 * Inserts a {@link Mapping} to an {@link org.w3c.dom.Document} object and writes the {@link org.w3c.dom.Document} object 
	 * to an XML file specified by the argument path.
	 * If the mapping has been existed, the original XML file will not be affected.
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
			//System.out.println(mapping.getTestCode());
			
			//add required mappings node
			if(mapping.getRequiredMappings() != null && mapping.getRequiredMappings().size() > 0){
				Element requiredMappingsNode = doc.createElement("required-mappings");
				
				String requiredMappings = "";
				for(String s: mapping.getRequiredMappings()){
					//add comma if there are more than one required mapping
					if(!requiredMappings.equals(""))
						requiredMappings += ",";
					
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
				for(String p: mapping.getParameters()){
					//add comma if there are more than one parameter
					if(!parameters.equals(""))
						parameters += ",";
					
					parameters += p;
				}
				
				Text parametersText = doc.createTextNode(parameters);
				parametersNode.appendChild(parametersText);
				mappingNode.appendChild(parametersNode);
				
			}
			
			root.appendChild(mappingNode);

			rewriteXml(doc,path);
			return true;
		}
		System.out.println("The user account has existed");
		return false;
	}
	
	/**
	 * Inserts a {@link ConstraintMapping} to an {@link org.w3c.dom.Document} object and writes the {@link org.w3c.dom.Document} object 
	 * to an XML file specified by the argument path.
	 * 
	 * @param doc		an {@link org.w3c.dom.Document} object in which a new mapping will be inserted
	 * @param mapping	a {@link ConstraintMapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @throws TransformerException
	 */
	public boolean createConstraintMapping(Document doc, ConstraintMapping mapping, String path) throws TransformerException{
				
		if(isMappingExisted(doc, mapping)){
			NodeList mappings = doc.getElementsByTagName("mapping");
			
			for(int i = 0; i < mappings.getLength();i++){
				NodeList nodes = mappings.item(i).getChildNodes();
				for(int j = 0; j < nodes.getLength();j++){
					//if the names match, remove this node
					if(nodes.item(j).getNodeName().equals("name")){
						if(nodes.item(j).getFirstChild().getNodeValue().equals(mapping.getMappingName())){
							mappings.item(i).getParentNode().removeChild(mappings.item(i));
						}
						else
							break;
					}
				}			
			}
		}
		
		//create a constraint mapping node
		Element root = doc.getDocumentElement();
		Element mappingNode = doc.createElement("mapping");

		//add mapping name node
		Element nameNode = doc.createElement("name");
		Text nameText = doc.createTextNode(mapping.getMappingName());
		nameNode.appendChild(nameText);
		mappingNode.appendChild(nameNode);
			
		//add constraint name node
		Element objectNameNode = doc.createElement("constraint-name");
		Text objectNameText = doc.createTextNode(mapping.getIdentifiableElementName());
		objectNameNode.appendChild(objectNameText);
		mappingNode.appendChild(objectNameNode);
			
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
					requiredMappings += ",";
			
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
			for(String p: mapping.getParameters()){
				//add comma if there are more than one parameter
				if(!parameters.equals(""))
					parameters += ",";
					
				parameters += p;
			}
				
			Text parametersText = doc.createTextNode(parameters);
			parametersNode.appendChild(parametersText);
			mappingNode.appendChild(parametersNode);			
		}
			
		//add constraint solving mapping node
		if(mapping.getConstSolvingMappings() != null && mapping.getConstSolvingMappings().size() > 0){
			Element solvingMappingsNode = doc.createElement("constraintSolvingMappings");
			
			String solvingMappings = "";
			for(String p: mapping.getConstSolvingMappings()){
				//add comma if there are more than one parameter
				if(!solvingMappings.equals(""))
					solvingMappings += ",";
					
				solvingMappings += p;
			}
			
			Text solvingMappingsText = doc.createTextNode(solvingMappings);
			solvingMappingsNode.appendChild(solvingMappingsText);
			mappingNode.appendChild(solvingMappingsNode);			
		}
			
		//add preconditions node
		if(mapping.getPreconditions() != null && mapping.getPreconditions().size() > 0){
			Element preconditionsNode = doc.createElement("preconditions");
			
			String preconditions = "";
			for(String p: mapping.getPreconditions()){
				//add comma if there are more than one parameter
				if(!preconditions.equals(""))
					preconditions += ",";
				
				preconditions += p;
			}
					
			Text preconditionsText = doc.createTextNode(preconditions);
			preconditionsNode.appendChild(preconditionsText);
			mappingNode.appendChild(preconditionsNode);			
		}
			
		//add postconditions node
		if(mapping.getPostconditions() != null && mapping.getPostconditions().size() > 0){
			Element postconditionsNode = doc.createElement("postconditions");
			
			String postconditions = "";
			for(String p: mapping.getPostconditions()){
				//add comma if there are more than one parameter
				if(!postconditions.equals(""))
					postconditions += ",";
						
				postconditions += p;
			}
				
			Text postconditionsText = doc.createTextNode(postconditions);
			postconditionsNode.appendChild(postconditionsText);
			mappingNode.appendChild(postconditionsNode);			
		}
			
		//add state invariants node
		if(mapping.getStateinvariants() != null && mapping.getStateinvariants().size() > 0){
			Element stateinvariantsNode = doc.createElement("stateinvariants");
				
			String stateinvariants = "";
			for(String p: mapping.getStateinvariants()){
				//add comma if there are more than one parameter
				if(!stateinvariants.equals(""))
					stateinvariants += ",";
					
				stateinvariants += p.trim();
		}
				
		Text stateinvariantsText = doc.createTextNode(stateinvariants);
		stateinvariantsNode.appendChild(stateinvariantsText);
		mappingNode.appendChild(stateinvariantsNode);			
		}
			
		root.appendChild(mappingNode);
		
		rewriteXml(doc,path);
		return true;
			
	}
	
	/**
	 * Updates a {@link Mapping} in an {@link org.w3c.dom.Document} object and writes the new {@link org.w3c.dom.Document} object 
	 * to an XML file specified by the argument path.
	 * The XML file will only be modified if there exists an old mapping that has the same as that of the new one.
	 * 
	 * @param doc		an {@link org.w3c.dom.Document} object in which a new mapping will be inserted
	 * @param mapping	a {@link Mapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @throws TransformerException
	 */
	public boolean updateMapping(Document doc, Mapping mapping, String path) throws TransformerException{
		
		//continue if this mapping has existed
		if(isMappingExisted(doc, mapping)){
			NodeList mappings = doc.getElementsByTagName("mapping");
			
			for(int i = 0; i < mappings.getLength();i++){
				NodeList nodes = mappings.item(i).getChildNodes();
				for(int j = 0; j < nodes.getLength();j++){
					//if the names match, remove this node
					if(nodes.item(j).getNodeName().equals("name")){
						if(nodes.item(j).getFirstChild().getNodeValue().equals(mapping.getMappingName())){
							mappings.item(i).getParentNode().removeChild(mappings.item(i));
						}
						else
							break;
					}
				}			
			}
			
			//create a new mapping node
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
			//System.out.println(mapping.getTestCode());
			
			//add required mappings node
			if(mapping.getRequiredMappings() != null && mapping.getRequiredMappings().size() > 0){
				Element requiredMappingsNode = doc.createElement("required-mappings");
				
				String requiredMappings = "";
				for(String s: mapping.getRequiredMappings()){
					//add comma if there are more than one required mapping
					if(!requiredMappings.equals(""))
						requiredMappings += ",";

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
				for(String p: mapping.getParameters()){
					//add comma if there are more than one parameter
					if(!parameters.equals(""))
						parameters += ",";
					
					parameters += p;
				}
				
				Text parametersText = doc.createTextNode(parameters);
				parametersNode.appendChild(parametersText);
				mappingNode.appendChild(parametersNode);
			}
			
			root.appendChild(mappingNode);

			rewriteXml(doc,path);
			return true;
		}else{
			System.out.println("The mapping is not existed; should create a new mapping instead of the update");
		}
		return false;
	}
	
	/**
	 * Updates a {@link ObjectMapping} in an {@link org.w3c.dom.Document} object and writes the new {@link org.w3c.dom.Document} object 
	 * to an XML file specified by the argument path.
	 * The XML file will only be modified if there exists an old mapping that has the same as that of the new one.
	 * 
	 * @param doc		an {@link org.w3c.dom.Document} object in which a new mapping will be inserted
	 * @param mapping	a {@link ObjectMapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @throws TransformerException
	 */
	public boolean updateObjectMapping(Document doc, ObjectMapping mapping, String path) throws TransformerException{
		
		//continue if this mapping has existed
		if(isMappingExisted(doc, mapping)){
			NodeList mappings = doc.getElementsByTagName("mapping");
			
			for(int i = 0; i < mappings.getLength();i++){
				NodeList nodes = mappings.item(i).getChildNodes();
				for(int j = 0; j < nodes.getLength();j++){
					//if the names match, remove this node
					if(nodes.item(j).getNodeName().equals("name")){
						if(nodes.item(j).getFirstChild().getNodeValue().equals(mapping.getMappingName())){
							mappings.item(i).getParentNode().removeChild(mappings.item(i));
						}
						else
							break;
					}
				}			
			}
			createObjectMapping(doc, mapping, path);
		}else{
			System.out.println("The mapping is not existed; should create a new mapping instead of the update");
		}
		return false;
	}
	
	/**
	 * Updates a {@link ConstraintMapping} in an {@link org.w3c.dom.Document} object and writes the new {@link org.w3c.dom.Document} object 
	 * to an XML file specified by the argument path.
	 * The XML file will only be modified if there exists an old mapping that has the same as that of the new one.
	 * 
	 * @param doc		an {@link org.w3c.dom.Document} object in which a new mapping will be inserted
	 * @param mapping	a {@link ConstraintMapping} object that will be inserted in an {@link org.w3c.dom.Document} object specified by doc 	
	 * @throws TransformerException
	 */
	public boolean updateConstraintMapping(Document doc, ConstraintMapping mapping, String path) throws TransformerException{
		
		//continue if this mapping has existed
		if(isMappingExisted(doc, mapping)){
			NodeList mappings = doc.getElementsByTagName("mapping");
			
			for(int i = 0; i < mappings.getLength();i++){
				NodeList nodes = mappings.item(i).getChildNodes();
				for(int j = 0; j < nodes.getLength();j++){
					//if the names match, remove this node
					if(nodes.item(j).getNodeName().equals("name")){
						if(nodes.item(j).getFirstChild().getNodeValue().equals(mapping.getMappingName())){
							mappings.item(i).getParentNode().removeChild(mappings.item(i));
						}
						else
							break;
					}
				}			
			}
			createConstraintMapping(doc, mapping, path);
		}else{
			System.out.println("The mapping is not existed; should create a new mapping instead of the update");
		}
		return false;
	}
	
	/**
	 * Removes a mapping specified by a mapping name.
	 * @param doc
	 * @param mappingName
	 * @param path
	 * @return				true if the mapping is removed;otherwise, return false;
	 * @throws TransformerException 
	 */
	public static boolean removeMapping(Document doc, String mappingName, String path) throws TransformerException{

		NodeList mappings = doc.getElementsByTagName("mapping");
			
		for(int i = 0; i < mappings.getLength();i++){
			NodeList nodes = mappings.item(i).getChildNodes();
			for(int j = 0; j < nodes.getLength();j++){
				//if the names match, remove this node
				if(nodes.item(j).getNodeName().equals("name")){
					if(nodes.item(j).getFirstChild().getNodeValue().equals(mappingName)){
						mappings.item(i).getParentNode().removeChild(mappings.item(i));
						rewriteXml(doc,path);
						return true;
					}
					else
						break;
				}
			}			
		}

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
	public static void rewriteXml(Document sourceDocument, String destinationXML) throws TransformerException{
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
	public static boolean isMappingExisted(Document doc, Mapping mapping){
		
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
	 * @return     a list of {@link org.w3c.dom.Node} objects
	 * @throws Exception 
	 */
	public static List<Node> getMatchedTransitionMappings(String path, String name) throws Exception{
		List<Node> matchedNodes = new ArrayList<Node>();
		Document doc = readXmlFile(path);
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
	
	/**
	 * Returns the mappings created for the identifiable element, specified by name
	 * @param path a String representation of the path of an XML file
	 * @param name a String representation of the name of an element in an XML model
	 * @return     a list of {edu.gmu.swe.taf.Mapping} objects
	 * @throws Exception 
	 */
	public static List<Mapping> getMappingsByTransition(String path, String name) throws Exception{
		List<Mapping> matchedNodes = new ArrayList<Mapping>();
		Document doc = readXmlFile(path);
		NodeList mappings = doc.getElementsByTagName("mapping");
		//System.out.println("size mapping: " + mappings.getLength());
		//System.out.println("path: " + path);
		//System.out.println("name: " + name);
		
		for(int i = 0; i < mappings.getLength();i++){
			NodeList nodes = mappings.item(i).getChildNodes();
			Mapping mapping = new Mapping();
			//if this boolean sign is true, the transition is the one we are looking for
			boolean isTransition = false;
			for(int j = 0; j < nodes.getLength();j++){
				
				if(nodes.item(j).getNodeName().equals("name")){
					mapping.setMappingName(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("transition-name")){
					if(nodes.item(j).getFirstChild().getNodeValue().equals(name)){
						mapping.setIdentifiableElementName(nodes.item(j).getFirstChild().getNodeValue());
						mapping.setType(IdentifiableElementType.TRANSITION);
						isTransition = true;
					}
					else{
						break;
					}
				}
				//if no code needs to be mapped to the element, add an empty String object
				if(nodes.item(j).getNodeName().equals("code")){
					if(nodes.item(j).getFirstChild() == null)
						mapping.setTestCode("");
					else
						mapping.setTestCode(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("required-mappings")){
					if(nodes.item(j).getFirstChild() != null){
						String[] required = nodes.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setRequiredMappings(Arrays.asList(required));
						continue;
					}
				}
				
				if(nodes.item(j).getNodeName().equals("parameters")){
					String[] parameters = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setParameters(Arrays.asList(parameters));
				}
				//may add more nodes if a mapping has more
			}
			if(isTransition == false)
				mapping = null;
			else
				matchedNodes.add(mapping);
			
		}
		return matchedNodes;
	}
	
	/**
	 * Returns the mappings created for the identifiable element, specified by name.
	 * @param path a String representation of the path of an XML file
	 * @param name a String representation of the name of an element in an XML model
	 * @return     a list of {edu.gmu.swe.taf.Mapping} objects
	 * @throws Exception 
	 */
	public static List<Mapping> getMappingsByElementName(String path, String name) throws Exception{
		List<Mapping> matchedNodes = new ArrayList<Mapping>();
		Document doc = readXmlFile(path);
		NodeList mappings = doc.getElementsByTagName("mapping");
		//System.out.println("size mapping: " + mappings.getLength());
		//System.out.println("path: " + path);
		//System.out.println("name: " + name);
		
		for(int i = 0; i < mappings.getLength();i++){
			NodeList nodes = mappings.item(i).getChildNodes();
			Mapping mapping = new Mapping();
			//if this boolean sign is true, the element is the one we are looking for
			boolean isElement = false;
			for(int j = 0; j < nodes.getLength();j++){
				
				if(nodes.item(j).getNodeName().equals("name")){
					mapping.setMappingName(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				//this if-else structure needs to be updated for other identifiable elements
				if(nodes.item(j).getNodeName().equals("transition-name")){
					if(nodes.item(j).getFirstChild().getNodeValue().equalsIgnoreCase(name)){
						mapping.setIdentifiableElementName(nodes.item(j).getFirstChild().getNodeValue());
						mapping.setType(IdentifiableElementType.TRANSITION);
						isElement = true;
					}
					else{
						break;
					}
				}
				else if(nodes.item(j).getNodeName().equals("constraint-name")){
					if(nodes.item(j).getFirstChild().getNodeValue().equalsIgnoreCase(name)){
						mapping.setIdentifiableElementName(nodes.item(j).getFirstChild().getNodeValue());
						mapping.setType(IdentifiableElementType.CONSTRAINT);
						isElement = true;
					}
					else{
						break;
					}
				}
				else if(nodes.item(j).getNodeName().equals("state-name")){
					if(nodes.item(j).getFirstChild().getNodeValue().equalsIgnoreCase(name)){
						mapping.setIdentifiableElementName(nodes.item(j).getFirstChild().getNodeValue());
						mapping.setType(IdentifiableElementType.STATE);
						isElement = true;
					}
					else{
						break;
					}					
				}
				else if(nodes.item(j).getNodeName().equals("object-name")){
					if(nodes.item(j).getFirstChild().getNodeValue().equalsIgnoreCase(name)){
						mapping.setIdentifiableElementName(nodes.item(j).getFirstChild().getNodeValue());
						mapping.setType(IdentifiableElementType.OBJECT);
						isElement = true;
					}
					else{
						break;
					}
				}
				
				//if no code needs to be mapped to the element, add an empty String object
				if(nodes.item(j).getNodeName().equals("code")){
					if(nodes.item(j).getFirstChild() == null)
						mapping.setTestCode("");
					else
						mapping.setTestCode(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("required-mappings")){
					if(nodes.item(j).getFirstChild() == null){
						mapping.setRequiredMappings(new ArrayList<String>());
					}
					else{
						String[] required = nodes.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setRequiredMappings(Arrays.asList(required));
					}
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("parameters")){
					if(nodes.item(j).getFirstChild() == null)
						mapping.setParameters(new ArrayList<String>());
					else{
						String[] parameters = nodes.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setParameters(Arrays.asList(parameters));
					}
				}
				//may add more nodes if a mapping has more
			}
			if(isElement == false)
				mapping = null;
			else{
				//handle the cases in which there are no required mappings or parameters saved
				if(mapping.getRequiredMappings() == null)
					mapping.setRequiredMappings(new ArrayList<String>());
				
				if(mapping.getParameters() == null)
					mapping.setParameters(new ArrayList<String>());
				
				matchedNodes.add(mapping);
			}
			
		}
		return matchedNodes;
	}
	
	/**
	 * Returns all object mappings for a model whose location is specified by the parameter.
	 * @param path a String representation of the path of an XML file
	 * @return     a list of {edu.gmu.swe.taf.ObjectMapping} objects
	 * @throws Exception 
	 */
	public static List<ObjectMapping> getObjectMappings(String path) throws Exception{
		List<ObjectMapping> matchedNodes = new ArrayList<ObjectMapping>();
		Document doc = readXmlFile(path);
		NodeList mappings = doc.getElementsByTagName("mapping");
		//System.out.println("size mapping: " + mappings.getLength());
		//System.out.println("path: " + path);
		//System.out.println("name: " + name);
		
		for(int i = 0; i < mappings.getLength();i++){
			NodeList nodes = mappings.item(i).getChildNodes();
			ObjectMapping mapping = new ObjectMapping();
			//if this boolean sign is true, the object is the one we are looking for
			boolean isObject = false;
			for(int j = 0; j < nodes.getLength();j++){
				
				if(nodes.item(j).getNodeName().equals("name")){
					mapping.setMappingName(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("object-name")){
					mapping.setIdentifiableElementName(nodes.item(j).getFirstChild().getNodeValue());
					mapping.setType(IdentifiableElementType.OBJECT);
					isObject = true;
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("class-name")){				
					mapping.setClassType(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				//if no code needs to be mapped to the element, add an empty String object
				if(nodes.item(j).getNodeName().equals("code")){
					if(nodes.item(j).getFirstChild() == null)
						mapping.setTestCode("");
					else
						mapping.setTestCode(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("required-mappings")){
					if(nodes.item(j).getFirstChild() == null){
						mapping.setRequiredMappings(new ArrayList<String>());
					}
					else{
						String[] required = nodes.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setRequiredMappings(Arrays.asList(required));
					}
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("parameters")){
					if(nodes.item(j).getFirstChild() == null)
						mapping.setParameters(new ArrayList<String>());
					else{
						String[] parameters = nodes.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setParameters(Arrays.asList(parameters));
					}
				}
				//may add more nodes if a mapping has more
			}
			if(isObject == false)
				mapping = null;
			else{
				//handle the cases in which there are no required mappings or parameters saved
				if(mapping.getRequiredMappings() == null)
					mapping.setRequiredMappings(new ArrayList<String>());
				
				if(mapping.getParameters() == null)
					mapping.setParameters(new ArrayList<String>());
				
				matchedNodes.add(mapping);
			}
			
		}
		return matchedNodes;
	}
	
	/**
	 * Returns a {edu.gmu.swe.taf.ObjectMapping} object based on the specified mapping name
	 * @param path a String representation of the path of an XML file
	 * @param name a String representation of the name of an element in an XML model
	 * @return     a {edu.gmu.swe.taf.Mapping} object
	 * @throws Exception 
	 */
	public static ObjectMapping getObjectMappingByName(String path, String name) throws Exception{
		
		Document doc = readXmlFile(path);
		NodeList nodes = doc.getElementsByTagName("name");
		
		//A ClassMapping object to be returned
		ObjectMapping mapping = new ObjectMapping();
		for(int i = 0; i < nodes.getLength();i++){
			//if the names match, add the values into the mapping; otherwise, go through the text node
			//System.out.println("nodes.item(i).getFirstChild().getNodeValue(): "+ nodes.item(i).getFirstChild().getNodeValue());
			//System.out.println("name: "+ name);

			if(nodes.item(i).getFirstChild().getNodeValue().trim().equals(name.trim())){
				NodeList children = nodes.item(i).getParentNode().getChildNodes();	

				for(int j = 0; j < children.getLength();j++){
					if(children.item(j).getNodeName().equals("name")){
						mapping.setMappingName(children.item(j).getFirstChild().getNodeValue());
						continue;
					}
					
					if(children.item(j).getNodeName().equals("object-name")){		
						mapping.setIdentifiableElementName(children.item(j).getFirstChild().getNodeValue());
						mapping.setType(IdentifiableElementType.OBJECT);

						continue;
					}
					
					if(children.item(j).getNodeName().equals("class-name")){				
						mapping.setClassType(children.item(j).getFirstChild().getNodeValue());
						continue;
					}
					
					if(children.item(j).getNodeName().equals("code")){
						if(children.item(j).getFirstChild() == null)
							mapping.setTestCode("");
						else
							mapping.setTestCode(children.item(j).getFirstChild().getNodeValue());
						continue;
					}
					
					if(children.item(j).getNodeName().equals("required-mappings")){
						if(children.item(j).getFirstChild() == null)
							mapping.setRequiredMappings(new ArrayList<String>());
						else{
							String[] required = children.item(j).getFirstChild().getNodeValue().split(",");
							mapping.setRequiredMappings(Arrays.asList(required));
						}
						continue;
					}
					
					if(children.item(j).getNodeName().equals("parameters")){
						if(children.item(j).getFirstChild() == null)
							mapping.setParameters(new ArrayList<String>());
						else{
							String[] parameters = children.item(j).getFirstChild().getNodeValue().split(",");
							mapping.setParameters(Arrays.asList(parameters));
						}
					}
				}
			}
			else
				continue;
		}
		
		//handle the cases in which there are no test code or required mappings or parameters saved
		if(mapping.getTestCode() == null)
			mapping.setTestCode("");
		
		if(mapping.getRequiredMappings() == null)
			mapping.setRequiredMappings(new ArrayList<String>());
		
		if(mapping.getParameters() == null)
			mapping.setParameters(new ArrayList<String>());
		return mapping;
	}
	
	/**
	 * Returns a {edu.gmu.swe.taf.ConstraintMapping} object based on the specified mapping name
	 * @param path a String representation of the path of an XML file
	 * @param name a String representation of the name of an element in an XML model
	 * @return     a {edu.gmu.swe.taf.ConstraintMapping} object
	 * @throws Exception 
	 */
	public static ConstraintMapping getConstraintMappingByName(String path, String name) throws Exception{
		
		Document doc = readXmlFile(path);
		NodeList nodes = doc.getElementsByTagName("name");
		
		//A ConstraintMapping object to be returned
		ConstraintMapping mapping = new ConstraintMapping();
		for(int i = 0; i < nodes.getLength();i++){
			//if the names match, add the values into the mapping; otherwise, go through the text node
			//System.out.println("nodes.item(i).getFirstChild().getNodeValue(): "+ nodes.item(i).getFirstChild().getNodeValue());
			//System.out.println("name: "+ name);

			if(nodes.item(i).getFirstChild().getNodeValue().trim().equals(name.trim())){
				NodeList children = nodes.item(i).getParentNode().getChildNodes();	

				for(int j = 0; j < children.getLength();j++){
					if(children.item(j).getNodeName().equals("name")){
						mapping.setMappingName(children.item(j).getFirstChild().getNodeValue());
						continue;
					}
					
					if(children.item(j).getNodeName().equals("constraint-name")){		
						mapping.setIdentifiableElementName(children.item(j).getFirstChild().getNodeValue());
						mapping.setType(IdentifiableElementType.OBJECT);
						continue;
					}
					
					if(children.item(j).getNodeName().equals("code")){						
						mapping.setTestCode(children.item(j).getFirstChild().getNodeValue());
						continue;
					}
					
					if(children.item(j).getNodeName().equals("required-mappings")){
						if(children.item(j).getFirstChild() == null)
							mapping.setRequiredMappings(new ArrayList<String>());
						else{
							String[] required = children.item(j).getFirstChild().getNodeValue().split(",");
							mapping.setRequiredMappings(Arrays.asList(required));
						}
						continue;
					}
					
					if(children.item(j).getNodeName().equals("parameters")){
						String[] parameters = children.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setParameters(Arrays.asList(parameters));
						continue;
					}
					
					if(children.item(j).getNodeName().equals("stateinvariants")){
						String[] parameters = children.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setStateinvariants(Arrays.asList(parameters));
						continue;
					}
					
					if(children.item(j).getNodeName().equals("preconditions")){
						String[] parameters = children.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setPreconditions(Arrays.asList(parameters));
						continue;
					}
					
					if(children.item(j).getNodeName().equals("postconditions")){
						String[] parameters = children.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setPostconditions(Arrays.asList(parameters));
					}
				}
			}
			else
				continue;
		}
		
		return mapping;
	}
	
	/**
	 * Returns the mappings created for the identifiable element, specified by name
	 * @param path a String representation of the path of an XML file
	 * @return     a list of {edu.gmu.swe.taf.Mapping} objects
	 * @throws Exception 
	 */
	public static List<ConstraintMapping> getConstraintMappings(String path) throws Exception{
		List<ConstraintMapping> matchedNodes = new ArrayList<ConstraintMapping>();
		//System.out.println("path: " + path);
		
		Document doc = readXmlFile(path);

		NodeList mappings = doc.getElementsByTagName("constraint-name");
		//System.out.println("size mapping: " + mappings.getLength());
		//System.out.println("path: " + path);
		//System.out.println("name: " + name);
		
		for(int i = 0; i < mappings.getLength();i++){
			NodeList nodes = mappings.item(i).getParentNode().getChildNodes();	
			ConstraintMapping mapping = new ConstraintMapping();

			for(int j = 0; j < nodes.getLength();j++){
				
				if(nodes.item(j).getNodeName().equals("name")){
					mapping.setMappingName(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("constraint-name")){					
					mapping.setIdentifiableElementName(nodes.item(j).getFirstChild().getNodeValue());
					mapping.setType(IdentifiableElementType.CONSTRAINT);
				}
				
				if(nodes.item(j).getNodeName().equals("code")){
					mapping.setTestCode(nodes.item(j).getFirstChild().getNodeValue());
					continue;
				}
				
				if(nodes.item(j).getNodeName().equals("required-mappings")){
					if(nodes.item(j).getFirstChild() != null){
						String[] required = nodes.item(j).getFirstChild().getNodeValue().split(",");
						mapping.setRequiredMappings(Arrays.asList(required));
						continue;
					}
				}
				
				if(nodes.item(j).getNodeName().equals("parameters")){
					String[] parameters = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setParameters(Arrays.asList(parameters));
				}
				
				if(nodes.item(j).getNodeName().equals("callers")){
					String[] callers = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setCallers(Arrays.asList(callers));
				}
				
				if(nodes.item(j).getNodeName().equals("return-objects")){
					String[] returnObjects = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setReturnObjects(Arrays.asList(returnObjects));
				}
				
				if(nodes.item(j).getNodeName().equals("solving-mappings")){
					String[] solvingMappings = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setConstSolvingMappings(Arrays.asList(solvingMappings));
				}
				
				if(nodes.item(j).getNodeName().equals("preconditions")){
					String[] preconditions = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setPreconditions(Arrays.asList(preconditions));
				}
				
				if(nodes.item(j).getNodeName().equals("stateinvariants")){
					String[] stateInvariants = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setStateinvariants(Arrays.asList(stateInvariants));
				}
				
				if(nodes.item(j).getNodeName().equals("postconditions")){
					String[] postconditions = nodes.item(j).getFirstChild().getNodeValue().split(",");
					mapping.setPostconditions(Arrays.asList(postconditions));
				}
			}

			matchedNodes.add(mapping);
			
		}
		return matchedNodes;
	}


}
