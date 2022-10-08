package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAddedItemsPage {
	WebDriver driver;
	
	public DeleteAddedItemsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
		
		
	}
	@FindBy(id ="nav-cart-count")
	WebElement cartElement;
	@FindBy(xpath="//input[contains(@aria-label,'Delete Lotto')]")
	WebElement deleteitem;
	@FindBy(id="a-autoid-5-announce")
	WebElement selectdropdown;

}
