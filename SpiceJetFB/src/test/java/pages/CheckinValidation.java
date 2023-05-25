package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class CheckinValidation extends Wrapper {
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;

	public void clickCheckIn() {
		waitForElement(checkin);
		clickAction(checkin);
	}

	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	WebElement ticket;

	public void enterTicketNumber(String num) {
		waitForElement(ticket);
		typeText(ticket, num);
	}

	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	WebElement lname;

	public void enterLastNmae(String name) {
		waitForElement(lname);
		typeText(lname, name);
	}

	@FindBy(xpath="//div[text()='Search Booking']")
	WebElement search;

	public void clickSearch() {
		waitForElement(search);
		actionClick(search);

	}

	@FindBy(xpath="//div[@class='css-76zvg2 css-cens5h r-jwli3a']")
	WebElement unable;

	public void validateCheckingField(String text) {
		waitForElement(unable);
		System.out.println(unable.getText());
		validateText(unable, text);
	}

}
