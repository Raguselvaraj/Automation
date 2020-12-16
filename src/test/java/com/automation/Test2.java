package com.automation;


import javax.management.MXBean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
public class Test2 extends BaseClass {
	
@FindAll({@FindBy(id="search_query_top"),@FindBy(xpath="//input[@id=\"search_query_top\"]")})
private WebElement searchbox;

@FindAll({@FindBy(name="submit_search"),@FindBy(xpath="//button[@name=\"submit_search\"]")})
private WebElement button;

@FindAll({@FindBy(xpath="(//span[text()='Add to cart'])[1]"),@FindBy(id="ragu selvaraj")})
private WebElement addToCart;

@FindAll({@FindBy(xpath="//a[@class='btn btn-default button button-medium']"),@FindBy(xpath="ragu selvaraj")})
private WebElement proceedtocheckout1;

@FindAll({@FindBy(xpath="//i[@class=\"icon-plus\"]"),@FindBy(id="Ragu")})
private WebElement addProduct;
   
@FindAll({@FindBy(id="total_price"),@FindBy(xpath="//span[@id=\"total_price\"]")})
private WebElement totalPrice;
   
@FindBy(xpath="//span[text()='Proceed to checkout']")
private WebElement proceedtocheckout2;

public WebElement getSearchbox() {
return searchbox;
}

public WebElement getButton() {
return button;
}

public WebElement getAddToCart() {
return addToCart;
}

public WebElement getProceedtocheckout1() {
return proceedtocheckout1;
}

public WebElement getAddProduct() {
return addProduct;
}

public WebElement getTotalPrice() {
return totalPrice;
}

public WebElement getProceedtocheckout2() {
return proceedtocheckout2;
}
   
    public Test2() {

      PageFactory.initElements(driver,this);
    }
   
   
   
}


