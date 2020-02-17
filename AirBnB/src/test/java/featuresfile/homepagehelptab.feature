Feature: AirBnB Homepage
  Background: Homepage
    Given I am at AirBnB HomePage

#Scenario1:
  Scenario: Test Help Tab
    Given I am Clicking HelpTab
    Then Close Browser
#Scenario2:
  Scenario: Test Help Tab Search Bar
    Given I am Clicking HelpTabSearch
    Then Close Browser
#Scenario3:
  Scenario: Test Help Tab Search SelectLA
    Given I am Selecting LA
    Then Close Browser
#Scenario4:
  Scenario: Test Help Tab Search Click ReadMore
    Given I am Clicking ReadMore
    Then Close Browser
#Scenario5:
  Scenario: Test Reset Pass ReadMore
    Given I am Clicking Password
    Then Close Browser
#Scenario6:
  Scenario: Test Reservation Arrow
    Given I am Clicking ReservationArrow
    Then Close Browser
#Scenario7:
  Scenario: Test Contacting Arrow
    Given I am Clicking ContactingArrow
    Then Close Browser
#Scenario8:
  Scenario: Test Prices Arrow
    Given I am Clicking PricesArrow
    Then Close Browser
#Scenario9:
  Scenario: Test Visit The Help Center Button
    Given I am Clicking VisitTheHelpCenterButton
    Then Close Browser
#Scenario10:
  Scenario: Test Give Feedback
    Given I am Clicking Give Feedback
    Then Close Browser

