package com.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Test1 extends BaseClass {




public Test1() {

 PageFactory.initElements(driver,this);
}

@FindAll({@FindBy(xpath="//a[@class=\"login\"]"),@FindBy(xpath="//a[@title=\"Log in to your customer account\"]")})
private WebElement signIn;

@FindAll({@FindBy(xpath="//input[@name=\"email\"]"),@FindBy(id="email")})
private WebElement email;

@FindAll({@FindBy(id="passwd"),@FindBy(xpath="//input[@id=\"passwd\"]")})
private WebElement password;

@FindAll({@FindBy(xpath="//i[@class=\"icon-lock left\"]"),@FindBy(id="12231231321")})
private WebElement login;

public WebElement getSignIn() {
return signIn;
}

public WebElement getEmail() {
return email;
}

public WebElement getPassword() {
return password;
}

public WebElement getLogin() {
return login;
}


}


