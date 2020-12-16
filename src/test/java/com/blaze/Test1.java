package com.blaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test1 extends BaseClass {

	@FindAll({@FindBy(name="fromPort"),@FindBy(xpath="//select[@name=\"fromPort\"]")})
	private WebElement fromport;

	@FindAll({@FindBy(name="toPort"),@FindBy(xpath="//select[@name=\"toPort\"]")})
	private WebElement toport;

	@FindAll({@FindBy(xpath="//input[@type=\"submit\"]"),@FindBy(xpath="//input[@class=\"btn btn-primary\"]")})
	private WebElement search;

	public WebElement getFromport() {
	return fromport;
	}

	public WebElement getToport() {
	return toport;
	}

	public WebElement getSearch() {
	return search;
	}

	public Test1() {

	 PageFactory.initElements(driver, this);
	}


	}


