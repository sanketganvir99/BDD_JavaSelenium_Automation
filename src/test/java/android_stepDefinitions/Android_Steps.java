package android_stepDefinitions;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Android_Steps {

	private static AndroidDriver Android_Driver;
	// AndroidDriver<AndroidElement> Android_Driver;

	@Given("^I launch the Android app$")
	public void i_launch_the_android_app() throws Throwable {

		File app = new File(".\\Apps\\SalonCentric-debug-2.7.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2");
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.saloncentric.app");
		// capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		// "com.yml.loreal.features.tutorial.activities.TutorialActivity");

		Android_Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Android_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(10000);

	}

	@Then("^I tap on identifier \"([^\"]*)\"$")
	public void i_tap_on_identifier(String arg1) throws Throwable {

		Android_Driver.findElement(By.id(arg1)).click();
	}

	@Then("^I clear the text in the identifier \"([^\"]*)\"$")
	public void i_clear_the_text_in_the_identifier(String arg1) throws Throwable {

		Android_Driver.findElement(By.id(arg1)).clear();

	}

	@Then("^I enter \"([^\"]*)\" in identifier \"([^\"]*)\"$")
	public void i_enter_something_in_identifier(String arg1, String arg2) throws Throwable {

		Android_Driver.findElement(By.id(arg2)).sendKeys(arg1);

	}

	@Then("^I wait for page to load on android$")
	public void i_wait_for_page_to_load() throws Throwable {

		Thread.sleep(5000);
		System.out.println("Wait Applied");

	}

	@Then("^I minimize the application on android$")
	public void i_minimize_the_app() throws Throwable {
		// ((AndroidDriver)driver).closeApp();
		Android_Driver.runAppInBackground(Duration.ofSeconds(20));// put app in
																	// background
																	// for 10
																	// seconds
		// ((AndroidDriver)driver).launchApp();
		// ((StartsActivity)driver).currentActivity();
		System.out.println("App closed successfully");
	}

	@Then("^I assert for the text \\\"([^\\\"]*)\\\" in identifier \"([^\"]*)\"$")
	public void I_assert_for_the_text(String arg1, String arg2) {
		System.out.println("Going to validate Texts contents");
		String text1 = Android_Driver.findElementById(arg2).getText();
		String text2 = arg1;
		Assert.assertEquals(text1, text2);
		System.out.println("Text is matched");
	}

	// @Given("^I launch the Android app$")
	// public void I_launch_the_Android_app() throws Throwable{
	//
	// File app = new
	// File("C:\\Users\\sanke\\workspace\\BDD_JavaSelenium_Automation\\Apps\\SalonCentric-debug-2.7.apk");
	// DesiredCapabilities capabilities = new DesiredCapabilities();
	//
	// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	// capabilities.setCapability(MobileCapabilityType.APP,
	// app.getAbsolutePath());
	//
	// driver = new AndroidDriver(new
	// URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	//
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//
	// Thread.sleep(10000);
	//
	// driver.quit();
	//
	//
	//
	// }

	// public static void main(String[] args) throws MalformedURLException{
	//
	// DesiredCapabilities capabilities = new DesiredCapabilities();
	//
	// capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
	//
	//
	// driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
	// capabilities);
	//
	// driver.get("http://google.com");
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//
	// driver.findElement(By.name("q")).sendKeys("Hello Appium");
	// driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/button[2]")).click();
	// driver.quit();

}
