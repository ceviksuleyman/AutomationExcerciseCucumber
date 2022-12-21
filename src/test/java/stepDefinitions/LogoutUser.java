package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.ConfigReader;

public class LogoutUser {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {

        page.emailBoxLogin.sendKeys(ConfigReader.getProperty("email"));
        page.passwordBoxLogin.sendKeys(ConfigReader.getProperty("password"));

    }
    @Then("Click Logout button")
    public void clickLogoutButton() {

        page.logoutButton.click();
    }

    @And("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {

        Assert.assertTrue(page.loginToYourAccount.isDisplayed());
    }
}
