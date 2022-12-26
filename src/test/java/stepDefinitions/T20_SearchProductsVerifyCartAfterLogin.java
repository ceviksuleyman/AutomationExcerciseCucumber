package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;

import java.util.ArrayList;
import java.util.List;

import static utilities.ReusableMethods.*;

public class T20_SearchProductsVerifyCartAfterLogin {

    AutoExercisePage page = new AutoExercisePage();

    @And("Add those products to cart")
    public void addThoseProductsToCart() {

        jsScrollClick(page.addToCartLinkList.get(0));
    }

    @And("Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {

        jsScrollClick(page.viewCartButton);

        Assert.assertTrue(page.cartDetails.isDisplayed());
    }

    @Then("Click Signup Login button and submit login details")
    public void clickSignupLoginButtonAndSubmitLoginDetails() {

        jsScrollClick(page.signupLoginLink);
        new Hooks().login();
    }

    @Then("Again, go to Cart page")
    public void againGoToCartPage() {

        jsScrollClick(page.cartButton);
    }

    @And("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {

        List<String> productNames = new ArrayList<>();
        for (WebElement w : page.productNamesInCartList) {

            productNames.add(w.getText());
        }
        Assert.assertTrue(productNames.contains(T09_SearchProduct.productName));


        while (page.cartDeleteXList.size() != 0) {

            jsScrollClick(page.cartDeleteXList.get(0));
            waitFor(1);
        }
    }
}
