@Test21
Feature: Add review on product

  Scenario: Add review on product
    Given Navigate to url "autoUrl"
    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Click on View Product button
    Then Verify Write Your Review is visible
    Then Enter name, email and review
    Then Click Submit button review
    And  Verify success message Thank you for your review.