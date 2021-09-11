package __03_com.learning.driver.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Firefox extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		preSetup(driver);
		System.out.println("Title: " + driver.getTitle());
		quitDriver(driver);
	}
}
