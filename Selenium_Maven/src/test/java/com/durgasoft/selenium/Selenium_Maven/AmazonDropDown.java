package com.durgasoft.selenium.Selenium_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonDropDown {
	public WebDriver driver;
	@Test
	public void dropDown1() {
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
		driver.findElement(By.className("nav-input")).click();
		String act_Val = driver.getTitle();
		String exp_Val = "Amazon.in: Harry Porter: Books";
		Assert.assertEquals(act_Val, exp_Val);
	}
	@Test
	public void dropDown2() {
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		Select webelem = new Select(dd);
		webelem.selectByIndex(10);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
		driver.findElement(By.className("nav-input")).click();
		String act_Val = driver.getTitle();
		String exp_Val = "Amazon.in: Harry Porter: Books";
		Assert.assertEquals(act_Val, exp_Val);
	}

	@BeforeMethod
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
	}

}
