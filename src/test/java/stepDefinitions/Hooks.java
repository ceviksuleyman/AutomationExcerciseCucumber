package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.getActions;

public class Hooks {

    AutoExercisePage page = new AutoExercisePage();
    static String email;
    static String password;
    static List<String> expectedAddressDetails;

    @After
    public void tearDown(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot)

                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()) {

            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }


    @Before(order = 1, value = "@Test02")
    public void registerUser() {

        email = Faker.instance().internet().emailAddress();
        password = Faker.instance().internet().password();

        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
        jsScrollClick(page.signupLoginLink);
        page.nameBoxSignup.sendKeys(Faker.instance().name().name());
        page.emailBoxSignup.sendKeys(email);
        page.signupButton.click();
        page.genderList.get(0).click();
        page.passwordBoxNewSignup.sendKeys(password);

        selectDropDown(page.dayDDM);
        selectDropDown(page.monthDDM);
        selectDropDown(page.yearDDM);
        jsScrollClick(page.newsletter);
        jsScrollClick(page.partners);

        jsScroll(page.firstnameBoxNewSignup);
        waitFor(2);
        getActions()
                .click(page.firstnameBoxNewSignup)
                .sendKeys(Faker.instance().name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().company().name()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();

        selectDdmIndex(page.country);
        jsScroll(page.country);
        waitFor(2);

        getActions()
                .click(page.state)
                .sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().phoneNumber().cellPhone()).perform();
        jsScrollClick(page.createAccountButton);

        Driver.quitDriver();
    }

    public void register() {

        String gender = "";
        String name = Faker.instance().name().name();
        String company = Faker.instance().company().name();
        String phoneNumber = Faker.instance().phoneNumber().cellPhone();

        page.nameBoxSignup.sendKeys(name);
        page.emailBoxSignup.sendKeys(Faker.instance().internet().emailAddress());
        page.signupButton.click();
        page.genderList.get(0).click();
        gender = page.genderList.get(0).getText();
        page.passwordBoxNewSignup.sendKeys(Faker.instance().internet().password());

        selectDropDown(page.dayDDM);
        selectDropDown(page.monthDDM);
        selectDropDown(page.yearDDM);
        jsScrollClick(page.newsletter);
        jsScrollClick(page.partners);

        jsScroll(page.firstnameBoxNewSignup);
        waitFor(1);
        getActions()
                .click(page.firstnameBoxNewSignup)
                .sendKeys(Faker.instance().name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(company).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();

        selectDdmIndex(page.country);
        jsScroll(page.country);
        waitFor(1);

        getActions()
                .click(page.state)
                .sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber)
                .perform();
        jsScrollClick(page.createAccountButton);

        expectedAddressDetails = new ArrayList<>(Arrays.asList(gender + name, company, phoneNumber));
    }
}
