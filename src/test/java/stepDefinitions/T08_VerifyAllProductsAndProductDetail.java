package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

public class T08_VerifyAllProductsAndProductDetail {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click on Products button")
    public void clickOnProductsButton() {

        ReusableMethods.jsScrollClick(page.productsButton);
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        Assert.assertTrue(page.allProductsPage.isDisplayed());
    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {

        int count = 1;
        System.out.println("========== ALL PRODUCT LIST ===========");
        for (WebElement w : page.allProductsList) {

            System.out.println(count + " -> " + w.getText());
            count++;
        }
    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {

        ReusableMethods.jsScrollClick(page.viewProductButtonList.get(0));
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {

        Assert.assertTrue(page.productDetail.isDisplayed());
    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {

        Assert.assertTrue(page.productName.isDisplayed()
                && page.productCategory.isDisplayed()
                && page.productPrice.isDisplayed()
                && page.productAvailability.isDisplayed()
                && page.productCondition.isDisplayed()
                && page.productBrand.isDisplayed());
    }
}
