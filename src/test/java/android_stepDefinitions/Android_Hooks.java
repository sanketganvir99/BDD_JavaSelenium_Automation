package android_stepDefinitions;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Android_Hooks {

//	private static AndroidDriver Android_Driver;
////	AndroidDriver<AndroidElement> Android_Driver;
//
//	@Before("@AndroidTest")
//	public String before_Android_Scenarios() throws Throwable {
//
//		File app = new File(".\\Apps\\SalonCentric-debug-2.7.apk");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
//		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2");
//		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.saloncentric.app");
////		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.yml.loreal.features.tutorial.activities.TutorialActivity");
//		
////		capabilities.setCapability("appActivity", "com.yml.loreal.features.tutorial.activities.TutorialActivity");
////		capabilities.setCapability("appPackage", "com.saloncentric.app");
////		capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
////		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");		
//		capabilities.setCapability(MobileCapabilityType.FULL_RESET, "true");
//		
//		
////		com.saloncentric.app:id/tv_skip
////		/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]
//
//
//		
//		
//		Android_Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		
//
//		Android_Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
////		Android_Driver.findElement(By.id("tv_skip")).click();
//		
//		
//		Thread.sleep(10000);
//		return "pass";
//
//	}
//	
//	 public AndroidDriver<AndroidElement> AndroidgetDriver()
//     {
//        return Android_Driver;
//     }

//	@After("@AndroidTest")
//	public void after_Android_Scenarios() {
//
//		driver.quit();
//
//	}

}
