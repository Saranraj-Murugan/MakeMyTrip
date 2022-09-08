Feature: Bus booking using MakeMyTrip from Chennai to Bangalore
  
  @Login
  Scenario: Login to the home page
    Given user enters the MakeMyTrip page and clicks login button
    When user provides the email
    And clicks the continue button
    And user enters the password
    Then clicks the login button
    
  @Boarding
  Scenario: User provides the travel details
    Given user clicks on the buses 
    When user selects the boarding point from and to
    Then user selects the travel date
    And click search Button
	
	@Buses
    Scenario: User prioritise the travel
    Given user filter facilities and offers
    And provides the pickup and drop point 
    And get the list of buses
    And select the first bus 
    Then user selects the number of seats
    Then clicks bookseats button
    
    @TravellerDetails
    Scenario: providing user details
    Given User enters the traveller details
    And user applies coupon code if available
    And user select about the travel insurance
    Then clicks continueToBookNow button
    
  #  @Payment
  # Scenario: Payment for the trip
  #  Given: user select the payment option
  #  And user provides the necessary details
  #  And make the payment and confirm the ticket