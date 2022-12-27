@all
Feature: Remove Products From Cart

  @Test17
  Scenario: Remove Products From Cart
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Add products to cart
    Then Click Cart button
    Then Verify that cart page is displayed
    Then Click X button corresponding to particular product
    And  Verify that product is removed from the cart