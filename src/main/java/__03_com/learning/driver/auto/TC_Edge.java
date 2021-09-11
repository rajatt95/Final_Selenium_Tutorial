package __03_com.learning.driver.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Edge extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		preSetup(driver);
		System.out.println("Title: " + driver.getTitle());
		quitDriver(driver);
	}
}
