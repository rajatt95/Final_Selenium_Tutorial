package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_JavascriptExecutor_GetPageTitle extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		System.out.println("title: " + title);

		quitDriver(driver);
		
	}

}
