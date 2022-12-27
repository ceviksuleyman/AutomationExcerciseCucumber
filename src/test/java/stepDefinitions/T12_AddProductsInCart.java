package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;
import utilities.Driver;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T12_AddProductsInCart {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click Products button")
    public void clickProductsButton() {

        jsScrollClick(page.productsButton);
        Driver.getDriver().navigate().refresh();
        jsScrollClick(page.productsButton);
    }

    @Then("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {

        jsScroll(page.allProductNameList.get(0));

        getActions()
                .moveToElement(page.allProductNameList.get(0))
                .perform();

        waitFor(1);
        addToCart(0);
    }

    @Then("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        waitFor(1);
        jsScrollClick(page.continueShoppingButton);
    }

    @Then("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {

        jsScroll(page.allProductNameList.get(1));

        getActions()
                .moveToElement(page.allProductNameList.get(1))
                .perform();

        waitFor(1);
        addToCart(1);//
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        waitFor(1);
        jsScrollClick(page.viewCartButton);
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() throws IOException {

        getScreenshotWebElement("cartDetails", page.cartDetails);
        assertTrue(productsInCart(1).isDisplayed());
        assertTrue(productsInCart(2).isDisplayed());
    }

    @And("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {

        /*System.out.println("urun 1 fiyat -> " + page.firstProductPrice.getText());
        System.out.println("urun 1 miktar -> " + page.firstProductQuantity.getText());
        System.out.println("urun 1 toplam fiyat -> " + page.firstProductTotalPrice.getText());
        System.out.println("urun 2 fiyat -> " + page.secondProductPrice.getText());
        System.out.println("urun 2 miktar -> " + page.secondProductQuantity.getText());
        System.out.println("urun 2 toplam fiyat -> " + page.secondProductTotalPrice.getText());*/

        assertTrue(page.firstProductPrice.isDisplayed()
                && page.secondProductPrice.isDisplayed()
                && page.firstProductQuantity.isDisplayed()
                && page.secondProductQuantity.isDisplayed()
                && page.firstProductTotalPrice.isDisplayed()
                && page.secondProductTotalPrice.isDisplayed());
    }
}
