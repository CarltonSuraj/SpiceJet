package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.Wrapper;

public class LoginNegative extends Wrapper {
	
	@Test(priority = 2)
	public void login() {

		try {
			

			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

			lp.clickLogin();
			lp.clickEmailField();
			lp.enterEmail("carltonsuraj962.com");
			lp.enterPassword("9790642157@Gu");
			lp.clickLogin1();
			lp.validateInvalidUsername("Invalid Username/Password");

			System.out.println("Negative Login functionality has been verified successfully");

			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}

}
