package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_MouseSimluation_DragAndDrop_2 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);
		navigateToURL(driver, "https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println("Perform Drag and Drag operation");
		new Actions(driver).dragAndDrop(draggable, droppable).perform();
		quitDriver(driver);
	}

}
