package __12_com.learning.alerts;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_HandleAlerts_SimpleAlert_1_Button extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/alerts");

		System.out.println("Clicking on Alert button");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		holdScript(2);

		System.out.println("Accept Alert");
		driver.switchTo().alert().accept();

		quitDriver(driver);
	}

}