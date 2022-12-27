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
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;
    @FindBy(css = ".features_items>h2")
    public WebElement allProductsPage;
    @FindBy(css = ".features_items>.col-sm-4>div>div>div>p")
    public List<WebElement> allProductsList;
    @FindBy(css = ".nav.nav-pills.nav-justified>li>a>i")
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
    @FindBy(css = "input#search_product")
    public WebElement searchProductBox;
    @FindBy(xpath = "//h2[.='Searched Products']")
    public WebElement searchedProductsTitle;
    @FindBy(xpath = "//*[@class='col-sm-4']/div/div/div/p")
    public List<WebElement> allTheProductsRelated;
    @FindBy(xpath = "//*[@class='product-image-wrapper']")
    public WebElement allTheProductsRelatedScreenShot;
    @FindBy(css = "input#susbscribe_email")
    public WebElement subscribeBoxEmail;
    @FindBy(css = "div.single-widget>h2")
    public WebElement subscribeTitle;
    @FindBy(xpath = "//*[.='You have been successfully subscribed!']")
    public WebElement youHaveBeenSuccessfullySubscribed;
    @FindBy(xpath = "//a[@href='/view_cart']")
    public WebElement cartButton;
    @FindBy(xpath = "//div[@class='overlay-content']/a[@data-product-id='1']")
    public WebElement addToCartLink;
    @FindBy(xpath = "//div[@class='single-products']//*[@class='productinfo text-center']/a")
    public List<WebElement> addToCartLinkList;
    @FindBy(xpath = "//*[.='Continue Shopping']")
    public WebElement continueShoppingButton;
    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement viewCartButton;
    @FindBy(css = "#cart_info_table")
    public WebElement cartDetails;
    @FindBy(css = "#product-2")
    public WebElement productsInCart;
    @FindBy(xpath = "//*[@class='col-sm-4']/div/div/div/h2")
    public List<WebElement> allProductsPrices;
    @FindBy(xpath = "//tr[1]/td[3]/p")
    public WebElement firstProductPrice;
    @FindBy(xpath = "//tr[1]/td[4]/button")
    public WebElement firstProductQuantity;
    @FindBy(xpath = "//tr[1]/td[5]/p")
    public WebElement firstProductTotalPrice;
    @FindBy(xpath = "//tr[2]/td[3]/p")
    public WebElement secondProductPrice;
    @FindBy(xpath = "//tr[2]/td[4]/button")
    public WebElement secondProductQuantity;
    @FindBy(xpath = "//tr[2]/td[5]/p")
    public WebElement secondProductTotalPrice;
    @FindBy(css = "#quantity")
    public WebElement quantity;
    @FindBy(css = "button.btn.btn-default.cart")
    public WebElement addToCartButton;
    @FindBy(xpath = "//tr[1]/td[4]/button")
    public WebElement quantityInCart;
    @FindBy(linkText = "Proceed To Checkout")
    public WebElement proceedToCheckoutLink;
    @FindBy(xpath = "//a[.='Register / Login']")
    public WebElement registerLoginButton;
    @FindBy(css = "#address_delivery>.address_firstname.address_lastname")
    public WebElement deliveryAddressFirstnameLastname;
    @FindBy(css = "#address_delivery>.address_country_name")
    public WebElement deliveryAddressCountry;
    @FindBy(css = "#address_delivery>.address_phone")
    public WebElement deliveryAddressPhone;
    @FindBy(css = ".checkout-information")
    public WebElement addressDetailsControl;
    @FindBy(css = ".form-control")
    public WebElement descriptionCommentBox;
    @FindBy(css = "input[name=name_on_card]")
    public WebElement cardName;
    @FindBy(css = "#submit")
    public WebElement payAndConfirmOrderButton;
    @FindBy(xpath = "//*[.='Congratulations! Your order has been confirmed!']")
    public WebElement yourOrderHasBeenPlacedSuccessfully; //*[contains(text(), 'Your order has been placed successfully!')]
    @FindBy(xpath = "//a[.='Place Order']")
    public WebElement placeOrderButton;
    @FindBy(xpath = "//*[@class='cart_delete']/a")
    public List<WebElement> cartDeleteXList;
    @FindBy(xpath = "//*[.='Cart is empty!']")
    public WebElement cartIsEmptyText;
    @FindBy(xpath = "//*[.='Category']")
    public WebElement categoryTitle;
    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement menCategoryLink;
    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategoryLink;
    @FindBy(xpath = "//a[@href='#Kids']")
    public WebElement kidsCategoryLink;
    @FindBy(xpath = "//*[@id='Women']/*[@class='panel-body']/ul/li/a")
    public List<WebElement> womenCategoryList;
    @FindBy(xpath = "//*[@id='Men']/*[@class='panel-body']/ul/li/a")
    public List<WebElement> menCategoryList;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement womenCategoryPage;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement menCategoryPage;
    @FindBy(xpath = "//*[.='Brands']")
    public WebElement brandsTitle;
    @FindBy(css = ".brands-name>ul>li>a>span")
    public List<WebElement> brandsLinkList;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement brandProductsPage;
    @FindBy(xpath = "//tbody/tr/td[2]/h4/a")
    public List<WebElement> productNamesInCartList;
    @FindBy(xpath = "//a[.='Write Your Review']")
    public WebElement writeYourReviewTitle;
    @FindBy(css = "#review-form>span>#name")
    public WebElement addReviewNameBox;
    @FindBy(css = "#review-form>span>#email")
    public WebElement addReviewEmailBox;
    @FindBy(css = "#review-form>#review")
    public WebElement addReviewBox;
    @FindBy(css = "button#button-review")
    public WebElement submitButtonAddReview;
    @FindBy(xpath = "//*[.='Thank you for your review.']")
    public WebElement thankYouReviewText;
}
