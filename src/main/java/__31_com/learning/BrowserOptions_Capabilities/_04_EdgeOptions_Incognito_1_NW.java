package __31_com.learning.BrowserOptions_Capabilities;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_EdgeOptions_Incognito_1_NW extends TestBase {

	public static void main(String[] args) {

		EdgeOptions options = new EdgeOptions();
		options.setCapability("InPrivate", true);

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(options);

		preSetup(driver);
		/*
		 * navigateToURL(driver, "https://www.myntra.com/");
		 */
		System.out.println("getTitle(): " + driver.getTitle());
		System.out.println("getCurrentUrl(): " + driver.getCurrentUrl());

		quitDriver(driver);

	}
}