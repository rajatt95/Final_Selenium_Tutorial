package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_MouseSimulation_RightClick_1 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/buttons");

		Actions action = new Actions(driver);

		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		/*
		 * doubleClickBtn.click(); doubleClickBtn.click();
		 */
		System.out.println("Perform Right click");
		action.contextClick(rightClickBtn).build().perform();
		holdScript(3);

		WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
		System.out.println("rightClickMessage.getText(): " + rightClickMessage.getText());

		quitDriver(driver);
	}
}
