package org.demotestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoSampleTestNGProject {
	
	@BeforeClass
	private void launchBrowers() {
		System.out.println("Launch Brower");

	}
	@AfterClass
	private void quitBrowers() {
		System.out.println("Quit the Browers");

	}
	@BeforeMethod
	private void startTime() {
		System.out.println("Start the excution");

	}
	@AfterMethod
	private void endtime() {
	System.out.println("Ent the excution");

	}
	@Test
	private void test1() {
		System.out.println("Test 1");

	}
	
	@Test
	private void test2() {
		System.out.println("Test 2");

	}
	
	
	

}
