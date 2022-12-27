package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class T01_RegisterUser {

    AutoExercisePage page = new AutoExercisePage();

    @Given("Navigate to url {string}")
    public void navigateToUrl(String url) {

        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }

    @When("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {

        assertTrue(page.homePage.isDisplayed());
        waitFor(2);
    }

    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {

        jsScrollClick(page.signupLoginLink);
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {

        String actualText = page.newUserSignup.getText();
        String expectedText = "New User Signup!";
        assertEquals(expectedText, actualText);
    }


    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {

        page.nameBoxSignup.sendKeys(Faker.instance().name().name());
        page.emailBoxSignup.sendKeys(Faker.instance().internet().emailAddress());
    }

    @Then("Click Signup button")
    public void clickSignupButton() {

        page.signupButton.click();
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {

        String expectedText = "ENTER ACCOUNT INFORMATION";
        String actualText = page.enterAccountInformationText.getText();

        assertEquals(expectedText, actualText);
        assertTrue(page.enterAccountInformationText.isDisplayed());
    }

    @Then("Fill details Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {

        for (WebElement gender : page.genderList) {
            gender.click();
            waitFor(1);
        }

        page.passwordBoxNewSignup.sendKeys(Faker.instance().internet().password());

        ReusableMethods.selectDropDown(page.dayDDM);
        ReusableMethods.selectDropDown(page.monthDDM);
        ReusableMethods.selectDropDown(page.yearDDM);
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {

        jsScrollClick(page.newsletter);
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {

        jsScrollClick(page.partners);
    }

    @Then("Fill details First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {

        jsScroll(page.firstnameBoxNewSignup);
        getActions().click(page.firstnameBoxNewSignup)
                .sendKeys(Faker.instance().name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().company().name()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();

        selectDropDown(page.country);
        jsScroll(page.state);
        waitFor(2);

        getActions()
                .click(page.state).sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().phoneNumber().cellPhone()).perform();
    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {

        jsScrollClick(page.createAccountButton);
    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {

        String expectedText = "ACCOUNT CREATED!";
        String actualText = page.accountCreatedText.getText();

        assertEquals(expectedText, actualText);
    }

    @Then("Click Continue button")
    public void clickContinueButton() {

        jsScrollClick(page.continueButton);
        Driver.getDriver().navigate().refresh();
        visibilityOfWait(page.continueButton);
        jsScrollClick(page.continueButton);

    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {

        assertTrue(page.loggedInAsUsername.isDisplayed());
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {

        jsScrollClick(page.deleteAccountButton);
        waitFor(2);
    }

    @And("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {

        String expectedText = "ACCOUNT DELETED!";
        String actualText = page.accountDeletedMessage.getText();

        assertEquals(expectedText, actualText);

        jsScrollClick(page.continueButton);
    }

    @And("Quit Browser")
    public void quitBrowser() {

        Driver.quitDriver();
    }

    @And("Wait {int} second")
    public void waitSecond(int sec) {

        waitFor(sec);
    }
}
