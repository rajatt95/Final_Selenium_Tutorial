package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_MouseSimluation_MouseHover_1 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.flipkart.com/");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		// Mouse simulation using Actions class
		Actions actions = new Actions(driver);

		// Creating WebElement Reference
		WebElement header_Electronics = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		WebElement header_Grocery = driver.findElement(By.xpath("//div[contains(text(),'Grocery')]"));
		WebElement header_Beauty = driver.findElement(By.xpath("//div[contains(text(),'Beauty, Toys & More')]"));
		WebElement header_Fashion = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));

		// Mouse Hover to Electronics
		System.out.println("Mouse Hover to Electronics");
		actions.moveToElement(header_Electronics).build().perform();
		holdScript(2);

		System.out.println("Mouse Hover to Grocery");
		actions.moveToElement(header_Grocery).build().perform();
		holdScript(2);

		System.out.println("Mouse Hover to Beauty");
		actions.moveToElement(header_Beauty).build().perform();
		holdScript(2);

		System.out.println("Mouse Hover to Fashion");
		actions.moveToElement(header_Fashion).build().perform();

		quitDriver(driver);
	}

}