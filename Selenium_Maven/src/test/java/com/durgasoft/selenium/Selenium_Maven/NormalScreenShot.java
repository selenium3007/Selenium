package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class NormalScreenShot {

	public WebDriver driver;

	@Test(enabled = false)
	public void blindScreenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Mahesh\\Desktop\\SBM.jpeg"));
	}

	@Test(enabled = false)
	public void coinditionScreenshot() throws Exception {
		List<WebElement> links = driver.findElements(By.partialLinkText("Mahesh"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
		if (!((links.size()) == 0)) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\Mahesh\\Desktop\\SBM.png"));

		}
	}

	@Test(enabled = false)
	public void functionalScreenShot() throws Exception {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			String linkName = links.get(i).getText();
			System.out.println(linkName);
			links.get(i).click();
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\Mahesh\\Desktop\\screenshots\\" + linkName + ".png"));
			links = driver.findElements(By.tagName("a"));

		}
	}

	@Test(enabled = false)
	public void datenTimeScreenshot() throws Exception {
		Date dt = new Date();
		DateFormat dtFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Mahesh\\Desktop\\" + dtFormat.format(dt) + "SBM.jpeg"));
	}

	@Test
	public void passedScreenShot() throws Exception {
		
		/*Object o=null;
		Integer x=(Integer)o;*/
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			String linkName = links.get(i).getText();
			System.out.println(linkName);
			links.get(i).click();
			if (driver.getTitle().contains("Register: Mercury Tours")) {
				Date dt = new Date();
				DateFormat dtFormat = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");

				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\Mahesh\\Desktop\\screenshots\\" 
												+ "" + linkName + "--"+ dtFormat.format(dt) + "SBM.jpeg"));
			}
			links = driver.findElements(By.tagName("a"));
		}
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

}
