@SmokeTest
@Search

Feature: Search

  @ilzat
  Scenario: User searches for science course
    Given User is on home page
    When Searches for "how to program" course
    Then System should find the searched course