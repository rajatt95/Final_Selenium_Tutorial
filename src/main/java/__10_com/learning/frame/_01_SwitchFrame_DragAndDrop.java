package __10_com.learning.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_SwitchFrame_DragAndDrop extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		preSetup(driver);

		navigateToURL(driver, "https://jqueryui.com/droppable/");

		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames available on web page: " + allFrames.size());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		holdScript(2);

		// Indexing starts from 0
		driver.switchTo().frame(0);

		Actions actions = new Actions(driver);

		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));

		System.out.println("Perform Drag ad Drop operation");
		actions.dragAndDrop(draggable, droppable).build().perform();

		quitDriver(driver);
	}

}