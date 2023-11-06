package Requestertickets;

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

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

public class requestertktstestcase {
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

		//dc.setCapability("deviceName", "Lenovo Tab P11 Pro");
		//dc.setCapability("automationName", "Appium");
		//dc.setCapability("platformName", "Android");
		//dc.setCapability("platformVersion", "11.0");
		//dc.setCapability("appPackage", "com.service_desk.onebill");
		//dc.setCapability("appActivity", ".MainActivity");
		//dc.setCapability("UDID", "emulator-5554");
		//dc.setCapability("autoGrantPermissions", true);

		url = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(url, dc);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

	}

	@Test
	public static void Requester_001() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.firsttkt();

	}

	@Test
	public static void Requester_002() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.requesterdropdown, "TicketDropdown");

	}

	@Test
	public static void Requester_003() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown();

	}

	@Test
	public static void Requester_004() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown();

	}

	@Test
	public static void Requester_005() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.createticketbtn, "create ticket");
		methods.createticketbtn();

	}

	@Test
	public static void Requester_006() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
	}

	@Test
	public static void Requester_007() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.firsttkt();
		methods.editbtn();
		methods.editpage_Backbutton();

	}

	@Test
	public static void Requester_008() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.selecttemplatesdrpdown, "templatesdropdown");

	}

	@Test
	public static void Requester_009() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.tickettype, "ticketTypedropdown");

	}

	@Test
	public static void Requester_010() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.subject, "SubjectField");
	}

	@Test
	public static void Requester_011() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.description, "DescriptionFiled");
	}

	@Test
	public static void Requester_012() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.description("Testing Description Ak1");
	}

	@Test
	public static void Requester_013() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.description("testdata1");
	}

	@Test
	public static void Requester_014() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.AccountnameField, "AccountnameField");
		methods.elementCheck(methods.CustomerContactnameField, "CustomerContactNameField ");

	}

	@Test
	public static void Requester_015() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.AccountTypeDropdown, "AccountTypeDropdown");

	}

	@Test
	public static void Requester_022() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.CustomerContactnameField, "CustomerContactNameField ");

	}

	@Test
	public static void Requester_024() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.department_Dropdown, "Department name");
	}

	@Test
	public static void Requester_026() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.incidenttype, "IncedentType Dropdown");
	}

	@Ignore
	@Test
	public static void Requester_027() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.incidentsubtype, "IncedentSubType Dropdown");
	}

	@Ignore
	@Test
	public static void Requester_029() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.description, "DescriptionFiled");
	}

	@Test
	public static void Requester_032() throws Throwable {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.scrollDown();
		methods.elementCheck(methods.attachment, "Attachment");
	}

	@Test
	public static void Requester_033() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.create_as_template, "create as template Button ");
	}

	@Test
	public static void Requester_037() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
		methods.elementCheck(methods.create_button_in_createnewtkt, "create_button");

	}

	// TicketsPageTestcases

	@Test
	public static void Requester_039() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.elementCheck(methods.EditIcon, "Ticketspage");
	}

	@Test
	public static void Requester_40() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.ticketstatus, "Ticket Status ");
	}

	@Test
	public static void Requester_041() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.ticketId, "Ticket Id ");
	}

	@Test
	public static void Requester_042() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.ticketId, "Ticket Id ");
	}

	@Test
	public static void Requester_043() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.ticketId, "Ticket Subject ");
	}

	@Test
	public static void Requester_044() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.ticketId, "Ticket Description");
	}

	@Test
	public static void Requester_045() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.CreationDate, "Creation Time ");
	}

	@Test
	public static void Requester_046() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.InternalExternalIcon, "Internal External Icon ");
	}

	@Test
	public static void Requester_047() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.AttachmentIcon, "AttachmentIcon ");
	}

	@Test
	public static void Requester_048() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.TimelogIcon, "TimelogIcon ");
	}

	@Test
	public static void Requester_049() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.elementCheck(methods.EditTicketdetailsIcon, "Edit Details Icon ");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_050() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_051() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_department, "department dropdown");
		methods.editpage_Backbutton();

	}

	@Test
	public static void Requester_052() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_incidenttype, "IncidentType");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_053() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_subincidenttype, "Subincident Type");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_054() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_priority, "Priority");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_055() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_cancelbtn, "Cancel");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_056() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();

		methods.editicon_cancelbtn();
	}

	@Test
	public static void Requester_057() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();
	}

	@Test
	public static void Requester_058() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();

	}

	@Test
	public static void Requester_059() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		methods.elementCheck(methods.editbtn, "Edit Button ");
	}

	@Test
	public static void Requester_060() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		methods.elementCheck(methods.Ticket_commentField, "Comment Field ");
	}

	@Test
	public static void Requester_061() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.Ticket_commentField).sendKeys("Abcd12345566");
	}

	@Test
	public static void Requester_062() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.Ticket_commentField).sendKeys("");
	}

	@Test
	public static void Requester_063() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		methods.elementCheck(methods.updatebtn, "Edit Button ");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_064() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Update Page ");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_065() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Action type Dropdown ");
		methods.elementCheck(methods.updateAction_Dropdown, "Actiontype_Dropdown ");
		methods.elementCheck(methods.updateDescription_Field, "Update Page description");

		methods.update_backbtn();
	}

	@Test
	public static void Requester_066() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();
		// need to write ForActionDropdown Options
		methods.updateAction_Dropdown();
		methods.update_backbtn();

	}

	@Test
	public static void Requester_067() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();
		// need to write ForActionType Dropdown Options
		methods.updateActionType_Dropdown();
		methods.updateCloseButton();

	}

	@Test
	public static void Requester_070() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();
		// methods.updateDescription_Field("Test description");
		methods.updateCloseButton();

	}

	@Test
	public static void Requester_071() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();
		// driver.findElement(methods.updateDescription_Field).sendKeys("");
		// methods.updateDescription_Field("Test description");
		methods.updateCloseButton();

	}

	@Test
	public static void Requester_072() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();
		methods.updateCloseButton();

	}

	@Test
	public static void Requester_073() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();
		driver.findElement(methods.updatebtn).click();
		methods.updateSubmitButton();
		methods.updateCloseButton();
	}

	@Test
	public static void Requester_074() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		methods.elementCheck(methods.editbtn, "Edit Button ");
		methods.editbtn_backbtn();
	}

	@Test
	public static void Requester_075() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_tickettype();
		methods.editbtn_tickettype();
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_076() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subject, "subject");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_077() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_description, "description");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_078() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_079() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_080() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_081() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_cancel, "cancel");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_082() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_submit, "submit");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_083() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_cancel();

	}

	@Test
	public static void Requester_084() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		driver.findElement(methods.editbtn).click();
		methods.editbtn_submit();

	}

