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
    @FindBy(xpath = "//p[.='Email Address already exist!']")
    public WebElement emailAddressAlreadyExistText;
    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//h2[.='Get In Touch']")
    public WebElement getInTouchText;
    @FindBy(css = "input[name='name']")
    public WebElement nameContactUs;
    @FindBy(css = "input[name='email']")
    public WebElement emailContactUs;
    @FindBy(css = "input[name='subject']")
    public WebElement subjectContactUs;
    @FindBy(css = "textarea[id='message']")
    public WebElement messageContactUs;
    @FindBy(css = "input[name='upload_file']")
    public WebElement uploadFileContactUs;
    @FindBy(css = "input[name='submit']")
    public WebElement submitButtonContactUs;
    @FindBy(xpath = "//div[@class='contact-form']/*[.='Success! Your details have been submitted successfully.']")
    public WebElement successfullyContactUsText;
    @FindBy(css = "#form-section>.btn.btn-success")
    public WebElement homeReturnPageButton;
    @FindBy(xpath = "//a[@href='/test_cases']")
    public WebElement testCasesButton;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement testCasesPage;
    @FindBy(xpath = "//a[@href='/products']/i")
    public WebElement productsButton;
    @FindBy(css = ".features_items>h2")
    public WebElement allProductsPage;
    @FindBy(css = ".features_items>.col-sm-4>div>div>div>p")
    public List<WebElement> allProductsList;
    @FindBy(css = ".nav.nav-pills.nav-justified>li>a")
    public List<WebElement> viewProductButtonList;
    @FindBy(css = ".product-information")
    public WebElement productDetail;
    @FindBy(css = ".product-information>h2")
    public WebElement productName;
    @FindBy(xpath = "//div//span//span")
    public WebElement productPrice;
    @FindBy(xpath = "(//*[@class='product-information']//p)[1]")
    public WebElement productCategory;
    @FindBy(xpath = "(//*[@class='product-information']//p)[2]")
    public WebElement productAvailability;
    @FindBy(xpath = "(//*[@class='product-information']//p)[3]")
    public WebElement productCondition;
    @FindBy(xpath = "(//*[@class='product-information']//p)[4]")
    public WebElement productBrand;
}
