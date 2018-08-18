package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BootStrapDropDownInJquery {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	  Thread.sleep(3000);
	  WebElement header = driver.findElement(By.xpath
			  												("//ul[@class='multiselect-container dropdown-menu']"));
	  List<WebElement> items = header.findElements(By.tagName("input"));
	  
	  for(int i=0;i<items.size();i++)
	  {
		 items.get(i).click();
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
	  driver.manage().window().maximize();
  }
}



