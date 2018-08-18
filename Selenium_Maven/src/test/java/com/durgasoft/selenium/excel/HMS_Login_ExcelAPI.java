package com.durgasoft.selenium.excel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Login_ExcelAPI {

	public WebDriver driver;
	public ExcelAPI e;

	@Test
	public void f() throws Exception{
		e=new ExcelAPI("D:\\LiveProject_18_JUNE_930AM\\Selenium_Maven\\testdata\\login.xlsx");
		int noOfRows=e.getRows("Sheet1");
		for(int i=1;i<noOfRows;i++)
		{
			driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(e.getCellValue("Sheet1", 0, i));
		Thread.sleep(3000);
	//	driver.findElement(By.name("password")).sendKeys(e.getCellValue("Sheet1", 1, 1));
	//	driver.findElement(By.name("submit")).click();
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
	}
}




