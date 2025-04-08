package in.Apollo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features  = ".\\src\\test\\resources\\feature",
				glue = {"in.Apollo"},
				monochrome = true,
				dryRun = false,
				strict = true,
				plugin = {"html:target/cucumber/report.html","json:target/cucumber/report.json"})
						
public class TestRunner {

}
