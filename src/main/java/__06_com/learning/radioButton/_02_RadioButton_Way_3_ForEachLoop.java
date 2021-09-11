package __06_com.learning.radioButton;

import java.util.List;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_RadioButton_Way_3_ForEachLoop extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);
		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");

		// 3rd way- to handle Radio button

		// listOfRadioButtons - Reference name
		List<WebElement> listOfRadioButtons = driver.findElements(By.xpath("//input[@type='radio']")); // 3 Radio
		int a = 1;
		for (WebElement element : listOfRadioButtons) {

			System.out.println("Clicking on Radio button: " + a);
			a++;
			element.click();
			holdScript(2);
		}

		System.out.println("driver.getCurrentUrl(): " + driver.getCurrentUrl());
		System.out.println("driver.getTitle(): " + driver.getTitle());

		quitDriver(driver);
	}
}