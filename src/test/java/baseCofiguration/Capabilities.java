package baseCofiguration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	
	protected static DesiredCapabilities dc;
	protected static URL url;

	protected static AndroidDriver driver;
	/*
	 * static DesiredCapabilities dc; static URL url; static AndroidDriver driver;
	 */
	protected static String username = "Tyss";
	protected static String password = "Onebilltest1";
	protected static String newtktbtn = "//android.view.ViewGroup[@content-desc=\"New Ticket\"]";
	protected static String templatename = "templatename4";

	
	
	@SuppressWarnings("deprecation")
	public void Emulatorcapabilities() throws InterruptedException, MalformedURLException {
		Thread.sleep(5000);
		dc = new DesiredCapabilities();

		dc.setCapability("deviceName", "sdk_gphone64_x86_64");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "13.0");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("appPackage", "com.service_desk.onebill");
		dc.setCapability("appActivity", ".MainActivity");
		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability(MobileCapabilityType.NO_RESET, true);

		dc.setCapability("deviceName", "Lenovo Tab P11 Pro");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11.0");
		dc.setCapability("appPackage", "com.service_desk.onebill");
		dc.setCapability("appActivity", ".MainActivity");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("autoGrantPermissions", true);

		url = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(url, dc);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		
	}
}


