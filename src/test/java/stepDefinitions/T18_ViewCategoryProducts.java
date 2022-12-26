package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AutoExercisePage;
import utilities.Driver;


import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T18_ViewCategoryProducts {

    AutoExercisePage page = new AutoExercisePage();

    @When("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {

        visibilityOfWait(page.categoryTitle);
        assertTrue(page.categoryTitle.isDisplayed());
        waitFor(4);
    }

    @Then("Click on Women category")
    public void clickOnWomenCategory() {

        jsScrollClick(page.womenCategoryLink);
        waitFor(1);
    }

    @Then("Click on any category link under Women category, for example: Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {

        int index = random().nextInt(page.womenCategoryList.size());
        visibilityOfWait(page.womenCategoryList.get(index));
        jsScrollClick(page.womenCategoryList.get(index));
        Driver.getDriver().navigate().refresh();
        jsScrollClick(page.womenCategoryLink);
        waitFor(1);
        jsScrollClick(page.womenCategoryList.get(index));
    }

    @And("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {

        assertTrue(page.womenCategoryPage.isDisplayed());
        waitFor(4);
    }

    @Then("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {

        jsScrollClick(page.menCategoryLink);
        int index = random().nextInt(page.menCategoryList.size());
        visibilityOfWait(page.menCategoryList.get(index));
        jsScrollClick(page.menCategoryList.get(index));
        waitFor(4);
    }

    @And("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {

        assertTrue(page.menCategoryPage.isDisplayed());
        waitFor(4);
    }
}
