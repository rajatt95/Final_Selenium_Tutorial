package __31_com.learning.BrowserOptions_Capabilities;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_ChromeOptions_Headless extends TestBase {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);

		preSetup(driver);
		navigateToURL(driver, "https://www.myntra.com/");

		System.out.println("getTitle(): " + driver.getTitle());
		System.out.println("getCurrentUrl(): " + driver.getCurrentUrl());

		quitDriver(driver);

	}
}