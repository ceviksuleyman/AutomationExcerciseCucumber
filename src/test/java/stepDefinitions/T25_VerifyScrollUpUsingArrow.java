package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AutoExercisePage;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T25_VerifyScrollUpUsingArrow {

    AutoExercisePage page = new AutoExercisePage();

    @When("Scroll down page to bottom")
    public void scrollDownPageToBottom() {

        jsScroll(page.subscribeTitle);
    }

    @Then("Verify SUBSCRIPTION is visible")
    public void verifySUBSCRIPTIONIsVisible() {

        assertTrue(page.subscribeTitle.isDisplayed());
    }

    @Then("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {

        jsScrollClick(page.scrollUp);
    }

    @And("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {

        visibilityOfWait(page.automationEngineersTitleList.get(0));
        assertTrue(page.automationEngineersTitleList.get(0).isDisplayed());

        visibilityOfWait(page.automationEngineersTitleList.get(1));
        assertTrue(page.automationEngineersTitleList.get(1).isDisplayed());

        visibilityOfWait(page.automationEngineersTitleList.get(2));
        assertTrue(page.automationEngineersTitleList.get(2).isDisplayed());
    }
}
