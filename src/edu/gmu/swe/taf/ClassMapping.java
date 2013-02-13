/**
 * 
 */
package edu.gmu.swe.taf;

import java.util.List;

/**
 * A {@link Mapping} object that maps test code to a class object.
 * 
 * @author Nan Li
 * @version 1.0 Nov 14, 2012
 *
 */
public class ClassMapping extends Mapping {
	//the name of the object of a class that is mapped to
	private String objectName;
	
	/**
	 * @param mappingName
	 * @param type
	 * @param identifiableElementName
	 * @param testCode
	 * @param requiredMappings
	 * @param parameters
	 */
	public ClassMapping(String mappingName, IdentifiableElementType type,
			String identifiableElementName, String objectName, String testCode,
			List<String> requiredMappings, List<Parameter> parameters) {
		
		super(mappingName, type, identifiableElementName, testCode,
				requiredMappings, parameters);
		
		this.objectName = objectName;
	}
	
	/**
	 * Constructs a ClassMapping object with no parameters.
	 */
	public  ClassMapping(){		
	}

	/**
	 * Gets the name of the object of the class that this mapping is for
	 * @return the name of the object
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * Sets the object name
	 * @param objectName		the name of the object
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}
