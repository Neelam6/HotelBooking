package stepdefs;

import org.testng.Assert;

import AssessmentBase.AssessmentTestBase;
import AssessmentPages.HotelBookingConfirmationPage;
import AssessmentPages.HotelBookingForm;
import AssessmentPages.HotelBookingLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import freemarker.cache.FirstMatchTemplateConfigurationFactory;

public class HotelBookingStepDefs extends AssessmentTestBase {
	HotelBookingLoginPage loginPage;
	HotelBookingForm bookingForm;
	HotelBookingConfirmationPage confirmationPage;

	String error_password;
	String error_username;
	String heading;
	String firstNameAlert;
	String lastNameAlert;
	String emailalertmsg;
	String blankphalert;
	String invalidphalert;
	String bookedRooms;
	String cityalertmsg;
	String statealertmsg;
	String cardAlert;
	String debitAlert;
	String cvvAlertmsg;
	String monthAlertmsg;
	String yearAlertmsg;
	String success_msg;

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		AssessmentTestBase.initialize();

	}

	@Given("^Heading of the login page is Hotel Booking Application$")
	public void heading_of_the_login_page_is_Hotel_Booking_Application() throws Throwable {
		loginPage = new HotelBookingLoginPage();
		heading = loginPage.getHeading();
		Assert.assertEquals(loginPage.expectedHeading(), heading);

	}

	@Then("^Print the heading$")
	public void print_the_heading() throws Throwable {
		loginPage = new HotelBookingLoginPage();
		System.out.println("Heading:" + heading);
		loginPage.closeBrowser();

	}

	@Given("^User clicks on login without entering username$")
	public void user_clicks_on_login_without_entering_username() throws Throwable {
		loginPage = new HotelBookingLoginPage();
		error_username = loginPage.usernamelogin();
		Assert.assertEquals(loginPage.expectedUsernameErr(), error_username);
	}

	@Given("^User clicks on login without entering password$")
	public void user_clicks_on_login_without_entering_password() throws Throwable {
		loginPage = new HotelBookingLoginPage();
		error_password = loginPage.passwordlogin();
		Assert.assertEquals(loginPage.expectedPwdErr(), error_password);

	}

	@Then("^Return error messages$")
	public void return_error_messages() throws Throwable {
		loginPage = new HotelBookingLoginPage();
		System.out.println("Error message without username:" + error_username);
		System.out.println("Error message without password:" + error_password);
		loginPage.closeBrowser();

	}

	@Given("^User enters the login credentials$")
	public void user_enters_the_login_credentials() throws Throwable {
		loginPage = new HotelBookingLoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^User is redirected to Hotel Booking Form$")
	public void user_is_redirected_to_Hotel_Booking_Form() throws Throwable {
		loginPage = new HotelBookingLoginPage();
		bookingForm = new HotelBookingForm();
		Assert.assertEquals(bookingForm.title(), "Hotel Booking");
		System.out.println("Title of the page:" + bookingForm.title());
		loginPage.closeBrowser();

	}

	@Given("^User is on Hotel Booking Form$")
	public void user_is_on_Hotel_Booking_Form() throws Throwable {
		AssessmentTestBase.initialize();
		loginPage = new HotelBookingLoginPage();
		bookingForm = new HotelBookingForm();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(bookingForm.title(), "Hotel Booking");

	}

	@Given("^User clicks on confirm booking without entering first name$")
	public void user_clicks_on_confirm_booking_without_entering_first_name() throws Throwable {
		bookingForm = new HotelBookingForm();
		firstNameAlert = bookingForm.alertfname();
		Assert.assertEquals(firstNameAlert, "Please fill the First Name");

	}

	@Given("^User clicks on confirm booking without entering last name$")
	public void user_clicks_on_confirm_booking_without_entering_last_name() throws Throwable {
		bookingForm = new HotelBookingForm();
		lastNameAlert = bookingForm.alertlname();
		Assert.assertEquals(lastNameAlert, "Please fill the Last Name");

	}

	@Then("^Throw an error$")
	public void throw_an_error() throws Throwable {
		System.out.println("First Name Alert:" + firstNameAlert);
		System.out.println("Last Name Alert:" + lastNameAlert);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();

	}

	@Given("^User enters incorrect email id$")
	public void user_enters_incorrect_email_id() throws Throwable {

		bookingForm = new HotelBookingForm();
		emailalertmsg = bookingForm.alertemail();
		Assert.assertEquals(emailalertmsg, "Please enter valid Email Id.");

	}

	@Then("^Return alert message$")
	public void return_alert_message() throws Throwable {
		System.out.println("Email Alert:" + emailalertmsg);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();

	}

	@Given("^User clicks on confirm booking without entering phone number$")
	public void user_clicks_on_confirm_booking_without_entering_phone_number() throws Throwable {

		bookingForm = new HotelBookingForm();
		blankphalert = bookingForm.blankalertphone();
		Assert.assertEquals(blankphalert, "Please fill the Mobile No.");

	}

	@Given("^User clicks on confirm booking by entering invalid phone number$")
	public void user_clicks_on_confirm_booking_by_entering_invalid_phone_number() throws Throwable {

		bookingForm = new HotelBookingForm();
		invalidphalert = bookingForm.alertphone();
		Assert.assertEquals(invalidphalert, "Please enter valid Contact no.");

	}

	@Then("^Return phone alert message$")
	public void return_phone_alert_message() throws Throwable {
		System.out.println("Blank Ph Alert:" + blankphalert);
		System.out.println("Invalid Ph Alert:" + invalidphalert);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();

	}

	@Given("^User enters the address and selects the number of guests$")
	public void user_enters_the_address_and_selects_the_number_of_guests() throws Throwable {

		bookingForm = new HotelBookingForm();
		bookedRooms = bookingForm.roomsBooked();

	}

	@Then("^Print the number of rooms booked$")
	public void print_the_number_of_rooms_booked() throws Throwable {
		System.out.println("No.of rooms booked:" + bookedRooms);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();

	}

	@Given("^User clicks on confirm booking without selecting city$")
	public void user_clicks_on_confirm_booking_without_selecting_city() throws Throwable {
		bookingForm = new HotelBookingForm();
		cityalertmsg = bookingForm.cityAlert();
		Assert.assertEquals(cityalertmsg, "Please select city");

	}

	@Given("^User clicks on confirm booking with selecting state$")
	public void user_clicks_on_confirm_booking_with_selecting_state() throws Throwable {
		bookingForm = new HotelBookingForm();
		statealertmsg = bookingForm.stateAlert();
		Assert.assertEquals(statealertmsg, "Please select state");

	}

	@Then("^Print the alert error for city and state$")
	public void print_the_alert_error_for_city_and_state() throws Throwable {
		System.out.println("City Alert:" + cityalertmsg);
		System.out.println("State Alert:" + statealertmsg);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();

	}

	@Given("^User clicks on confirm booking without entering card holder name$")
	public void user_clicks_on_confirm_booking_without_entering_card_holder_name() throws Throwable {
		bookingForm = new HotelBookingForm();
		cardAlert = bookingForm.cardHolderAlert();
		Assert.assertEquals(cardAlert, "Please fill the Card holder name");
	}

	@Then("^Return card holder name alert message$")
	public void return_card_holder_name_alert_message() throws Throwable {
		System.out.println("Card Holder Name Alert:" + cardAlert);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();

	}

	@Given("^User clicks in confirm booking without entering debit card number$")
	public void user_clicks_in_confirm_booking_without_entering_debit_card_number() throws Throwable {
		bookingForm = new HotelBookingForm();
		debitAlert = bookingForm.debitCardAlert();
		Assert.assertEquals(debitAlert, "Please fill the Debit card Number");
	}
		
	

	@Then("^Return debit card number alert message$")
	public void return_debit_card_number_alert_message() throws Throwable {
		System.out.println("Debit Card Alert:" + debitAlert);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();
	}
	@Given("^User clicks on confirm booking booking without entering cvv$")
	public void user_clicks_on_confirm_booking_booking_without_entering_cvv() throws Throwable {
		bookingForm = new HotelBookingForm();
		cvvAlertmsg = bookingForm.cvvAlert();
		Assert.assertEquals(cvvAlertmsg, "Please fill the CVV");
	   
	}

	@Then("^Return cvv alert message$")
	public void return_cvv_alert_message() throws Throwable {
		System.out.println("CVV Alert:" + cvvAlertmsg);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();
	  
	}
	@Given("^User clicks on confirm booking without entering expiration month$")
	public void user_clicks_on_confirm_booking_without_entering_expiration_month() throws Throwable {
		bookingForm = new HotelBookingForm();
		monthAlertmsg = bookingForm.expirationMonthAlert();
		Assert.assertEquals(monthAlertmsg, "Please fill expiration month");
	   
	}

	@Then("^Return expiration month alert message$")
	public void return_expiration_month_alert_message() throws Throwable {
		System.out.println("Expiration Month Alert:" + monthAlertmsg);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();
	  
	   
	}
	@Given("^User clicks on confirm booking without entering expiration year$")
	public void user_clicks_on_confirm_booking_without_entering_expiration_year() throws Throwable {
		bookingForm = new HotelBookingForm();
		yearAlertmsg = bookingForm.expirationYearAlert();
		Assert.assertEquals(yearAlertmsg, "Please fill the expiration year");
	 
	}

	@Then("^Return expiration year alert message$")
	public void return_expiration_year_alert_message() throws Throwable {
		System.out.println("Expiration Year Alert:" + yearAlertmsg);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();
	   
	}

	@Given("^User fills the booking form$")
	public void user_fills_the_booking_form() throws Throwable {
		bookingForm = new HotelBookingForm();
		bookingForm.confirmation();
		  
	}

	@Then("^Confirms the booking$")
	public void confirms_the_booking() throws Throwable {
		confirmationPage = new HotelBookingConfirmationPage();
		success_msg = confirmationPage.bookingConfirmation();
		Assert.assertEquals(success_msg, "Booking Completed!");
		System.out.println("Success message:" +success_msg);
		loginPage = new HotelBookingLoginPage();
		loginPage.closeBrowser();
	}

}
