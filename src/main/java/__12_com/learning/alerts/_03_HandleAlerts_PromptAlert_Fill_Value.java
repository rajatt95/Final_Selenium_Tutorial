package __12_com.learning.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_HandleAlerts_PromptAlert_Fill_Value extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");

		String profile = "Full Stack Test Automation Engineer";
		System.out.println("Fill value: " + profile);
		driver.findElement(By.id("name")).sendKeys(profile);

		System.out.println("Clicking on Alert button");
		driver.findElement(By.id("alertbtn")).click();

		holdScript(2);

		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert text : " + alertText);

		System.out.println("Accept the Alert");
		driver.switchTo().alert().accept();
		quitDriver(driver);
	}

}