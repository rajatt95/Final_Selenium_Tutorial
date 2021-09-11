package __23_com.learning.browser.window.size;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MultipleWindows_UsingDimensionClass extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		preSetup(driver);

		setBrowserWindowSize(driver, 850, 700);
		setBrowserWindowSize(driver, 200, 100);
		setBrowserWindowSize(driver, 1650, 1200);
		setBrowserWindowSize(driver, 760, 600);

		driver.manage().window().maximize();

		quitDriver(driver);
	}

	private static void setBrowserWindowSize(WebDriver driver, int width, int height) {
		Dimension dim = new Dimension(width, height);
		System.out.println("Set Browser dimension: " + "---------Width: " + width + " and Height: " + height);
		driver.manage().window().setSize(dim);
		holdScript(2);
	}

}
