package edu.gmu.swe.taf.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.NamedElement;

/**
 * A utility class used to support compilation of Java classes
 * 
 * @author Nan Li
 * @version 1.0 Feb 8, 2013
 *
 */

public class JavaSupporter {

	public JavaSupporter() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Returns all Java files in a directory specified by path
	 * 
	 * @param path the current path of a directory
	 * @return a {@link java.util.List} of {@link java.io.File}s that are Java files
	 */
	public static List<File> returnAllJavaFiles(String path){
		
		File folder = new File(path);
		File[] files = folder.listFiles();
		List<File> results = new ArrayList<File>();
		
		for(File file: files){
			if(file.isFile() && file.getName().endsWith(".java"))
				results.add(file);
		}
		
		return results;
	}
	
	/**
	 * Removes the semicolon if there is one at the end of a String object.
	 * @param string	a statement having semicolons at the end in a String format
	 * @return			a String object without having a semicolon at the end
	 */
	public static String removeSemiColon(String string){
		String result = string;
		if(string.endsWith(";")){
			result = string.substring(0, string.length() - 1);
			if(result.endsWith(";"))
				result = removeSemiColon(result);
		}
		else{
			return result;
		}
		return result;	
	}
	
	/**
	 * Copies a File object from the source to the destination.
	 * 
	 * @param source		the source file
	 * @param destination	the destination file
	 * @throws IOException
	 */
	public static void copyFile(File source, File destination) throws IOException{
		InputStream oInStream = new FileInputStream(source);
		OutputStream oOutStream = new FileOutputStream(destination);

		// Transfer bytes from in to out
		byte[] oBytes = new byte[1024];
		int nLength;
		BufferedInputStream oBuffInputStream = new BufferedInputStream( oInStream );

		while ((nLength = oBuffInputStream.read(oBytes)) > 0) {
			oOutStream.write(oBytes, 0, nLength);
		}

		oInStream.close();
		oOutStream.close();
	}
	
	/**
	 * Returns all UML files in a directory specified by path.
	 * 
	 * @param 	path the current path of a directory
	 * @return 	a {@link java.util.List} of {@link java.io.File}s that are Java files
	 */
	public static List<File> returnAllUmlFiles(String path){
		
		File folder = new File(path);
		File[] files = folder.listFiles();
		List<File> results = new ArrayList<File>();
		
		for(File file: files){
			if(file.isFile() && file.getName().endsWith(".uml"))
				results.add(file);
		}
		
		return results;
	}
	
	/**
	 * Returns all sub-directories in a directory specified by path.
	 * 
	 * @param path the current path of a directory
	 * @return a {@link java.util.List} of {@link java.io.File}s that are Java files
	 */
	public static List<File> returnAllDirectories(String path){
		
		File folder = new File(path);
		File[] files = folder.listFiles();
		System.out.println("file size: " + files.length);
		List<File> results = new ArrayList<File>();
		
		for(File file: files){
			if(file.isDirectory())
				results.add(file);
		}
		System.out.println("result size: " + results.size());
		return results;
	}
	
	/**
	 * Get the names of a list of File objects.
	 * @param files	a list of File objects
	 * @return		an array of names of File objects
	 */
	public static Object[] getFileNames(List<File> files){
		List<String> fileNames = new ArrayList<String>();
		for(File file : files){
			fileNames.add(file.getName());
		}
		return fileNames.toArray();
	}
	
	/**
	 * Get the names of a list of {@link org.eclipse.uml2.uml.NamedElement} objects.
	 * @param elements	a list of {@link org.eclipse.uml2.uml.NamedElement} objects
	 * @return			an array of names of {@link org.eclipse.uml2.uml.NamedElement} objects
	 */
	public static Object[] getElementNames(List<NamedElement> elements){
		List<String> elementNames = new ArrayList<String>();
		for(NamedElement element : elements){
			elementNames.add(element.getName());
		}
		return elementNames.toArray();
	}

}
