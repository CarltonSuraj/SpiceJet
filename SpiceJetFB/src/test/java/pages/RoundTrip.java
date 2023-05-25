package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class RoundTrip extends Wrapper {
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement round;

	public void clickRoundTrip() {
		clickAction(round);
	}

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement from;

	public void typeFrom(String text) {
		typeText(from, text);
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement to;

	public void typeTo(String text) {
		typeText(to, text);
	}

	@FindBy(xpath="(//div[text()='15'])[4]")
	WebElement day;

	public void clickDate() {
		waitForElement(day);
		clickAction(day);
	}

	@FindBy(xpath="(//div[text()='20'])[4]")
	WebElement returnDate;

	public void clickReturndate() {
		waitForElement(returnDate);
		clickAction(returnDate);
	}

	@FindBy(xpath="//div[text()='Search Flight']")
	WebElement search;

	public void clickSearchFlight() {
		waitForElement(search);
		//clickAction(search);
	//	jsClick(search);
		actionClick(search);
	}

}
