package com.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	
	
	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MURALI\\eclipse-workspace\\ecom\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		return driver;
	}
	public  static void waitforclickable(WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static WebDriver quitBrowser() {
		driver.quit();
		return driver;
	}

}
