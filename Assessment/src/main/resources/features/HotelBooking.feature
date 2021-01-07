Feature: Verify the Hotel Booking website

Scenario: Verify login page heading
	Given User is on login page
	And Heading of the login page is Hotel Booking Application
	Then Print the heading

Scenario: Verify error messages for username and password
	Given User is on login page
	And User clicks on login without entering username
	And User clicks on login without entering password
	Then Return error messages
	
Scenario: Verify the Title of Hotel Booking Form
	Given User is on login page
	And User enters the login credentials
	Then User is redirected to Hotel Booking Form
	
Scenario: Verify the alert messages
	Given User is on Hotel Booking Form
	And User clicks on confirm booking without entering first name
	And User clicks on confirm booking without entering last name
	Then Throw an error
	
Scenario: Verify the email format
	Given User is on Hotel Booking Form
	And User enters incorrect email id
	Then Return alert message

Scenario: Verify the phone number
	Given User is on Hotel Booking Form
	And User clicks on confirm booking without entering phone number
	And User clicks on confirm booking by entering invalid phone number
	Then Return phone alert message
	
Scenario: Enter the address and select the number of people
	Given User is on Hotel Booking Form
	And User enters the address and selects the number of guests
	Then Print the number of rooms booked
	
Scenario: Verify alert messages for city and state
	Given User is on Hotel Booking Form
	And User clicks on confirm booking without selecting city
	And User clicks on confirm booking with selecting state
	Then Print the alert error for city and state
	
Scenario: Verify alert message for card holder name
	Given User is on Hotel Booking Form
	And User clicks on confirm booking without entering card holder name
	Then Return card holder name alert message 
	
Scenario: Verify alert message for debit card number
 	Given User is on Hotel Booking Form
	And User clicks in confirm booking without entering debit card number
	Then Return debit card number alert message
	
Scenario: Verify alert message for CVV
	Given User is on Hotel Booking Form
	And User clicks on confirm booking booking without entering cvv
	Then Return cvv alert message
	
	
Scenario: Verify alert message for expiration month
	Given User is on Hotel Booking Form
	And User clicks on confirm booking without entering expiration month
	Then Return expiration month alert message
	
Scenario: Verify alert message for expiration year
	Given User is on Hotel Booking Form
	And User clicks on confirm booking without entering expiration year
	Then Return expiration year alert message
	
Scenario: Verify successful completion of hotel booking
	Given User is on Hotel Booking Form
	And User fills the booking form
	Then Confirms the booking
	
	
	
	