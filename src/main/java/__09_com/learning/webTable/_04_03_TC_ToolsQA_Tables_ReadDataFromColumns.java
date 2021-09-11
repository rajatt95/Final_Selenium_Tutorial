package __09_com.learning.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_03_TC_ToolsQA_Tables_ReadDataFromColumns extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/webtables");

		// Store the table size
		WebElement webtable = driver.findElement(By.xpath("//div[contains(@class,'ReactTable')]"));

		// Get 2nd column cells which has data
		List<WebElement> colsWithData = webtable.findElements(By.xpath("//div[@class='rt-td'][2][text()]"));

		// Print the text of 2nd column
		System.out.println("Data of 2nd Column is: ");
		for (int index = 0; index < colsWithData.size(); index++) {
			System.out.println(colsWithData.get(index).getText());
		}
		quitDriver(driver);
	}

}
