package __33_com.learning.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_TakesScreenshot_Element extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");

		captureElementScreenshot(driver.findElement(By.xpath("//img[@class='logoClass']")), driver);

		quitDriver(driver);
	}

	private static void captureElementScreenshot(WebElement element, WebDriver driver) {
		System.out.println("..............Element image...............");
		Date date = new Date();
		String fileName = date.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		System.out.println("Element Screenshot name: Element_" + fileName);
		File screenshot = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(".//screenshot/" + "Element_" + fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
