package com.inetBankingV1.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.LoginPage;
import com.inetBankingV1.utilities.XlUtilities;

public class TC_LoginDDT_002 extends BaseClass {

	@Test
	public void LoginDDT(String uname, String pwd) {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(uname);
		lp.setPassword(pwd);
		lp.clickSubmit();

		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}

	}

	// user define method to check wheather alert present or not
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	@DataProvider(name="LoginData")
	String[][] getdata() throws IOException{
		
		String path = System.getProperty("user.dir")+"/inetBankingV1/src/test/java/com/inetBankingV1/testData/LoginData.xlsx";
		
		int rownum = XlUtilities.getRowCount(path, "Sheet1");
		int colcount =XlUtilities.getCelCount(path, "Sheet1", 1);		
		String logindata[][] = new String[rownum][colcount];
		
		for(int i=0;i<=rownum;i++) {
			for(int j=1;j<colcount;j++) {
				logindata[i-1][j]= XlUtilities.GetCelData(path, "Sheet1", i, j);
			}
			
		}
		return logindata;
		
		
		
		
	}

}
