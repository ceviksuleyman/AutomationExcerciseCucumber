@all
Feature: Verify Scroll Up using 'Arrow' button and Scroll Down functionality

  @Test25
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Navigate to url "autoUrl"
    When Verify that home page is visible successfully
    When Scroll down page to bottom
    Then Verify SUBSCRIPTION is visible
    Then Click on arrow at bottom right side to move upward
    And  Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
