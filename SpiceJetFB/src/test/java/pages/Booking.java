package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class Booking extends Wrapper {
	
	@FindBy(xpath = "(//div[text()='Continue'])[1]")
	WebElement continue1;

	public void clickContinueButton() {
		waitForElement(continue1);
		// clickAction(continue1);
		// jsClick(continue1);
		actionClick(continue1);
	}

}
