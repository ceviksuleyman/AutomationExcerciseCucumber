package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T13_VerifyProductQuantityInCart {

    AutoExercisePage page = new AutoExercisePage();
    String quantity;

    @Then("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {

        int index = random().nextInt(page.viewProductButtonList.size());
        jsScrollClick(page.viewProductButtonList.get(index));
        Driver.getDriver().navigate().refresh();
        jsScrollClick(page.viewProductButtonList.get(index));
        waitFor(3);
    }

    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {

        assertTrue(page.productDetail.isDisplayed());
    }

    @Then("Increase quantity to {int}")
    public void increaseQuantityTo(int miktar) {

        quantity = String.valueOf(miktar);

        page.quantity.click();
        waitFor(1);
        page.quantity.clear();
        waitFor(1);
        page.quantity.sendKeys(quantity);
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {

        jsScrollClick(page.addToCartButton);
    }

    @And("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {

        assertEquals(quantity, page.quantityInCart.getText());
    }
}
