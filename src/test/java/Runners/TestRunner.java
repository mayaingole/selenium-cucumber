package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"stepDefinitions", "hooks"},
	    plugin = {
	        "pretty",
	        "json:target/cucumber.json",               // ✅ this generates valid report
	        "html:target/cucumber-html-report.html"    // (optional) HTML report
	    },
	    monochrome = true
	)

public class TestRunner {}
