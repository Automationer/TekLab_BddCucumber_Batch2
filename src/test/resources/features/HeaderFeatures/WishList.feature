@SmokeTest
@WishList

Feature: Wish list page

  Scenario: display wish list page
    Given Enter valid username and password
    Then Should be able to sign in
    And Go to Wish List
    Then Wish list should open

  @leftNavTabsVerification-wishlist
  Scenario: All wish list left nav tabs should open correct pages
    Given Enter valid username and password
    Then Should be able to sign in
    And Go to Wish List
    Then Left navigation wish list tabs should display correct pages