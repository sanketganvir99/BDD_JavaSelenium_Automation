package android_cucumberOptions;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/android_features"
		,glue = "android_stepDefinitions"
//		,tags = "@AndroidTest"
		,monochrome=true
		,strict=true
		,plugin = {"pretty","html:target/cucumberReports","json:target/cucumberReports.json","junit:target/cukes.xml","com.cucumber.listener.ExtentCucumberFormatter"}
		)


public class android_TestRunner {
	
	@BeforeClass
	public static void setup() {
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		
		ExtentCucumberFormatter.loadConfig(new File("src/test/java/android_extent-config.xml"));
		ExtentCucumberFormatter.addSystemInfo("Platform Name","Android");
		ExtentCucumberFormatter.addSystemInfo("Platform version","7.1.2");
		ExtentCucumberFormatter.addSystemInfo("Selenium version","v3.3.1");

	}
	

}
