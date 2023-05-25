package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Booking;
import pages.PaymentInfoAndPassanger;
import pages.RoundTrip;
import utils.Wrapper;

public class RoundTripTest extends Wrapper {
	
	@Test(priority = 4)
	public void searchFlightRound() {

		try {
			
			System.out.println("Title : "+driver.getTitle());
			System.out.println();

			RoundTrip rtp = PageFactory.initElements(driver, RoundTrip.class);
			rtp.clickRoundTrip();
			rtp.typeFrom("Banglore");
			Thread.sleep(2000);
			rtp.typeTo("Ker");
			rtp.clickDate();
			rtp.clickReturndate();
			rtp.clickSearchFlight();
			Thread.sleep(6000);
			screenShot("RoundTripSearchFlights");
			System.out.println("Round trip flights has been searched successfully.");
			System.out.println();

			Booking bp = PageFactory.initElements(driver, Booking.class);

			Thread.sleep(3000);
			bp.clickContinueButton();
			System.out.println("Booking page passed successfully in Round Trip.");
			System.out.println();

			PaymentInfoAndPassanger ppi = PageFactory.initElements(driver,PaymentInfoAndPassanger.class);
			ppi.enterFirstName("Carlton");
			ppi.enterLastName("Suraj");
			ppi.enterPhoneNumber("9790642157");
			ppi.enterEmail("carltonsuraj962@gmail.com");
			ppi.enterCityName("Banglore");
			ppi.clickCheckBox();
			ppi.enterFirstNameTraveller("Carlton");
			ppi.enterLastNameTraveller("Suraj");
			ppi.enterPhoneNumberTraveller("9790642157");
			ppi.clickContinueButton();
			ppi.clickContinueButton2();
			ppi.clickSkipSeat();
			ppi.enterCardNumber("123412365166678");
			ppi.enterAccHolderName("Carlton");
			ppi.enterExpiryMonth("10");
			ppi.enterExpiryYear("26");
			ppi.enterExpiryCVV("669");
			ppi.framesByDefault();
			ppi.clickProceedToPay();
			Thread.sleep(4000);
			screenShot("RoundTripPaymentInvalid");

			ppi.validatePayment("Invalid Card Details");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
