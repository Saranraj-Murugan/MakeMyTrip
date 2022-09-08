package com.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Base;
import com.runner.Runner;

import POM.BoardingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Boarding_stepDefinitions extends Base {
	WebDriver driver=Runner.driver;
	
	BoardingPage boardingPage = new BoardingPage(driver);
	
	
	@Given("user clicks on the buses")
	public void user_clicks_on_the_buses() throws InterruptedException {
		boardingPage.getBuses().click();
		Thread.sleep(5000);
		
	}
	
	@When("user selects the boarding point from and to")
	public void user_selects_the_boarding_point_from_and_to() throws InterruptedException {
		boardingPage.getFrom().click();
		Thread.sleep(3000);
		boardingPage.getFrom().sendKeys("Chennai");
		driver.findElement(By.xpath("//li/div/p/span[text()='Chennai, Tamil Nadu']")).click();
//		boardingPage.getTo().click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Bangalore");

//		boardingPage.getTo().sendKeys("Bangalore");
		WebElement element = driver.findElement(By.xpath("//li[@class=\"react-autosuggest__suggestion react-autosuggest__suggestion--first\"]"));
		waitforclickable(element);
		Thread.sleep(2000);
		element.click();
	}
	
	@Then("user selects the travel date")
	public void user_selects_the_travel_date() throws InterruptedException {
//		driver.switchTo().activeElement();
//		driver.findElement(By.xpath("//span[@data-cy=\"travelDate\"]")).click();
		
		String xpath="//div[@aria-label='change']";
		String date = select_Date();
		String actual_Xpath= xpath.replaceAll("change",date);
		System.out.println(actual_Xpath);
		WebElement element2 = driver.findElement(By.xpath(actual_Xpath));
		waitforclickable(element2);
		Thread.sleep(3000);
		element2.click();
	}
	@Then("click search Button")
	public void click_search_button() {
		
		driver.findElement(By.id("search_button")).click();
	}
	
	}

	




