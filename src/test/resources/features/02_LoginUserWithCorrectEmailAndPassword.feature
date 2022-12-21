@Test02
Feature: Login User with correct email and password

  Scenario: Login User with correct email and password
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    And Verify Login to your account is visible
    And Enter correct email address and password
    Then Click login button
    Then Verify that Logged in as username is visible
    Then Click Delete Account button
    #And Verify that ACCOUNT DELETED! is visible