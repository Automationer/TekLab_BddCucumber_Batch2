package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty:output", "html:target/cucumber", "json:target/cucumber.json"
        , "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extentReports/report.html"},
        features = {"/Users/yilizatiabudusaimaiti/IdeaProjects/TekLabAutomation/TheGreatCourses/src/test/resources/features"},
        glue = {"stepDefinitions"},
        tags = "@SignIn_Feature", dryRun = false)

public class CukesRunnerTest {

}
