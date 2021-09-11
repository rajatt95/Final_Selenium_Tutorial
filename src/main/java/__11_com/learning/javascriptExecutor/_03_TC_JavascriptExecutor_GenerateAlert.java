package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_TC_JavascriptExecutor_GenerateAlert extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);
		holdScript(2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + "Hello Sher!" + "')");

		quitDriver(driver);	}

}
