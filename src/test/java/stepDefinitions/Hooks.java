package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.getActions;

public class Hooks {

    AutoExercisePage page = new AutoExercisePage();
    static String email;
    static String password;

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
        ReusableMethods.selectDropDown(page.dayDDM);
        ReusableMethods.selectDropDown(page.monthDDM);
        ReusableMethods.selectDropDown(page.yearDDM);
        jsScrollClick(page.newsletter);
        jsScrollClick(page.partners);
        getActions().sendKeys(Faker.instance().name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().company().name()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();
        selectDropDown(page.country);
        jsScroll(page.state);
        waitFor(2);
        getActions().click(page.state).sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().phoneNumber().cellPhone()).perform();
        jsScrollClick(page.createAccountButton);
        Driver.quitDriver();
    }
}
