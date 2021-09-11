package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_JavascriptExecutor_Get_Height_Width extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://paytm.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Height: " + js.executeScript("return window.innerHeight;").toString());
		System.out.println("Width: " + js.executeScript("return window.innerWidth;").toString());

		quitDriver(driver);
	}

}
