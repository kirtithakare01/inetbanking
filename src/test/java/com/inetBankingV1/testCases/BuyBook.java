package com.inetBankingV1.testCases;



import java.awt.AWTException;

import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.BuyBookPage;
import com.inetBankingV1.utilities.CommonMethods;

public class BuyBook extends BaseClass {
	
	BuyBookPage bbp;
	CommonMethods cm;
	

	
	@Test
	public void Test_BuyBook() throws AWTException, InterruptedException {
		bbp = new BuyBookPage(driver);
		cm = new CommonMethods(driver);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		bbp.selectSearchbox();
		Thread.sleep(2000);
		bbp.selectBookAuthor("Sudha Murthy");
		Thread.sleep(2000);
		cm.keyDown();
		Thread.sleep(2000);
		bbp.selectBook();
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		cm.switchToNewWindow(parentWindow);
		Thread.sleep(2000);
		bbp.scrollIntoElement(driver);
		Thread.sleep(2000);
		bbp.clickAddToCart();
		Thread.sleep(2000);
		bbp.clickProccedToSubmit();
		Thread.sleep(2000);

	}

}
