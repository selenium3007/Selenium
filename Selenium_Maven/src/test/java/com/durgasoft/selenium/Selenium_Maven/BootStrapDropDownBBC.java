package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BootStrapDropDownBBC {

	public WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.linkText("More")).click();
		WebElement header = driver.findElement(By.xpath("//*[@id='orb-panel-more']/div/ul"));
		List<WebElement> links = header.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			// if(links.get(i).getText().equalsIgnoreCase("Radio"))
			String actual_Val = links.get(i).getAttribute("innerHTML");
			if (actual_Val.contentEquals("Radio")) {
				links.get(i).click();
				break;
			}
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		driver.manage().window().maximize();
	}

}
