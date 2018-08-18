package com.durgasoft.selenium.Selenium_Maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebCalender {
	public WebDriver driver;
	public void selectDate(String month_year, String day) throws Exception {
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div/div/div"));
		System.out.println(elements.size());
		for (int i = 0; i < elements.size(); i++) {
			i=0;
			System.out.println(elements.get(i).getText());
			if (elements.get(i).getText().equals(month_year)) {
				List<WebElement> tableData = driver
						.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td/a"));
				for (WebElement d : tableData) {
					System.out.println(d.getText());
					if (d.getText().equals(day)) {
						d.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(3000);
				elements = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div/div/div"));
			}
		}
		}
	@Test
	public void f() throws Exception {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(3000);
		//CheckIn
		String date = "1-November 2018";
		String[] splitter = date.split("-");
		String checkInDate = splitter[0];
		String checkInMonth = splitter[1];
		selectDate(checkInMonth, checkInDate);
		Thread.sleep(3000);
		//CheckOut
		driver.findElement(By.xpath("//*[@id='Div1']/button")).click();
		String chkdate = "30-November 2018";
		String chksplitter[]=chkdate.split("-");
		String checkOutDate=chksplitter[0];
		String checkOutMonth=chksplitter[1];
		selectDate(checkOutMonth, checkOutDate);
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
