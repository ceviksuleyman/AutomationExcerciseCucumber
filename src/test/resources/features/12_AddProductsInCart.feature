@Test12
Feature: Add Products in Cart

  Scenario: Add Products in Cart
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click Products button
    Then Hover over first product and click Add to cart
    Then Click Continue Shopping button
    Then Hover over second product and click Add to cart
    And  Click View Cart button
    Then Verify both products are added to Cart
    And  Verify their prices, quantity and total price