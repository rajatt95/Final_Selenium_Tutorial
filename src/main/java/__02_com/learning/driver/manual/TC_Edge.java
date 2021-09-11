package __02_com.learning.driver.manual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;

public class TC_Edge extends TestBase {

	public static void main(String[] args) {

		System.setProperty(edgeDriver, edgeDriverPath);
		WebDriver driver = new EdgeDriver();

		preSetup(driver);
		System.out.println("Title: " + driver.getTitle());
		quitDriver(driver);
	}

}
