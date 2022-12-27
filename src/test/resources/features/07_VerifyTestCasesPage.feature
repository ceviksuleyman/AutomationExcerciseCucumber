@all
Feature: Verify Test Cases Page

  @Test07
  Scenario: Verify Test Cases Page
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Test Cases button
    And  Wait 1 second
    And  Verify user is navigated to test cases page successfully

    #2. Navigate to url 'http://automationexercise.com'
    #3. Verify that home page is visible successfully
    #4. Click on 'Test Cases' button
    #5. Verify user is navigated to test cases page successfully
