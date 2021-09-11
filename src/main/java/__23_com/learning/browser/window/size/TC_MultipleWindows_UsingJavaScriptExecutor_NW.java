package __23_com.learning.browser.window.size;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MultipleWindows_UsingJavaScriptExecutor_NW extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		setBrowserWindowSizeUsingJavascriptExecutor(driver, 850, 700);
		setBrowserWindowSizeUsingJavascriptExecutor(driver, 200, 100);
		setBrowserWindowSizeUsingJavascriptExecutor(driver, 1650, 1200);
		setBrowserWindowSizeUsingJavascriptExecutor(driver, 760, 600);

		driver.manage().window().maximize();

		quitDriver(driver);
	}

	private static void setBrowserWindowSizeUsingJavascriptExecutor(WebDriver driver, int width, int height) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// set size with window.resizeTo() method
//		js.executeScript("window.resizeTo(" + width + "," + height + ");");

		js.executeScript("window.resizeTo(450,630);");

		holdScript(2);
	}

}
