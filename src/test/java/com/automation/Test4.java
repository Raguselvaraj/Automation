package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test4 extends BaseClass{

	@FindAll({@FindBy(xpath="//a[@title=\"View my shopping cart\"]"),@FindBy(xpath="1222313132")})
	private WebElement mouseover;

	@FindBy(xpath="//textarea[@name=\"message\"]")
	private WebElement message;

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceedtocheckout4;

	public WebElement getMouseover() {
	return mouseover;
	}

	public WebElement getMessage() {
	return message;
	}

	public WebElement getProceedtocheckout4() {
	return proceedtocheckout4;
	}


	public Test4() {

	      PageFactory.initElements(driver, this);
	}


	}

