package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AutoExercisePage;
import utilities.Driver;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T09_SearchProduct {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {

        int indexProduct = random().nextInt(page.allProductsList.size());
        getActions()
                .click(page.searchProductBox)
                .sendKeys(page.allProductsList.get(indexProduct).getText())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {

        visibilityOfWait(page.searchedProductsTitle);
        assertTrue(page.searchedProductsTitle.isDisplayed());
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() throws IOException {

        Driver.zoomInOut(80);
        for (int i = 0; i < page.allTheProductsRelated.size(); i++) {

            System.out.println(page.allTheProductsRelated.get(i).getText());
            jsScroll(page.allTheProductsRelated.get(i));
            getActions().sendKeys(Keys.PAGE_DOWN).perform();
            assertTrue(page.allTheProductsRelated.get(i).isDisplayed());
        }
    }
}
