@Test08
Feature: Verify All Products and product detail page

  Scenario: Verify All Products and product detail page
    Given Navigate to url "autoUrl"
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    Then Click on View Product of first product
    Then User is landed to product detail page
    And  Verify that detail detail is visible: product name, category, price, availability, condition, brand



  #4. 'Ürünler' düğmesine tıklayın
  #5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla yönlendirildiğini doğrulayın
  #6. Ürün listesi görünür
  #7. İlk ürünün 'Ürünü Görüntüle'ye tıklayın
  #8. Kullanıcı ürün detay sayfasına yönlendirildi
  #9. Ürün adı, kategorisi, fiyatı, bulunabilirliği, durumu, markası gibi ayrıntıların göründüğünü doğrulayın.
