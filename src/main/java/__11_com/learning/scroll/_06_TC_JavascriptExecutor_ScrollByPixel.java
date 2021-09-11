package __11_com.learning.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _06_TC_JavascriptExecutor_ScrollByPixel extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		doSearchInGoogle(driver);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// window.scrollBy(width, height)

		// Scroll down
		System.out.println("Scroll down");
		// jse.executeScript("window.scrollBy(0,750)");
		jse.executeScript("window.scrollBy(0,2000)");
		holdScript(2);

		// Scroll Up
		System.out.println("Scroll Up");
		jse.executeScript("window.scrollBy(0,-1000)");
		holdScript(2);

		setDimensionOfBowserWindow(driver, 400, 600);

		// Scroll Right
		System.out.println("Scroll Right");
		jse.executeScript("window.scrollBy(250,0)");
		holdScript(2);

		// Scroll Left
		System.out.println("Scroll Left");
		jse.executeScript("window.scrollBy(-120,0)");

		quitDriver(driver);
	}

}
