package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;


import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T17_RemoveProductsFromCart {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {

        while (page.cartDeleteXList.size() != 0){

            jsScrollClick(page.cartDeleteXList.get(0));
            waitFor(1);
        }
    }

    @And("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {

        visibilityOfWait(page.cartIsEmptyText);
        assertTrue(page.cartIsEmptyText.isDisplayed());
    }
}
