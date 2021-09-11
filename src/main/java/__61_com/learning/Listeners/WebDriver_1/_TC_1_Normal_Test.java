package __61_com.learning.Listeners.WebDriver_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _TC_1_Normal_Test extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		holdScript(2);

		driver.findElement(By.id("name")).sendKeys("Rajat!");
		holdScript(2);

		driver.findElement(By.id("alertbtn")).click();
		holdScript(2);

		driver.switchTo().alert().accept();

		holdScript(3);
		System.out.println(message_success);
		driver.quit();

	}

}