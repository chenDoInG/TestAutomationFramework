package edu.gmu.swe.taf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import edu.gmu.swe.taf.util.ChocoConstraintSolver;
import edu.gmu.swe.taf.util.JavaSupporter;
import edu.gmu.swe.taf.util.JunitTestWriter;

/**
 * A class that generates concrete tests from abstract tests
 * 
 * @author Nan Li
 * @version 1.0 Feb 8, 2012
 *
 */

public class ConcreteTestGenerator {
	private String directory;
	private String name;
	private String xmlPath;
	/**
	 * Construct a ConcreteTestGenerator with the specified directory and class name
	 */
	public ConcreteTestGenerator(String directory, String name, String xmlPath) {
		this.setDirectory(directory);
		this.setName(name);
		this.xmlPath = xmlPath;
	}

	/**
	 * Generates and Compiles a JUnit test in a directory
	 * 
	 * @param directory			a directory in a String format
	 * @param name				a Java class name in a String format
	 * @param tests				a list of {@link edu.gmu.swe.taf.Test} objects that contain abstract test information
	 * @throws Exception		throws 
	 */
	public void generateConcreteTests(List<? extends Test> tests) throws Exception{
		File file = new File(getDirectory() + getTestName() + ".java");
		
		List<Test> finalTests = new ArrayList<Test>();
		for(Test test: tests)
			finalTests.add(updateConcreteTest(test));
		
		try {
			createConcreteTestCase(getDirectory(), file, finalTests);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		compileJavaFile(getDirectory(), file);
	}
	
	/**
	 * Creates a concrete JUnit test case (a Java file) containing only one test in the specified directory with a specified name. The compilation is not complete.
	 * 
	 * @param directory		a directory in a String format
	 * @param file			a File object
	 * @param test 			a {@link edu.gmu.swe.taf.Test} object
	 * @return 				true if tests are successfully generated
	 * @throws IOException
	 */
	public boolean createConcreteTestCase(String directory, File file, Test test) throws IOException{
		
		//System.out.println(file.getPath());
		//a package name may need to be specified

		FileOutputStream fop = new FileOutputStream(file);
		StringBuffer result = new StringBuffer("");
		String packageName = "\n";
		String importsJava = "import java.io.*;\n";
		String importsJUnit = "import org.junit.*;\nimport static org.junit.Assert.*;\n";
	
		result.append(packageName);
		result.append(importsJava);
		result.append(importsJUnit);
		result.append("\n");
		
		String classHeader = "public class " + getTestName() + " {\n";
		result.append(classHeader);
		result.append("\n");
		
		result.append(test.getTestCode());
		result.append("}\n");
		
		byte[] contentInBytes = result.toString().getBytes();
		fop.write(contentInBytes);
		fop.flush();
		fop.close();
		
		System.out.println("Done");
		
		return false;
	}
	
	/**
	 * Creates a concrete JUnit test (a Java file) containing a list of tests in the specified directory with a specified name. The compilation is not complete.
	 * 
	 * @param directory		a directory in a String format
	 * @param file			a File object
	 * @param tests			a list of {@link edu.gmu.swe.taf.Test} objects
	 * @return 				true if tests are successfully generated
	 * @throws IOException	throws an IOException if the tests cannot be written in a JUnit test case
	 */
	public boolean createConcreteTestCase(String directory, File file, List<? extends Test> tests) throws IOException{
		
		//System.out.println(file.getPath());
		//a package name may need to be specified

		FileOutputStream fop = new FileOutputStream(file);
		StringBuffer result = new StringBuffer("");
		String packageName = "\n";
		String importsJava = "import java.io.*;\n";
		String importsJUnit = "import org.junit.*;\nimport static org.junit.Assert.*;\n";
	
		result.append(packageName);
		result.append(importsJava);
		result.append(importsJUnit);
		result.append("\n");
		
		String classHeader = "public class " + getTestName() + " {\n";
		result.append(classHeader);
		result.append("\n");
		
		for(Test test: tests){
			result.append(test.getTestCode());
			result.append("\n");
		}
		result.append("}\n");
		
		byte[] contentInBytes = result.toString().getBytes();
		fop.write(contentInBytes);
		fop.flush();
		fop.close();
		
		System.out.println("Done");
		
		return false;
	}
	
	
	/**
	 * Updates the concrete JUnit test code of a {@link edu.gmu.swe.taf.Test} object.
	 * The test content is surrounded with test header and comments in a JUnit test format.
	 * The test code is embedded with the required variable initializations.
	 * 
	 * @param test 			a {@link edu.gmu.swe.taf.Test} object
	 * 
	 * @return 				the {@link edu.gmu.swe.taf.Test} object
	 * @throws Exception 
	 */
	public Test updateConcreteTest(Test test) throws Exception {

		StringBuffer result = new StringBuffer(JunitTestWriter.INDENTATIONFORMETHOD);
		result.append("@Test\n");
		String methodHeader = "public void test" + test.getTestName() + "(){\n";
		
		result.append(JunitTestWriter.INDENTATIONFORMETHOD);
		result.append(test.getTestComment().endsWith("\n") ? "/* " + test.getTestComment() + " */" : "/* " + test.getTestComment() + " */ \n");
		result.append(JunitTestWriter.INDENTATIONFORMETHOD);
		result.append(methodHeader);
		
		if(test.getTestCode().startsWith("\n"))
			result.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
		
		String[] code = test.getTestCode().split("\n");
		
		StringBuffer testCode = new StringBuffer("");
		for(String s: code){
			testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
			testCode.append(s);
			testCode.append("\n");
		}
		
		//Check if there are required variable declarations or initializations in the test code.
		//If none of the required ones exist, add them at the beginning of the test code.
		//Otherwise, throw an exception  -- to be done
		
		//Add all required mappings for this tests into finalRequiredMappings
		List<Mapping> mappings = test.getMappings();
		List<String> finalRequiredMappings = new ArrayList<String>();
		
		for(Mapping mapping: mappings){
			if(mapping.getRequiredMappings() != null && mapping.getRequiredMappings().size() != 0){
				List<String> requiredMappings = mapping.getRequiredMappings();
				for(String requiredMapping: requiredMappings){
					if(!finalRequiredMappings.contains(requiredMapping))
						finalRequiredMappings.add(requiredMapping);					
				}
			}
		}
		StringBuffer variableInitialization = null;
		//Check if the test code has contained the variable declarations and initializations
		//If it does not, add the required variable declarations to the variableInitialization
		/*
		
		if(finalRequiredMappings != null && finalRequiredMappings.size() > 0){
			variableInitialization = new StringBuffer("");
			for(String string: finalRequiredMappings){
				String retrievedTestInitialization = XmlManipulator.getObjectMappingByName(xmlPath, string.trim()).getTestCode();
				//System.out.println("string: " + string);
				//System.out.println("testCode: " + testCode);
				//System.out.println("retrievedTestInitialization: " + retrievedTestInitialization);
				if(testCode.toString().indexOf(retrievedTestInitialization) == -1){
					variableInitialization.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
					variableInitialization.append(retrievedTestInitialization);
					variableInitialization.append("\n");
				}
			}
		}*/
		variableInitialization = computeVariableInitialization(finalRequiredMappings, testCode, variableInitialization);
		if(variableInitialization != null)
			if(!variableInitialization.toString().equals("")){
				variableInitialization.append("\n");
				result.append(variableInitialization.toString());
			}
		
		result.append(testCode.toString());
		result.append(JunitTestWriter.INDENTATIONFORMETHOD);
		result.append("}\n");
		
		test.setTestCode(result.toString());
		//System.out.println("Done");
		
		return test;
	}
	
	/**
	 * Computes the variable declarations and initializations for a test from a list of required mappings
	 * Dependencies among the required mappings are solved.
	 * Proper test values are chosen for required mappings to satisfy the preconditions and state invariants if any.
	 * 
	 * @param requiredMappings	a list of mappings names in a String format
	 * @param testCode TODO
	 * @param variableInitialization TODO
	 * @return					the variable declarations and initializations in a String format
	 * @throws Exception 
	 */
	public StringBuffer computeVariableInitialization(List<String> requiredMappings, StringBuffer testCode, StringBuffer variableInitialization) throws Exception{
		List<ObjectMapping> finalMappings = new ArrayList<ObjectMapping>();
		finalMappings = calculateRequiredMappings(finalMappings, requiredMappings);
		
		if(finalMappings != null && finalMappings.size() > 0){
			variableInitialization = new StringBuffer("");
			for(ObjectMapping mapping: finalMappings){
				String testInitialization = generateTestValue(mapping);
				//System.out.println("test: " + testInitialization);
				if(testInitialization == null)
					throw new NullPointerException("Variables cannot be initialized. Please check the required mappings.");
				//String testInitialization = mapping.getTestCode();
				//System.out.println("string: " + mapping.getMappingName());
				//System.out.println("testCode: " + testCode);
				
				if(testCode.toString().indexOf(testInitialization) == -1){
					variableInitialization.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
					variableInitialization.append(testInitialization);
					variableInitialization.append("\n");
				}
			}
		}
		//System.out.println("testInitialization: " + variableInitialization);
		return variableInitialization;
	}
	
	/**
	 * Calculates all the required mappings using a recursive method
	 * 
	 * @param finalMappings		the final list of mappings in a String format
	 * @param initialMappings	the initial list of mappings in a String format
	 * @return					the final list of mappings in a String format
	 * @throws Exception
	 */
	public List<ObjectMapping> calculateRequiredMappings(List<ObjectMapping> finalMappings, List<String> initialMappings) throws Exception{
		for(String s: initialMappings){
			ObjectMapping mapping = XmlManipulator.getObjectMappingByName(xmlPath, s.trim());
			//System.out.println("mapping name: " + mapping.getMappingName());
			//System.out.println("mapping object: " + mapping.getObjectName());
			//System.out.println("mapping test: " + mapping.getTestCode());
			//System.out.println("mapping size: " + (mapping.getRequiredMappings() == null));
			if(mapping.getRequiredMappings() == null || mapping.getRequiredMappings().size() == 0){
				finalMappings.add(mapping);
			}
			else{
				calculateRequiredMappings(finalMappings, mapping.getRequiredMappings());
				finalMappings.add(mapping);
			}
		}
		//Remove redundant mappings
		for(int i = finalMappings.size() - 1; i >= 0;i--){
			for(int j = i - 1; j >= 0;j--){
				if(finalMappings.get(i).getMappingName().equals(finalMappings.get(j).getMappingName()))
					finalMappings.remove(i);
			}
		}
			
		return finalMappings;
	}
	
	/**
	 * Generates a test value for an object variable and return an object initialization.
	 * For a String object, if a regular expression is specified, an arbitrary String satisfying the regular expression will be generated.
	 * For an int, float, double, Integer, Float, or Double object, both value scopes and relational conditions may exist and they are separated by comma.
	 * For instance, "10, 25, 100, c>0"
	 * @param om	an {@link edu.gmu.swe.taf.ObjectMapping} object
	 * @return		an object initialization in a String format
	 */
	public String generateTestValue(ObjectMapping om){
		String type = om.getClassType().trim();
		String code = om.getTestCode();
		//System.out.println("type: " + type);
		//System.out.println("code: " + code);
		
		//If the test code is a complete variable declaration or initialization, return the code
		//Otherwise, continue and solve the constraints
		if(code.startsWith(type)){
			return code;
		}
		//If the type is String, call Xeger library to generate a String value that satisfies the pattern
		if(type.equalsIgnoreCase("String")){
			
		}
		String[] conditions = code.trim().split(",");
		if(type.equalsIgnoreCase("int") || type.equalsIgnoreCase("Integer") || type.equalsIgnoreCase("float") ||type.equalsIgnoreCase("double")){
			//Check if the code has relational conditions
			boolean hasRelationalOperators = false;
			for(String s: conditions){
				if(s.indexOf("<") != -1 || s.indexOf("<=") != -1 || s.indexOf(">") != -1 || s.indexOf(">=") != -1 || s.indexOf("!=") != -1){
					hasRelationalOperators = true;
					break;
				}
			}
			
			//if relational operators exist, call Choco library to solve the constraints.
			//Otherwise, choose an arbitrary test value
			if(hasRelationalOperators == true){
				ChocoConstraintSolver solver = new ChocoConstraintSolver();
				String value = solver.solveIntegerConstraint(conditions);
				if(type.equalsIgnoreCase("Integer")){				
					return type + " " + om.getIdentifiableElementName() + " = new Integer(" + value +");";
				}
				if(type.equalsIgnoreCase("int")){	
					return type + " " + om.getIdentifiableElementName() + " = " + value + ";";
				}
			}
			else{
				Random randomNumbers = new Random();
				int randomValue = randomNumbers.nextInt(conditions.length);
				
				if(type.equalsIgnoreCase("int")){	
					//Integer i = Integer.valueOf(conditions[randomValue].trim());
					String testCode = type + " " + om.getIdentifiableElementName() + " = " + conditions[randomValue].trim() +";";
					return testCode;
				}
				else if(type.equalsIgnoreCase("Integer")){
					String testCode = type + " " + om.getIdentifiableElementName() + " = new Integer(" + conditions[randomValue].trim() +");";
					return testCode;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Compile a file in a specified directory
	 * 
	 * @param directory		a directory in a String format
	 * @param file			a File object
	 * @throws Exception
	 */
	public void compileJavaFile(String directory, File file) throws Exception{
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		List<File> listFiles = JavaSupporter.returnAllJavaFiles(directory);
		//System.out.println("file size: " + listFiles.size());
		File[] files = new File[]{file};
		//File[] files = listFiles.toArray(new File[0]);
		Iterable<? extends JavaFileObject> compilationUnits =
		           fileManager.getJavaFileObjectsFromFiles(Arrays.asList(files));
		
		//create a diagnostic controller, which holds the compilation problems
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
		
		List<String> optionList = new ArrayList<String>();
		optionList.addAll(Arrays.asList("-classpath", directory + ":" + System.getProperty("java.class.path")));
		//optionList.addAll(Arrays.asList("-classpath", System.getProperty("java.class.path")));
		
		System.out.println("classpath: " + System.getProperty("java.class.path"));
		boolean status = compiler.getTask(null, fileManager, diagnostics, optionList, null, compilationUnits).call();
		
		if (!status){//If compilation error occurs
			/*Iterate through each compilation problem and print it*/
			for (Diagnostic diagnostic : diagnostics.getDiagnostics()){
				System.out.format("Error on line %d in %s", diagnostic.getLineNumber(), diagnostic);
			}
		}
		try {
			fileManager.close() ;//Close the file manager
		} catch (IOException e) {
			e.printStackTrace();
		}
		//fileManager.close();
		//compiler.run(null, null, null, directory + "vendingMachine" + ".java");
		//addURL(globalDirectory + directory);
		//compiler.run(null, null, null, directory + file.getName() + ".java");
		
	}

	/**
	 * Gets the directory
	 * @return the directory
	 */
	public String getDirectory() {
		return directory;
	}

	/**
	 * Sets the directory with the specified parameter
	 * @param directory		the directory in a String format
	 */
	public void setDirectory(String directory) {
		this.directory = directory;
	}

	/**
	 * Gets the name
	 * @return	the class name
	 */
	public String getTestName() {
		return name;
	}

	/**
	 * Sets the class name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	                         

}
