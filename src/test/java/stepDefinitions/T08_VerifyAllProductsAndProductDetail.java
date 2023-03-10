package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class T08_VerifyAllProductsAndProductDetail {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click on Products button")
    public void clickOnProductsButton() {

        jsScrollClick(page.productsButton);
        Driver.getDriver().navigate().refresh();
        visibilityOfWait(page.productsButton);
        jsScrollClick(page.productsButton);
        waitFor(1);
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        assertTrue(page.allProductsTitle.isDisplayed());
    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() throws IOException {


        ReusableMethods.waitFor(1);
        int count = 1;

        System.out.println("========== ALL PRODUCT NAMES ===========");
        for (int i = 0; i < page.allProductNameList.size(); i++) {

            System.out.println(count + " -> " + page.allProductNameList.get(i).getText());
            assertTrue(page.allProductNameList.get(i).isDisplayed());
            count++;
        }
    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {

        jsScrollClick(page.viewProductButtonList.get(0));
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {

        assertTrue(page.productDetail.isDisplayed());
    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {

        assertTrue(page.productName.isDisplayed()
                && page.productCategory.isDisplayed()
                && page.productPrice.isDisplayed()
                && page.productAvailability.isDisplayed()
                && page.productCondition.isDisplayed()
                && page.productBrand.isDisplayed());
    }
}
