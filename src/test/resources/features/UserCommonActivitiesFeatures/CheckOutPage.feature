@SmokeTest
@VerifyCheckOutPage

Feature: Checkout page

  Scenario: User should be able to go to CheckOut page
    Given User goes to the Application
    When User adds an item to the cart
    Then User can go to Checkout page