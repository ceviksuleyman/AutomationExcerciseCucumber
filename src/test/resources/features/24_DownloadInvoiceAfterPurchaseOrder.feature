@all
Feature: Download Invoice after purchase order

  @Test24
  Scenario: Download Invoice after purchase order
    Given Navigate to url "autoUrl"
    When Verify that home page is visible successfully
    Then Add products to cart
    Then Click Cart button
    And  Verify that cart page is displayed
    Then Click Proceed To Checkout
    Then Click Register Login button
    Then Fill all details in Signup and create account
    And  Verify ACCOUNT CREATED! and click Continue button
    Then Verify that Logged in as username is visible
    Then Click Cart button
    Then Click Proceed To Checkout button
    And  Verify Address Details and Review Your Order
    Then Enter description in comment text area and click Place Order
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And  Click Download Invoice button and verify invoice is downloaded successfully.
    Then Click to Continue button
    Then Click Delete Account button
    And  Verify ACCOUNT DELETED! and click Continue button