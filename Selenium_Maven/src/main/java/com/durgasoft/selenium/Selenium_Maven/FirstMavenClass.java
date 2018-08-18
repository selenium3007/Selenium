package com.durgasoft.selenium.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstMavenClass {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		/**
		  @author Mahesh
		 **/
		//System.out.println("Hi welcome to Maven first program");
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		
			System.setProperty("webdriver.ie.driver", "D:\\library\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("http://google.com");
		
	}

}
