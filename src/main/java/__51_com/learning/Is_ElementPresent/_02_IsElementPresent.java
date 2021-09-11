package __51_com.learning.Is_ElementPresent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_IsElementPresent extends TestBase {
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

		int sizeOfTheList = driver.findElements(By.xpath(locator_XPath)).size();
		// sizeOfTheList == 0 - means there is no element in the list
		if (sizeOfTheList == 0) {
			return false;
		} else {
			return true;
		}

	}
}
