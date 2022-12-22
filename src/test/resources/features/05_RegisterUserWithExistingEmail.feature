@Test05
Feature: Register User with existing email

  Scenario: Register User with existing email
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify New User Signup! is visible
    When Enter name and already registered email address
    Then Click Signup button
    And Verify error Email Address already exist! is visible



    #2. Navigate to url 'http://automationexercise.com'
    #3. Verify that home page is visible successfully
    #4. Click on 'Signup / Login' button
    #5. Verify 'New User Signup!' is visible
    #6. Enter name and already registered email address
    #7. Click 'Signup' button
    #8. Verify error 'Email Address already exist!' is visible