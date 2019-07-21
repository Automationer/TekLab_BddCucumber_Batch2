@SmokeTest
@AboutUs

Feature: About us

  @ilzat
  Scenario: About us link should work properly
    Given User is on home page
    When Clicks on About us
    Then About us page should open on a new tab

  @kitten
  Scenario: All about us left nav tabs should open correct pages
    Given User is on home page
    When Clicks on About us
    Then About us page should open on a new tab
    Then Left side bar about us tabs should display correct pages