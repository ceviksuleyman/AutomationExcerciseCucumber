package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.AutoExercisePage;
import utilities.ConfigReader;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.jsScrollClick;

public class T16_PlaceOrderLoginBeforeCheckout {

    AutoExercisePage page = new AutoExercisePage();
    static String phoneNumber;
    static String firstname;
    static String lastname;
    static String country;

    @Then("Fill email, password and click Login button")
    public void fillEmailPasswordAndClickLoginButton() {

        getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("autoUrl"));
        List<String> windows = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(windows.get(1));

        String email = Faker.instance().internet().emailAddress();
        String password = Faker.instance().internet().password();
        firstname = Faker.instance().name().firstName();
        lastname = Faker.instance().name().lastName();
        phoneNumber = Faker.instance().phoneNumber().cellPhone();

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
                .sendKeys(firstname).sendKeys(Keys.TAB)
                .sendKeys(lastname).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().company().name()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().streetAddress()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().fullAddress()).sendKeys(Keys.TAB).perform();

        selectDdmIndex(page.country);
        country = select(page.country).getFirstSelectedOption().getText();
        jsScroll(page.country);
        waitFor(2);

        getActions()
                .click(page.state)
                .sendKeys(Faker.instance().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().city()).sendKeys(Keys.TAB)
                .sendKeys(Faker.instance().address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber).perform();
        jsScrollClick(page.createAccountButton);


        getDriver().switchTo().window(windows.get(0));


        page.emailBoxLogin.sendKeys(email);
        page.passwordBoxLogin.sendKeys(password);
        jsScrollClick(page.loginButton);
    }

    @Then("Verify Address Details and Review Your Order T login")
    public void verifyAddressDetailsAndReviewYourOrderT() throws IOException {

        String expectedName = firstname + " " + lastname;
        String expectedCountry = country;
        String expectedPhoneNumber = phoneNumber;
        //System.out.println("expectedName = " + expectedName);

        assertTrue(page.deliveryAddressFirstnameLastname.getText().contains(expectedName));
        assertEquals(expectedCountry, page.deliveryAddressCountry.getText());
        assertEquals(expectedPhoneNumber, page.deliveryAddressPhone.getText());
        assertTrue(page.addressDetailsControl.isDisplayed());
        getScreenshotWebElement("AddressDetails", page.addressDetailsControl);
    }
}
