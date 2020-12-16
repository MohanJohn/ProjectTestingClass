package org.programinginjunit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassforHostelBookingUsingDataDriven {

	public static WebDriver driver;
	public static File file;
	public static FileInputStream fileInputStream;
	
	public static Select select;

	public static WebDriver Browserlauch() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\sampleMavenproject\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}
	public static  void UrlLaunch(String url) {
		driver.get(url);

	}
	public static  void pagetitle() {
		System.out.println("Page Title ::"+driver.getTitle());

	}
	public static  void pageUrl() {
		System.out.println("Page URL ::"+driver.getCurrentUrl());

	}
//	public static String ReadDataExcel(int rowno, int cellno) throws IOException {
//		file=new File("F:\\eclipse-workspace\\sampleMavenproject\\excelbook\\adactin-access.xlsx");
//		fileInputStream=new FileInputStream(file);
//		workbook=new XSSFWorkbook(fileInputStream);
//		sheet=workbook.getSheet("web-access");
//		Row r =sheet.getRow(rowno);
//		Cell c=r.getCell(cellno);
//		int type = c.getCellType();
//		String name="";
//		if (type==1) {
//			name = c.getStringCellValue();
//
//		}else {
//			if (DateUtil.isCellDateFormatted(c)) {
//				Date d = c.getDateCellValue();
//				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mmm-yyyy");
//				name = dateFormat.format(d);	
//
//			}else {
//				double d = c.getNumericCellValue();
//				long lo=(long)d;
//				name = String.valueOf(lo);
//			}
//
//
//
//
//
//		}
//		return name;
//	}
	public static  void givenvalues(WebElement ele,String values) {
		ele.sendKeys(values);

	}
	public static	void bntclick(WebElement ele) {
		ele.click();
	}
	public static void selectbyvistabletext(WebElement elem,String value) {
		Select select=new Select(elem);
		select.selectByVisibleText(value);
	}
	public static void selectbyvalues(WebElement el,String valu) {

		select =new Select(el);
		select.selectByValue(valu);

	}
	public static void dataclear(WebElement cle) {
		cle.clear();
		

	}
	public static void orderno(WebElement ordno) {
		System.out.println("Order No::"+ordno.getAttribute("value"));

	}
	public static void waittimes() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public static  void quitbrower() {
		driver.quit();
		

	}













}

