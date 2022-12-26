@Test18
Feature: View Category Products

  Scenario: View Category Products
    Given Navigate to url "autoUrl"
    When Verify that categories are visible on left side bar
    Then Click on Women category
    Then Click on any category link under Women category, for example: Dress
    And  Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    Then On left side bar, click on any sub-category link of Men category
    And  Verify that user is navigated to that category page



    #3. Kategorilerin sol taraftaki çubukta göründüğünü doğrulayın
    #4. 'Kadınlar' kategorisine tıklayın
    #5. "Kadınlar" kategorisi altındaki herhangi bir kategori bağlantısına tıklayın, örneğin: Elbise
    #6. Kategori sayfasının görüntülendiğini doğrulayın ve 'KADIN - TOPS ÜRÜNLERİ' metnini onaylayın
    #7. Sol taraftaki çubukta, 'Erkekler' kategorisinin herhangi bir alt kategori bağlantısına tıklayın
    #8. Kullanıcının o kategori sayfasına yönlendirildiğini doğrulayın