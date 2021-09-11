package __09_com.learning.webTable;

import java.util.List;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_WebTable_Rediff extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://money.rediff.com/gainers");

		// Create List of all Companies
		List<WebElement> list_allCompanies = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies: " + list_allCompanies.size());

		// Create List of all Current Price
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Prices: " + currentPrice.size());
		System.out.println("---------------");

		String expectedCompanyName = "South India Pape";

		for (int index = 0; index < list_allCompanies.size(); index++) {
			if (list_allCompanies.get(index).getText().equalsIgnoreCase(expectedCompanyName)) {
				System.out.println(expectedCompanyName + " is present in the List");
				System.out.println(list_allCompanies.get(index).getText() + " ==== " + currentPrice.get(index).getText());
				list_allCompanies.get(index).click();
				break;
			}
		}

		quitDriver(driver);	}

}