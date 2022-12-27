package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AutoExercisePage;

import java.io.IOException;

import static utilities.ReusableMethods.*;

public class T22_AddToCartFromRecommendedItems {

    AutoExercisePage page = new AutoExercisePage();

    @When("Scroll to bottom of page")
    public void scrollToBottomOfPage() {

        jsScroll(page.recommendedItemsTitle);
    }

    @Then("Verify RECOMMENDED ITEMS are visible")
    public void verify_recommended_items_are_visible() {

        Assert.assertTrue(page.recommendedItems.isDisplayed());
    }

    @Then("Click on Add To Cart on Recommended product")
    public void click_on_add_to_cart_on_recommended_product() {

        int index = random().nextInt(page.recommendedProductsAddToCartButtonList.size());
        visibilityOfWait(page.recommendedProductsAddToCartButtonList.get(index));
        jsScrollClick(page.recommendedProductsAddToCartButtonList.get(index));
    }

    @Then("Click on View Cart button")
    public void click_on_view_cart_button() {

        jsScrollClick(page.viewCartButton);
    }

    @Then("Verify that product is displayed in cart page")
    public void verify_that_product_is_displayed_in_cart_page() throws IOException {

        Assert.assertTrue(page.cartDetails.isDisplayed());
        getScreenshotWebElement("T22CartDetails", page.cartDetails);
    }
}
