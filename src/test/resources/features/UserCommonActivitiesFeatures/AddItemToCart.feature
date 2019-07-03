@SmokeTest
@ItemInCartVerification

Feature: Add item to cart

  Scenario: User adds a science course to the cart
    Given User goes to the Application
    When User adds an item to the cart
    Then Item should be successfully added to the cart