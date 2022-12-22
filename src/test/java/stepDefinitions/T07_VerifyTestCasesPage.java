package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

public class T07_VerifyTestCasesPage {

    AutoExercisePage page = new AutoExercisePage();
    @Then("Click on Test Cases button")
    public void clickOnTestCasesButton() {

        ReusableMethods.jsScrollClick(page.testCasesButton);
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {

        Assert.assertTrue(page.testCasesPage.isDisplayed());
    }
}
