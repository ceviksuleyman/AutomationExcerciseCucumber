package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class T23_VerifyAddressDetailsInCheckoutPage {

    AutoExercisePage page = new AutoExercisePage();
    List<String> registrationAddress = new ArrayList<>(Arrays.asList(Hooks.gender + " " + Hooks.firstname + " " + Hooks.lastname,
            Hooks.company,
            Hooks.address1,
            Hooks.address2,
            Hooks.city + " " + Hooks.state + " " + Hooks.zipcode,
            Hooks.country,
            Hooks.phoneNumber));

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {


        System.out.println("******* Registration Address *******");
        for (String w : registrationAddress) {

            System.out.println(w);
        }

        System.out.println("********* Delivery Address *********");
        for (int i = 1; i <= page.deliveryAddress.size() - 1; i++) {

            System.out.println(page.deliveryAddress.get(i).getText());
            assertEquals(registrationAddress.get(i - 1), page.deliveryAddress.get(i).getText());
        }
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {

        System.out.println("********* Billing Address **********");
        for (int i = 1; i <= page.billingAddress.size() - 1; i++) {

            System.out.println(page.billingAddress.get(i).getText());
            assertEquals(registrationAddress.get(i - 1), page.billingAddress.get(i).getText());
        }
    }
}
