Feature: AirBnB Homepage
  Background: Homepage
   Given I am at AirBnB HomePage

#Scenario1:
  Scenario: Test Validate WhereBar
    Given I am Validating WhereBar
  Then Close Browser
#Scenario2:
  Scenario: Test CheckIn Bar
    Given I am Checking CheckInBar
    Then Close Browser
#Scenario3:
  Scenario: Test CheckOut Bar
    Given I am Checking CheckOutBar
    Then Close Browser
#Scenario4:
  Scenario: Test SelectDate CheckInBar
    Given I am Checking SelectDate CheckInBar
    Then Close Browser
#Scenario5:
  Scenario: Test SelectDate CheckOutBar
    Given I am Checking SelectDate CheckOutBar
    Then Close Browser
#Scenario6:
  Scenario: Test Click GuestsBar
    Given I am Clicking GuestsBar
    Then Close Browser
#Scenario7:
  Scenario: Test Select GuestsBar 1 Adults
    Given I am Clicking GuestsBar 1Adults
    Then Close Browser
#Scenario8:
  Scenario: Test Select GuestsBar 1 Children
    Given I am Clicking GuestsBar 1 Children
    Then Close Browser
#Scenario9:
  Scenario: Test Select GuestsBar 1Infants
    Given I am Clicking GuestsBar 1Infants
    Then Close Browser
#Scenario10:
  Scenario: Test Search
    Given I am testing Search
    Then Close Browser