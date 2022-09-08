package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusesPage {
	WebDriver driver;
	public BusesPage(WebDriver driver3) {
		this.driver=driver3;
PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='myDeals upto 6% off']")
	private WebElement filter_MyDeals;
	
	@FindBy(xpath = "//span[text()='Sleeper']")
	private WebElement filter_Sleeper;
	
	@FindBy(xpath = "//span[text()='AC']")
	private WebElement filter_AC;
	
	@FindBy(xpath = "//span[text()='Primo']")
	private WebElement filter_Primo;
	
	@FindBy(xpath = "//span[text()='Pickup after 6PM']")
	private WebElement filter_PickupAfter6;
	
	@FindBy(id = "Boarding Points")
	private WebElement filter_BoardingPoint;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFilter_MyDeals() {
		return filter_MyDeals;
	}

	public WebElement getFilter_Sleeper() {
		return filter_Sleeper;
	}

	public WebElement getFilter_AC() {
		return filter_AC;
	}

	public WebElement getFilter_Primo() {
		return filter_Primo;
	}

	public WebElement getFilter_PickupAfter6() {
		return filter_PickupAfter6;
	}

	public WebElement getFilter_BoardingPoint() {
		return filter_BoardingPoint;
	}

	public List<WebElement> getNumof_BoardingPoint() {
		return numof_BoardingPoint;
	}

	public WebElement getFilter_DropPoint() {
		return filter_DropPoint;
	}

	public List<WebElement> getListof_DropPoint() {
		return listof_DropPoint;
	}

	public WebElement getFilter_TravelOperators() {
		return filter_TravelOperators;
	}

	public WebElement getFilter_BusTypes() {
		return filter_BusTypes;
	}

//	@FindBy(xpath = "//input[@id='Boarding Points']//following::li/div/div/span")
	@FindBy(xpath = "//span[text()='Koyambedu']")
	private  List<WebElement> numof_BoardingPoint;
	
	@FindBy(id = "Drop Points")
	private WebElement filter_DropPoint;
	
	@FindBy(xpath = "//input[@id='Drop Points']//following::li/div/div/span")
	private  List<WebElement> listof_DropPoint;
	
	@FindBy(id = "Travel Operators")
//	@FindBy(xpath = "//input[@id="Travel Operators"]//following::li/div/div/span")
	private WebElement filter_TravelOperators;
	
	@FindBy(xpath = "//span[text()='AC Sleeper']")
	private WebElement filter_BusTypes;
	
@FindBy(xpath = "//div[@id='bus_39_MMTCC1159_MMTCC1092_03-09-2022_1000005542632679698']//child::a[@data-test-id='select-seats']")
private WebElement bus_Book;

//public WebElement getBus_Book() {
//	return bus_Book;
//}

public  WebElement getBus_Book() {
	return null;
}
}
