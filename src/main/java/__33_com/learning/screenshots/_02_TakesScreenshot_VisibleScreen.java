package __33_com.learning.screenshots;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TakesScreenshot_VisibleScreen extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");

		captureScreenshotOfVisibleScreen(driver);

		quitDriver(driver);
	}

	
	
	
	
	
	
	private static void captureScreenshotOfVisibleScreen(WebDriver driver) {
		System.out.println("..............Full Page image...............");
		Date date = new Date();
		String fileName = "Visible_Screen_" + date.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		System.out.println("Visible Screen Screenshot name: " + fileName);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Copying the taken screenshot to specified path - Root folder - .//
		try {
			FileUtils.copyFile(screenshot, new File(".//screenshot/" + fileName));
		} catch (Exception e) {
		}
	}

}
