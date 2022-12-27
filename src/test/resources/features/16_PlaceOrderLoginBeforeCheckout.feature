@all
Feature: Place Order: Login before Checkout

  @Test16
  Scenario: Place Order: Login before Checkout
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Fill email, password and click Login button
    Then Verify that Logged in as username is visible
    Then Add products to cart
    Then Click Cart button
    And  Verify that cart page is displayed
    Then Click Proceed To Checkout
    Then Verify Address Details and Review Your Order T login
    Then Enter description in comment text area and click Place Order
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Click Pay and Confirm Order button
    And  Verify success message Your order has been placed successfully!
    Then Click Delete Account button
    And  Verify ACCOUNT DELETED! and click Continue button


  #2. 'http://automationexercise.com' URL'sine gidin
  #3. Ana sayfanın başarıyla göründüğünü doğrulayın
  #4. 'Kaydol / Giriş Yap' düğmesini tıklayın
  #5. E-postayı, şifreyi doldurun ve 'Giriş' düğmesine tıklayın
  #6. En üstte 'Kullanıcı adı olarak oturum açıldı'yı doğrulayın
  #7. Sepete ürün ekleyin
  #8. 'Sepet' düğmesine tıklayın
  #9. Sepet sayfasının görüntülendiğini doğrulayın
  #10. Ödeme İşlemine Devam Et'i tıklayın
  #11. Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin
  #12. Açıklama metin alanına açıklamayı girin ve 'Sipariş Ver'i tıklayın
  #13. Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma Tarihi
  #14. 'Öde ve Siparişi Onayla' düğmesine tıklayın
  #15. Başarı mesajını doğrulayın 'Siparişiniz başarıyla verildi!'
  #16. 'Hesabı Sil' düğmesini tıklayın
  #17. 'HESAP SİLİNDİ!' ve 'Devam Et' düğmesini tıklayın