package __03_com.learning.driver.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Chrome extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);
		System.out.println("Title: " + driver.getTitle());
		quitDriver(driver);
	}
}
