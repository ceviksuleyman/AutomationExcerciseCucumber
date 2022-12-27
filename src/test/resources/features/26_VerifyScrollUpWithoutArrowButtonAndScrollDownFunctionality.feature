@all
Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  @Test26
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Navigate to url "autoUrl"
    When Verify that home page is visible successfully
    When Scroll down page to bottom
    Then Verify SUBSCRIPTION is visible
    Then Wait 3 second
    Then Scroll up page to top
    And  Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen