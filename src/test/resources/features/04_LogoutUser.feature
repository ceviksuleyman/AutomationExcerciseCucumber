@Test04
Feature:Logout User

  Scenario:Logout User
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    When Verify Login to your account is visible
    Then Enter correct email address and password
    When Click login button
    Then Verify that Logged in as username is visible
    Then Click Logout button
    And Verify that user is navigated to login page