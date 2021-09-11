package __08_com.learning.mouse_Simulation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_MouseSimluation_TestSliders extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);
		navigateToURL(driver, "https://jqueryui.com/slider/");

		listDownTheFramesCount(driver);

		/* driver.switchTo().frame(0); */
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebElement slider = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
		// 400 - X-Axis, 0 - Y-Axis
		new Actions(driver).dragAndDropBy(slider, 400, 0).perform();

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
