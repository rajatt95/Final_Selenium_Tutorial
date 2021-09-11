package __31_com.learning.BrowserOptions_Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_Handle_SSL_Certificates_Chrome_2 extends TestBase {

	public static void main(String[] args) {

		// General Chrome profile
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();

		// ch.acceptInsecureCerts();
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Belows to local browser
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(desiredCapabilities);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		preSetup(driver);

		navigateToURL(driver, "https://www.amazon.com/");

		quitDriver(driver);
	}

}
