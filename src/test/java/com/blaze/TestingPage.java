package com.blaze;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestingPage {
	
	BaseClass baseClass =new BaseClass();
	@BeforeClass
	private void browser() {

	baseClass.launchBrowser("google");
	}
	     
	@BeforeMethod
	private void url() {
	         
	baseClass.launchUrl("https://blazedemo.com/");
	}


	//@Parameters({"Ragu","City"})
	//First page
	@Test(priority=-2000,enabled=true,groups="@Chennai")
	private void method1() throws Throwable {
	Test1 blazeDemo =new Test1();

	baseClass.dropDownText(blazeDemo.getFromport(),"Mexico City");
	Thread.sleep(3000);
	baseClass.dropDownText(blazeDemo.getToport(),"Rome");
	Thread.sleep(2000);
	baseClass.click(blazeDemo.getSearch());

	//Second Page
	Test2 demo1=new Test2();
	baseClass.click(demo1.getFlight());
	baseClass.sendKeys(demo1.getFirstName(),"Ragu");
	baseClass.sendKeys(demo1.getAddress(),"City");
	baseClass.sendKeys(demo1.getCity(), "Chennai");
	baseClass.sendKeys(demo1.getState(),"Tamil Nadu");
	baseClass.sendKeys(demo1.getZipCode(), "655465");
	baseClass.dropDownText(demo1.getCardType(),"American Express");
	Thread.sleep(2000);
	baseClass.sendKeys(demo1.getCardNumber(),"4584 5454 5456 5666");
	baseClass.sendKeys(demo1.getCardMonth(),"12");
	baseClass.sendKeys(demo1.getCardYear(), "2022");
	baseClass.sendKeys(demo1.getHolderName(), "ragu selvaraj");
	baseClass.click(demo1.getRemember());
	baseClass.click(demo1.getBooking());

	}

	@Test(priority=200,invocationCount=2)
	private void method2() throws Throwable {
	Test1 blazeDemo =new Test1();

	baseClass.dropDownText(blazeDemo.getFromport(),"Mexico City");
	Thread.sleep(3000);
	baseClass.dropDownText(blazeDemo.getToport(),"Rome");
	Thread.sleep(2000);
	baseClass.click(blazeDemo.getSearch());

	//Second Page
	Test2 demo1=new Test2();
	baseClass.click(demo1.getFlight());
	baseClass.sendKeys(demo1.getFirstName(),"Mahesh");
	baseClass.sendKeys(demo1.getAddress(),"Adyar");
	baseClass.sendKeys(demo1.getCity(), "Chennai");
	baseClass.sendKeys(demo1.getState(),"Tamil Nadu");
	baseClass.sendKeys(demo1.getZipCode(), "655465");
	baseClass.dropDownText(demo1.getCardType(),"American Express");
	Thread.sleep(2000);
	baseClass.sendKeys(demo1.getCardNumber(),"4584 5454 5456 5666");
	baseClass.sendKeys(demo1.getCardMonth(),"12");
	baseClass.sendKeys(demo1.getCardYear(), "2022");
	baseClass.sendKeys(demo1.getHolderName(), "ragu selvaraj");
	baseClass.click(demo1.getRemember());
	baseClass.click(demo1.getBooking());

	}

	@AfterClass
	private void quit() {

	baseClass.quit();
	}

	}


