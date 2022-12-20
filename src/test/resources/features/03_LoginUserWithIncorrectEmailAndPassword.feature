@Test03
Feature: Login User with incorrect email and password

  Scenario: Login User with incorrect email and password
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify Login to your account is visible
    And  Enter incorrect email address and password
    Then Click login button
    And  Verify error Your email or password is incorrect! is visible