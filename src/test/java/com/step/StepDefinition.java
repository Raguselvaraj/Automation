package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public WebDriver driver;
	
	@Given("user is on Adactin page")
	public void user_is_on_Adactin_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-12\\eclipse-workspace\\ragu\\Automation\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://adactinhotelapp.com/");
	  driver.manage().window().maximize();
	}

	@When("user enter the valid username & password")
	public void user_enter_the_valid_username_password() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ragu");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345");
		
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
	   WebElement click = driver.findElement(By.id("login"));
	   click.click();	
		
	}
	
	


	

}
