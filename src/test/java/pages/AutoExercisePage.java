package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoExercisePage {

    public AutoExercisePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "section#slider")
    public WebElement homePage;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupLoginLink;
    @FindBy(xpath = "//*[.='New User Signup!']")
    public WebElement newUserSignup;
    @FindBy(name = "name")
    public WebElement nameBoxSignup;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailBoxSignup;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;
    @FindBy(css = ".radio-inline")
    public List<WebElement> genderList;
    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement enterAccountInformationText;
    @FindBy(css = "#password")
    public WebElement passwordBoxNewSignup;
    @FindBy(css = "#days")
    public WebElement dayDDM;
    @FindBy(css = "#months")
    public WebElement monthDDM;
    @FindBy(css = "#years")
    public WebElement yearDDM;
    @FindBy(id = "newsletter")
    public WebElement newsletter;
    @FindBy(id = "optin")
    public WebElement partners;
    @FindBy(css = "#first_name")
    public WebElement firstnameBoxNewSignup;
    @FindBy(css = "#country")
    public WebElement country;
    @FindBy(css = "#state")
    public WebElement state;
    @FindBy(css = "button[data-qa='create-account']")
    public WebElement createAccountButton;
    @FindBy(xpath = "//h2[.='Account Created!']")
    public WebElement accountCreatedText;
    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueButton;
    @FindBy(css = "a>.fa.fa-user")
    public WebElement loggedInAsUsername;
    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;
    @FindBy(xpath = "//h2[.='Account Deleted!']")
    public WebElement accountDeletedMessage;
    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginToYourAccount;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailBoxLogin;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement passwordBoxLogin;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement yourEmailPasswordIncorrectText;
    @FindBy(css = "#dismiss-button>div")
    public List<WebElement> dismissButton;
    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;

}
