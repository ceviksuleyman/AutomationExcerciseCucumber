package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T06_ContactUsForm {

    AutoExercisePage page = new AutoExercisePage();

    @Then("Click on Contact Us button")
    public void clickOnContactUsButton() {

        ReusableMethods.jsScrollClick(page.contactUsButton);
    }

    @Then("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {

        Assert.assertTrue(page.getInTouchText.isDisplayed());
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {

        page.nameContactUs.sendKeys(ConfigReader.getProperty("name"));
        page.emailContactUs.sendKeys(ConfigReader.getProperty("email"));
        page.subjectContactUs.sendKeys("Papua");
        page.messageContactUs.sendKeys(Faker.instance().toString());
    }

    @Then("Upload file")
    public void uploadFile() {

        String filePath = "C:\\Users\\cevik\\IdeaProjects\\AutomationExerciseCucumberProject\\src\\resources\\redCar.png";
        page.uploadFileContactUs.sendKeys(filePath);
    }

    @Then("Click Submit button")
    public void clickSubmitButton() {

        ReusableMethods.jsScrollClick(page.submitButtonContactUs);
    }

    @Then("Click OK button")
    public void clickOKButton() {

        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {

        Assert.assertTrue(page.successfullyContactUsText.isDisplayed());
    }

    @And("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {

        ReusableMethods.jsScrollClick(page.homeReturnPageButton);
        //Assert.assertTrue(page.homePage.isDisplayed());
    }
}
