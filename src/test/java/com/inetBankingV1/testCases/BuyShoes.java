package com.inetBankingV1.testCases;

import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.BuyShoesPage;
import com.inetBankingV1.utilities.CommonMethods;

public class BuyShoes extends BaseClass {
	BuyShoesPage bsp;
	CommonMethods cm;

	
	@Test
	public void Test_BuyShoes() throws InterruptedException {
		bsp = new BuyShoesPage(driver);
		cm = new CommonMethods(driver);
		bsp.clickToAllMenu();
		Thread.sleep(2000);
		bsp.ClickOnMensWearMenu();
		Thread.sleep(2000);
		bsp.clickOnSportshoeMenu();
		Thread.sleep(2000);
		bsp.clickOnRunning();
		Thread.sleep(2000);
		bsp.selectShoe();
		Thread.sleep(2000);
		String ParentWindow = driver.getWindowHandle();
		cm.switchToNewWindow(ParentWindow);
		Thread.sleep(2000);
		bsp.SelectSize();
		Thread.sleep(2000);
		bsp.selectShoeColor();
		Thread.sleep(2000);
		bsp.clickAddTocart();
		Thread.sleep(2000);
		bsp.clickProceedToPay();
		Thread.sleep(2000);

	}

}
