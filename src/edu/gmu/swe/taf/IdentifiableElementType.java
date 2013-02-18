/**
 * 
 */
package edu.gmu.swe.taf;

/**
 * An enumeration that represents the types of identifiable elements in UML models and types used in mappings
 * for such as parameters.
 * 
 * @author Nan Li
 * @version 1.0 Nov 12, 2012
 */
public enum IdentifiableElementType {
	CLASS, 
	OBJECT,
	//state machine
	TRANSITION, 
	STATE, 
	GUARD, 
	CONSTRAINT, 
	
	//arguments and variables checking for test oracle
	PARAMETER, 
	FIELD;
}
