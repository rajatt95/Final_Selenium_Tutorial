package __23_com.learning.browser.window.size;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MultipleWindows_UsingPointClass extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		setBrowserWindowSizePointClass(driver, 850, 700);
		setBrowserWindowSizePointClass(driver, 200, 100);
		setBrowserWindowSizePointClass(driver, 1650, 1200);
		setBrowserWindowSizePointClass(driver, 760, 600);

quitDriver(driver);
	}

	private static void setBrowserWindowSizePointClass(WebDriver driver, int width, int height) {
		Point p = new Point(width, height);
		System.out.println("Set Browser dimension: " + "---------Width: " + width + " and Height: " + height);
		driver.manage().window().setPosition(p);
		holdScript(2);
	}

}
