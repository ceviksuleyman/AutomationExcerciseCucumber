package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;


import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.jsScrollClick;
import static utilities.ReusableMethods.visibilityOfWait;

public class T17_RemoveProductsFromCart {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {

            jsScrollClick(page.cartDeleteXList.get(0));
    }

    @And("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {

        visibilityOfWait(page.cartIsEmptyText);
        assertTrue(page.cartIsEmptyText.isDisplayed());
    }
}
