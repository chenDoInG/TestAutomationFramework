
package edu.gmu.swe.taf;

import java.util.List;

/**
 * A {@link PreconditionMapping} class that represents a precondition constraint of an identifiable element.
 * 
 * @author Nan Li
 * @version 1.0 Feb 20, 2013
 *
 */
public class PreconditionMapping extends Mapping {

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
	public PreconditionMapping(String mappingName, String identifiableElementName,
			String testCode, List<String> requiredMappings,
			List<String> parameters, List<String> callers,
			List<String> returnObjects) {
		super(mappingName, IdentifiableElementType.PRECONDITION, identifiableElementName, testCode,
				requiredMappings, parameters, callers, returnObjects);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public PreconditionMapping() {
		// TODO Auto-generated constructor stub
	}

}
