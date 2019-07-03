@SmokeTest

Feature: Item image

  Scenario: Cart item needs to have image
    Given User goes to the Application
    When User adds an item to the cart
    Then Added item needs to have an image