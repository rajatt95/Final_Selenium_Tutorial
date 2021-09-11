package __31_com.learning.BrowserOptions_Capabilities;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_FirefoxOptions_Headless extends TestBase {

	public static void main(String[] args) {

		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(options);

		preSetup(driver);
		navigateToURL(driver, "https://www.myntra.com/");

		System.out.println("getTitle(): " + driver.getTitle());
		System.out.println("getCurrentUrl(): " + driver.getCurrentUrl());

		quitDriver(driver);

	}
}