package org.demotestng;

import java.sql.Driver;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HostelBookingUsingTestngParameter {
	public  WebDriver driver; 
	public Select select;
	@BeforeClass
	private void lanunchBro() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\DemoTestNG\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		

	}
//	@AfterClass
//	private void quitBrower() {
//	driver.quit();
//}

	
	@BeforeMethod
	private void startTime() {
		Date date=new Date();
		System.out.println(date);

	}
	
	@AfterMethod
	private void endTime() {
		Date date=new  Date();
		System.out.println(date);
		}
	@Parameters({"username","password","checkInDate","checkOutDate","FName"})
	@Test
	private void Tc1(String username1,String pass,String chckInDate,String chckoutdate,String Firstname1) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(username1);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys(pass);
		WebElement loginbnt = driver.findElement(By.id("login"));
		loginbnt.click();
		WebElement selectLocation = driver.findElement(By.id("location"));
		Select select=new Select(selectLocation);
		select.selectByVisibleText("New York");
		WebElement selectHostel = driver.findElement(By.id("hotels"));
		Select select2=new Select(selectHostel);
		select2.selectByValue("Hotel Sunshine");
		WebElement selectRoomType = driver.findElement(By.id("room_type"));
		Select select3=new Select(selectRoomType);
		select3.selectByIndex(3);
		WebElement cleardate = driver.findElement(By.id("datepick_in"));
		cleardate.clear();
		WebElement indate = driver.findElement(By.id("datepick_in"));
		indate.sendKeys(chckInDate);
		WebElement cleardateout = driver.findElement(By.id("datepick_out"));
		cleardateout.clear();
		WebElement Outdate = driver.findElement(By.id("datepick_out"));
		Outdate.sendKeys(chckoutdate);
		WebElement selectAdultRoom = driver.findElement(By.id("adult_room"));
		Select select4=new Select(selectAdultRoom);
		select4.selectByVisibleText("2 - Two");
		WebElement SelectChileroom = driver.findElement(By.id("child_room"));
		Select select5=new Select(SelectChileroom);
		select5.selectByValue("1");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		WebElement radiobnt = driver.findElement(By.id("radiobutton_0"));
		radiobnt.click();
		WebElement continuebnt = driver.findElement(By.id("continue"));
		continuebnt.click();
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(Firstname1);
		
		
		
	}
	
	
	

}
