package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.LINK_TEXT, using = "New Customer")
	WebElement NewCustomer;

	@FindBy(how = How.CSS, using = "input[name='name']")
	WebElement txtUsername;

	@FindBy(how = How.NAME, using = "rad1")
	WebElement txtgender;

	@FindBy(how = How.NAME, using = "dob")
	WebElement txtdob;

	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;

	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;

	@FindBy(how = How.NAME, using = "state")
	WebElement txtstate;

	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpin;

	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txtphoneno;

	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;

	@FindBy(how = How.NAME, using = "sub")
	WebElement txtsubmit;

	public void clickAddNewCustomer() {
		NewCustomer.click();

	}

	public void custName(String cname) {

		txtUsername.sendKeys(cname);
	}

	public void custGender(String cgender) {
		txtgender.click();
	}

	public void custdob(String dd, String mm, String yy) {
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yy);
	}

	public void custAddress(String caddress) {
		txtaddress.sendKeys(caddress);

	}

	public void custCity(String ccity) {
		txtcity.sendKeys(ccity);

	}

	public void custState(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custPin(int cpin) {
		txtpin.sendKeys(String.valueOf(cpin));
	}

	public void custphoneno(String cphoneno) {

		txtphoneno.sendKeys(cphoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custSubmit() {
		txtsubmit.click();
	}
}