///////////////////////////////////////// icon
	@Test
	public static void Requester_085() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		methods.iconbtn();
		methods.iconbtn();

	}

	@Test
	public static void Requester_086() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		methods.iconbtn();

		methods.elementCheck(methods.iconbtn_tags, "Tags icon");

		methods.iconbtn();

	}

	@SuppressWarnings("static-access")
	@Test
	public static void Requester_088() throws MalformedURLException, InterruptedException {

		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		driver.findElement(methods.FristRequseterTicket).click();

		methods.iconbtn();

		methods.iconbtn_tags();

		methods.xycordinates(50, 677);

	}

	@Test
	public static void Requester_089() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_tags();
		methods.newtags("newtag");
		methods.newtags_cancel();
		methods.newtags_cancel();

	}

	@Test
	public static void Requester_090() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_tags();
		driver.findElement(methods.newtags).click();
		methods.newtags_cancel();
		methods.newtags_cancel();

	}

	@Test
	public static void Requester_091() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_tags();
		methods.newtags("new tag by automation");
		methods.newtags_submit();

	}

	@Test
	public static void Requester_092() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_watcher, "Watcher");
		methods.iconbtn_tags();
		methods.newtags("new tag by automation");
		methods.newtags_submit();

	}

	@SuppressWarnings("static-access")
	@Test
	public static void Requester_093() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_watcher();
		methods.xycordinates(20, 677);

	}

	@SuppressWarnings("static-access")
	@Test
	public static void Requester_094() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_watcher();

		methods.elementCheck(methods.watcher_internal, "Internal radio button ");
		methods.elementCheck(methods.watcher_external, "External radio button ");
		methods.xycordinates(20, 677);

	}

	@SuppressWarnings("static-access")
	@Test
	public static void Requester_095() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_watcher();

		driver.findElement(methods.watcher_textfield).click();
		methods.xycordinates(20, 677);
		methods.xycordinates(20, 677);

	}

	@Test
	public static void Requester_096() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_clone, "Clone");
		methods.iconbtn();
	}

	@Test
	public static void Requester_097() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();

	}

	@Test
	public static void Requester_098() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_subject, "Subject field");

	}

	@Test
	public static void Requester_099() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_describtion, "Clone description");

	}

	@Test
	public static void Requester_100() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.clone_describtion("describition value");

	}

	@Test
	public static void Requester_101() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.clone_describtion("");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_102() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_customername, "Customer name");
		methods.elementCheck(methods.clone_accountname, "account name");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_103() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_customercontact, "Customer contact");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_104() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.clone_accountname("");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_106() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_department, "Department");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_107() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_department();
		methods.clone_cancel();
		methods.clone_cancel();

	}

	@Test
	public static void Requester_108() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_incidenttype, "INCIDENTTYPE");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_110() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_incidenttype();
		methods.clone_cancel();

	}

	@Test
	public static void Requester_109() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_incidentsubtype, "SUBINCIDENTTYPE");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_111() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_priority();
		methods.clone_priority();
		Thread.sleep(4000);
		methods.clone_cancel();

	}

	@Test
	public static void Requester_112() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_priority, "Priority");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_113() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_cancel, "cancel");
		methods.clone_cancel();

	}

	@Test
	public static void Requester_114() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();

		methods.scrollDown();
		methods.clone_cancel();

	}

	@Test
	public static void Requester_115() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_submit, "submit");
		methods.clone_submit();

	}

	@Test
	public static void Requester_116() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_submit();
		System.out.println("Successfully cloned");

	}

	@Test
	public static void Requester_117() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_history, "History");
		methods.iconbtn();
	}

	@Test
	public static void Requester_118() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_history();
		methods.history_back();
	}

	@Test
	public static void Requester_119() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_history();
		methods.elementCheck(methods.history_data, "History data as");
		methods.history_back();
	}

	@Test
	public static void Requester_120() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_properties, "properties");
		methods.iconbtn();
	}

	@Test
	public static void Requester_121() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_properties();
		methods.properties_backbtn();
	}

	@Test
	public static void Requester_122() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_properties();
		methods.elementCheck(methods.properties_data, "Formcard");
		methods.properties_backbtn();
	}

	@Test
	public static void Requester_123() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_timelog, "Timelog");
		methods.iconbtn();
	}

	@Test
	public static void Requester_124() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_125() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.elementCheck(methods.timelog_timehistory, "History of the the ticket");
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_126() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.elementCheck(methods.timelog_timeentry, "Timeentry");
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_127() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		Thread.sleep(5000);
		methods.timeentry_backbtn();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_128() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.elementCheck(methods.timeentry_taskowner, "Task Owner field");
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception e) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_129() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_timecompletion, "timecompletion");
		methods.timeentry_backbtn();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_130() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.elementCheck(methods.timeentry_calender, "Calender");
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception e) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_131() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.elementCheck(methods.timeentry_Billable, "Billable");
			methods.elementCheck(methods.timeentry_Nonbillable, "Non billable");
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception e) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_132() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_Hours, "Hours");
		methods.timeentry_backbtn();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_133() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_Hours(50);
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception d) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_134() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_Hours(0);
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception d) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_135() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_Hours(50);
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception d) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public static void Requester_136() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_minutes, "Minutes");
		methods.timeentry_backbtn();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_137() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_minutes(0);
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception e) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_138() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_timelogactiontype, "Time log actions");
		methods.timeentry_backbtn();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_139() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_timelogactiontype();
			methods.timeentry_timelogactiontype();
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception e) {

			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_140() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_description, "description");
		methods.timeentry_backbtn();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_141() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_description("type of data");
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception e) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_142() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_description("");
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		} catch (Exception e) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_143() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_close, "Close");
		methods.elementCheck(methods.timeentry_submit, "Submit");
		methods.timeentry_backbtn();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_144() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		try {
			methods.timeentry_taskowner();

			methods.timeentry_Hours(50);
			methods.timeentry_minutes(50);
			methods.timeentry_timelogactiontype();
			driver.findElement(By
					.xpath("//android.view.ViewGroup[@content-desc=\"Professional Services\"]/android.widget.TextView"))
					.click();
			methods.timeentry_description("description");
			methods.timeentry_submit();
			methods.timelog_backbtn();
		} catch (Exception e) {
			methods.timeentry_backbtn();
			methods.timelog_backbtn();
		}
	}

	@Test
	public static void Requester_145() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_close();
		methods.timelog_backbtn();
	}

	@Test
	public static void Requester_146() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_addon, "Addon");
		methods.iconbtn();

	}

	@Test
	public static void Requester_147() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_addon, "add-on Icon ");
		methods.iconbtn();
	}

	@Test
	public static void Requester_148() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addontemplatedropdown, "addon template dropdown ");

	}

	@Test
	public static void Requester_149() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();

		methods.elementCheck(methods.addontickettypedropdown, "addon Ticket Type dropdown ");

	}

	@Test
	public static void Requester_150() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();

		methods.elementCheck(methods.SubjectField, "Subject Field ");

	}

	@Test
	public static void Requester_151() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();

		methods.elementCheck(methods.addonDescriptionField, "Description Field ");

	}

	@Test
	public static void Requester_152() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		driver.findElement(methods.addonDescriptionField).sendKeys("Descrption 12334");

	}

	@Test
	public static void Requester_153() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		driver.findElement(methods.addonDescriptionField).sendKeys("");

	}

	@Test
	public static void Requester_154() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addonCustomername, "Customer name");
		methods.elementCheck(methods.addonCustomerContact, "Customer Contact");
		methods.elementCheck(methods.addonCustomeraccount, "Customer Account");

	}

	@Test
	public static void Requester_155() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addonCustomerContact, "Customer Contact");
		methods.elementCheck(methods.addonCustomeraccount, "Customer Account");

	}

	@Test
	public static void Requester_156() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addonDepartment, "Department Field ");

	}

	@Test
	public static void Requester_157() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.addonDepartment();
		methods.elementCheck(methods.addonDepartment, "Department dropdown");

	}

	@Test
	public static void Requester_158() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonincedentType, "incedent Type ");

	}

	@Test
	public static void Requester_159() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonincedentsubType, "incedent SubType ");

	}

	@Test
	public static void Requester_160() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.addonincedentsubType();
		methods.addonincedentsubType();
	}

	@Test
	public static void Requester_161() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonPriority, " Priority dropdown");

	}

	@Test
	public static void Requester_162() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonAttachmentButton, "Attachment");
		//

	}

	@Test
	public static void Requester_163() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addoncreateTemplateButton, "Create as template");
		//

	}

	@Test
	public static void Requester_164() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.addoncreateTemplateButton();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

	}

	@Test
	public static void Requester_165() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonSubmit, "Submit Button ");
	}

	@Test
	public static void Requester_166() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		driver.findElement(methods.addonSubmit).click();
	}

	@Test
	public static void Requester_167() throws Throwable {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		methods.elementCheck(methods.AssosiateaddonIcon, "Assosiate addon Icon ");
		methods.iconbtn();
	}

	@Test
	public static void Requester_168() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		driver.findElement(methods.AssosiateaddonIcon).click();
		methods.AssosiateaddonIcon_close();

	}

	@Test
	public static void Requester_169() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		driver.findElement(methods.AssosiateaddonIcon).click();
		methods.elementCheck(methods.AssosiateaddonRadios1, "Within Account");
		methods.elementCheck(methods.AssosiateaddonRadios2, "Within Hirechery");
		methods.elementCheck(methods.AssosiateaddonRadios3, "Across Account");
		methods.elementCheck(methods.AssosiateaddonselectField, "Select");
		methods.AssosiateaddonIcon_close();
	}

	@Ignore
	@Test
	public static void Requester_170() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.FristRequseterTicket).click();
		methods.iconbtn();
		driver.findElement(methods.AssosiateaddonIcon).click();
		driver.findElement(methods.AssosiateaddonRadios3).click();
		driver.findElement(methods.AssosiateaddonselectField).click();
		driver.findElement(methods.AssosiateaddonselectFieldsuggestions1).click();
		driver.findElement(methods.AssosiateaddonSubmit).click();

	}

	@Test
	public static void Requester_171() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.searchFilter).sendKeys("ak");

		// methods.
	}

	@Test
	public static void Requester_172() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.ticketFilter).click();
		methods.elementCheck(methods.filterpopup, "Filter Popup");
		driver.findElement(methods.ticketFilter).click();

		// methods.
	}

	@Test
	public static void Requester_173() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentpopup, "Department Popup");
		driver.findElement(methods.departmentDropdown).click();

	}

	@Test
	public static void Requester_174() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentDropdownCheckboxes, "Checkboxes");

		// methods.
	}
	

	@Test
	public static void Requester_175() throws MalformedURLException, InterruptedException {
		requestermethods methods = new requestermethods(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		driver.findElement(methods.departmentDropdown).click();
		driver.findElement(methods.departmentDropdownCheckboxes).click();
		driver.findElement(methods.departmentDropdown).click();

	}



@AfterMethod
public void Logout() throws InterruptedException, MalformedURLException {
	Logout a = new Logout(driver, dc, url);
	a.Logoutapp();
}
}
