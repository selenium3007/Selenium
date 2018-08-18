package com.java.ecommerce.hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APPage {
	@FindBy(linkText="Sign in") WebElement signinLoc;
	@FindBy(id="email") WebElement emailLoc;
	@FindBy(id="passwd") WebElement passwordLoc;
	@FindBy(id="SubmitLogin") WebElement submitLoc;
	@FindBy(xpath="//*[@id='center_column']/div[1]/ol/li") WebElement erromsgLoc;
	
	public APPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login() {
		signinLoc.click();
		emailLoc.sendKeys("abc@gmail.com");
		passwordLoc.sendKeys("abc123");
		submitLoc.click();
	}
	
	public String getErrorMsg() {
		return erromsgLoc.getText();
	}
}




