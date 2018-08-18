package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class DropDown1 {

	public WebDriver driver;

	@Test
	public void f() {
		// driver.findElement(By.id("month")) .sendKeys("Jul");
		WebElement dd = driver.findElement(By.id("month"));
		Select monthDD = new Select(dd);
		monthDD.selectByVisibleText("Jul");
		monthDD.selectByIndex(3);
		monthDD.selectByValue("12");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

	}

}
