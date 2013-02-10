package edu.gmu.swe.taf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import edu.gmu.swe.taf.util.JavaSupporter;

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
	/**
	 * Construct a ConcreteTestGenerator with the specified directory and class name
	 */
	public ConcreteTestGenerator(String directory, String name) {
		this.setDirectory(directory);
		this.setName(name);
	}

	/**
	 * Generates and Compiles a Java file in a directory
	 * 
	 * @param directory			a directory in a String format
	 * @param name				a Java class name in a String format
	 * @param methodContent		the content of a Java class
	 * @throws Exception
	 */
	public void generateConcreteTests(String methodContent) throws Exception{
		File file = new File(getDirectory() + getName() + ".java");

		try {
			createConcreteTest(getDirectory(), file, getName(), methodContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		compileJavaFile(getDirectory(), file);
	}
	
	/**
	 * Creates a concrete JUnit test in the specified directory with a specified name
	 * 
	 * @param directory		a directory in a String format
	 * @param file			a File object
	 * @param name			a file name in a String format
	 * @param content		the method content
	 * @return 				true if tests are successfully generated
	 * @throws IOException
	 */
	public boolean createConcreteTest(String directory, File file, String name, String content) throws IOException{
		
		//System.out.println(file.getPath());
		//needs to be updated for JUnit tests
		//a package name may need to be specified
		
		//indentation vairiables to improve readability
		String indentationForClass = "    ";
		String indentationForMethod = "        ";

		FileOutputStream fop = new FileOutputStream(file);
		String result = "";
		String importsJava = "import java.io.*;\n";
		String importsJUnit = "import org.junit.*;\n import static org.junit.Assert.*;\n";
		
		String imports = importsJava + importsJUnit;
		String packageName = "\n";
		String className = "public class " + name + " {\n";
		String firstMethod = "public void test" + name + "(){\n";
		
		result = packageName + imports + className + firstMethod + content + "}\n}\n";
		byte[] contentInBytes = result.getBytes();
		fop.write(contentInBytes);
		fop.flush();
		fop.close();
		
		System.out.println("Done");
		
		return false;
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
		optionList.addAll(Arrays.asList("-classpath", directory));
		
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
	public String getName() {
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
