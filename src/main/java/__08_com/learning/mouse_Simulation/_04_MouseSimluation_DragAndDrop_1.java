package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_MouseSimluation_DragAndDrop_1 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);

		navigateToURL(driver, "http://demo.guru99.com/test/drag_drop.html");

		Actions action = new Actions(driver);

		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement accountSpace = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));

		action.dragAndDrop(bank, accountSpace).build().perform();

		holdScript(2);

		WebElement amount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement amountSpace = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));

		action.dragAndDrop(amount, amountSpace).build().perform();

		quitDriver(driver);
	}
}
