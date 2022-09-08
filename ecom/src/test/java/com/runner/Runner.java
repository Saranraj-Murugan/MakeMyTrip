package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "BusBooking.feature",
				glue = "com.stepDefinitions",
				dryRun = false,
				monochrome = true,
				tags="@Boarding"
				)


public class Runner extends Base{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver = browserLaunch();

	}
	
//	@AfterClass
//	public static void exitBrowser() {
//		driver.quit();
//	}
}
