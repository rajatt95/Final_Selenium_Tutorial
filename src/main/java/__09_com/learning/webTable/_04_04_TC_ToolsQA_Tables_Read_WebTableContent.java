package __09_com.learning.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_04_TC_ToolsQA_Tables_Read_WebTableContent extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver,"https://demoqa.com/webtables");

		// Store the table size
		WebElement webtable = driver.findElement(By.xpath("//div[contains(@class,'ReactTable')]"));

		// Get rows which has data
		List<WebElement> rowsWithData = webtable.findElements(
				By.xpath(".//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));

		// Print the whole web table
		System.out.println("Table Data is: ");
		for (int rowIndex = 0; rowIndex < rowsWithData.size(); rowIndex++) {
			System.out.println("Data of Row " + (rowIndex + 1) + " is:");
			List<WebElement> colsWithData = rowsWithData.get(rowIndex)
					.findElements(By.xpath(".//div[@class='rt-td'][text()]"));
			for (int colIndex = 0; colIndex < colsWithData.size(); colIndex++)
				System.out.println("Data at Cell with Row " + (rowIndex + 1) + " Column " + (colIndex + 1) + " : "
						+ colsWithData.get(colIndex).getText());
		}

		quitDriver(driver);	}

}
