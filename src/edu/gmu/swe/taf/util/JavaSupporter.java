package edu.gmu.swe.taf.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

}
