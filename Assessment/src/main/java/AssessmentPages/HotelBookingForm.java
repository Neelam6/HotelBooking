package AssessmentPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import AssessmentBase.AssessmentTestBase;

public class HotelBookingForm extends AssessmentTestBase {
	@FindBy(xpath="//input[@value='Confirm Booking']")
	WebElement confirmBtn;
	
	@FindBy(xpath="//input[@id='txtFirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='txtLastName']")
	WebElement lastName;
	
	@FindBy(id="txtEmail")
	WebElement email;
	
	
	@FindBy(id="txtPhone")
	WebElement phone;
	
	@FindBy(xpath="//textarea")
	WebElement address;
	
	@FindBy(xpath = "//select[@name='persons']")
	WebElement guestdropdown;
	
	@FindBy(id="rooms")
	WebElement roomsBooked;
	
	@FindBy(xpath = "//select[@name='city']")
	WebElement city;
	
	@FindBy(xpath = "//select[@name='state']")
	WebElement state;
	
	@FindBy(id="txtCardholderName")
	WebElement cardholder;
	
	@FindBy(id="txtDebit")
	WebElement debit;
	
	@FindBy(name="cvv")
	WebElement cvv;
	
	@FindBy(id="txtMonth")
	WebElement month;
	
	@FindBy(id="txtYear")
	WebElement year;
	

	public HotelBookingForm() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String title() {
		String actual_title = driver.getTitle();
		return actual_title;
	}
	
	public String alertfname() {
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	
	public String alertlname() {
		firstName.sendKeys(prop.getProperty("firstname"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	
	public String alertemail() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("incorrectemail"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	
	public String blankalertphone() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public String alertphone() {
		phone.sendKeys(prop.getProperty("incorrectph"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	
	public String roomsBooked() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		Select sel = new Select(guestdropdown);
		sel.selectByValue("5");
		return roomsBooked.getText();
	
	}
	public String cityAlert() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public String stateAlert() {
		Select sel = new Select(city);
		sel.selectByValue("Bangalore");
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public String cardHolderAlert() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		Select selcity = new Select(city);
		selcity.selectByValue("Bangalore");
		Select selstate = new Select(state);
		selstate.selectByValue("Karnataka");
		Select selguest = new Select(guestdropdown);
		selguest.selectByValue("5");
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public String debitCardAlert() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		Select selcity = new Select(city);
		selcity.selectByValue("Bangalore");
		Select selstate = new Select(state);
		selstate.selectByValue("Karnataka");
		Select selguest = new Select(guestdropdown);
		selguest.selectByValue("5");
		cardholder.sendKeys(prop.getProperty("cardholdername"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public String cvvAlert() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		Select selcity = new Select(city);
		selcity.selectByValue("Bangalore");
		Select selstate = new Select(state);
		selstate.selectByValue("Karnataka");
		Select selguest = new Select(guestdropdown);
		selguest.selectByValue("5");
		cardholder.sendKeys(prop.getProperty("cardholdername"));
		debit.sendKeys(prop.getProperty("cardnumber"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public String expirationMonthAlert() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		Select selcity = new Select(city);
		selcity.selectByValue("Bangalore");
		Select selstate = new Select(state);
		selstate.selectByValue("Karnataka");
		Select selguest = new Select(guestdropdown);
		selguest.selectByValue("5");
		cardholder.sendKeys(prop.getProperty("cardholdername"));
		debit.sendKeys(prop.getProperty("cardnumber"));
		cvv.sendKeys(prop.getProperty("cvv"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public String expirationYearAlert() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		Select selcity = new Select(city);
		selcity.selectByValue("Bangalore");
		Select selstate = new Select(state);
		selstate.selectByValue("Karnataka");
		Select selguest = new Select(guestdropdown);
		selguest.selectByValue("5");
		cardholder.sendKeys(prop.getProperty("cardholdername"));
		debit.sendKeys(prop.getProperty("cardnumber"));
		cvv.sendKeys(prop.getProperty("cvv"));
		month.sendKeys(prop.getProperty("month"));
		confirmBtn.click();
		Alert alert= driver.switchTo().alert();
		String alertmsg=alert.getText();
		alert.accept();
		return alertmsg;
	}
	public void confirmation() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		email.sendKeys(prop.getProperty("correctemail"));
		phone.sendKeys(prop.getProperty("correctph"));
		address.sendKeys(prop.getProperty("address"));
		Select selcity = new Select(city);
		selcity.selectByValue("Bangalore");
		Select selstate = new Select(state);
		selstate.selectByValue("Karnataka");
		Select selguest = new Select(guestdropdown);
		selguest.selectByValue("5");
		cardholder.sendKeys(prop.getProperty("cardholdername"));
		debit.sendKeys(prop.getProperty("cardnumber"));
		cvv.sendKeys(prop.getProperty("cvv"));
		month.sendKeys(prop.getProperty("month"));
		year.sendKeys(prop.getProperty("year"));
		confirmBtn.click();		
				
	}

}
