package __36_com.learning.Driver_Scope;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_Links_All_Footer_Column extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");

		getTotalLinksDetails(driver);
		System.out.println("=======================================================");
		getFooterLinksDetails(driver);
		System.out.println("=======================================================");
		getFooter_1stColumn_LinksDetails(driver);

		quitDriver(driver);
	}

	private static void getFooter_1stColumn_LinksDetails(WebDriver driver) {
		System.out.println("Footer 1st Column - Links details");
		WebElement footer_1stColumn = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		List<WebElement> listOfAnchorTagsIn_1stColumn_Footer = footer_1stColumn.findElements(By.tagName("a"));
		System.out.println("Links count : " + listOfAnchorTagsIn_1stColumn_Footer.size());
		for (WebElement link : listOfAnchorTagsIn_1stColumn_Footer) {
			System.out.println(link.getAttribute("href"));
		}
	}

	private static void getFooterLinksDetails(WebDriver driver) {
		System.out.println("Footer Links details");
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		List<WebElement> listOfAnchorTagsInFooter = footer.findElements(By.tagName("a"));
		System.out.println("Links count : " + listOfAnchorTagsInFooter.size());
		for (WebElement link : listOfAnchorTagsInFooter) {
			System.out.println(link.getAttribute("href"));
		}
	}

	private static void getTotalLinksDetails(WebDriver driver) {
		System.out.println("All Links details");
		List<WebElement> listOfAnchorTags = driver.findElements(By.tagName("a"));
		System.out.println("Links count : " + listOfAnchorTags.size());
		for (WebElement link : listOfAnchorTags) {
			System.out.println(link.getAttribute("href"));
		}
	}

}
