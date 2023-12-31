package test_runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/login.feature",
        glue = "stepdefinitions",
        dryRun = false,
        publish = false,
        plugin = {
                "pretty",
                "html:reports/cucumber-report.html",
                "rerun:failed_scenarios.txt"
        },
        snippets = CucumberOptions.SnippetType.UNDERSCORE
//        tags = "@login"
//        tags = "not @negative"
//        tags = "@negative and @ganesh"
//        tags = "@positive or @negative"
//        tags = "@login and not @ganesh"


)
public class TestRunner {
}
