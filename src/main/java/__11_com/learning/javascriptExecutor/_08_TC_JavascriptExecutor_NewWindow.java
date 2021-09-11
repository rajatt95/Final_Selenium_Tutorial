package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _08_TC_JavascriptExecutor_NewWindow extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);

		doSearchInGoogle(driver);

		JavascriptExecutor jse = ((JavascriptExecutor) driver);

		System.out.println("Opening new window");
		jse.executeScript("window.open()");

		navigateToURL(driver, "https://www.facebook.com/");

		quitDriver(driver);
	}
}
