package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

public class DropDown2 {

	public WebDriver driver;
	
	@Test(enabled=false)
	public void amazonDropDown1() {
		WebElement header = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dd = header.findElements(By.tagName("option"));
		System.out.println(dd.size());
		
		for(int i=0;i<dd.size();i++)
		{
			System.out.println(dd.get(i).getText());
		}
	}
	@Test
	public void amazonDropDown2() {
		WebElement header = driver.findElement(By.id("searchDropdownBox"));
		Select dd=new Select(header);
		List<WebElement> ddValues= dd.getOptions();
		System.out.println(ddValues.size());
		
		for(int i=0;i<ddValues.size();i++)
		{
			System.out.println(ddValues.get(i).getText());
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
	}

}
