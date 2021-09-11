package __31_com.learning.BrowserOptions_Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_ChromeOptions_Incognito extends TestBase {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		preSetup(driver);

		navigateToURL(driver, "https://www.amazon.com/");

		quitDriver(driver);
	}

}
