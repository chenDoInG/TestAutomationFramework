package edu.gmu.swe.taf.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.gmu.swe.taf.util.JavaSupporter;

public class JavaSupporterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRemoveSemiColon() {
		String string = "vm.getCredit() == 0;;;;";
		assertEquals("vm.getCredit() == 0", JavaSupporter.removeSemiColon(string));
	}
	
	@Test
	public void testCreateTestDirectories(){
		String directory = "tempData/DynamicParser/test/";
		JavaSupporter.createTestDirectory(directory, "edu.gmu");
	}
	
	@Test
	public void testReturnPakcages(){
		assertEquals("edu/gmu/", JavaSupporter.returnPackages("package    edu.gmu;"));
	}
	
	@Test
	public void testCleanUpPackageName(){
		assertEquals("edu.gmu", JavaSupporter.cleanUpPackageName("package    edu.gmu;;"));
	}
}
