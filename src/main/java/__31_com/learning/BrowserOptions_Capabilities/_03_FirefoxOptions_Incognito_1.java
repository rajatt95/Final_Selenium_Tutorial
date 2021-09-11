package __31_com.learning.BrowserOptions_Capabilities;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_FirefoxOptions_Incognito_1 extends TestBase {

	public static void main(String[] args) {

		DesiredCapabilities caps = new DesiredCapabilities();

		// For Firefox
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-private");
		caps.setCapability("moz:firefoxOptions", options);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(caps);

		preSetup(driver);
		/*
		 * navigateToURL(driver, "https://www.myntra.com/");
		 */
		System.out.println("getTitle(): " + driver.getTitle());
		System.out.println("getCurrentUrl(): " + driver.getCurrentUrl());

		quitDriver(driver);

	}
}