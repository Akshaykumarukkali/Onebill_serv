package tasks;

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
public class tasksmethod {
	DesiredCapabilities dc;
	URL url;

	static AndroidDriver driver;

	/*
	 * public requestermethods(AndroidDriver driver, DesiredCapabilities dc, URL
	 * url) { this.driver = driver; this.dc = dc; this.url = url; }
	 */

	@SuppressWarnings("static-access")
	public tasksmethod(AndroidDriver driver, DesiredCapabilities dc, URL url) {
		this.driver = driver;
		this.dc = dc;
		this.url = url;
	}

	By username1 = By.xpath("//android.widget.EditText[@text='Username']");
	By password1 = By.xpath("//android.widget.EditText[@text='Password']");
	By Signin = By.xpath("//android.widget.TextView[@text='Sign In']");

	By tasksTab = By.xpath("(//android.view.ViewGroup[@content-desc=''])[9]");
	
	By taskspage = By.xpath("//android.view.ViewGroup[@content-desc='Create New Task']");
	
	By  createtask= By.xpath("//android.view.ViewGroup[@content-desc=', Create Task']/android.view.ViewGroup[2]/android.widget.TextView[2]");
	
	By  tasknameField= By.xpath("(//android.widget.EditText)[1]");
	
	By duedateIcon=By.xpath("//android.view.ViewGroup[@content-desc='󰸘']/android.widget.TextView");
	
	By  duedateCalender= By.xpath("//android.view.ViewGroup[@content-desc='󰸘']");
	
	By dateselect= By.xpath("//android.view.View[@content-desc='26 November 2023']");
	
	By  CalenderCancel=By.id("android:id/button2");
	
	By  Calenderok=By.id("android:id/button1");
	
	By  timepicker= By.xpath("//android.view.ViewGroup[@content-desc='󱑍']/android.widget.TextView");
	
	By  timepickerpopup= By.id("android:id/timePicker");
	
