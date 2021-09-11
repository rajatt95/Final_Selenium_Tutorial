package __09_com.learning.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_WebTable_Get_Whole_Data extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		// https://money.rediff.com/gainers/bsc/daily/groupa

		// Row count: //table[contains(@class,'dataTable')]/tbody/tr

		// Column count: //table[contains(@class,'dataTable')]/tbody/tr[1]/td

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://money.rediff.com/gainers/bsc/daily/groupa");

		List<WebElement> rowNum = driver.findElements(By.xpath("//table[contains(@class,'dataTable')]/tbody/tr"));
		System.out.println("Total rows are : " + rowNum.size());

		List<WebElement> columnNum = driver
				.findElements(By.xpath("//table[contains(@class,'dataTable')]/tbody/tr[1]/td"));
		System.out.println("Total columns are : " + columnNum.size());

		for (int rows = 1; rows <= rowNum.size(); rows++) {
			for (int cols = 1; cols < columnNum.size(); cols++) {

				// This will run like :
				// Row #1-Column#1, Row #1-Column#2, Row #1-Column#3, Row #1-Column#4, Row
				// #1-Column#5
				// Row #2-Column#1, Row #2-Column#2, Row #2-Column#3,.....................
				System.out.print(driver
						.findElement(By
								.xpath("//table[contains(@class,'dataTable')]/tbody/tr[" + rows + "]/td[" + cols + "]"))
						.getText() + "     ");
			}
			System.out.println();
		}

		quitDriver(driver);	}

}
