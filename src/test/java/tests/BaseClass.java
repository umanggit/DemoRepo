package tests;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ExtentReportDemo {
	
	 AppiumDriver<MobileElement> driver=null;
	 
//	 AndroidDriver<MobileElement> driver=null;
	 

	
	@BeforeTest
	public void setup() {
		
		try {	
		
		DesiredCapabilities caps = new DesiredCapabilities();
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("w3c", false);

		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "oneplusone");

		caps.setCapability(MobileCapabilityType.UDID, "100.91.5.245:5555");
//		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		caps.setCapability(MobileCapabilityType.UDID, "21a42f38");

		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		caps.setCapability("chromedriverExecutable","C:\\Users\\Pooja Bajaj\\Desktop\\chromedriver_win32\\chromedriver.exe");

		URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, caps);
//		driver = new AndroidDriver<MobileElement>(url, caps);

		
			}catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
		
	}
}
	@Test
	public void sampletest() {
		
		System.out.println("I m inside sample test");
	}
	
		
	
	@AfterTest
	public void teardown() {
		
		driver.close();
		driver.quit();
		
		
	}
}
