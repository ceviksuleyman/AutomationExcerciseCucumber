@all
Feature: Verify Product quantity in Cart

  @Test13
  Scenario: Verify Product quantity in Cart
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click View Product for any product on home page
    Then Verify product detail is opened
    Then Increase quantity to 4
    And  Click Add to cart button
    Then Click View Cart button
    And  Verify that product is displayed in cart page with exact quantity


  #2. 'http://automationexercise.com' URL'sine gidin
  #3. Ana sayfanın başarıyla göründüğünü doğrulayın
  #4. Ana sayfadaki herhangi bir ürün için 'Ürünü Görüntüle'ye tıklayın
  #5. Ürün detayının açıldığını doğrulayın
  #6. Miktarı 4'e yükseltin
  #7. 'Sepete ekle' düğmesini tıklayın
  #8. 'Sepeti Görüntüle' düğmesini tıklayın
  #9. Sepet sayfasında ürünün tam miktar ile görüntülendiğini doğrulayın.