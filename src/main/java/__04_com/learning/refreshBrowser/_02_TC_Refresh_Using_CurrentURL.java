package __04_com.learning.refreshBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Refresh_Using_CurrentURL extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://www.toolsqa.com");
		holdScript(3);
		System.out.println("Refresh the Browser");
		driver.navigate().to(driver.getCurrentUrl());

		quitDriver(driver);
	}

}
