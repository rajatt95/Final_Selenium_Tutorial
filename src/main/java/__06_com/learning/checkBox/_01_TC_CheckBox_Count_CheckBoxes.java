package __06_com.learning.checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_TC_CheckBox_Count_CheckBoxes extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);
		navigateToURL(driver, "https://rahulshettyacademy.com/dropdownsPractise/");

		int checkBoxesCount = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("Total checkboxes : " + checkBoxesCount);

		quitDriver(driver);
	}

}