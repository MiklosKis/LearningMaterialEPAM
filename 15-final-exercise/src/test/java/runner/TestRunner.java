package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {"src/test/resources/feature"},
        glue = {"stepdefintion",
                "com.testautomation.finalproject.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class TestRunner {
}