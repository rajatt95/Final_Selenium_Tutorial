package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_JavascriptExecutor_Get_InnerText extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://paytm.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String innerText_EntireWebPage = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("InnerText of Entire Web Page");
		System.out.println(innerText_EntireWebPage);

		quitDriver(driver);
	}

}
