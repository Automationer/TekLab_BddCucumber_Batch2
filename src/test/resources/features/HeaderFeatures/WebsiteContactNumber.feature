@SmokeTest
@verifyContactNumber

Feature: Verify the contact number

  Scenario: Website needs to have a correct contact number
    Given User is on home page
    Then Correct phone number should be displayed