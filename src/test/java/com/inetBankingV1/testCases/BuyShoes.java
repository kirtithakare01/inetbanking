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
		
		bsp.ClickOnMensWearMenu();
		
		bsp.clickOnSportshoeMenu();
		
		bsp.clickOnRunning();
		
		bsp.selectShoe();
		
		String ParentWindow = driver.getWindowHandle();
		cm.switchToNewWindow(ParentWindow);
		
		bsp.SelectSize();
		
		bsp.selectShoeColor();
		
		bsp.clickAddTocart();
		
		bsp.clickProceedToPay();
		

	}

}
