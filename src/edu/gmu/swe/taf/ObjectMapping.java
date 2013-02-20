/**
 * 
 */
package edu.gmu.swe.taf;

import java.util.List;

/**
 * A class that maps test code to an object.
 * 
 * @author Nan Li
 * @version 1.0 Nov 14, 2012
 *
 */
public class ObjectMapping extends Mapping {
	//the class type of this object
	private String classType;
	/**
	 * @param mappingName
	 * @param type
	 * @param identifiableElementName
	 * @param testCode
	 * @param requiredMappings
	 * @param parameters
	 */
	public ObjectMapping(String mappingName, IdentifiableElementType type,
			String identifiableElementName, String objectName, String testCode,
			List<String> requiredMappings, List<String> parameters) {
		
		super(mappingName, type, identifiableElementName, testCode,
				requiredMappings, parameters, null, null);
		
		this.classType = objectName;
	}
	
	/**
	 * Constructs a ClassMapping object with no parameters.
	 */
	public  ObjectMapping(){	
		super();
	}

	/**
	 * Gets the name of the object of the class that this mapping is for
	 * @return the name of the object
	 */
	public String getClassType() {
		return classType;
	}

	/**
	 * Sets the object name
	 * @param classType		the name of the object
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}

}
