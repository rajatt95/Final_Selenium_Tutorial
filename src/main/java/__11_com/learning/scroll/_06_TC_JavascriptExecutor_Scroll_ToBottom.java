package __11_com.learning.scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _06_TC_JavascriptExecutor_Scroll_ToBottom extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		doSearchInGoogle(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		System.out.println("Scroll to Bottom");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		quitDriver(driver);
	}

}
