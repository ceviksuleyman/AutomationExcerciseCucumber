package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports2.html",
                "json:target/json-reports2/cucumber.json",
                "junit:target/xml-reports2/cucumber.xml"},
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        tags = "@Test25",
        dryRun = false
)
public class TestRunner2 {

}
