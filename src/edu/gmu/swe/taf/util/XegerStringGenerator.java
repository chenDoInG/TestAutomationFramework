/**
 * 
 */
package edu.gmu.swe.taf.util;

import nl.flotsam.xeger.Xeger;

/**
 * A utility class that generates a String value from a regular expression.
 *
 * @author Nan Li
 * @version 1.0 Feb 18, 2013
 */
public class XegerStringGenerator {

	private Xeger generator;
	public XegerStringGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Generates a String object from a regular expression specified by the parameter
	 * @param regex	a regular expression
	 * @return		a String object
	 */
	public String generateString(String regex){
		generator = new Xeger(regex);
		String result = generator.generate();
		assert result.matches(regex);
		return result;
	}

}
