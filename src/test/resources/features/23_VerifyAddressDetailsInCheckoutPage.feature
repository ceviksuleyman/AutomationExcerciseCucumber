@all
Feature: Verify address details in checkout page

  @Test23
  Scenario: Verify address details in checkout page
    Given Navigate to url "autoUrl"
    When Verify that home page is visible successfully
    When Click on Signup Login button
    Then Fill all details in Signup and create account
    And  Verify ACCOUNT CREATED! and click Continue button
    Then Verify that Logged in as username is visible
    Then Add products to cart
    Then Click Cart button
    And  Verify that cart page is displayed
    Then Click Proceed To Checkout
    Then Verify that the delivery address is same address filled at the time registration of account
    And  Verify that the billing address is same address filled at the time registration of account
    Then Click Delete Account button
    And  Verify ACCOUNT DELETED! and click Continue button