package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test5 extends BaseClass{

	@FindAll({@FindBy(xpath="//a[@title=\"View my shopping cart\"]"),@FindBy(xpath="1222313132")})
	private WebElement mouseover;

	@FindAll({@FindBy(id="cgv"),@FindBy(xpath="//input[@name=\"cgv\"]")})
	private WebElement tickmark;

	@FindAll({@FindBy(name="processCarrier"),@FindBy(xpath="//button[@name=\"processCarrier\"]")})
	private WebElement proceedtocheckout5;

	public WebElement getMouseover() {
	return mouseover;
	}

	public WebElement getTickmark() {
	return tickmark;
	}

	public WebElement getProceedtocheckout5() {
	return proceedtocheckout5;
	}


	public Test5() {

	PageFactory.initElements(driver,this);

	}

	}

