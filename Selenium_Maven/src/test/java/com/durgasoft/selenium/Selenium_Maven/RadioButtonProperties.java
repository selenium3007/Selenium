package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class RadioButtonProperties {
	public WebDriver driver;

	@Test
	public void f() {
		WebElement radio = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> radioButton = radio.findElements(By.name("group2"));
		for(int i=0;i<radioButton.size();i++)
		{
			System.out.println(radioButton.get(i).getAttribute("value")+"----"
																		+radioButton.get(i).getAttribute("checked"));
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}

}
