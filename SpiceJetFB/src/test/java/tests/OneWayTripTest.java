package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Booking;
import pages.OneWayTrip;
import pages.PaymentInfoAndPassanger;
import utils.Wrapper;

public class OneWayTripTest extends Wrapper {
	
	@Test(priority = 3)
	public void searchFlightOneway() {

		try {
			
			System.out.println("Title : "+driver.getTitle());
			System.out.println();

			OneWayTrip owp = PageFactory.initElements(driver, OneWayTrip.class);
			owp.typeFrom("Bang");
			Thread.sleep(2000);
			owp.typeTo("Ker");
			owp.clickDate();
			owp.clickSearchFlight();

			Thread.sleep(6000);
			screenShot("OneWayTripSearchFlights");
			System.out.println("One way trip flights has been searched successfully");
			System.out.println();

			Booking b = PageFactory.initElements(driver, Booking.class);
			Thread.sleep(3000);
			b.clickContinueButton();
			System.out.println("Booking page passed successfully in One Way Trip.");
			System.out.println();

			PaymentInfoAndPassanger pip= PageFactory.initElements(driver, PaymentInfoAndPassanger.class);
			pip.enterFirstName("Carlton");
			pip.enterLastName("Suraj");
			pip.enterPhoneNumber("9790642157");
			pip.enterEmail("carltonsuraj962@gmail.com");
			pip.enterCityName("Banglore");
			pip.clickCheckBox();
			pip.enterFirstNameTraveller("Carlton");
			pip.enterLastNameTraveller("Suraj");
			pip.enterPhoneNumberTraveller("9790642157");
			pip.clickContinueButton();
			pip.clickContinueButton2();
			pip.clickSkipSeat();
			pip.enterCardNumber("123464619678");
			pip.enterAccHolderName("Carlton");
			pip.enterExpiryMonth("10");
			pip.enterExpiryYear("26");
			pip.enterExpiryCVV("669");
			pip.framesByDefault();
			pip.clickProceedToPay();
			Thread.sleep(4000);
			screenShot("OneWayTripPaymentInvalid");

			pip.validatePayment("Invalid Card Details");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
