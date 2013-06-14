
package edu.gmu.swe.taf;

import java.util.List;

/**
 * A {@link TestOracleMapping} class that represents assertions for a mapping.
 * 
 * @author Nan Li
 * @version 1.0 June 13, 2013
 *
 */
public class TestOracleMapping extends Mapping {
	
	private String mappingName;
	private TestOracleLevel toLevel;
	
	/**
	 * @param mappingName				the mapping name of the constraint
	 * @param type
	 * @param identifiableElementName	the mapping name of the identifiable name
	 * @param testCode
	 * @param requiredMappings
	 * @param parameters
	 * @param callers
	 * @param returnObjects
	 */
	public TestOracleMapping(String Name, String testCode, String mappingName, TestOracleLevel toLevel) {
		super(Name, IdentifiableElementType.TESTORACLE, null, testCode,
				null, null, null, null);
		
		this.mappingName = mappingName;
		this.toLevel = toLevel;
	}
	
	/**
	 * @param mappingName				the mapping name of the constraint
	 * @param type
	 * @param identifiableElementName	the mapping name of the identifiable name
	 * @param testCode
	 * @param requiredMappings
	 * @param parameters
	 * @param callers
	 * @param returnObjects
	 */
	public TestOracleMapping(String Name, String testCode, String mappingName, String identifiableElementName, TestOracleLevel toLevel) {
		super(Name, IdentifiableElementType.TESTORACLE, identifiableElementName, testCode,
				null, null, null, null);
		
		this.mappingName = mappingName;
		this.toLevel = toLevel;
	}

	/**
	 * 
	 */
	public TestOracleMapping() {
		
	}
	
	/**
	 * @return the name
	 */
	public String getMappingName() {
		return mappingName;
	}

	/**
	 * @param name the name to set
	 */
	public void setMappingName(String name) {
		this.mappingName = name;
	}

	/**
	 * @return the toLevel
	 */
	public TestOracleLevel getToLevel() {
		return toLevel;
	}

	/**
	 * @param toLevel the toLevel to set
	 */
	public void setToLevel(TestOracleLevel toLevel) {
		this.toLevel = toLevel;
	}
	
	

}
