package __31_com.learning.BrowserOptions_Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.h2kinfosys.com/blog/handling-of-ssl-certificates-in-selenium-webdriver/

/*The certificate errors you see in different browsers are

Firefox – This connection is untrusted
Google Chrome -This site security is not trusted
Internet Explorer ( IE) – This security certificate presented by this website was not trusted by a trusted certificate authority (CA)*/
public class _01_Handle_SSL_Certificates_Chrome_1 extends TestBase {

	public static void main(String[] args) {

		// Create object of DesiredCapabilities class
		DesiredCapabilities cap = DesiredCapabilities.chrome();

		// Set ACCEPT_SSL_CERTS variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		WebDriverManager.chromedriver().setup();

		// Open browser with capability
		WebDriver driver = new ChromeDriver(cap);
		preSetup(driver);

		driver.get("https://www.amazon.com/");

		quitDriver(driver);
	}

}
