package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ManageBooking;
import utils.Wrapper;

public class ManageBookingTest extends Wrapper{
	
	@Test(priority = 7)
	public void validateCheckIn() {

		try {
			
			ManageBooking mvp = PageFactory.initElements(driver, ManageBooking.class);
			mvp.clickManageBooking();
			mvp.enterTicketNumber("S3C7T8");
			mvp.enterLastNmae("Suraj");
			mvp.clickSearch();
			mvp.validateCheckingField("Unable to fetch your booking. Please check the inputs \n"
					+ " you have provided and try again.");
			System.out.println("Manage Bookings Fields Verified successfully");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
