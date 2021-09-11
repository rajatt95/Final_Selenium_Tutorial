package __07_com.learning.dropdown_pending;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_AutoSuggestion_4 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		driver.get("https://www.makemytrip.com/flights/");

		WebElement fromTextBox = driver.findElement(By.id("fromCity"));
		holdScript(2);
		fromTextBox.sendKeys("MUM");
		holdScript(2);
		fromTextBox.sendKeys(Keys.ARROW_DOWN);
		holdScript(2);
		fromTextBox.sendKeys(Keys.ARROW_DOWN);
		holdScript(2);
		fromTextBox.sendKeys(Keys.ENTER);
		holdScript(2);
		System.out.println("Origin : " + driver.findElement(By.id("fromCity")).getText());

		WebElement toTextBox = driver.findElement(By.id("toCity"));
		holdScript(2);
		toTextBox.sendKeys("DEL");
		holdScript(2);
		toTextBox.sendKeys(Keys.ARROW_DOWN);
		holdScript(2);
		toTextBox.sendKeys(Keys.ARROW_DOWN);
		holdScript(2);
		toTextBox.sendKeys(Keys.ENTER);
		holdScript(2);
		System.out.println("Destination : " + driver.findElement(By.id("toCity")).getText());

		holdScript(3);
		System.out.println(message_success);
		driver.quit();

	}

}