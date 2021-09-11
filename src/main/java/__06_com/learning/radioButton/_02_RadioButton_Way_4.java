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

public class _02_RadioButton_Way_4 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);
		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println("driver.getCurrentUrl(): " + driver.getCurrentUrl());
		System.out.println("driver.getTitle(): " + driver.getTitle());
		System.out.println("-----------------------------");

		// 4th way- to handle Radio button

		// listOfRadioButtons - Reference name
		List<WebElement> listOfRadioButtons = driver.findElements(By.xpath("//input[@type='radio']")); // 3 Radio

		String expectedResult = "radio2";

		for (int i = 0; i < listOfRadioButtons.size(); i++) {

			// System.out.println("listOfRadioButtons.get(" + i + ").getText(): " +
			// listOfRadioButtons.get(i).getText());
			System.out.println("listOfRadioButtons.get(" + i + ").getAttribute(\"value\"): "
					+ listOfRadioButtons.get(i).getAttribute("value"));
			// if (listOfRadioButtons.get(i).getText().contains(expectedResult)) {
			if (listOfRadioButtons.get(i).getAttribute("value").contains(expectedResult)) {
				listOfRadioButtons.get(i).click();
				System.out.println(expectedResult + " clicked");
				break;
			}
		}

		quitDriver(driver);
	}
}