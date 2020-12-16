package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test3 extends BaseClass{
	
	@FindAll({@FindBy(xpath="//a[@title=\"View my shopping cart\"]"),@FindBy(xpath="1222313132")})
	private WebElement mouseover;

	@FindAll({@FindBy(xpath="//ul[@class=\"address first_item item box\"]"),@FindBy(xpath="121515151")})
	private WebElement deliveryDetails;

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceedtocheckout3;

	public WebElement getMouseover() {
	return mouseover;
	}

	public WebElement getDeliveryDetails() {
	return deliveryDetails;
	}

	public WebElement getProceedtocheckout3() {
	return proceedtocheckout3;
	}

	public Test3() {

	      PageFactory.initElements(driver,this);
	     
	}



	}


