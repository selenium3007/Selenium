package com.durgasoft.selenium.Selenium_Maven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyAlertsInHMS {

	public WebDriver driver;

	@BeforeTest
	public void openURL() {
		driver = new FirefoxDriver();
		driver.get("http://seleniumbymahesh.com/HMS");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void verifyLogin() throws Exception {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void verifyRegistration() throws Exception{
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void verifyPR() throws Exception  {
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Mahesh");
		driver.findElement(By.name("LAST_NAME")).sendKeys("D");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("1234567890");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.xpath("//*[@id='tcalGrid']/tbody/tr[2]/td[5]")).click();
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("20");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Married");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("ADDRESS1")).sendKeys("vijayawada");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9876543210");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("ZIP")).sendKeys("123456");
		driver.findElement(By.name("image")).sendKeys("D:\\mbar\\sunny.jpg");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	public void verifyAlerts() {
		Alert alrt = driver.switchTo().alert();
		String str=alrt.getText();
		System.out.println(str);
		alrt.accept();//OK
		//alrt.dismiss();//CANCEL
	}

	}

	









