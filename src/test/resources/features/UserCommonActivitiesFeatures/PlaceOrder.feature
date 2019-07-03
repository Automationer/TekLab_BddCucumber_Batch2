@SmokeTest
@PlaceOrder

Feature: Place an order

  Scenario: User places an order with new billing address
    Given User is on home page
    And Choose a bestseller course
    And Add to the shopping cart
    And Go to Checkout page
    Then Create new billing address
    When Place the order
    Then Order should be successfully placed