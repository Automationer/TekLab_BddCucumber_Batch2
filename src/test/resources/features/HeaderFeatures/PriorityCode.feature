@SmokeTest
@PriorityCode

Feature: Priority Code pop-up window

  Background:
    Given User is on home page

  Scenario: Priority code window should pop up
    When Clicks on Have a priority code link
    Then Popup window should be displayed

  @badCode
  Scenario: System should throw error for bad priority code
    When Clicks on Have a priority code link
    And Enter bad priority code "jdhsiofkdsjlf"
    Then System should throw error message