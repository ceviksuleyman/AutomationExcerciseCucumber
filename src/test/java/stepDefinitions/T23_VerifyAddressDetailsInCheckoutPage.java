package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/test/resources/TestData/DeliveryAddress.txt", false));

        System.out.println("******* Registration Address *******");
        writer.append("******* Registration Address *******\n");
        for (String w : registrationAddress) {

            writer.append(w).append("\n");
            System.out.println(w);
        }

        System.out.println("********* Delivery Address *********");
        writer.append("******* Delivery Address *******\n");
        for (int i = 1; i <= page.deliveryAddress.size() - 1; i++) {

            writer.append(page.deliveryAddress.get(i).getText()).append("\n");

            System.out.println(page.deliveryAddress.get(i).getText());
            assertEquals(registrationAddress.get(i - 1), page.deliveryAddress.get(i).getText());
        }
        writer.close();
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/test/resources/TestData/BillingAddress.txt", false));

        System.out.println("******* Registration Address *******");
        writer.append("******* Registration Address *******\n");
        for (String w : registrationAddress) {

            writer.append(w).append("\n");
            System.out.println(w);
        }

        System.out.println("********* Billing Address **********");
        writer.append("******* Billing Address *******\n");
        for (int i = 1; i <= page.billingAddress.size() - 1; i++) {

            writer.append(page.billingAddress.get(i).getText()).append("\n");

            System.out.println(page.billingAddress.get(i).getText());
            assertEquals(registrationAddress.get(i - 1), page.billingAddress.get(i).getText());
        }
        writer.close();
    }
}