	By  timepickertime= By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='2']");
	
	By  timepickerok= By.id("android:id/button1");
	
	By  timepickercancel= By.id("android:id/button2");
	
	By  statusdropdown= By.xpath("//android.view.ViewGroup[@content-desc='Status, ']");
	
	By  prioritydropdown= By.xpath("//android.view.ViewGroup[@content-desc='Priority, ']");
	
	By  ticketdropdown= By.xpath("//android.view.ViewGroup[@content-desc='Ticket, ']");
	
	By  searchticketfield= By.xpath( "//android.view.ViewGroup[@content-desc='Create New Task']/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup");
	
	By  radioself= By.xpath("//android.view.ViewGroup[@content-desc='Create New Task']/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]");
	
	By  radioOther= By.xpath("//android.view.ViewGroup[@content-desc='Create New Task']/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]");
	
	By  DescriptionField= By.xpath("//android.view.ViewGroup[@content-desc='Create New Task']/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]");
	
	By  closebutton= By.xpath("//android.view.ViewGroup[@content-desc='Close']");
	
	By  submitbutton= By.xpath("//android.view.ViewGroup[@content-desc='Submit']");
	
	By taskpage = By.className("android.widget.ScrollView");
	
	By backIcon =By.xpath("//android.view.ViewGroup[@content-desc='']/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");
	
	By userfield = By.xpath("//android.view.ViewGroup[@content-desc='User, ']");
	
	By taskserachfield=By.className("android.widget.EditText");
		
	By todaydropdown = By.xpath("//android.view.ViewGroup[@content-desc='Today']/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");

	By todaydropdownpopup=By.xpath("(//android.view.ViewGroup)[57]");
	
	By taskpopup=By.xpath("(//android.view.ViewGroup)[49]");
	
	By dotsIcon=By.xpath("(//android.view.ViewGroup[@content-desc=''])[1]");
	
	By Editdeletepopup = By.xpath("(//android.view.ViewGroup)[81]");
	
	By Edittaskoption =By.xpath("//android.widget.TextView[@text='Edit']");
	
	By Deletetaskoption =By.xpath("//android.widget.TextView[@text='Delete']");
	
	By taskFilterIcon =By.xpath("//android.view.ViewGroup[@content-desc='']");
	
	By periodoptionall =By.xpath("(//android.widget.TextView)[36]");
	
	By taskpriorityhighslider =By.xpath("(//android.view.ViewGroup[@content-desc=''])[7]");
	
	By taskprioritymediumslider =By.xpath("(//android.view.ViewGroup[@content-desc=''])[8]");
	
	By taskpriorityNormalslider =By.xpath("(//android.view.ViewGroup[@content-desc=''])[9]");
	
	By taskStatusNotstarted= By.xpath("(//android.view.ViewGroup[@content-desc='󰸞'])[1]/android.view.ViewGroup[2]/android.widget.TextView");
	
	//Timeloglocators
	
	
	
	
	public void username_password(String username, String password) throws InterruptedException {

		driver.findElement(username1).sendKeys(username);
		driver.findElement(password1).sendKeys(password);
		driver.findElement(Signin).click();

	}

	public void taskTabclick() {
		driver.findElement(tasksTab).click();
	}
	
	public void createTaskclick() {
		driver.findElement(createtask).click();
	}
	
	public void duedateIconclick() {
		driver.findElement(duedateIcon).click();
	}
	
	public void dateselectclick() {
		driver.findElement(dateselect).click();
	}
	
	public void timePickerIconClick() {
		driver.findElement(timepicker).click();
	}
	
	public void timePickerokclick() {
		driver.findElement(timepickerok).click();
	}
	
	public void timePickercancelclick() {
		driver.findElement(timepickercancel).click();
	}
	
	public void timepickertimeclick() {
		driver.findElement(timepickertime).click();
	}
	
	public void calenderCancelclick() {
		driver.findElement(CalenderCancel).click();
	}
	
	public void calenderokclick() {
		driver.findElement(Calenderok).click();
	}
	
	public void  tasknameinput(String input ) {
		driver.findElement(tasknameField).sendKeys(input);;
	}
	
	public void radioselfclick() {
		driver.findElement(radioself).click();
	}
	
	public void radioOtherclick() {
		driver.findElement(radioOther).click();
	}
	
	public void  Descriptioninput(String input ) {
		driver.findElement(DescriptionField).sendKeys(input);;
	}
	
	public void closebuttonclick() {
		driver.findElement(closebutton).click();
	}
	
	public void userfieldInput(String input) {
		driver.findElement(userfield).sendKeys(input);;
	}
	
	public void submitbuttonclick() {
		driver.findElement(submitbutton).click();
	}
	
	public void backIconclick() {
		driver.findElement(backIcon).click();
	}
	
	public void  taskserachfieldInput(String input ) {
		driver.findElement(taskserachfield).sendKeys(input);;
	}
	
	public void periodoptionallclick() {
		driver.findElement(periodoptionall).click();
	}
	public void dotsIconclick() {
		driver.findElement(dotsIcon).click();
	}
	
	
	public void Editoptionclick() {
		driver.findElement(dotsIcon).click();
	}
	
	public void Deleteoptionclick() {
		driver.findElement(dotsIcon).click();
	}
	
	public void taskTodayclick() {
		driver.findElement(todaydropdown).click();
	}
	
	public void taskfilterClick() {
		driver.findElement(taskFilterIcon).click();
	}
	
	public void taskpriorityhighsliderclick() {
		driver.findElement(taskpriorityhighslider).click();
	}
	
	public void taskprioritymediumsliderclick() {
		driver.findElement(taskprioritymediumslider).click();
	}
	
	public void taskprioritynormalSliderclick() {
		driver.findElement(taskpriorityNormalslider).click();
	}
	
	public void taskStatusNotstartedclick() {
		driver.findElement(taskStatusNotstarted).click();
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