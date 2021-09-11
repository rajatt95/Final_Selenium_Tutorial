package __04_com.learning.refreshBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _05_TC_Refresh_Using_SendKeys_NW extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.toolsqa.com");
		holdScript(3);
		System.out.println("Refresh the Browser");
		// Element "s" is a Search Text box on my website
		driver.findElement(By.name("s")).sendKeys(Keys.F5);

		quitDriver(driver);
	}

}
