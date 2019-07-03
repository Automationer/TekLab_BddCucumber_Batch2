@SmokeTest
@SignIn_Feature

Feature: Sign in

  Scenario: User should be able to sign in with valid credentials
    When Enter valid username and password
    Then Should be able to sign in