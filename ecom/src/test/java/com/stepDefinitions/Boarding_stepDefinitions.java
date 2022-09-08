package com.stepDefinitions;

import org.openqa.selenium.WebDriver;

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
	public void user_clicks_on_the_buses() {
		boardingPage.getBuses().click();
	}
	
	@When("user selects the boarding point from and to")
	public void user_selects_the_boarding_point_from_and_to() {
		boardingPage.getFrom().click();
		boardingPage.getFrom().sendKeys("Chennai");
		waitforclickable(boardingPage.getFrom());
		boardingPage.getTo().click();
		boardingPage.getTo().sendKeys("Bangalore");
	}
	
	@Then("user selects the travel date")
	public void user_selects_the_travel_date() {
	}
	@Then("click search Button")
	public void click_search_button() {
	}
	
	}

	




