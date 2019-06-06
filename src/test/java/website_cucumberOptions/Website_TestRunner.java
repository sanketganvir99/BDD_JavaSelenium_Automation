package website_cucumberOptions;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/website_features"
		,glue = "website_stepDefinitions"
//		,tags = "@SmokeTest,@RegTest,@iOSTest,@AndroidTest,@WebTest"
		,monochrome=true
		,strict=true
		,plugin = {"pretty","html:target/cucumberReports","json:target/cucumberReports.json","junit:target/cukes.xml","com.cucumber.listener.ExtentCucumberFormatter"}
		)
public class Website_TestRunner {


	@BeforeClass
	public static void setup() {
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		
		ExtentCucumberFormatter.loadConfig(new File("src/test/java/website_extent-config.xml"));
		ExtentCucumberFormatter.addSystemInfo("Browser Name","Firefox");
		ExtentCucumberFormatter.addSystemInfo("Browser version","v31.0");
		ExtentCucumberFormatter.addSystemInfo("Selenium version","v2.53.1");

	}
					
	
}
	
