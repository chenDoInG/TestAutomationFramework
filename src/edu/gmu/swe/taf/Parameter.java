package edu.gmu.swe.taf;

/**
 * A class that represents an object of a parameter.
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 *
 */
public class Parameter {
	
	//type of parameter
	private String type;	
	//name of parameter
	private String name;

	/**
	 * Allocate a {@link Parameter} object and initializes it to represent the parameter specified by the strings type and name
	 * @param type		a string representation of the type of the parameter
	 * @param name		a string representation of the name of the parameter
	 */
	public Parameter(String type, String name) {
		this.type = type;
		this.name = name;
	}

	/**
	 * Gets the type of the parameter
	 * @return the type of the parameter
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type of the parameter
	 * @param type		a string representation of the type of the parameter
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the name of the parameter
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the parameter
	 * @param name		a string representation of the name of the parameter
	 */
	public void setName(String name) {
		this.name = name;
	}
}