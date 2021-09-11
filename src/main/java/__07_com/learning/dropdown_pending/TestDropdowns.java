package __07_com.learning.dropdown_pending;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdowns extends TestBase {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		preSetup(driver);

		// elementsInDropdown(driver);

		// getAllLinksInPage(driver);

		getAllLinksUnderFooterBlock(driver);

		quitDriver(driver);
	}

	private static void getAllLinksUnderFooterBlock(WebDriver driver) {
		System.out.println("=========================================");
		System.out.println("Links under Footer Block");
		WebElement footerBlock = driver.findElement(By.xpath("//div[contains(@class,'footer')]"));
		List<WebElement> listOfAnchorTagsInsideFooterBlock = footerBlock.findElements(By.tagName("a"));
		for (WebElement link : listOfAnchorTagsInsideFooterBlock) {
			System.out.println("Text of Link: " + link.getText() + "------and the URL : " + link.getAttribute("href"));
		}
		System.out.println("Total links count: " + listOfAnchorTagsInsideFooterBlock.size());
	}

	private static void getAllLinksInPage(WebDriver driver) {
		List<WebElement> listOfAnchorTags = driver.findElements(By.tagName("a"));

		/*
		 * for (int link = 0; link < listOfAnchorTags.size(); link++) {
		 * System.out.println("Text of Link: " + listOfAnchorTags.get(link).getText());
		 * }
		 */

		// ForEach Loop
		for (WebElement link : listOfAnchorTags) {
			System.out.println("Text of Link: " + link.getText() + "------and the URL : " + link.getAttribute("href"));
		}
		System.out.println("Total links count: " + listOfAnchorTags.size());
	}

	private static void elementsInDropdown(WebDriver driver) {
		// not recommended - For select tags
		// driver.findElement(By.name("country")).sendKeys("Germany"); - sendKeys is not
		// good solution
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);

		// select.selectByVisibleText("Eesti");

		// For Hindi
		/* <option value="hi" lang="hi">हिन�?दी</option> */
		select.selectByValue("hi");
		/*
		 * select.selectByIndex(0); select.deselectByIndex(0);
		 */

		// Get options from Dropdown
		// List<WebElement> optionsFromDropdown=select.getOptions();
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("Total values: " + values.size());
		System.out.println("Text of element 8th position: " + values.get(7).getText());
		System.out.println("VAlue of element 8th position: " + values.get(7).getAttribute("value"));
//		System.out.println("Location of element 8th position: " + values.get(7).getLocation());
		System.out.println("---------------------");
		for (int valueInDropdown = 0; valueInDropdown < values.size(); valueInDropdown++) {
			System.out.println(values.get(valueInDropdown).getText());
			System.out.println(values.get(valueInDropdown).getAttribute("value"));
			System.out.println(values.get(valueInDropdown).getAttribute("lang"));
			System.out.println("---------------------");
		}
	}

}
