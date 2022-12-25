package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.AutoExercisePage;

import static utilities.ReusableMethods.jsScrollClick;

public class T11_VerifySubscriptionInCartPage {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click Cart button")
    public void clickCartButton() {

        jsScrollClick(page.cartButton);
    }
}
