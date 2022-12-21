package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.jsScrollClick;

public class LoginUserCorrect {

    AutoExercisePage page = new AutoExercisePage();

    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {

        assertTrue(page.loginToYourAccount.isDisplayed());
    }

    @And("Enter correct email address and password hooks")
    public void enterCorrectEmailAddressAndPassword() {

        page.emailBoxLogin.sendKeys(Hooks.email);
        page.passwordBoxLogin.sendKeys(Hooks.password);
    }

    @Then("Click login button")
    public void clickLoginButton() {

        jsScrollClick(page.loginButton);
    }

    @And("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {

        assertTrue(page.accountDeletedMessage.isDisplayed());
    }
}
