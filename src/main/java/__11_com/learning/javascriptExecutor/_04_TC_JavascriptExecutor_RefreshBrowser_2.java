package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.softwaretestingmaterial.com/javascriptexecutor-selenium-webdriver/
//https://www.toolsqa.com/selenium-webdriver/javascript-and-selenium-javascriptexecutor/
//https://www.h2kinfosys.com/blog/javascriptexecutor-in-selenium-webdriver-with-example/
//https://www.lambdatest.com/blog/how-to-use-javascriptexecutor-in-selenium-webdriver/
public class _04_TC_JavascriptExecutor_RefreshBrowser_2 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		holdScript(3);
		System.out.println("Refresh the Browser");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("location.reload()");

		quitDriver(driver);
	}

}
