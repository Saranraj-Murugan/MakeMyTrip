package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class BoardingPage extends Base {
	WebDriver driver;
	
	@FindBy(className = "menu_Buses")
	private WebElement buses;
	@FindBy(id = "fromCity")
	private WebElement from;
	@FindBy(className = "react-autosuggest__input react-autosuggest__input--open")
	private WebElement to;
	@FindBy(id = "travelDate")
	private WebElement travelDate;
	@FindBy(id = "search_button")
	private WebElement search;
	
	public WebElement getBuses() {
		return buses;
	}
	public WebElement getFrom() {
		return from;
	}
	public WebElement getTo() {
		return to;
	}
	public WebElement getTravelDate() {
		return travelDate;
	}
	public WebElement getSearch() {
		return search;
	}
	
	public BoardingPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
