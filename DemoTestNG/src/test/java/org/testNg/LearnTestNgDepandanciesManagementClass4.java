package org.testNg;

import org.testng.annotations.Test;

public class LearnTestNgDepandanciesManagementClass4 {
	
	
	@Test(enabled=true)
	public  void highschool() {
		System.out.println("High school");
		}
	@Test(dependsOnMethods="highschool")
	public void highersecschool() {
		System.out.println("Higher sec school");

	}
	@Test(dependsOnMethods="highersecschool")
	public  void engineering() {
		System.out.println("Engineering ");

	}
	
	
	
	
	
	
	
	

}
