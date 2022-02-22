Feature: Select destination of flight


Scenario: validate destination can be set
    Given user is on spicejet homepage
    When user selects from and to cities
    And user selects departure date and return date
    And user clicks on search flight
    Then user is navigated to the flights.
 
   
Scenario: flight can be choosen
    Given user is on flight page
    When user select any flight
    And user fetches flightno and price
    Then user clicks on continue

 
Scenario: validate passenger details
    Given user is on passenger page
    When user enter contact details
    And enters passenger information details
    Then user clicks on continue button
    
Scenario: seats can be choosen
    Given user is on Add-on
    When user clicks on choose seats
    And user clicks on add seat
    Then user clicks continue