@SmokeTest
@DigitalLibrary

Feature: Digital library page

  Background:
    Given Enter valid username and password

  @digitalPage
  Scenario: display digital library page
    Then Should be able to sign in
    And Go to My Digital Library
    Then My Digital Library should open

  @leftNavTabsVerification-mydigital
  Scenario: All digital library left nav tabs should open correct pages
    Then Should be able to sign in
    And Go to My Digital Library
    Then Left side bar tabs should display correct pages