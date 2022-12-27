package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AutoExercisePage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class T24_DownloadInvoiceAfterPurchaseOrder {

    AutoExercisePage page = new AutoExercisePage();

    @And("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void clickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() throws IOException {

        jsScrollClick(page.downloadInvoice);
        waitFor(5);


        String filePath = "C:\\Users\\cevik\\Downloads\\invoice.txt";
        assertTrue(Files.exists(Paths.get(filePath)));


        Path filePaths = Path.of("C:\\Users\\cevik\\Downloads\\invoice.txt");
        String invoice = Files.readString(Path.of(filePaths.toString()));
        System.out.println("invoice \n" + invoice);
    }

    @Then("Click to Continue button")
    public void clickToContinueButton() {

        jsScrollClick(page.continueButton);
    }
}
