package __02_com.learning.driver.manual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;

public class TC_Chrome extends TestBase {

	public static void main(String[] args) {

		// We are setting the property of Chrome Browser and passing chromedriver path
		System.setProperty(chromeDriver, chromeDriverPath);
		
		// Launching Chrome Browser instance
		WebDriver driver = new ChromeDriver();

		preSetup(driver);
		System.out.println("Title: " + driver.getTitle());
		quitDriver(driver);
	}

}
