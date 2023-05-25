package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class Signup extends Wrapper {
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup;

	public void clickSignupButton() {
		waitForElement(signup);
		clickAction(signup);
	}

	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement option;

	public void selectOption(String user) {
		waitForElement(option);
		selectDDByVisibleText(option, user);
	}

	@FindBy(id="first_name")
	WebElement fname;

	public void setFirstName(String user) {
		waitForElement(fname);
		typeText(fname, user);
	}

	@FindBy(id="last_name")
	WebElement lname;

	public void setLastName(String user) {
		waitForElement(lname);
		typeText(lname, user);
	}

	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;

	public void selectCountry(String user) {
		waitForElement(country);
		selectDDByVisibleText(country, user);
	}

	@FindBy(id="dobDate")
	WebElement dob;

	public void clickDOB() {
		waitForElement(dob);
		clickAction(dob);
	}

	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement sYear;

	public void selectYear(String user) {
		waitForElement(sYear);
		selectDDByVisibleText(sYear, user);
	}

	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement sMonth;

	public void selectMonth(String user) {
		waitForElement(sMonth);
		selectDDByVisibleText(sMonth, user);
	}

	public void clickDate(String day) {
		//String day = "3";
		WebElement sDate = driver.findElement(By.xpath("//div[text()="+day+"]"));
		waitForElement(sDate);
		clickAction(sDate);
	}

	@FindBy(xpath="//input[@class=' form-control']")
	WebElement phone;

	public void enterPhoneNumber(String number) {
		waitForElement(phone);
		typeText(phone, number);
	}

	//@FindBy(id="email_id")
	//@FindBy(xpath="(//input[@class='form-control '])[3]")
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;

	public void enterEmail(String text) {
		waitForElement(email);
		typeText(email, text);
	}

	@FindBy(id="new-password")
	WebElement setPass;

	public void setPassword(String pass) {
		waitForElement(setPass);
		jsScrollUpToElement(setPass);
		typeText(setPass, pass);
	}

	@FindBy(id="c-password")
	WebElement cPass;

	public void confirmPassword(String pass) {
		waitForElement(cPass);
		typeText(cPass, pass);
	}

//	@FindBy(id="defaultCheck1")
//	@FindBy(xpath="//input[@class='form-check-input mt-02']")
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement check;

	public void clickCheckBox() {
		waitForElement(check);
		//clickAction(check);
		jsScrollUpToElement(check);
		jsClick(check);
	}

	//@FindBy(linkText = "Submit")
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;

	public void clickSubmitButton() {
		waitForElement(submit);
		//clickAction(submit);
		//jsClick(submit);
		//doubleclick(submit);
		actionClick(submit);
	}

}
