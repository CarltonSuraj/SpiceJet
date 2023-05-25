package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Signup;
import utils.Wrapper;

public class SignUp extends Wrapper{
	
	@Test(priority = 0)
	public void signUp() {

		try {
			

			brokenLink("https://www.spicejet.com");
			Signup sp = PageFactory.initElements(driver, Signup.class);
			sp.clickSignupButton();
			windowHandling();

			sp.selectOption("Mr");
			sp.setFirstName("Gunasekar");
			sp.setLastName("Aanandhan");
			sp.selectCountry("India");
			sp.clickDOB();
			sp.selectYear("1998");
			sp.selectMonth("June");
			sp.clickDate("3");
			sp.enterPhoneNumber("9585148924");
			sp.enterEmail("gunasekaranandhan24@gmail.com");
			sp.setPassword("9585148924@Gu");
			sp.confirmPassword("9585148924@Gu");
			sp.clickCheckBox();
			Thread.sleep(3000);
			sp.clickSubmitButton();

			System.out.println("Signup functionality has been done successfully");

			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
