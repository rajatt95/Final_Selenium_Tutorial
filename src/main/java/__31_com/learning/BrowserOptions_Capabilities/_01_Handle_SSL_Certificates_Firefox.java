package __31_com.learning.BrowserOptions_Capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_Handle_SSL_Certificates_Firefox extends TestBase {

	public static void main(String[] args) {

		// It create firefox profile
		FirefoxProfile profile = new FirefoxProfile();

		// This will set the true value
		profile.setAcceptUntrustedCertificates(true);

		WebDriverManager.firefoxdriver().setup();

		// This will open firefox browser using above created profile
		WebDriver driver = new FirefoxDriver((Capabilities) profile);

		preSetup(driver);

		driver.get("https://www.amazon.com/");

		quitDriver(driver);
	}

}
