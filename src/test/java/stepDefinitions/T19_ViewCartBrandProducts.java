package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;


import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T19_ViewCartBrandProducts {

    AutoExercisePage page = new AutoExercisePage();
    int brand;
    int brand2;

    @Then("Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {

        assertTrue(page.brandsTitle.isDisplayed());
    }

    @Then("Click on any brand name")
    public void clickOnAnyBrandName() {

        brand = random().nextInt(page.brandsLinkList.size());
        visibilityOfWait(page.brandsLinkList.get(brand));
        jsScrollClick(page.brandsLinkList.get(brand));
    }

    @And("Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {

        assertTrue(page.brandProductsPage.isDisplayed());
    }

    @Then("On left side bar, click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() {

        brand2 = random().nextInt(page.brandsLinkList.size());
        while (brand == brand2) {

            brand2 = random().nextInt(page.brandsLinkList.size());
        }
        visibilityOfWait(page.brandsLinkList.get(brand2));
        jsScrollClick(page.brandsLinkList.get(brand2));
    }

    @And("Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {

        assertTrue(page.brandProductsPage.isDisplayed());
    }
}
