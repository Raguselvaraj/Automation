package com.blaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test2 extends BaseClass {
	
	@FindBys({@FindBy(xpath="(//input[@class=\"btn btn-small\"])[3]"),@FindBy(xpath="(//input[@type=\"submit\"])[2]")})
	private WebElement flight;

	@FindBys({@FindBy(id="inputName"),@FindBy(xpath="//input[@id=\"inputName\"]")})
	private WebElement firstName;

	@FindBys({@FindBy(name="address"),@FindBy(xpath="//input[@name=\"address\"]")})
	private WebElement address;

	@FindBys({@FindBy(name="city"),@FindBy(xpath="//input[@name=\"city\"]")})
	private WebElement city;

	@FindBys({@FindBy(id="state"),@FindBy(xpath="//input[@name=\"state\"]")})
	private WebElement state;

	@FindAll({@FindBy(xpath="//input[@name=\"zipCode\"]"),@FindBy(id="zipCode")})
	private WebElement zipCode;

	@FindAll({@FindBy(xpath="//select[@name=\"cardType\"]"),@FindBy(id="cardType")})
	private WebElement cardType;

	@FindBys({@FindBy(id="creditCardNumber"),@FindBy(xpath="//input[@name=\"creditCardNumber\"]")})
	private WebElement cardNumber;

	@FindBys({@FindBy(id="creditCardMonth"),@FindBy(xpath="//input[@name=\"creditCardMonth\"]")})
	private WebElement cardMonth;

	@FindBys({@FindBy(id="creditCardYear"),@FindBy(xpath="//input[@name=\"creditCardYear\"]")})
	private WebElement cardYear;

	@FindBys({@FindBy(id="nameOnCard"),@FindBy(xpath="//input[@name=\"nameOnCard\"]")})
	private WebElement holderName;

	@FindBys({@FindBy(name="rememberMe"),@FindBy(xpath="//input[@name=\"rememberMe\"]")})
	private WebElement remember;

	@FindBys({@FindBy(xpath="//input[@class=\"btn btn-primary\"]"),@FindBy(xpath="//input[@type=\"submit\"]")})
	private WebElement booking;

	public WebElement getFlight() {
	return flight;
	}

	public WebElement getFirstName() {
	return firstName;
	}

	public WebElement getAddress() {
	return address;
	}

	public WebElement getCity() {
	return city;
	}

	public WebElement getState() {
	return state;
	}

	public WebElement getZipCode() {
	return zipCode;
	}

	public WebElement getCardType() {
	return cardType;
	}

	public WebElement getCardNumber() {
	return cardNumber;
	}

	public WebElement getCardMonth() {
	return cardMonth;
	}

	public WebElement getCardYear() {
	return cardYear;
	}

	public WebElement getHolderName() {
	return holderName;
	}

	public WebElement getRemember() {
	return remember;
	}

	public WebElement getBooking() {
	return booking;
	}

	public Test2() {

	  PageFactory.initElements(driver, this);
	}



	}


