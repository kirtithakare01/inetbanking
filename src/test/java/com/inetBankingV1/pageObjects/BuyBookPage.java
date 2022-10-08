package com.inetBankingV1.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyBookPage {

	WebDriver driver;

	public BuyBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchDD;
	@FindBy(id = "twotabsearchtextbox")
	WebElement twotabSB;
	@FindBy(xpath = "//span[contains(text(),'The Magic Drum')]")
	WebElement selectBook;
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCart;
	@FindBy(name = "proceedToRetailCheckout")
	WebElement Proceed;

	public void selectSearchbox() {
		SearchDD.click();
	}

	public void selectBookAuthor(String name) {
		twotabSB.sendKeys(name);
	}

	public void clickAddToCart() {
		addToCart.click();
	}

	public void selectBook() {
		selectBook.click();
	}

	public void clickProccedToSubmit() {
		Proceed.click();
	}

	public void scrollIntoElement(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCart);
	}
}
