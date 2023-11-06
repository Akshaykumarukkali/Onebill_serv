package timelog;

import java.awt.List;
import java.net.URL;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("deprecation")
public class timeLogrmethods {
	DesiredCapabilities dc;
	URL url;

	static AndroidDriver driver;

	/*
	 * public requestermethods(AndroidDriver driver, DesiredCapabilities dc, URL
	 * url) { this.driver = driver; this.dc = dc; this.url = url; }
	 */

	@SuppressWarnings("static-access")
	public timeLogrmethods(AndroidDriver driver, DesiredCapabilities dc, URL url) {
		this.driver = driver;
		this.dc = dc;
		this.url = url;
	}

	By username1 = By.xpath("//android.widget.EditText[@text='Username']");
	By password1 = By.xpath("//android.widget.EditText[@text='Password']");
	By Signin = By.xpath("//android.widget.TextView[@text='Sign In']");

	

	//Timeloglocators
	
	By timeLogTab =  By.xpath("(//android.view.ViewGroup[@content-desc=\"\"])[7]");
	
	By exportButton =  By.xpath("//android.view.ViewGroup[@content-desc=', Export']/android.view.ViewGroup[2]/android.widget.TextView[1]");
	
	By timeLogCard=  By.xpath("(//android.view.ViewGroup)[50]");
	
	By timeLogtime=  By.xpath("(//android.widget.TextView)[19]");
	
	By timeLogTicketnumber=  By.xpath("(//android.widget.TextView)[14]");
	
	By timeLogAccountnumber=  By.xpath("(//android.widget.TextView)[15]");
	
	By timeLogTaskowner=  By.xpath("(//android.widget.TextView)[16]");
	
	By timeLogTimeinminutes=  By.xpath("(//android.widget.TextView)[17]");
	
	By timeLogtasktype=  By.xpath("(//android.widget.TextView)[16]");
	
	By timelogbillable=  By.xpath("(//android.view.ViewGroup)[52]");
	
	By timelogperiodDropdown=  By.xpath("//android.view.ViewGroup[@content-desc='All, ']/android.widget.TextView[2]");
	
	By periodDropdownOptionAll=  By.xpath("//android.view.ViewGroup[@content-desc='All']/android.widget.TextView");
	
	By periodDropdownOptionToday=  By.xpath("//android.view.ViewGroup[@content-desc='Today']/android.widget.TextView");
	
	By periodDropdownOptionyesterday=  By.xpath("//android.view.ViewGroup[@content-desc='Yesterday']/android.widget.TextView");
	
	By periodDropdownOptionThisweek=  By.xpath("//android.view.ViewGroup[@content-desc='This week']/android.widget.TextView");
	
	By periodDropdownOptionThismonth=  By.xpath("//android.view.ViewGroup[@content-desc='This month]");
	
	By periodDropdownOptionThisquartar=  By.xpath("//android.view.ViewGroup[@content-desc='This quarter']");
	
	By periodDropdownOptionThisyear=  By.xpath("//android.view.ViewGroup[@content-desc='This year']/android.widget.TextView");
	
	By periodDropdownOptionLastweek=  By.xpath("//android.view.ViewGroup[@content-desc='Last week']/android.widget.TextView");
	
	By periodDropdownOptionLastmonth=  By.xpath("//android.view.ViewGroup[@content-desc='Last month']/android.widget.TextView");
	
	By periodDropdownOptionLastquarter=  By.xpath("//android.view.ViewGroup[@content-desc='Last quarter']/android.widget.TextView");
	
	By periodDropdownOptionLastyear=  By.xpath("//android.view.ViewGroup[@content-desc='Last year']");
	
	By periodDropdownOptioncustom=  By.xpath("//android.view.ViewGroup[@content-desc='Custom']");
	
	By SelectDropdown=  By.xpath("//android.view.ViewGroup[@content-desc='Select, ']/android.widget.TextView[2]");
	
	By SelectDropdownOptionselect=  By.xpath("//android.view.ViewGroup[@content-desc='Select, ']");
	
	By SelectDropdownOptionbillable=  By.xpath("//android.view.ViewGroup[@content-desc='Billable']/android.widget.TextView");
	
	By SelectDropdownOptionnonbillable=  By.xpath("//android.view.ViewGroup[@content-desc='Non - Billable']/android.widget.TextView");
	
