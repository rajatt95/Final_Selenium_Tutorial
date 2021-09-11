package __52_com.learning.element_Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_TC_Element_Status_CustomMethod extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println("Clicking on One Way");
		WebElement radioButton_oneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		radioButton_oneWay.click();
		getElementStatus(driver);

		System.out.println("==================");
		System.out.println("Clicking on Round Trip");
		WebElement radioButton_roundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		radioButton_roundTrip.click();

		getElementStatus(driver);

		quitDriver(driver);
	}

	private static void getElementStatus(WebDriver driver) {
		WebElement returnDate = driver.findElement(By.id("Div1"));
		// System.out.println(returnDate.getAttribute("style"));
		if (returnDate.getAttribute("style").contains("0.5")) {
			System.out.println("Return date is disabled");
		} else if (returnDate.getAttribute("style").contains("1")) {
			System.out.println("Return date is enabled");
		}
	}

}