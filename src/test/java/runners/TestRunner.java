package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = "src/test/resources/feature",
		glue = {"stepDefinitions"},
		plugin = {"pretty",
				"html:cucumber-report/report.html",
				"json:cucumber-report/report.json"},
		monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
