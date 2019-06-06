package website_stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;

@RunWith(Cucumber.class)
public class Website_Steps {

	public static WebDriver driver;

	@Given("^I am launching the chrome browser$")
	public void i_am_launching_the_chrome_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanke\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser Launched");

	}

	@Then("^I am loading the website$")
	public void i_am_loading_the_website() throws Throwable {

		driver.get("https://staging.tekagogo.com/");
		System.out.println("Tekagogo Website Loaded");

	}

	@Then("^I wait for page to load$")
	public void i_wait_for_page_to_load() throws Throwable {

		Thread.sleep(5000);
		System.out.println("Wait Applied");

	}

	@Then("^I click on identifier \"([^\"]*)\"$")
	public void i_click_on_identifier(String arg1) throws Throwable {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(arg1)).click();
		System.out.println("I clicked on Identifier");

	}

	@Then("^I clear the text in the identifier \"([^\"]*)\"$")
	public void i_clear_the_text_in_the_identifier(String arg1) throws Throwable {

		driver.findElement(By.id(arg1)).clear();
		System.out.println("I Cleared the Text in the Identifier");

	}

	@Then("^I click on identifier with xpath \"([^\"]*)\"$")
	public void i_click_on_identifier_with_xpath(String arg1) throws Throwable {

		driver.findElement(By.xpath(arg1)).click();
		System.out.println("I clicked on Identifier with Xpath");

	}

	@Then("^I enter \"([^\"]*)\" in identifier \"([^\"]*)\"$")
	public void i_enter_in_identifier(String arg1, String arg2) throws Throwable {

		driver.findElement(By.id(arg2)).sendKeys(arg1);
		System.out.println("I Entered Data in Identifier");

	}

	@Then("^I assert for the element \"([^\"]*)\"$")
	public void i_assert_for_the_element(String arg1) throws Throwable {

		driver.findElement(By.id(arg1)).isDisplayed();
		System.out.println("I Asserted for the Element");

	}

	@Then("^I assert for the element with xpath \"([^\"]*)\"$")
	public void i_assert_for_the_element_with_xpath(String arg1) throws Throwable {

		driver.findElement(By.xpath(arg1)).isDisplayed();
		System.out.println("I Asserted for the Element with Xpath");

	}

	@Then("^I mouseover on the element with xpath \"([^\"]*)\"$")
	public void i_mouseover_on_the_element_something(String strArg1) throws Throwable {

		WebElement menu = driver.findElement(By.xpath(strArg1));
		new Actions(driver).moveToElement(menu).perform();

	}

	@Then("^I assert for text \"([^\"]*)\" in identifier with xpath \"([^\"]*)\"$")
	public void i_assert_for_text_something_in_identifier_with_xpath_something(String strArg1, String strArg2)
			throws Throwable {

		String text1 = strArg1;
		String text2 = driver.findElement(By.xpath(strArg2)).getText();
		Assert.assertEquals(text1, text2);

	}

	@Then("^I click on device back button$")
	public void I_click_on_device_back_button() throws Throwable {

		driver.navigate().back();

	}
	
	
	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	    }
	}
	
	
//	}

	// @Then("^I hide the device keypad$")
	// public void I_Hide_the_Device_Keypad() throws Throwable
	// {
	// Thread.sleep(20000);
	// driver.hideKeyboard();
	// }

}
