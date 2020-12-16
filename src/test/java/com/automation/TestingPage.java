package com.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
public class TestingPage {
	
	BaseClass b=new BaseClass();
	@BeforeClass()
	private void browser() {

	b.launchBrowser("Google");
	}

	@BeforeMethod
	private void url() {

	b.launchUrl("http://automationpractice.com/");
	}

	@Parameters({"username","password"})
	@Test(priority=4)
	public void Execution(String username,String password) throws Throwable {

	//First Page
	Test1 auto1=new Test1();
	b.click(auto1.getSignIn());
	b.sendKeys(auto1.getEmail(),username);
	b.sendKeys(auto1.getPassword(),password);
	b.click(auto1.getLogin());
	b.screenShot("Automation 1");


	//Second Page
	   Test2 auto2=new Test2();
	   b.sendKeys(auto2.getSearchbox(),"dresses");
	   b.click(auto2.getButton());
	   b.click(auto2.getAddToCart());
	   Thread.sleep(2000);
	   b.click(auto2.getProceedtocheckout1());
	   
	//Third page
	   Test3 auto3=new Test3();
	   b.action(auto3.getMouseover());
	   b.getText(auto3.getDeliveryDetails());
	   b.click(auto3.getProceedtocheckout3());
	   
	//Fourth Page
	   Test4 auto4=new Test4();
	   b.action(auto4.getMouseover());
	   b.sendKeys(auto4.getMessage(),"Hiiiiiiiii");
	   b.click(auto4.getProceedtocheckout4());
	   
	//Fifth Page
	   Test5 auto5=new Test5();
	   b.action(auto5.getMouseover());
	   b.click(auto5.getTickmark());
	   b.click(auto5.getProceedtocheckout5());
	   
	//Sixth Page
	   Test6 auto6=new Test6();
	   b.action(auto6.getMouseover());
	   b.click(auto6.getBank());
	   b.click(auto6.getiConfirm());
	   
	}

}
