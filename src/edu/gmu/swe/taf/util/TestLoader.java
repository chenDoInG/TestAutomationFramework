
package edu.gmu.swe.taf.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A utility class used to test Java classes
 * 
 * @author Nan Li
 * @version 1.0 Feb 21, 2013
 *
 */
public class TestLoader extends ClassLoader {

	/**
	 * Constructs a TestLoader object with no parameter
	 */
	public TestLoader() {
		super();
	}

	/**
	 * @param parent
	 */
	public TestLoader(ClassLoader parent) {
		super(parent);
	}
	
	/**
	 * Loads a test class specified by the directory and test name.
	 * @param name						the name of the test class
	 * @param directory					the directory name
	 * @return							a Class object
	 * @throws ClassNotFoundException
	 */
	public synchronized Class loadTestClass(String name, String directory) throws ClassNotFoundException{
		Class result;
		try{
			byte[] data = getClassData(name, directory);

		    result = defineClass(name, data, 0, data.length);
		    if(result == null){
		    	throw new ClassNotFoundException(name);
		    }
		}catch(IOException e){
			throw new ClassNotFoundException();
		}
		return result;
	}
	
	/**
	 * Gets the class content in a byte array.
	 * @param name						the name of the class
	 * @param directory					the name of the directory in which the class is
	 * @return							a byte array of class content
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private byte[] getClassData(String name, String directory) throws FileNotFoundException,IOException{
	    //Create a file object of the test class
	    File f = new File (directory + name + ".class");

	    FileInputStream fis = new FileInputStream(f);

	    BufferedInputStream bis = new BufferedInputStream(fis);
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    try {
	    	int c = bis.read();
	    	while (c != -1) {
	        out.write(c);
	        c = bis.read();
	    	}
	    } catch (IOException e) {
	      return null;
	    }
	    return out.toByteArray();
	  }
	
	  public synchronized Class loadClass(String name) throws ClassNotFoundException
	  {
	    // See if type has already been loaded by
	    // this class loader
	    Class result = findLoadedClass(name);
	    if (result != null){
	      // Return an already-loaded class
	      return result;
	    }

	    try{
	      result = findSystemClass(name);
	      return result;
	    } catch (ClassNotFoundException e){
	      // keep looking
	    }

	    try{
	      byte[] data;
	      try{
	      // Try to load it
	        data = getClassData(name, "testData/test/temp/");
	      }catch(FileNotFoundException e){
	        data = getClassData(name, "testData/test/temp/");
	      }
	      result = defineClass(name, data,0,data.length);
	      if(result==null) throw new ClassNotFoundException(name);
	      return result;
	    }catch(IOException e){
	      throw new ClassNotFoundException();
	    }
	  }
}
