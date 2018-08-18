package com.durgasoft.selenium.Selenium_Maven;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTest4 {
	public WebDriver driver;

	@Test
	public void brokenLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: " + links.size());

		for (int i = 0; i < links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			verifyLinkActive(url);
		}
	}

	public void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(3000);
			httpUrlConnection.connect();

			if (httpUrlConnection.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpUrlConnection.getResponseMessage());
			}
			if (httpUrlConnection.getResponseCode() == httpUrlConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpUrlConnection.getResponseMessage() 
																				+ httpUrlConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}

}
