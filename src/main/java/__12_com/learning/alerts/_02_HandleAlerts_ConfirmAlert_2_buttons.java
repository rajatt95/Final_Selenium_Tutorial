package __12_com.learning.alerts;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_HandleAlerts_ConfirmAlert_2_buttons extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/alerts");

		System.out.println("Clicking on Confirm button");
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		holdScript(2);

		// Verify Alert text
		String actualAlertText = driver.switchTo().alert().getText();
		System.out.println("Alert text: " + actualAlertText);

		// To accept the Alert
		System.out.println("Accept the Alert");
		driver.switchTo().alert().accept();
		System.out.println("Accept worked");

		// To dismiss the Alert
		System.out.println("Clicking on Confirm button");
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		holdScript(2);

		System.out.println("Dismiss the Alert");
		driver.switchTo().alert().dismiss();
		System.out.println("Dismiss worked");
		quitDriver(driver);
	}

}