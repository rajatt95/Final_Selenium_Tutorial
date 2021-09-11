package __09_com.learning.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _05_01_TC_ToolsQA_Tables_DynamicTableSize extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver,"https://demoqa.com/webtables");

		// Store the table size
		WebElement webtable = driver.findElement(By.xpath("//div[contains(@class,'ReactTable')]"));

		// Get the Number of rows in the table
		List<WebElement> rows = webtable.findElements(By.xpath("//div[contains(@class,'rt-tr-group')]"));

		// Print the rows size
		System.out.println("Total Number of visible rows in the table is: " + rows.size());

		// Print the number of rows which has data
		List<WebElement> rowsWithData = webtable.findElements(
				By.xpath("//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));

		// Print the rows size
		System.out.println("Number of rows having data in the table is: " + rowsWithData.size());

		quitDriver(driver);	}

}
