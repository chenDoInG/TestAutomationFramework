package edu.gmu.swe.taf.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


//import org.eclipse.acceleo.module.example.uml2java.helios.GenerateJava;
//import org.eclipse.acceleo.examples.uml2java.main.Uml2java;
import org.eclipse.acceleo.module.sample.main.GenerateFSM;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratorsTest {

	/**
	 * The user.dir property key.
	 */
	private static final String USERDIR = "user.dir";
	
	@Test
	public void testUMLtoJava() {
		
		/*
		String path = System.getProperty(USERDIR);
		path = path + "/generators/uml2java/model/example.uml";
		URI modelURI = URI.createFileURI(URI.decode(path));

		File targetFolder = new File(System.getProperty(USERDIR) + "/generators/uml2java/result");

		try {
			assertFalse(EMFPlugin.IS_ECLIPSE_RUNNING);
			GenerateJava generator = new GenerateJava(modelURI, targetFolder, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		*/
		/*
		
		String path = "E:\\EclipseDataModeling\\org.eclipse.acceleo.examples.uml2java.model";
		String path1 = path + "/model/model.uml";

		URI modelURI = URI.createFileURI(path1);
		System.out.println(path1);
		
		File targetFolder = new File(path);

		try {
			assertFalse(EMFPlugin.IS_ECLIPSE_RUNNING);
			Uml2java generator = new Uml2java(modelURI, targetFolder, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			fail(e.getMessage());
		}
		*/
	
		//String path = "C:\\Users\\nanli\\Desktop\\temp\\VendingMachine";
		//String path = "E:\\eclipseDataJuno\\VendingMachine";
		//String path = "E:\\EclipseDataModeling\\VendingMachine";
		String path = "/Users/nli/Documents/workspace/eclipseJuno/VendingMachine";
		String path1 = path + "/VendingMachineFSM.uml";

		URI modelURI = URI.createFileURI(path1);
		System.out.println(path1);
		String path2 = path + "/src/result";
		File targetFolder = new File(path2);

		try {
			assertFalse(EMFPlugin.IS_ECLIPSE_RUNNING);
			GenerateFSM generator = new GenerateFSM(modelURI, targetFolder, new ArrayList<Object>());
			generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

}
