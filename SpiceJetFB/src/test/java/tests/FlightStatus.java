package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.FlightValidation;
import utils.Wrapper;

public class FlightStatus extends Wrapper {
	
	@Test(priority = 6)
	public void validateFlightStatus() {

		try {
			
	

			FlightValidation fv = PageFactory.initElements(driver, FlightValidation.class);
			fv.clickFlightStatus();
			fv.clickDepartureDate();
			fv.clickToday();
			fv.typeFrom("Bang");
			fv.typeTo("Ker");
			fv.clickSearch();
			validateTitle("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
			System.out.println("Flight status Fields Verified successfully");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
