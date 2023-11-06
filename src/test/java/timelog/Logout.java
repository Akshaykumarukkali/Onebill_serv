package timelog;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Logout {
	DesiredCapabilities dc;
	URL url;

	static AndroidDriver driver;

	@SuppressWarnings("static-access")
	public Logout(AndroidDriver driver, DesiredCapabilities dc, URL url) {

		this.driver = driver;
		this.dc = dc;
		this.url = url;
	}

	@SuppressWarnings("static-access")
	public void Logoutapp() throws InterruptedException, MalformedURLException {

		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup"))
					.click();
			System.out.println("Clicked on logout");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\", Logout\"]")).click();
			System.out.println("Loggedout");
			Thread.sleep(5000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Invalid credentials");
			Thread.sleep(5000);
			driver.quit();
		}
	}

}

