@Test10
Feature: Verify Subscription in home page

  Scenario: Verify Subscription in home page
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Scroll down to footer
    Then Verify text SUBSCRIPTION
    And  Enter email address in input and click arrow button
    And  Verify success message You have been successfully subscribed! is visible



  #2. 'http://automationexercise.com' URL'sine gidin
  #3. Ana sayfanın başarıyla göründüğünü doğrulayın
  #4. Altbilgiye doğru aşağı kaydırın
  #5. 'ABONELİK' metnini doğrulayın
  #6. Giriş alanına e-posta adresini girin ve ok düğmesine tıklayın
  #7. Başarı mesajını doğrulayın 'Başarılı bir şekilde abone oldunuz!' görünür