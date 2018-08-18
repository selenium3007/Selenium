package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class CheckBoxProperties {
	public WebDriver driver;
  @Test
  public void f() {
	    List<WebElement> checkBox = driver.findElements(By.xpath
			  															("//td[@class='table5']/input[@type='checkbox']"));
	  System.out.println(checkBox.size());
	  
	  for(int i=0;i<checkBox.size();i++)
	  {
		//  System.out.println(checkBox.get(i).isSelected());
		  System.out.println(checkBox.get(i).getAttribute("value")+"---"
				  																	+checkBox.get(i).getAttribute("checked"));
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://echoecho.com/htmlforms09.htm");
	  driver.manage().window().maximize();
  }
}
