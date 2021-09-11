package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_MouseSimluation_MouseHover_3 extends TestBase {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);

		navigateToURL(driver, "https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Way2Automation");
		driver.findElement(By.name("btnK")).click();

		System.out.println("Click on Way2Automation");
		WebElement way2Automation = driver.findElement(By.xpath("//h3[normalize-space()='Way2Automation']"));
		way2Automation.click();

		System.out.println("Perform Mouse Hover on Resources");
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		new Actions(driver).moveToElement(menu).perform();

		System.out.println("Click on Practice Site 1");
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Practice site 1')]"));
		resources.click();

		quitDriver(driver);
	}
}