	public void username_password(String username, String password) throws InterruptedException {

		driver.findElement(username1).sendKeys(username);
		driver.findElement(password1).sendKeys(password);
		driver.findElement(Signin).click();

	}

	public void timelogTab() {
		driver.findElement(timeLogTab).click();
	}
	
	public void exportButtonclick() {
		driver.findElement(exportButton).click();
	}
	
	public void  timelogperiodDropdownclick() {
		driver.findElement(timelogperiodDropdown).click();
	}
	
	public void  SelectDropdownclick() {
		driver.findElement(SelectDropdown).click();
	}
	
	public void gettext(By locator) {
		String textback=driver.findElement(locator).getText();
		System.out.println(textback);
	}


	

	public static void verifyDropdownOptions(RemoteWebDriver driver, String dropdownId, List optionIds,
			int Option_Count) {
		RemoteWebElement dropdown = (RemoteWebElement) driver.findElement(By.id(dropdownId));

		dropdown.click();

		int j = Option_Count;
		for (int i = 0; i < j; i++) {
			String optionId = optionIds.getItem(i);
			WebElement option = driver.findElement(By.id(optionId));

			// Check if the option is displayed
			if (option.isDisplayed()) {
				System.out.println("Option '" + optionId + "' is visible and verified.");
			} else {
				System.out.println("Option '" + optionId + "' verification failed.");
			}
		}
	}

	public void elementCheck(By ele, String name) {
		try {

			driver.findElements(ele);

			System.out.println(name + " Element is present on the page.");
		} catch (NoSuchElementException e) {
			// If the element is not found, NoSuchElementException is thrown
			System.out.println(name + " Element is not present on the page.");
		}

	}

	public static void xycordinates(int x, int y) {

		// Create a TouchAction to press and release at the specified coordinates
		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(x, y)).release().perform();
	}

	@SuppressWarnings({ "rawtypes" })
	public void scrollDown() throws Throwable {
		Thread.sleep(5000);
		@SuppressWarnings("unused")
		int scrollDistance = 2; // Adjust this value to control the scroll distance

		// Get the dimensions of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();

		// Calculate scroll start and end coordinates
		int startX = driver.manage().window().getSize().getWidth() / 2;
		int startY = (int) (screenHeight * 0.7); // Start scroll from 70% down the screen
		int endY = (int) (screenHeight * 0.2); // End scroll at 20% down the screen

		// Create a TouchAction instance and perform the scroll gesture
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
				.moveTo(PointOption.point(startX, endY)).release().perform();
	}

	@SuppressWarnings({ "rawtypes" })
	public void scrollDownengineerdropdown() {
		@SuppressWarnings("unused")
		int scrollDistance = 2; // Adjust this value to control the scroll distance

		// Get the dimensions of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();

		// Calculate scroll start and end coordinates
		int startX = driver.manage().window().getSize().getWidth() / 2;
		int startY = (int) (screenHeight * 0.6); // Start scroll from 60% down the screen
		int endY = (int) (screenHeight * 0.2); // End scroll at 20% down the screen

		// Create a TouchAction instance and perform the scroll gesture
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
				.moveTo(PointOption.point(startX, endY)).release().perform();
	}

	@SuppressWarnings({ "rawtypes" })
	public void scrollforselecttemplate() {
		@SuppressWarnings("unused")
		int scrollDistance = 2; // Adjust this value to control the scroll distance
		for (scrollDistance = 1; scrollDistance < 3; scrollDistance++) {
			// Get the dimensions of the screen
			int screenHeight = driver.manage().window().getSize().getHeight();

			// Calculate scroll start and end coordinates
			int startX = driver.manage().window().getSize().getWidth() / 2;
			int startY = (int) (screenHeight * 0.4); // Start scroll from 40% down the screen
			int endY = (int) (screenHeight * 0.2); // End scroll at 20% down the screen

			// Create a TouchAction instance and perform the scroll gesture
			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
					.moveTo(PointOption.point(startX, endY)).release().perform();
		}
	}

	

	

	

	
	


	public void AssosiateaddonIcon_close() {
		By AssosiateaddonIcon_close = By.xpath("//android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup[2]/android.widget.TextView");
		driver.findElement(AssosiateaddonIcon_close).click();
	}
}