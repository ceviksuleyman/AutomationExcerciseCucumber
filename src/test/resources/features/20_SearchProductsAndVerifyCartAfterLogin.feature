@all
Feature: Search Products and Verify Cart After Login

  @Test20
  Scenario: Search Products and Verify Cart After Login
    Given Navigate to url "autoUrl"
    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Enter product name in search input and click search button
    And  Verify SEARCHED PRODUCTS is visible
    And  Verify all the products related to search are visible
    And  Add those products to cart
    And  Click Cart button and verify that products are visible in cart
    Then Click Signup Login button and submit login details
    Then Again, go to Cart page
    And  Verify that those products are visible in cart after login as well