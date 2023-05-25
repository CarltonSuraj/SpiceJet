package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.Wrapper;

public class LoginPositive extends Wrapper {
	
	@Test(priority = 1)
	public void login() {

		try {
		

			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

			lp.clickLogin();
			lp.clickEmailField();
			lp.enterEmail("carltonsuraj962@gmail.com");
			lp.enterPassword("9790642157@Gu");
			lp.clickLogin1();
			validateTitle("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
			System.out.println("Positive Login functionality has been verified successfully");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
