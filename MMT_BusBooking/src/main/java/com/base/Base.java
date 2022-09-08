package com.base;


import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;


	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MURALI\\eclipse-workspace\\ecom\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	
		return driver;
	}
	public  static void waitforclickable(WebElement element) {

		wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

	public static void elementToBeVisible(WebElement element) {
		wait=new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public static void screenShot(String name) throws Throwable  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\MURALI\\eclipse-workspace\\MMT_BusBooking\\target\\"+name+".png");
		FileUtils.copyFile(source, dest);		
	}
	public static String  select_Date() {

		Calendar calendar = Calendar.getInstance();
		int date = calendar.DATE;
		calendar.add(date, 2);
		Date time = calendar.getTime();
		String[] split = time.toString().split(" ");
		String requiredFormat=split[0]+" "+split[1]+" "+split[2]+" "+split[5];
		return requiredFormat;
	}
	
	public static void goto_activeElement() {
		driver.switchTo().activeElement().click();
	}
	
	
	public static WebDriver quitBrowser() {
		driver.quit();
		return driver;
	}

}
