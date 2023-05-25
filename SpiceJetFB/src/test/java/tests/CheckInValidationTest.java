package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.CheckinValidation;
import utils.Wrapper;

public class CheckInValidationTest extends Wrapper {
	
	@Test(priority = 5)
	public void validateCheckIn() {

		try {
			


			CheckinValidation civ = PageFactory.initElements(driver, CheckinValidation.class);
			civ.clickCheckIn();
			civ.enterTicketNumber("CS9P8");
			civ.enterLastNmae("suraj");
			civ.clickSearch();
			civ.validateCheckingField("Unable to fetch your booking. Please check the inputs \n"
					+ " you have provided and try again.");
			System.out.println("ChechIn Fields Verified successfully");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
