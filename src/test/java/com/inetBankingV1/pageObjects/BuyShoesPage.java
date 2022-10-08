package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.inetBankingV1.utilities.CommonMethods;

public class BuyShoesPage {
	WebDriver driver;
	CommonMethods cm;

	public BuyShoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		cm = new CommonMethods(driver);
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
		cm.waitForElementLoaded(All);
		All.click();
	}

	public void ClickOnMensWearMenu() {
		cm.waitForElementLoaded(Mensfashion);
		Mensfashion.click();

	}

	public void clickOnSportshoeMenu() {
		cm.waitForElementLoaded(Sportshoes);
		Sportshoes.click();
	}

	public void clickOnRunning() {
		cm.waitForElementLoaded(running);
		running.click();

	}

	public void selectShoe() {
		cm.waitForElementLoaded(shoeSelect);
		shoeSelect.click();

	}

	public void SelectSize() {
		Select se = new Select(selectshoesSize);
		se.selectByVisibleText(" 8 UK ");

	}

	public void selectShoeColor() {
		cm.waitForElementLoaded(ShoeColour);
		ShoeColour.click();

	}

	public void clickAddTocart() {
		cm.waitForElementLoaded(addToCart);
		addToCart.click();
	}

	public void clickProceedToPay() {
		cm.waitForElementLoaded(Proceed);
		Proceed.click();
	}

}
