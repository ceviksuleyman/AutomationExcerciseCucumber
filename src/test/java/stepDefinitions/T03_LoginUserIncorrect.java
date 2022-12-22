package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.AutoExercisePage;

public class T03_LoginUserIncorrect {

    AutoExercisePage page = new AutoExercisePage();

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {

        page.emailBoxLogin.sendKeys("pappua@gmail.com");
        page.passwordBoxLogin.sendKeys("Pappua");
    }

    @And("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {

        String expectedText = "Your email or password is incorrect!";
        String actualText = page.yourEmailPasswordIncorrectText.getText();

        Assert.assertEquals(expectedText, actualText);
    }
}
