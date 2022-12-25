@Test14
Feature: Place Order: Register while Checkout

  Scenario: Place Order: Register while Checkout
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Add products to cart
    Then Click View Cart button
    Then Verify that cart page is displayed
    And  Click Proceed To Checkout
    Then Click Register Login button
    And  Fill all details in Signup and create account
    Then Verify ACCOUNT CREATED! and click Continue button
    Then Verify that Logged in as username is visible
    And  Click Cart button
    And  Click Proceed To Checkout button
    Then Verify Address Details and Review Your Order
    Then Enter description in comment text area and click Place Order
    And  Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And Click Delete Account button
    And Verify ACCOUNT DELETED! and click Continue button


  #2. 'http://automationexercise.com' URL'sine gidin
  #3. Ana sayfanın başarıyla göründüğünü doğrulayın
  #4. Sepete ürün ekleyin
  #5. 'Sepet' düğmesine tıklayın
  #6. Sepet sayfasının görüntülendiğini doğrulayın
  #7. Ödeme İşlemine Devam Et'i tıklayın
  #8. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
  #9. Kaydol'daki tüm ayrıntıları doldurun ve hesap oluşturun
  #10. 'HESAP OLUŞTURULDU!'nu doğrulayın! ve 'Devam Et' düğmesini tıklayın
  #11. Üstte "Kullanıcı adı olarak oturum açıldı"yı doğrulayın
  #12.'Sepet' düğmesine tıklayın
  #13. 'Ödeme İşlemine Devam Et' düğmesini tıklayın
  #14. Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin
  #15. Açıklama metin alanına açıklamayı girin ve 'Sipariş Ver'i tıklayın
  #16. Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma Tarihi
  #17. 'Öde ve Siparişi Onayla' düğmesine tıklayın
  #18. Başarı mesajını doğrulayın 'Siparişiniz başarıyla verildi!'
  #19. 'Hesabı Sil' düğmesini tıklayın
  #20. 'HESAP SİLİNDİ!' ve 'Devam Et' düğmesini tıklayın