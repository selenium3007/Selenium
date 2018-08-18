package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class SelectAllChekBoxes {
	public WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> checkBox = driver.findElements(By.xpath
														("//td[@class='table5']/input[@type='checkbox']"));
	  for(int i=0;i<checkBox.size();i++)
	  {
		  if(!checkBox.get(i).isSelected())
		  {
		  checkBox.get(i).click();
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://echoecho.com/htmlforms09.htm");
	  driver.manage().window().maximize();
  }

}
