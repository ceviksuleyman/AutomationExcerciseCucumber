@all
Feature: Place Order: Register before Checkout

  @Test15
  Scenario: Place Order: Register before Checkout
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Fill all details in Signup and create account
    And Verify ACCOUNT CREATED! and click Continue button
    Then Verify that Logged in as username is visible
    Then Add products to cart
    Then Click Cart button
    And  Verify that cart page is displayed
    And  Click Proceed To Checkout
    Then Verify Address Details and Review Your Order
    Then Enter description in comment text area and click Place Order
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    Then Click Delete Account button
    And Verify ACCOUNT DELETED! and click Continue button


  #2. 'http://automationexercise.com' URL'sine gidin
  #3. Ana sayfanın başarıyla göründüğünü doğrulayın
  #4. 'Kaydol / Giriş Yap' düğmesini tıklayın
  #5. Kaydol'daki tüm ayrıntıları doldurun ve hesap oluşturun
  #6. 'HESAP OLUŞTURULDU!'nu doğrulayın. ve 'Devam Et' düğmesini tıklayın
  #7. Üstte "Kullanıcı adı olarak oturum açıldı"yı doğrulayın
  #8. Sepete ürün ekleyin
  #9. 'Sepet' düğmesine tıklayın
  #10. Sepet sayfasının görüntülendiğini doğrulayın
  #11. Ödeme İşlemine Devam Et'i tıklayın
  #12. Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin
  #13. Açıklama metin alanına açıklamayı girin ve 'Sipariş Ver'i tıklayın
  #14. Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma Tarihi
  #15. 'Öde ve Siparişi Onayla' düğmesine tıklayın
  #16. Başarı mesajını doğrulayın 'Siparişiniz başarıyla verildi!'
  #17. 'Hesabı Sil' düğmesini tıklayın
  #18. 'HESAP SİLİNDİ!' ve 'Devam Et' düğmesini tıklayın