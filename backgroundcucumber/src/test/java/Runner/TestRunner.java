package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature",
        glue = {"Stepdefinitions"},
        plugin = {"pretty", "html:target\\cucumber\\report.html"},
        tags =("@checkout and @TN"))
public class TestRunner {

}
