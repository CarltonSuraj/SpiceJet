package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wrapper;

public class PaymentInfoAndPassanger extends Wrapper{
	
	 @FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
     WebElement fname;

     public void enterFirstName(String name) {
    	 waitForElement(fname);
    	 typeText(fname, name);
     }

     @FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
     WebElement lname;

     public void enterLastName(String name1) {
    	 waitForElement(lname);
    	 typeText(lname, name1);
     }

     @FindBy(xpath="//input[@data-testid='contact-number-input-box']")
     WebElement phone;

     public void enterPhoneNumber(String num) {
    	 waitForElement(phone);
    	 typeText(phone, num);
     }

     @FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
     WebElement email;

     public void enterEmail(String mail) {
    	 waitForElement(email);
    	 typeText(email, mail);
     }

     @FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
     WebElement city;

     public void enterCityName(String name) {
    	 waitForElement(city);
    	 typeText(city, name);
     }

     @FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[5]")
     WebElement checkbox;

     public void clickCheckBox() {
    	 waitForElement(checkbox);
    	 jsClick(checkbox);
     }

     @FindBy(xpath="//input[@data-testid='traveller-0-first-traveller-info-input-box']")
     WebElement fname1;

     public void enterFirstNameTraveller(String name) {
    	 waitForElement(fname1);
    	 typeText(fname1, name);
     }

     @FindBy(xpath="//input[@data-testid='traveller-0-last-traveller-info-input-box']")
     WebElement lname1;

     public void enterLastNameTraveller(String name) {
    	 waitForElement(lname1);
    	 typeText(lname1, name);
     }

     @FindBy(xpath="//input[@data-testid='sc-member-mobile-number-input-box']")
     WebElement phone1;

     public void enterPhoneNumberTraveller(String num) {
    	waitForElement(phone1);
    	typeText(phone1, num);
     }

     @FindBy(xpath="//div[text()='Continue']")
     WebElement continue1;

     public void clickContinueButton() {
    	 waitForElement(continue1);
    	// clickAction(continue1);
    	// jsClick(continue1);
    	 moveTo(continue1);
    	 actionClick(continue1);
     }

     @FindBy(xpath="(//div[text()='Add'])[1]")
     WebElement spiceAdd;

     public void clickAdd1SpiceMax() {
    	 waitForElement(spiceAdd);
    	 clickAction(spiceAdd);
     }

     @FindBy(xpath="(//div[text()='1A'])[1]")
     WebElement seat1;

     public void clickFirstSeat() {
    	 waitForElement(seat1);
    	 clickAction(seat1);
     }

     @FindBy(xpath="(//div[@class='css-1dbjc4n r-1p0dtai r-zso239 r-ipm5af'])[1]")
     WebElement privateRow;

     public void clickPrivateRow() {
    	 waitForElement(privateRow);
    	 clickAction(privateRow);
     }

 /*    @FindBy(xpath="(//div[@class='css-1dbjc4n'])[315]")
     WebElement terms;
     
     public void clickTermsCondition() {
    	 waitForElement(terms);
    	// clickAction(terms);
    	 jsClick(terms);
     }
*/    

     @FindBy(xpath="//div[text()='Skip']")
     WebElement skip;

     public void clickSkip() {
    	 waitForElement(skip);
    	 clickAction(skip);
     }

     @FindBy(xpath="(//div[text()='Continue'])[4]")
     WebElement continue2;

     public void clickContinueButton1() {
    	 waitForElement(continue2);
    	 clickAction(continue2);
     }

     @FindBy(xpath="//div[text()='Select Meals']")
     WebElement selectMeal;

     public void selectMeals() {
    	 waitForElement(selectMeal);
    	// clickAction(selectMeal);
    	 jsClick(selectMeal);
     }

     @FindBy(xpath="//div[text()='Paneer masala in multigrain bread']")
     WebElement sandwich;

     public void paneerSandwich() {
    	 waitForElement(sandwich);
    	 clickAction(sandwich);
     }

     @FindBy(xpath="//div[text()='Done']")
     WebElement done;

     public void clickDoneButton() {
    	 waitForElement(done);
    	 clickAction(done);
     }

     @FindBy(id="at_addon_close_icon")
     WebElement cancel;

     public void clickCancel() {
    	 waitForElement(cancel);
    	 clickAction(cancel);
     }

     @FindBy(xpath="(//span[text()='Skip this to skip comfort.'])[1]")
     WebElement skipSeat;

     public void clickSkipSeat() {
    	 waitForElement(skipSeat);
    	 clickAction(skipSeat);
     }

     @FindBy(xpath="(//div[text()='Continue'])[3]")
     WebElement continue3;

    @FindBy(xpath="//div[text()='Excess Baggage']")
    WebElement bagg;

     public void clickContinueButton2() {
    	 waitForElement(continue3);
    	 jsScrollUpToElement(bagg);
    	// actionClick(continue3);
    	 jsClick(continue3);
    	// clickAction(continue3);
     }

     @FindBy(xpath="//iframe[@class='card_number_iframe']")
     WebElement frame1;

     @FindBy(id="card_number")
     WebElement cardNum;

     public void enterCardNumber(String num) {
    	 waitForElement(frame1);
    	 framesByWebElement(frame1);
    	 waitForElement(cardNum);
    	 typeText(cardNum, num);
     }

     @FindBy(xpath="//iframe[@class='name_on_card_iframe']")
     WebElement frame2;

     @FindBy(id="name_on_card")
     WebElement accHolder;

     public void enterAccHolderName(String name) {
    	 framesByDefault();
    	 waitForElement(frame2);
    	 framesByWebElement(frame2);
    	 waitForElement(accHolder);
    	 typeText(accHolder, name);
     }

     @FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
     WebElement frame3;

     @FindBy(id="card_exp_month")
     WebElement month;

     public void enterExpiryMonth(String num) {
    	 framesByDefault();
    	 waitForElement(frame3);
    	 framesByWebElement(frame3);
    	 waitForElement(month);
    	 typeText(month, num);
     }

     @FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
     WebElement frame4;

     @FindBy(id="card_exp_year")
     WebElement year;

     public void enterExpiryYear(String num) {
    	 framesByDefault();
    	 waitForElement(frame4);
    	 framesByWebElement(frame4);
    	 waitForElement(year);
    	 typeText(year, num);
     }

     @FindBy(xpath="//iframe[@class='security_code_iframe']")
     WebElement frame5;

     @FindBy(id="security_code")
     WebElement cvv;

     public void enterExpiryCVV(String num) {
    	 framesByDefault();
    	 waitForElement(frame5);
    	 framesByWebElement(frame5);
    	 waitForElement(cvv);
    	 typeText(cvv, num);
     }

     @FindBy(xpath="//div[text()='Proceed to pay']")
     WebElement pay;

     public void clickProceedToPay() {
    	 framesByDefault();
    	 waitForElement(pay);
    	 jsScrollUpToElement(pay);
   		// clickAction(pay);
    	// jsClick(pay);
    	 actionClick(pay);
     }

     @FindBy(xpath="//div[text()='Invalid Card Details']")
 	WebElement invalid;

 	public void validatePayment(String text) {
 		waitForElement(invalid);
 		validateText(invalid, text);
 	//	String text = "Invalid Card Details";
 		if(invalid.getText().contains(text)) {
 			System.out.println("Verification of Flight Booking : Due to invalid card details, The web page doesn't gives the proper booking confirmation message.");
 		}
 		else
 			System.out.println("Verification Failed.");
 	}

}
