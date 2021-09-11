package __07_com.learning.dropdown_pending;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_AutoSuggestion_3 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		holdScript(2);

		selectValueFromAutoSuggestedDropdown(driver, "India", "//li[@class='ui-menu-item']/a");

		holdScript(3);
		System.out.println(message_success);
		driver.quit();

	}

	
	
	
	
	private static void selectValueFromAutoSuggestedDropdown(WebDriver driver, String locationToSelect,
			String xpathOfAllLocation) {
		/*
		 * List<WebElement> elementsIn_AutoSuggested_DropDown = driver
		 * .findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 */

		List<WebElement> elementsIn_AutoSuggested_DropDown = driver.findElements(By.xpath(xpathOfAllLocation));

		for (WebElement option : elementsIn_AutoSuggested_DropDown) {
			if (option.getText().equalsIgnoreCase(locationToSelect)) {
				option.click();
				break;
			}
		}
	}

}