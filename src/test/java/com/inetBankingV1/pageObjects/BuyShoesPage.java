package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuyShoesPage {
	WebDriver driver;

	public BuyShoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id = "nav-hamburger-menu")
	WebElement All;
	@FindBy(xpath = "//a/div[text()=\"Men's Fashion\"]")
	WebElement Mensfashion;
	@FindBy(xpath = "//a[text()='Sports Shoes']")
	WebElement Sportshoes;
	@FindBy(xpath = "//span[text()='Running']")
	WebElement running;
	@FindBy(xpath = "//span[text()='Mens Vertigo Running Shoes']")
	WebElement shoeSelect;
	@FindBy(name = "dropdown_selected_size_name")
	WebElement selectshoesSize;
	@FindBy(id = "a-autoid-10")
	WebElement ShoeColour;
	@FindBy(id = "add-to-cart-button")
	WebElement addToCart;
	@FindBy(name = "proceedToRetailCheckout")
	WebElement Proceed;

	public void clickToAllMenu() {
		All.click();
	}

	public void ClickOnMensWearMenu() {
		Mensfashion.click();

	}

	public void clickOnSportshoeMenu() {
		Sportshoes.click();
	}

	public void clickOnRunning() {
		running.click();

	}

	public void selectShoe() {
		shoeSelect.click();

	}

	public void SelectSize() {
		Select se = new Select(selectshoesSize);
		se.selectByVisibleText(" 8 UK ");

	}

	public void selectShoeColor() {
		ShoeColour.click();

	}

	public void clickAddTocart() {
		addToCart.click();
	}

	public void clickProceedToPay() {
		Proceed.click();
	}

}
