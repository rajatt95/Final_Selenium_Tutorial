package __05_com.learning.waits;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Wait_ExplicitWait_2_ElementPresent extends TestBase {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.facebook.com/");

		System.out.println("Clicking on English (UK)");
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();

		System.out.println("Enter 'abc@gmail.com' in Email field");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Wait for Password and fill data

		System.out.println("Enter 'xyz_password' in Password field");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("xyz_password");

		// Wait for Login button and click
		System.out.println("Clicking on Sign in button");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Log In']")))
				.click();

		// Wait for Login Invalid message
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[contains(text(),'We limit how often you can post, comment or do oth')]")));

		String login_Invalid_Message = driver
				.findElement(By.xpath("//div[contains(text(),'We limit how often you can post, comment or do oth')]"))
				.getText();
		System.out.println("login_Invalid_Message: " + login_Invalid_Message);
		quitDriver(driver);
	}

}