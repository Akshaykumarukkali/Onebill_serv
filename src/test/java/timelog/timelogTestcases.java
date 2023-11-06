package timelog;

import java.awt.List;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Requestertickets.requestermethods;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

public class timelogTestcases {
	static DesiredCapabilities dc;
	static URL url;

	static AndroidDriver driver;
	/*
	 * static DesiredCapabilities dc; static URL url; static AndroidDriver driver;
	 */
	static String username = "Tyss";
	static String password = "Onebilltest1";
	static String newtktbtn = "//android.view.ViewGroup[@content-desc=\"New Ticket\"]";
	static String templatename = "templatename4";

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void startapp() throws InterruptedException, MalformedURLException {
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

		/*dc.setCapability("deviceName", "Lenovo Tab P11 Pro");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11.0");
		dc.setCapability("appPackage", "com.service_desk.onebill");
		dc.setCapability("appActivity", ".MainActivity");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("autoGrantPermissions", true);*/

		url = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(url, dc);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		
	}
	
	@Test
	public static void timelog_001() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.elementCheck(methods.timeLogCard, "Timelog page" );
	}

	@Test
	public static void timelog_002() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		//methods.gettext(methods.timeLogtime);
		methods.elementCheck(methods.timeLogtime, "Timelog " );
	}

	@Test
	public static void timelog_003() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		methods.elementCheck(methods.timeLogTicketnumber, "Timelog Ticketnumber " );
	}

	@Test
	public static void timelog_004() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		methods.elementCheck(methods.timeLogAccountnumber, "Timelog Account number " );
	}

	@Test
	public static void timelog_005() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		//methods.elementCheck(methods.task, "Timelog Timeline " );
	}
	
	@Test
	public static void timelog_006() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		methods.elementCheck(methods.timeLogTaskowner, "Timelog Task Owner " );
	}
	
	@Test
	public static void timelog_007() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		methods.elementCheck(methods.timeLogTimeinminutes, "Timelog Timeline " );
	}

	@Test
	public static void timelog_008() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		methods.elementCheck(methods.timelogbillable, "Timelog Billable  " );
	}
	
	@Test
	public static void timelog_009() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		methods.elementCheck(methods.timeLogTaskowner, "Timelog Taskowner " );
	}
	
	@Test
	public static void timelog_010() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		
		methods.elementCheck(methods.timelogbillable, "Timelog Timeline " );
	}
	
	@Test
	public static void timelog_011() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		
	}

	@Test
	public static void timelog_012() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.elementCheck(methods. timelogperiodDropdown, "period Dropdown " );
	}
	
	@Test
	public static void timelog_013() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionAll, "All Timelog " );
	}

	@Test
	public static void timelog_014() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionToday, "today Option " );
	}
	
	@Test
	public static void timelog_015() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionyesterday, "period Dropdown Option yesterday" );
	}
	
	@Test
	public static void timelog_016() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThisweek, "This week " );
	}
	
	@Test
	public static void timelog_017() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThismonth, "This Month " );
	}
	
	@Test
	public static void timelog_018() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThisquartar, "This Quarter " );
	}
	
	@Test
	public static void timelog_019() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
	    methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThisyear, "This Year " );
	}
	
	@Test
	public static void timelog_020() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastweek, "Last week " );
	}
	
	@Test
	public static void timelog_021() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastmonth, "Last month " );
	}
	
	@Test
	public static void timelog_022() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastquarter, "Last Quarter " );
	}
	
	@Test
	public static void timelog_023() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastyear, "last Year " );
	}
	
	@Test
	public static void timelog_024() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptioncustom, "Custom " );
	}
	
	@Test
	public static void timelog_025() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.elementCheck(methods.SelectDropdown, "Select dropdown " );
	}
	
	@Test
	public static void timelog_026() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.SelectDropdownclick();
		methods.elementCheck(methods.SelectDropdownOptionbillable, "Billable option " );
	}
	
	@Test
	public static void timelog_027() throws MalformedURLException, InterruptedException {
  
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.SelectDropdownclick();
		methods.elementCheck(methods.SelectDropdownOptionnonbillable, "Select dropdown " );
	}
	
@AfterMethod
public void Logout() throws InterruptedException, MalformedURLException {
	Logout a = new Logout(driver, dc, url);
	a.Logoutapp();
}
}
