package __10_com.learning.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_SwitchFrame_Click extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

		// iframeResult - ID of the Frame; we can ID/name/index
		System.out.println("Switching to frame");
		driver.switchTo().frame("iframeResult");

		System.out.println("Clicking on Try it");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();

		listDownTheFramesCount(driver);

		// Focus back to main page
		System.out.println("Switching focus back to default content");
		driver.switchTo().defaultContent();
		listDownTheFramesCount(driver);

		quitDriver(driver);

	}

	private static void listDownTheFramesCount(WebDriver driver) {
		// To get all the frames in the Page
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames: " + frames.size());
		for (WebElement frame : frames) {
			System.out.println("IDs of frame: " + frame.getAttribute("id"));
		}
	}

}
