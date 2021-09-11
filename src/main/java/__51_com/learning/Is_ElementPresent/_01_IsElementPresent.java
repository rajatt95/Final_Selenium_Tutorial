package __51_com.learning.Is_ElementPresent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_IsElementPresent extends TestBase {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		preSetup(driver);

		// Valid XPath
		System.out.println("isElementPresent: " + isElementPresent("//input[@title='Search']", driver));

		// Invalid XPath
		System.out.println("isElementPresent: " + isElementPresent("//idsadn[@dsa='sad']", driver));

		quitDriver(driver);
	}

	protected static boolean isElementPresent(String locator_XPath, WebDriver driver) {
		// Logic #1

		try {
			driver.findElement(By.xpath(locator_XPath));
			return true;
		} catch (Exception exception) {
			return false;
		}

	}
}
