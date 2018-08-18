package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class ActionsMouseOperations {

	public WebDriver driver;

	@Test(enabled=false)
	public void dragNDrop() {
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		//a.clickAndHold(drag).moveToElement(drop).release().build().perform();

	}
	@Test(enabled=false)
	public void resizeMethod() {
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions a=new Actions(driver);
		//a.dragAndDropBy(drag, 200, 50).perform();
		a.clickAndHold(drag).moveByOffset(100, 50).release().build().perform();
	}
	@Test(enabled=false)
	public void rightCLickMethod() {
		driver.get("https://jqueryui.com/resizable/");
		WebElement element = driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[4]/a"));
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	@Test(enabled=false)
	public void slider() {
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions a=new Actions(driver);
		//a.clickAndHold(drag).moveByOffset(100, 0).release().build().perform();
		a.dragAndDropBy(drag, 200, 0).perform();
	}
	@Test
	public void browserSlider() {
		driver.get("https://www.seleniumhq.org/download/");
		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,1000)");
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
}
