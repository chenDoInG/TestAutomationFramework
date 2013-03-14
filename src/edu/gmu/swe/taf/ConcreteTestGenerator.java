package edu.gmu.swe.taf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
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
import edu.gmu.swe.taf.util.TestLoader;
import edu.gmu.swe.taf.util.XegerStringGenerator;

/**
 * A class that generates concrete tests from abstract tests
 * 
 * @author Nan Li
 * @version 1.0 Feb 8, 2012
 *
 */

public class ConcreteTestGenerator {
	//a test directory
	private String directory;
	private String testDirectory;
	private String name;
	private String xmlPath;
	//a test directory to put temporal Java files
	private String tempTestDirectory;
	private String packageName;
	private String imports;
	/**
	 * Construct a ConcreteTestGenerator with the specified directory and class name
	 */
	public ConcreteTestGenerator(String directory, String name, String xmlPath, String packageName, String imports) {
		this.directory = directory;
		this.name = name;
		this.xmlPath = xmlPath;
		this.tempTestDirectory = directory + "test/temp/";
		this.packageName = packageName;
		this.imports = imports;
		this.testDirectory = directory + "test/";
		JavaSupporter.createTestDirectory(tempTestDirectory, packageName);
	}

	/**
	 * Generates and Compiles a JUnit test in a directory
	 * 
	 * @param xmlDirectory		a directory in a String format
	 * @param name				a Java class name in a String format
	 * @param tests				a list of {@link edu.gmu.swe.taf.Test} objects that contain abstract test information
	 * @throws Exception		throws 
	 */
	public void generateConcreteTests(List<? extends Test> tests) throws Exception{
		File file = new File(getDirectory() + "test/" + getTestName() + ".java");
		
		List<Test> finalTests = new ArrayList<Test>();
		for(Test test: tests)
			finalTests.add(updateConcreteTest(test));
		
		try {
			createConcreteTestCase(getDirectory() + "test/", file, finalTests);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		compileJavaFile(getDirectory() + "class/", file);
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
		String importsJava = "import java.io.*;\n";
		String importsJUnit = "import org.junit.*;\nimport static org.junit.Assert.*;\n";
	
		result.append(packageName);
		result.append(importsJava);
		result.append(importsJUnit);
		result.append(imports);
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
		
		//Check if there are required variable declarations or initializations in the test code.
		//If none of the required ones exist, add them at the beginning of the test code.
		//Otherwise, throw an exception  -- to be done
		
		//Add all required mappings for this tests into finalRequiredMappings
		List<Mapping> mappings = test.getMappings();
		for(Mapping mapping: mappings){
			//System.out.println(mapping.getIdentifiableElementName());
			System.out.println(mapping.getMappingName());
		}
		
		List<Mapping> finalMappings = new ArrayList<Mapping>();
		
		//keep track of the index moving inside of the for loop

		for(int i = 0; i < mappings.size();){
			//the first if structure deals the case: all mappings before the very last one
			//because we are using one lookhead mechanism, if the last mapping is reached, the program will reach the one after it
			//and this could case indexoutofbound exception
			if(i < mappings.size() - 1){
				//find a right mapping before a constraint
				if(mappings.get(i + 1).getType() == IdentifiableElementType.PRECONDITION || mappings.get(i + 1).getType() == IdentifiableElementType.STATEINVARIANT){
					//get the current mapping and this mapping is mapped to an element that describes behaviors of a model
					Mapping currentMapping = mappings.get(i);
					
					//get a list of constraint mappings after the current mapping 
					List<Mapping> nextMappings = new ArrayList<Mapping>();
					
					//the position of the next element after the constraints
					int position = i + 1;
					do{
						nextMappings.add(mappings.get(position));
						position++;
						if(position >= mappings.size())
							break;
					}while(mappings.get(position).getType() == IdentifiableElementType.PRECONDITION || mappings.get(position).getType() == IdentifiableElementType.STATEINVARIANT);
					
					//get a list of mappings that are prior to the constraint
					for(int j = i; j <= position - 1; j++){
						finalMappings.add(mappings.get(j));
						i++;
					}
					//System.out.println("current: " + currentMapping.getIdentifiableElementName());
					//for(Mapping nextmapping: nextMappings)
					//	System.out.println("next: " + nextmapping.getIdentifiableElementName() + " " + nextmapping.getMappingName());
					
					//System.out.println("size: " + finalMappings.size() + " i: " + i);
					
					//from the mappings prior to the constraint, write them in a temp Java file and test if the constraint can be satisfied
					//if this list of mappings cannot satisfy the constraint, use another mapping 
					//if all mappings cannot satisfy the constraint, throw an exception
					if(!isConstraintSatisfied(finalMappings)){
						//get all mappings for the element right ahead of the constraint
						//to be updated for any element, not just transition
						List<Mapping> nodes = XmlManipulator.getMappingsByTransition(xmlPath, currentMapping.getIdentifiableElementName());
						System.out.println("available mappings for " + currentMapping.getIdentifiableElementName() + " is " + nodes.size());
						boolean[] isMappingSatisfied = new boolean[nextMappings.size()];
						

						
						for(Mapping m: nodes){
							//System.out.println("mappings before: " + finalMappings.size());
							//remove the old mapping and constraints first

							//System.out.println("mappings after: " + finalMappings.size());
							//System.out.println("m.getMappingName(): " + m.getMappingName() + "currentMapping.getMappingName(): " + currentMapping.getMappingName());
							//use a different mapping to solve the constraint
							if(!m.getMappingName().equals(currentMapping.getMappingName())){
								for(Mapping mappingRemoved: nextMappings){
									finalMappings.remove(finalMappings.size() - 1);
								}
								finalMappings.remove(finalMappings.size() - 1);
								
								finalMappings.add(m);
								System.out.println("nextMappings size: " + nextMappings.size());
								//check every constraint
								for(int x = 0; x < nextMappings.size();x++){
									finalMappings.add(nextMappings.get(x));
									if(isConstraintSatisfied(finalMappings)){
										isMappingSatisfied[x] = true;
									}
									else{
										isMappingSatisfied[x] = false;
									}
									finalMappings.remove(finalMappings.size() - 1);
								}
								//System.out.println("after more mappings checking0: " + finalMappings.size());
								boolean isConstraintSatisfied = true;
								for(int x = 0; x < nextMappings.size();x++){
									if(isMappingSatisfied[x]  == false)
										isConstraintSatisfied = false;
								}
								if(isConstraintSatisfied == true){
									//finalMappings.add(m);
									for(int x = 0; x < nextMappings.size();x++){
										finalMappings.add(nextMappings.get(x));
									}
									break;
								}else{
									
									//this part will be deleted after the error message catch part is complete
									//since if any constraint is not satisfied, 
									for(int x = 0; x < nextMappings.size();x++){
										finalMappings.add(nextMappings.get(x));
									}
								}
									
								//System.out.println("after more mappings checking1: " + finalMappings.size());
							}
						}	

						//show the error messages
						for(int y = 0; y < nextMappings.size(); y++){
							if(isMappingSatisfied[y] == false){
								System.err.println("The constraint " + nextMappings.get(y).getMappingName() +  " in " + nextMappings.get(y).getIdentifiableElementName() + " cannot be satisfied after the following path: ");
								for(int z = 0; z < finalMappings.size(); z++){
									if(z > 0){
										if(!finalMappings.get(z).getIdentifiableElementName().equals(finalMappings.get(z - 1).getIdentifiableElementName()))
											System.err.print(finalMappings.get(z).getIdentifiableElementName() + " ");
									}else{
										System.err.print(finalMappings.get(z).getIdentifiableElementName() + " ");
									}
								}
							}
						}//end of the for loop of showing error messages
						
					}
					//System.out.println("i: " + i);
				}
				else{
					finalMappings.add(mappings.get(i));
					i++;
				}
			}			
			else{
				//if this is the last mapping, add it
				finalMappings.add(mappings.get(i));
				i++;
			}
		}
	
		StringBuffer variableInitialization = null;
		
		//Get the variable initialization
		variableInitialization = computeVariableInitialization(finalMappings);
		if(variableInitialization != null)
			if(!variableInitialization.toString().equals("")){
				variableInitialization.append("\n");
				result.append(variableInitialization.toString());
			}
		
		StringBuffer testCode = new StringBuffer("");		
		for(int i = 0;i < finalMappings.size();i++){
			System.out.println(finalMappings.get(i).getMappingName());
			//the if branch is to be updated for test oracle
			if((finalMappings.get(i).getType() == IdentifiableElementType.PRECONDITION) || (finalMappings.get(i).getType() == IdentifiableElementType.STATEINVARIANT)){
				if(i == (finalMappings.size() - 1)){
					testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT); 
					testCode.append("assertEquals(true, ");
					testCode.append(finalMappings.get(i).getTestCode().substring(0, finalMappings.get(i).getTestCode().lastIndexOf(";")));
					testCode.append(");");
					testCode.append("\n");
				}
			}else{
				testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
				testCode.append("/*** test code of " + finalMappings.get(i).getMappingName());
				testCode.append(" for the element ");
				testCode.append(finalMappings.get(i).getIdentifiableElementName());
				testCode.append(" ***/");
				testCode.append("\n");
				String[] code = finalMappings.get(i).getTestCode().split("\n");
				for(String s: code){
					testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
					testCode.append(s.trim());
					testCode.append("\n");
				}
			}
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
	 * @param mappings	a list of mappings names in a String format
	 * @return					the variable declarations and initializations in a String format
	 * @throws Exception 
	 */
	public StringBuffer computeVariableInitialization(List<Mapping> mappings) throws Exception{
		List<String> initialRequiredMappings = new ArrayList<String>();
		StringBuffer variableInitialization = null;
		StringBuffer testCode = new StringBuffer();
		
		for(Mapping m1: mappings){
			testCode.append(m1.getTestCode());
		}
		
		//The first step to compute the required mappings
		//Get the required object mappings at the top level that are directly associated with identifiable element mappings
		//Then use these required object mappings to get the variable declarations and initializations
		for(Mapping mapping: mappings){
			if(mapping.getRequiredMappings() != null && mapping.getRequiredMappings().size() != 0){
				List<String> requiredMappings = mapping.getRequiredMappings();
				for(String requiredMapping: requiredMappings){
					if(!initialRequiredMappings.contains(requiredMapping))
						initialRequiredMappings.add(requiredMapping);					
				}
			}
		}
		
		//System.out.println(mappings.size());
		//System.out.println(initialRequiredMappings.size());
		
		List<ObjectMapping> finalMappings = new ArrayList<ObjectMapping>();
		finalMappings = calculateRequiredMappings(finalMappings, initialRequiredMappings);
		//System.out.println("finalMappings.size(): " + finalMappings.size());
		
		if(finalMappings != null && finalMappings.size() > 0){
			variableInitialization = new StringBuffer("");
			for(ObjectMapping mapping: finalMappings){
				//System.out.println("mapping: " + mapping.getTestCode());
				String testInitialization = generateTestValue(mapping);
				//System.out.println("test: " + testInitialization);
				if(testInitialization == null)
					throw new NullPointerException("Variables cannot be initialized. Please check the required mappings.");
				//String testInitialization = mapping.getTestCode();
				//System.out.println("string: " + mapping.getMappingName());
				//System.out.println("testCode: " + testCode);
				
				//check if the test initialization has been included in the main body of the test
					if(testCode.indexOf(testInitialization) == -1){
						variableInitialization.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
						variableInitialization.append(testInitialization);
						variableInitialization.append("\n");
					}
					/*
					else if(testInitialization != null && !testInitialization.toString().trim().equals("")){
						throw new Exception("a variable initialization" + testInitialization + " has been defined in the test content.");
					}
					*/						
			}//end of the for loop
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
		String code = om.getTestCode().trim();
		//System.out.println("type: " + type);
		//System.out.println("code: " + code + code.startsWith(type));
		
		//if this mapping requires no more mappings, return its test code
		if(om.getRequiredMappings() == null)
			return code;
		
		//If the test code is a complete variable declaration or initialization, return the code
		//Otherwise, continue and solve the constraints
		if(code.startsWith(type)){
			return code;
		}
		
		//If the type is String, call Xeger library to generate a String value that satisfies the pattern
		if(type.equalsIgnoreCase("String")){
				boolean isRegex;
				try {
			        java.util.regex.Pattern.compile(code);
			        isRegex = true;
			    } catch (java.util.regex.PatternSyntaxException e) {
			    	isRegex = false;
			    	System.err.println("The input String is not a regular expression.");
			    }
				
				if(isRegex == true){
					XegerStringGenerator xeger = new XegerStringGenerator();
					return type + " " + om.getIdentifiableElementName() + " = \"" + xeger.generateString(code) +"\";";
				}
			
		}

		//Get the possible test values
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
	 * Determines if the constraint after the given mappings can be evaluated to true.
	 * @param mappings		a list of <@link Mapping> objects
	 * @return				true if the constraint is satisfied; otherwise, return false.
	 * @throws Exception 	
	 */
	public boolean isConstraintSatisfied(List<Mapping> mappings) throws Exception{
		boolean returnValue = false;
		
		StringBuffer variableInitilization = computeVariableInitialization(mappings);
		StringBuffer testCode = new StringBuffer();
		
		if(variableInitilization != null)
			testCode.append(variableInitilization);
		
		//find the position of the last element that is not a constraint
		int position = 0;
		for(int i = mappings.size() - 1; i >= 0; i--){
			if((mappings.get(i).getType() != IdentifiableElementType.PRECONDITION) && (mappings.get(i).getType() != IdentifiableElementType.POSTCONDITION) && (mappings.get(i).getType() != IdentifiableElementType.STATEINVARIANT)){
				position = i;
				break;
			}
		}
		
		//add main body of the test
		for(int i = 0; i < mappings.size(); i++){
			if((mappings.get(i).getType() == IdentifiableElementType.PRECONDITION) ||( mappings.get(i).getType() == IdentifiableElementType.STATEINVARIANT)){
				if(i == (mappings.size() - 1)){
					testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT); 
					testCode.append("return ");
					testCode.append(mappings.get(i).getTestCode());
					testCode.append("\n");
				}
				else if(i == (position + 1)){
					testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT); 
					testCode.append("return (");
					testCode.append(JavaSupporter.removeSemiColon(mappings.get(i).getTestCode()));
					testCode.append(") ");
					
					for(int j = i + 1; j < mappings.size();j++){
						testCode.append("&&");
						testCode.append(" (");
						testCode.append(JavaSupporter.removeSemiColon(mappings.get(j).getTestCode()));
						testCode.append(")");
					}
					testCode.append(";");
					testCode.append("\n");
					break;
				}
			}else{
				
				String[] code = mappings.get(i).getTestCode().split("\n");
				for(String s: code){
					testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT);
					testCode.append(s.trim());
					testCode.append("\n");
				}
				/*
				testCode.append(JunitTestWriter.INDENTATIONFORMETHODCONTENT); 
				testCode.append(mappings.get(i).getTestCode());
				testCode.append("\n");*/
			}
		}
		System.out.println("mapping size: " + mappings.size());
		for(Mapping mapping : mappings)
			System.out.println(mapping.getMappingName());
		//System.out.println(testCode.toString());
		File file = writeTempTest(testCode.toString());
		compileJavaFile(directory + "class/", file);
		
		File root1 = new File(tempTestDirectory);
		
		//System.out.println(root1.getAbsolutePath());
		
		/* when deploying the project, this part needs to be updated for adding more class paths
		 	File root2 = new File("./testData/src/");
			URL[] urls1 = new URL[]{root1.toURI().toURL()};
			URL[] urls2 = new URL[]{root2.toURI().toURL()};
			URL[] urls = new URL[urls1.length + urls2.length];
			System.arraycopy(urls1, 0, urls, 0, urls1.length);
			System.arraycopy(urls2, 0, urls, urls1.length, urls2.length);
		*/
		
		URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{root1.toURI().toURL()});
		List<File> jarFiles = JavaSupporter.returnAllJarFiles(directory + "class/");
		
		for(File jar : jarFiles){
			System.out.println(jar.getName());
			System.out.println(jar.getAbsolutePath());
			JavaSupporter.addURL(jar.toURL());
		}
		
		JavaSupporter.addURL(new File(directory + "class/").toURL());
		//System.out.println(JavaSupporter.returnPackages(packageName) + "TempTest");
		Class<?> c = null;
		if(packageName == null || packageName.trim().equals(""))
			c = Class.forName("TempTest", true, classLoader);
		else
			c = Class.forName(JavaSupporter.cleanUpPackageName(packageName) + ".TempTest", true, classLoader);
		
		//this part uses a customized class loader: TestLoader, now it looks like we do not need this class
		//TestLoader loader = new TestLoader();
		//Class c = loader.loadTestClass("TempTest", tempTestDirectory);
		Method[] methods = c.getDeclaredMethods();

		if(methods.length == 1){
			Method m = methods[0];
			m.setAccessible(true);
			Object o = m.invoke(c.newInstance(), new Object[]{});
			System.out.println("temp file result: " + o.toString());
			returnValue = Boolean.valueOf(o.toString());
		}
		else{
			throw new Exception("Errors in creating a temparoral Java class");
		}
	
		return returnValue;
	}
	/**
	 * Writes the test content in the temp class
	 * @param testContent	the test content in a String format
	 * @return				the file object of the test class
	 * @throws IOException
	 */
	public File writeTempTest(String testContent) throws IOException{
		File file = new File(tempTestDirectory + JavaSupporter.returnPackages(packageName) + "TempTest.java");
		//System.out.println(tempTestDirectory + "TempTest.java");
		FileOutputStream fop = new FileOutputStream(file);
		StringBuffer result = new StringBuffer("");

		String importsJava = "import java.io.*;\n";
		String importsJUnit = "import org.junit.*;\nimport static org.junit.Assert.*;\n";
	
		result.append(packageName);
		result.append(importsJava);
		result.append(importsJUnit);
		result.append(imports);
		result.append("\n");
		
		String classHeader = "public class TempTest {\n";
		result.append(classHeader);
		result.append("\n");
		result.append("    public boolean test(){\n");
		result.append(testContent);
		result.append("    }\n");
		result.append("}\n");
		
		byte[] contentInBytes = result.toString().getBytes();
		fop.write(contentInBytes);
		fop.flush();
		fop.close();
		
		return file;
	}
	/**
	 * Compiles a file in a specified directory
	 * 
	 * @param directory		a directory in a String format
	 * @param file			a File object
	 * @throws Exception
	 */
	public void compileJavaFile(String directory, File file) throws Exception{
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		//List<File> listFiles = JavaSupporter.returnAllJavaFiles(directory);
		//System.out.println("file size: " + listFiles.size());
		File[] files = new File[]{file};
		//File[] files = listFiles.toArray(new File[0]);
		Iterable<? extends JavaFileObject> compilationUnits =
		           fileManager.getJavaFileObjectsFromFiles(Arrays.asList(files));
		
		//create a diagnostic controller, which holds the compilation problems
		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
		
		//find all jar files in the class folder of the directory
		List<File> jarFiles = JavaSupporter.returnAllJarFiles(directory);
		String jarPath = "";
		for(File jar : jarFiles)
			jarPath += ":" + directory + jar.getName();
		
		List<String> optionList = new ArrayList<String>();
		optionList.addAll(Arrays.asList("-classpath", directory + ":" + System.getProperty("java.class.path") + jarPath));
		//optionList.addAll(Arrays.asList("-classpath", System.getProperty("java.class.path")));
		
		//System.out.println("classpath: " + System.getProperty("java.class.path"));
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
