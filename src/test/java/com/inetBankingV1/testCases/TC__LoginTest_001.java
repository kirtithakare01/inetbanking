package com.inetBankingV1.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.LoginPage;



public class TC__LoginTest_001 extends BaseClass{
	
	

	
	@Test
	public void LoginTest() {
		
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(Username);
		lp.setPassword(Password);
		lp.clickSubmit();
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
