package in.Apollo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features  = ".\\src\\test\\resources\\feature",
				glue = {"in.Apollo"},
				monochrome = true,
				dryRun = false,
				plugin = {"html:target","json:target/report.json"},
				strict = true
						)
public class TestRunner {

}
