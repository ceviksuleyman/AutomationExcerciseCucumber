@all
Feature: View & Cart Brand Products

  @Test19
  Scenario: View & Cart Brand Products
    Given Navigate to url "autoUrl"
    When Click on Products button
    Then Verify that Brands are visible on left side bar
    Then Click on any brand name
    And  Verify that user is navigated to brand page and brand products are displayed
    Then On left side bar, click on any other brand link
    And  Verify that user is navigated to that brand page and can see products