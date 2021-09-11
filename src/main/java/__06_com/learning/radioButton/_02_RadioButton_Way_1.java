package __06_com.learning.radioButton;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_RadioButton_Way_1 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");

		// 1st way- to handle Radio button
		WebElement radioButton_1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		System.out.println("Clicking on Radio button 1");
		radioButton_1.click();
		holdScript(3);

		WebElement radioButton_2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		System.out.println("Clicking on Radio button 2");
		radioButton_2.click();
		holdScript(3);

		WebElement radioButton_3 = driver.findElement(By.xpath("//input[@value='radio3']"));
		System.out.println("Clicking on Radio button 3");
		radioButton_3.click();
		holdScript(3);

		System.out.println("-----------------------");
		System.out.println("radioButton_1.isEnabled(): " + radioButton_1.isEnabled());// Radio button 1 is enabled or
																						// not
		System.out.println("radioButton_2.isEnabled(): " + radioButton_2.isEnabled());
		System.out.println("radioButton_3.isEnabled(): " + radioButton_3.isEnabled());
		System.out.println("-----------------------");
		System.out.println("radioButton_1.isDisplayed(): " + radioButton_1.isDisplayed());
		System.out.println("radioButton_2.isDisplayed(): " + radioButton_2.isDisplayed());// Radio button 2 is displayed
																							// or not
		System.out.println("radioButton_3.isDisplayed(): " + radioButton_3.isDisplayed());
		System.out.println("-----------------------");
		System.out.println("radioButton_1.isSelected(): " + radioButton_1.isSelected());
		System.out.println("radioButton_2.isSelected(): " + radioButton_2.isSelected());
		System.out.println("radioButton_3.isSelected(): " + radioButton_3.isSelected());// Radio button 3 is selected or
																						// not
		System.out.println("-----------------------");

		System.out.println("driver.getCurrentUrl(): " + driver.getCurrentUrl());

		System.out.println("driver.getTitle(): " + driver.getTitle());

		quitDriver(driver);
	}
}