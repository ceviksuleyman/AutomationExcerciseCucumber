package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.ConfigReader;

public class T05_RegisterUserWithExistingEmail {

    AutoExercisePage page = new AutoExercisePage();
    @When("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {

        page.nameBoxSignup.sendKeys(ConfigReader.getProperty("name"));
        page.emailBoxSignup.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {

        Assert.assertTrue(page.emailAddressAlreadyExistText.isDisplayed());
    }
}
