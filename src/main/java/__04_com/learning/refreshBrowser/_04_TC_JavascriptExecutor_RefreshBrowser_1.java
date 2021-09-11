package __04_com.learning.refreshBrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_TC_JavascriptExecutor_RefreshBrowser_1 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://www.toolsqa.com");
		holdScript(2);

		System.out.println("Refresh the Browser");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");

		quitDriver(driver);
	}

}
