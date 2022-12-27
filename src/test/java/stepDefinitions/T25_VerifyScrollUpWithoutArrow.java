package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

public class T25_VerifyScrollUpWithoutArrow {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Scroll up page to top")
    public void scrollUpPageToTop() {

        ReusableMethods.jsScroll(page.signupLoginLink);
    }
}
