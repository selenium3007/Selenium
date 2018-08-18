package com.java.ecommerce.hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageUI {

	@FindBy(linkText="HMS") WebElement hmsLoc;
	@FindBy(name="username") WebElement usernameLoc;
	@FindBy(name="password") WebElement passwordLoc;
	@FindBy(name="submit") WebElement loginLoc;
	@FindBy(linkText="Logout") WebElement logoutLoc;
	
	public PageUI(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void hmsLogin() {
		hmsLoc.click();
		usernameLoc.sendKeys("admin");
		passwordLoc.sendKeys("admin");
		loginLoc.click();
	}
	
	public void hmsLogout() {
		logoutLoc.click();
	}
	
}





