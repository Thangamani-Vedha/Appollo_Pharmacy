package in.Apollo.Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import in.Apollo.base.Utility;

public class Hooks extends Utility {
@Before
public void browserFunctionalities(Scenario scenario) {
	browser_launch();
	TakesScreenshot ts = (TakesScreenshot)driver;
	final byte[] image = ts.getScreenshotAs(OutputType.BYTES);
	scenario.embed(image, "image/png");
	
}
@After
public void tearDown(Scenario scenario1){
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	final byte[] image = ts.getScreenshotAs(OutputType.BYTES);
	scenario1.embed(image, "image/png");
	driver.quit();
	
}

}
