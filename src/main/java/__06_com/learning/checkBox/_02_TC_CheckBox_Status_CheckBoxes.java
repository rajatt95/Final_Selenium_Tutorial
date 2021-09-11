package __06_com.learning.checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_CheckBox_Status_CheckBoxes extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		holdScript(2);

		System.out.println("Before Click - CheckBox selected status : "
				+ driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());

		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		holdScript(2);

		boolean checkBoxSelectStatus_AfterClick = driver
				.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected();
		System.out.println("After Click - CheckBox selected status : " + checkBoxSelectStatus_AfterClick);

		holdScript(2);

		System.out.println(
				"getSize() : " + driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).getSize());

		quitDriver(driver);
	}

}