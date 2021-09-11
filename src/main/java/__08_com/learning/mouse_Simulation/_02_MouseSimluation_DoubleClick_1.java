package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_MouseSimluation_DoubleClick_1 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/buttons");

		Actions action = new Actions(driver);

		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		/*
		 * doubleClickBtn.click(); doubleClickBtn.click();
		 */

		System.out.println("Double click on button");
		action.doubleClick(doubleClickBtn).build().perform();
		Thread.sleep(3000);

		WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
		System.out.println("doubleClickMessage.getText(): " + doubleClickMessage.getText());

		quitDriver(driver);
	}
}
