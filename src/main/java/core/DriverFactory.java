package core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {
	
	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> getDriver() {
		if(driver==null) {
			createDriver();
		}
		return driver;
	}
	
	public static void createDriver(){
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		 desiredCapabilities.setCapability("platformName", "Android");
		 desiredCapabilities.setCapability("deviceName", "emulator-5554");
		 desiredCapabilities.setCapability("appPackage", "com.ctappium");
		 desiredCapabilities.setCapability("appActivity", "com.ctappium.MainActivity");
		 
		 try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace(); }
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
