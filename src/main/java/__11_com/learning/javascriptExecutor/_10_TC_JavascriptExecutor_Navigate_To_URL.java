package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _10_TC_JavascriptExecutor_Navigate_To_URL extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		System.out.println("Navigating to: https://www.softwaretestingmaterial.com");
		js.executeScript("window.location = 'https://www.softwaretestingmaterial.com'");

		quitDriver(driver);
	}

}
