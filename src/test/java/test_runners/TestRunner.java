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
                "html:reports/cucumber-report.html"
        },
        snippets = CucumberOptions.SnippetType.UNDERSCORE

)
public class TestRunner {
}
