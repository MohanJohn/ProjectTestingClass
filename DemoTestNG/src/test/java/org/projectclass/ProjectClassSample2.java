package org.projectclass;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ProjectClassSample2 {
	WebDriver driver;

	@BeforeSuite
	private void launchBrower() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\DemoTestNG\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	private void ecomerwebsitetesting() {
		String oldwindown = driver.getWindowHandle();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@id=\"inputValEnter\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"inputValEnter\"]")).sendKeys("hp laptop i5");
		WebElement bntenter = driver.findElement(By.xpath("//button[@class=\"searchformButton col-xs-4 rippleGrey\"]"));
		bntenter.click();
		Set<String> Handles = driver.getWindowHandles();
		int count=0;
		for (String newwindow: Handles) {
			if (count==6) {
				driver.switchTo().window(newwindow);

			}

		}
		driver.findElement(By.xpath("(//div[@class=\"sub-cat-name \"])[1]")).click();
		//i have click Laptops11 in  side bar Computers & Peripherals 
		List<WebElement> LaptopNames = driver.findElements(By.xpath("//p[@class=\"product-title \"]"));	
		List<WebElement> priceoflaltop = driver.findElements(By.xpath("//span[@class=\"lfloat product-price\"]"));

		for (WebElement names : LaptopNames) {
			String listoflaptopname = names.getText();
			for (WebElement price : priceoflaltop) {
				String pricetag = price.getText();

				System.out.println(" Laptop Name::"+listoflaptopname+ " lapTop Price ::"+pricetag);
			}
		}

	}


	@AfterSuite
	private void closebrower() {
				driver.quit();

	}


}
