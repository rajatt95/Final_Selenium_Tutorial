package __05_com.learning.waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Wait_ExplicitWait_3_Alert extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/alerts");

		System.out.println("Clicking on button - alert will appear after 5 seconds");
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		holdScript(2);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println("alert.getText(): " + alert.getText());
		System.out.println("Accept Alert");
		alert.accept();

		quitDriver(driver);
	}

}