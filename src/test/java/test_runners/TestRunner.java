package test_runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/login.feature",
        glue = "stepdefinitions",
        dryRun = true,
        publish = false,
        plugin = {
                "pretty",
                "html:reports/cucumber-report.html"
        },
        snippets = CucumberOptions.SnippetType.UNDERSCORE,
//        tags = "@login"
//        tags = "not @negative"
//        tags = "@negative and @ganesh"
//        tags = "@positive or @negative"
        tags = "@login and not @ganesh"


)
public class TestRunner {
}
