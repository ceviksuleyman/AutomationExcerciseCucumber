package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.openqa.selenium.Keys;
import pages.AutoExercisePage;
import utilities.ConfigReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T10_VerifySubscriptionInHomePage {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Scroll down to footer")
    public void scrollDownToFooter() {

        jsScroll(page.subscribeBoxEmail);
    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {

        String expectedText = "SUBSCRIPTION";
        String actualText = page.subscribeTitle.getText();

        assertEquals(expectedText, actualText);
    }

    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {

        getActions()
                .click(page.subscribeBoxEmail)
                .sendKeys(Faker.instance().internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
    }

    @And("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {

        visibilityOfWait(page.youHaveBeenSuccessfullySubscribed);
        assertTrue(page.youHaveBeenSuccessfullySubscribed.isDisplayed());
    }
}
