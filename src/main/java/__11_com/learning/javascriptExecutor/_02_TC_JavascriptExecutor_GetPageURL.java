package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_JavascriptExecutor_GetPageURL extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://paytm.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String sText = js.executeScript("return document.URL;").toString();
		System.out.println("Page URL: " + sText);

		quitDriver(driver);
	}

}
