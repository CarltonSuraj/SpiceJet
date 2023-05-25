package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class FlightValidation extends Wrapper {
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement status;

	public void clickFlightStatus() {
		waitForElement(status);
		clickAction(status);
	}

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement DepartDate;

	public void clickDepartureDate() {
		waitForElement(DepartDate);
		clickAction(DepartDate);
	}

	
	@FindBy(xpath="//div[text()='Today']")
	WebElement today;

	public void clickToday() {
		waitForElement(today);
		clickAction(today);
	}

	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement from;

	public void typeFrom(String city) {
		typeText(from, city);
	}

	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement to;

	public void typeTo(String city) {
		typeText(to, city);
	}

	@FindBy(xpath="//div[text()='Search Flights']")
	WebElement search;

	public void clickSearch() {
		waitForElement(search);
		actionClick(search);
	}

}
