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

public class ProjectClass2 {
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
		driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.click();
		WebElement enterthevalue = driver.findElement(By.id("twotabsearchtextbox"));
		enterthevalue.sendKeys("Hp laptop");
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-text"));
		searchbtn.click();

		Set<String> handless = driver.getWindowHandles();
		int count=0;
		for (String newwinddow: handless) {
			if (count==6) {
				driver.switchTo().window(newwinddow);

			}

		}
		WebElement pricetag = driver.findElement(By.xpath("(//a[@class='a-size-base a-link-normal s-no-hover'])[2]"));
		pricetag.click();
		List<WebElement> laptopname = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		List<WebElement> pricetags= driver.findElements(By.xpath("//span[@class=\"a-price\"]"));
		
		for (WebElement names : laptopname) {
			String lapnames = names.getText();
			for (WebElement laptopprice : pricetags) {
				String lprices = laptopprice.getText();
				System.out.println("Laptops Names::"+lapnames+"Laptop ::"+lprices);
				
			}
		
		}

		
		
		

	}

	@AfterSuite
	private void closebrower() {
			driver.quit();

	}


}
