package com.inetBankingV1.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.AddCustomerPage;
import com.inetBankingV1.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUsername(Username);
		lp.setPassword(Password);
		lp.clickSubmit();

		AddCustomerPage addcust = new AddCustomerPage(driver);
		Thread.sleep(3000);

		addcust.clickAddNewCustomer();
		Thread.sleep(2000);
		addcust.custName("kirti");
		addcust.custGender("female");
		addcust.custdob("05", "07", "1990");
		addcust.custAddress("Nagpur");
		addcust.custCity("Nagpur");
		addcust.custPin(124534);
		addcust.custState("maharashtra");
		addcust.custphoneno("8676869567");
		String email = randomestring() + "@gmail.com";
		addcust.custemailid(email);
		Thread.sleep(3000);
		addcust.custSubmit();
		Thread.sleep(5000);

		boolean res = driver.getPageSource().contains("customer registered Successfully!!!");
		if (res == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return (generatedstring);

	}

}
