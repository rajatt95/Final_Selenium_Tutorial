package __09_com.learning.webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_01_TC_ToolsQA_Tables extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/webtables");

		// Locate the cell value and store it in string format. Now read the value and
		// print it
		String value = driver.findElement(By.xpath("//div[@class='rt-resizable-header-content']")).getText();
		System.out.println(value);

		quitDriver(driver);
	}

}
