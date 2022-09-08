package com.stepDefinitions;

import java.awt.Window;
import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Base;
import com.runner.Runner;

import POM.BusesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Buses_stepDefinitions extends Base {
	WebDriver driver=Runner.driver;
	BusesPage busesPage=new BusesPage(driver);
	

	@Given("user filter facilities and offers")
	public void user_filter_facilities_and_offers() {
		goto_activeElement();
//		driver.switchTo().activeElement().click();
		busesPage.getFilter_Sleeper().click();
		busesPage.getFilter_AC().click();
		busesPage.getFilter_PickupAfter6().click();
		
		
	}
	@Given("provides the pickup and drop point")
	public void provides_the_pickup_and_drop_point() {
//		List<WebElement> numof_BoardingPoint = busesPage.getNumof_BoardingPoint();
//		System.out.println(numof_BoardingPoint.size());
//		for (WebElement pickup_Places : numof_BoardingPoint) {
//			String places = pickup_Places.getText();
//			System.out.println(places);
//			busesPage.getFilter_BoardingPoint().click();
			
//		}

	}
	@Given("get the list of buses")
	public void get_the_list_of_buses() {

	}
	@Given("select the first bus")
	public void select_the_first_bus() {
		

	}
	@Then("user selects the number of seats")
	public void user_selects_the_number_of_seats() {
		busesPage.getBus_Book().click();
	}
	@Then("clicks bookseats button")
	public void clicks_bookseats_button() {

	}

	

}
