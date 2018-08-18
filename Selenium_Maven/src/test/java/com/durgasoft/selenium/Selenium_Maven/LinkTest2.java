package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class LinkTest2 {
	public WebDriver driver;

	@Test
	public void f() throws Exception {
		
		WebElement header = driver.findElement(By.id("sc_hdu"));
		List<WebElement> links = header.findElements(By.tagName("a"));
		System.out.println("Available links are : " + links.size());

		for (int i = 0; i < links.size(); i++) {
			if (!links.get(i).getText().isEmpty()) {
				if (links.get(i).getText().contentEquals("Maps")) {
					System.out.println(links.get(i).getText());
					links.get(i).click();
					Thread.sleep(5000);
					break;
				}
			}
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("https://bing.com");
		driver.manage().window().maximize();
	}

}
