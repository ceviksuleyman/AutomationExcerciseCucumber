package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AutoExercisePage;
import utilities.Driver;

import java.io.IOException;

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
    public void verifyAddressDetailsAndReviewYourOrder() throws IOException {

        String expectedName = Hooks.firstname + " " + Hooks.lastname;
        String expectedCountry = Hooks.country;
        String expectedPhoneNumber = Hooks.phoneNumber;
        //System.out.println("expectedName = " + expectedName);

        assertTrue(page.deliveryAddressFirstnameLastname.getText().contains(expectedName));
        assertEquals(expectedCountry, page.deliveryAddressCountry.getText());
        assertEquals(expectedPhoneNumber, page.deliveryAddressPhone.getText());
        getScreenshotWebElement("AddressDetails", page.addressDetailsControl);
    }

    @Then("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {

        jsScroll(page.descriptionCommentBox);
        getActions()
                .click(page.descriptionCommentBox)
                .sendKeys(Faker.instance().toString())
                .perform();
        jsScrollClick(page.placeOrderButton);

        Driver.getDriver().navigate().back();
        waitFor(1);
        jsScrollClick(page.placeOrderButton);
        waitFor(1);
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

        getActions()
                .click(page.cardName)
                .sendKeys(Hooks.firstname + " " + Hooks.lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().number().digits(16))
                .sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().number().digits(3))
                .sendKeys(Keys.TAB)
                .sendKeys(dateMonth())
                .sendKeys(Keys.TAB)
                .sendKeys(dateYear())
                .perform();
    }

    @Then("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {

        jsScrollClick(page.payAndConfirmOrderButton);
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        visibilityOfWait(page.yourOrderHasBeenPlacedSuccessfully);
        assertTrue(page.yourOrderHasBeenPlacedSuccessfully.isDisplayed());
    }

    @And("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {

        visibilityOfWait(page.accountDeletedMessage);
        assertTrue(page.accountDeletedMessage.isDisplayed());
        jsScrollClick(page.continueButton);
    }
}
