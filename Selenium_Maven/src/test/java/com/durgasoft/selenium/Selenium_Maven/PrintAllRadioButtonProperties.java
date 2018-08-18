package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class PrintAllRadioButtonProperties {
	public WebDriver driver;
	@Test
	public void Test01() throws Exception {
		WebElement radio = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));

		for (int k = 1; k < 3; k++) {
			List<WebElement> radioButton = radio.findElements(By.name("group" + k));
			for (int i = 0; i < radioButton.size(); i++) {
				radioButton.get(i).click();
				for (int j = 0; j < radioButton.size(); j++) {
					System.out.println(radioButton.get(j).getAttribute("value") + "----"
															+ radioButton.get(j).getAttribute("checked"));
					Thread.sleep(3000);
				}
			}
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
	}

}
