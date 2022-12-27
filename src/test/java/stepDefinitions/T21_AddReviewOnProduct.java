package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class T21_AddReviewOnProduct {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click on View Product button")
    public void clickOnViewProductButton() {

        int index = ReusableMethods.random().nextInt(page.viewProductButtonList.size());
        ReusableMethods.jsScrollClick(page.viewProductButtonList.get(index));
    }

    @Then("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {

        Assert.assertTrue(page.writeYourReviewTitle.isDisplayed());
    }

    @Then("Enter name, email and review")
    public void enterNameEmailAndReview() {

        page.addReviewNameBox.sendKeys(ConfigReader.getProperty("name"));
        page.addReviewEmailBox.sendKeys(ConfigReader.getProperty("email"));
        page.addReviewBox.sendKeys(Faker.instance().toString());
    }

    @Then("Click Submit button review")
    public void clickSubmitButtonReview() {

        ReusableMethods.jsScrollClick(page.submitButtonAddReview);
    }

    @And("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {

        ReusableMethods.visibilityOfWait(page.thankYouReviewText);
        Assert.assertTrue(page.thankYouReviewText.isDisplayed());
    }

}
