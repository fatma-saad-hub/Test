package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/HooksDemo/hooks.feature",glue={"StepDefinitions"},
        monochrome = true, plugin = {"pretty" ,"html:target/cucumber",
        "json:target/JSONReports/reports.json",
        "html:target/HTMLReports/report"})
public class TestRunneForHooks {
}
