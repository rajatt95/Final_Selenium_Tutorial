package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_MouseSimluation_MouseHover_2 extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.flipkart.com/");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		// Mouse simulation using Actions class
		Actions actions = new Actions(driver);

		// Creating WebElement Reference
		WebElement header_Eelectronics = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));

		// Mouse Hover to Electronics
		System.out.println("Mouse Hover to Electronics");
		actions.moveToElement(header_Eelectronics).build().perform();

		holdScript(2);

		// Creating WebElement Reference
		WebElement header_Electronics_Gaming = driver.findElement(By.xpath("//a[normalize-space()='Gaming']"));

		// Mouse Hover to Gaming
		System.out.println("Mouse Hover to Gaming");
		actions.moveToElement(header_Electronics_Gaming).build().perform();

		quitDriver(driver);
	}

}