@all
Feature: Contact Us Form

  @Test06
  Scenario: Contact Us Form
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Contact Us button
    Then Verify GET IN TOUCH is visible
    And  Enter name, email, subject and message
    Then Upload file
    Then Click Submit button
    Then Click OK button
    And  Verify success message Success! Your details have been submitted successfully. is visible
    And  Click Home button and verify that landed to home page successfully


    #Click on Contact Us button
    #Verify GET IN TOUCH is visible
    #Enter name, email, subject and message
    #Upload file
    #Click 'Submit' button
    #Click OK button
    #Verify success message 'Success! Your details have been submitted successfully.' is visible
    #Click 'Home' button and verify that landed to home page successfully