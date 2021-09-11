package __04_com.learning.refreshBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_TC_Refresh_Using_RefreshMethod extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		driver.get("https://www.toolsqa.com");
		holdScript(3);
		System.out.println("Refresh the Browser");
		driver.navigate().refresh();

		quitDriver(driver);
	}

}
