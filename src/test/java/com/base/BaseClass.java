package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	//BROWSER LAUNCH
	public WebDriver launchBrowser(String browser) {

	if (browser.equalsIgnoreCase("google")) {

	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Greens-12\\eclipse-workspace\\hari\\Greens\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	} else if(browser.equalsIgnoreCase("Firefox")) {
	System.setProperty("webdriver.gecko.driver",
	"C:\\Users\\Greens-12\\eclipse-workspace\\hari\\Greens\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	}else if (browser.equalsIgnoreCase("IE")) {
	System.setProperty("webdriver.internetexplorer.driver",
	"C:\\Users\\Greens-12\\eclipse-workspace\\hari\\Greens\\Drivers\\geckodriver.exe");
	driver=new InternetExplorerDriver();
	}


	   return driver;
	}
	//URL
	   public void launchUrl(String url) {

	driver.get(url);
	        }
	//SEND KEYS
	public void sendKeys(WebElement element,String text) {
	       
	      element.sendKeys(text);
	}

	//FORWARD
	public void forward() {
	       
	driver.navigate().forward();
	}
	//BACK
	        public void backward() {
	       
	driver.navigate().back();
	}
	//REFRESH
	        public void refresh() {
	       
	driver.navigate().refresh();
	}
	 //DROP DOWN(TEXT)
	        public void dropDownText(WebElement element,String text) {
	       
	Select s=new Select(element);
	s.selectByVisibleText(text);
	}
	//CLICK
	        public void click(WebElement element) {
	       
	element.click();
	}
	 //QUIT
	        public void quit() {
	       
	driver.quit();

	}
	 //Action
	        public void action(WebElement target) {

	        Actions a=new Actions(driver);
	        a.moveToElement(target);
	}
	//GET TEXT
	        public void getText(WebElement element) {

	            String text2 = element.getText();
	            System.out.println(text2);
	           
	}
	//GET ATTRIBUTE
	        public void getAttribute(WebElement element) {

	        String attribute = element.getAttribute("value");
	        System.out.println(attribute);
	       
	}
	//SCREEN SHOT
	        public void screenShot(String name) throws Throwable {

	        TakesScreenshot screenshot=(TakesScreenshot)driver;
	        File source = screenshot.getScreenshotAs(OutputType.FILE);
	        File dest=new File("C:\\Users\\Greens-12\\eclipse-workspace\\hari\\Greens\\Screenshot\\"+name+".png");
	   FileUtils.copyFile(source, dest);
	        }
	       
	       
	}

