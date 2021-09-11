package __02_com.learning.driver.manual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import __01_com.learning.base.TestBase;

public class TC_Firefox extends TestBase {

	public static void main(String[] args) {

		System.setProperty(firefoxDriver, firefoxDriverPath);
		WebDriver driver = new FirefoxDriver();

		preSetup(driver);
		System.out.println("Title: " + driver.getTitle());
		quitDriver(driver);
	}

}
