package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class SwitchToWindows {
	public WebDriver driver;

	@Test
	public void verifyPopUp() throws Exception {
		String title = driver.getTitle();
		System.out.println("Title of the window :" + title);
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main window ID : " + mainWindow);
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Available windows ID's are : " + windows);
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String currentWindow = itr.next();
			System.out.println("current window ID :" + currentWindow);
			if (!currentWindow.equalsIgnoreCase((mainWindow))) {
				driver.switchTo().window(currentWindow);
				System.out.println("current window title :" + driver.getTitle());
			}
		}
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("(//a[@class='btn btn-default redBtn'])[2]")).click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(mainWindow);
		System.out.println("Title : " + driver.getTitle());
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
	}

}
