package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = "src//test//resources//Features//",
		glue = {"StepDefinitions"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/reports/HTMLReport.html"
				}
		)
public class ShoppingDemoRunner extends AbstractTestNGCucumberTests{

}
