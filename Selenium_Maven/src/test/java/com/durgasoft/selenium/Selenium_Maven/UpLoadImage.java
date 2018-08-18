package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class UpLoadImage {
	
	public WebDriver driver;
	
	public void verifyLogin() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}

	public void verifyRegistrtaion() throws Exception{
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		Thread.sleep(3000);
	}
	
  @Test
  public void f() throws Exception{
	  verifyLogin();
	  verifyRegistrtaion();
	  driver.findElement(By.name("image")).click();
	  Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\Mahesh\\Desktop\\ImageUpload.exe");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
	  driver.manage().window().maximize();
  }

}
