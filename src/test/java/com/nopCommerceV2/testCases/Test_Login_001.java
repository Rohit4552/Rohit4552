package com.nopCommerceV2.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopCommerceV2.pageObject.LoginPage;



public class Test_Login_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
			
		LoginPage lp = new LoginPage(driver);
		
		logger.info("Url is opened");
		 
		lp.setUserName(username);
		logger.info("User provided"); //logger msg
		
		lp.setPassword(password);
		logger.info("Password provided");//logger msg
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login Passed");//logger msg
			
		} else {
			//captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Failed");//logger msg
		}

	}

	
}



