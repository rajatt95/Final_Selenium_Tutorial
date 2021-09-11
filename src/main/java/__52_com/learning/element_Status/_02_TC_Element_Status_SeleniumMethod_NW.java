package __52_com.learning.element_Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Element_Status_SeleniumMethod_NW extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/dropdownsPractise/");

		System.out.println("Clicking on One Way");
		WebElement radioButton_oneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		radioButton_oneWay.click();

		WebElement returnDate = driver.findElement(By.id("ctl00_mainContent_view_date2"));
		System.out.println("Return date - isEnabled() : " + returnDate.isEnabled());

		System.out.println("Clicking on Round Trip");
		WebElement radioButton_RadioButton = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		radioButton_RadioButton.click();

		System.out.println("Return date - isEnabled() : " + returnDate.isEnabled());

		quitDriver(driver);
	}

}