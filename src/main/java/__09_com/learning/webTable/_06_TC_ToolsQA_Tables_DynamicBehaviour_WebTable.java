package __09_com.learning.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _06_TC_ToolsQA_Tables_DynamicBehaviour_WebTable extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver,"https://demoqa.com/webtables");

		// Store the table size
		WebElement webtable = driver.findElement(By.xpath("//div[contains(@class,'ReactTable')]"));

		// Get the rows which has data
		List<WebElement> rowsWithData = webtable.findElements(
				By.xpath(".//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));

		// Print the number of rows visible
		System.out.println("No of Rows Visible: " + rowsWithData.size());

		// Search for Alden in the search box
		driver.findElement(By.id("searchBox")).sendKeys("Alden");

		// Get the rows which has data
		rowsWithData = webtable.findElements(
				By.xpath(".//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));

		// Print the number of rows visible
		System.out.println("No of Rows Visible after Search: " + rowsWithData.size());

quitDriver(driver);	}

}
