package org.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LearnTestNgSuiteExamClass4 {
	 WebDriver driver;
	long startTime;
	long endTime;
	
	
	@BeforeSuite
	public  void BrowerOpenn() {
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\DemoTestNG\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();

	}
	
	
	
	
	
	@Test
	public  void opeanGoogle() {
	
		
		driver.get("https://www.google.com/");
		
		

	}
	@Test
	public void openBing() {
		long startTime = System.currentTimeMillis();
		
		
		driver.get("https://www.bing.com/?cc=in");
		
	}
	@Test
	public void openYahoo() {
		
		driver.get("https://in.yahoo.com/");
		

	}
	
	@AfterSuite
	public  void quickBrower() {
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total Time taken ::"+totalTime);

	}
	
	

}
