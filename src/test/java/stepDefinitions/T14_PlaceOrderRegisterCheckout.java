package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.AutoExercisePage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T14_PlaceOrderRegisterCheckout {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Add products to cart")
    public void addProductsToCart() {

        int index = random().nextInt(page.addToCartLinkList.size());
        jsScrollClick(page.addToCartLinkList.get(index));
        waitFor(2);
    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {

        String expectedUrl = "https://www.automationexercise.com/view_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {

        jsScrollClick(page.proceedToCheckoutLink);
    }

    @Then("Click Register Login button")
    public void clickRegisterLoginButton() {

        jsScrollClick(page.registerLoginButton);
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {

        new Hooks().register();
    }

    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {

        assertTrue(page.accountCreatedText.isDisplayed());
        jsScrollClick(page.continueButton);
        Driver.getDriver().navigate().refresh();
        jsScrollClick(page.continueButton);
    }

    @And("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {

        jsScrollClick(page.proceedToCheckoutLink);
    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {

        System.out.println(Hooks.expectedAddressDetails);
    }
}
