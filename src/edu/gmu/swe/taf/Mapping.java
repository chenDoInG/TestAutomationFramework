/**
 * 
 */
package edu.gmu.swe.taf;

import java.util.List;

/**
 * A class that represents an object of a mapping.
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 *
 */
public class Mapping {
	//name of the mapping
	private String mappingName;
	//type of the mapped identifiable element
	private IdentifiableElementType type;
	//name of the identifiable element
	private String identifiableElementName;
	//test code that is mapped to
	private String testCode;
	//other mappings that are required for this mapping
	private List<String> requiredMappings;
	//parameters that used in this mapping
	private List<Parameter> parameters;
	
	/**
	 * Allocates a {@link Mapping} object and initialize it to represent the the mapping
	 * 
	 * @param mappingName               the name of the mapping
	 * @param type						the type of the identifiable element
	 * @param identifiableElementName	the name of the identifiable element
	 * @param testCode					the mapped test code 
	 * @param requiredMappings			the required mappings for this mapping
	 * @param parameters				the parameters used in this mapping
	 */
	public Mapping(String mappingName, IdentifiableElementType type, String identifiableElementName, String testCode,
			List<String> requiredMappings, List<Parameter> parameters){
		this.mappingName = mappingName;
		this.type = type;
		this.identifiableElementName = identifiableElementName;
		this.testCode = testCode;
		this.requiredMappings = requiredMappings;
		this.parameters = parameters;
	}
	
	/**
	 * Gets the mapping name
	 * @return the mapping name
	 */
	public String getMappingName() {
		return mappingName;
	}
	
	/**
	 * Sets the mapping name
	 * @param mappingName		the name of the mapping
	 */
	public void setMappingName(String mappingName) {
		this.mappingName = mappingName;
	}
	
	/**
	 * Gets the identifiable element type
	 * @return the type of the identifiable element
	 */
	public IdentifiableElementType getType() {
		return type;
	}
	
	/**
	 * Sets the identifiable element type
	 * @param type		the type of the identifiable element
	 */
	public void setType(IdentifiableElementType type) {
		this.type = type;
	}
	
	/**
	 * Gets the name of the identifiable element
	 * @return the name of the identifiable element
	 */
	public String getIdentifiableElementName() {
		return identifiableElementName;
	}
	
	/**
	 * Sets the name of the identifiable element
	 * @param identifiableElementName		the name of the identifiable element
	 */
	public void setIdentifiableElementName(String identifiableElementName) {
		this.identifiableElementName = identifiableElementName;
	}
	
	/**
	 * Gets the test code
	 * @return the mapped test code
	 */
	public String getTestCode() {
		return testCode;
	}
	
	/**
	 * Sets the test code
	 * @param testCode		the mapped test code 
	 */
	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}
	
	/**
	 * Gets the required mappings for this mapping
	 * @return a list of names of required mappings
	 */
	public List<String> getRequiredMappings() {
		return requiredMappings;
	}
	
	/**
	 * Sets the required mappings
	 * @param requiredMappings		the required mappings for this mapping
	 */
	public void setRequiredMappings(List<String> requiredMappings) {
		this.requiredMappings = requiredMappings;
	}
	
	/**
	 * Returns the parameters used in this mapping
	 * @return a list of {@link Parameter}s
	 */
	public List<Parameter> getParameters() {
		return parameters;
	}
	
	/**
	 * Sets the parameters
	 * @param parameters		the parameters used in this mapping
	 */
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
}
