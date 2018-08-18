package com.testng.ecommerce.hybrid;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.ecommerce.hybrid.BasePage;
import com.java.ecommerce.hybrid.PageUI;

import atu.testrecorder.ATUTestRecorder;

public class TC001_HMS extends BasePage {
	
	public ATUTestRecorder recorder;

	@Test(description = "This test case is to verify Login & Logout in HMS")
	public void TC001() throws Exception {
		PageUI page=new PageUI(driver);
		page.hmsLogin();
		page.hmsLogout();
		recorder.stop();
	}
	
	/*@Test(description="This is to verify alert message in automation practice")
	public void TC002(){
		APPage ap=new APPage(driver);
		ap.login();
		Assert.assertEquals(ap.getErrorMsg(), "Authentication failed.");
	}
*/
	@BeforeTest
	public void beforeTest() throws Exception {
		//System.out.println(System.getProperty("user.dir"));
		recorder=new ATUTestRecorder("D:\\recording", "HmsLogin", false);
		recorder.start();
		browserLaunch("chrome", "http://seleniumbymahesh.com");

	}

	@AfterTest
	public void afterTest() {
	}

}
