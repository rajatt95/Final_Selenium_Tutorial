package __12_com.learning.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _05_HandleAlerts extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		preSetup(driver);
		navigateToURL(driver, "https://mail.rediff.com/cgi-bin/login.cgi");

		System.out.println("Clicking on Proceed");
		driver.findElement(By.name("proceed")).click();

		// Other Way - Using Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert text: " + alert.getText());
		holdScript(2);
		System.out.println("Accept Alert");
		alert.accept();

		quitDriver(driver);
	}

}
