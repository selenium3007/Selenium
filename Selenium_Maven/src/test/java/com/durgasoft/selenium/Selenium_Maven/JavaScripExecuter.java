package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class JavaScripExecuter {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('email').value='Mahesh'" );
	  js.executeScript("document.getElementById('pass').value='Mahesh'");
	  js.executeScript("document.getElementById('u_0_2').click()");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();
  }

}
