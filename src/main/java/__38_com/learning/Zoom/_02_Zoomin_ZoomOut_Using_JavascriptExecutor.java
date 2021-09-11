package __38_com.learning.Zoom;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_Zoomin_ZoomOut_Using_JavascriptExecutor extends TestBase {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		holdScript(2);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		System.out.println("Set Zoom level - 80%");
		js.executeScript("document.body.style.transform='scale(0.8)';");
		// ((IJavaScriptExecutor)driver).executeScript("document.body.style.transform='scale(0.8)';");
		holdScript(2);

		System.out.println("Set Zoom level - 50%");
		js.executeScript("document.body.style.transform='scale(0.5)';");
		holdScript(2);

		System.out.println("Set Zoom level - 120%");
		js.executeScript("document.body.style.transform='scale(1.2)';");

		quitDriver(driver);
	}
}
