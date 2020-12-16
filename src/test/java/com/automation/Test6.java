package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class Test6 extends BaseClass {
	
	@FindAll({@FindBy(xpath="//a[@title=\"View my shopping cart\"]"),@FindBy(xpath="1222313132")})
	private WebElement mouseover;

	@FindAll({@FindBy(xpath="//a[@class=\"bankwire\"]"),@FindBy(xpath="//a[@title=\"Pay by bank wire\"]")})
	private WebElement bank;

	@FindAll({@FindBy(xpath="//span[text()='I confirm my order']"),@FindBy(id=" Ragu selvaraj")})
	private WebElement iConfirm;

	public WebElement getMouseover() {
	return mouseover;
	}

	public WebElement getBank() {
	return bank;
	}

	public WebElement getiConfirm() {
	return iConfirm;
	}

	public Test6() {

	      PageFactory.initElements(driver, this);
	}

	}


