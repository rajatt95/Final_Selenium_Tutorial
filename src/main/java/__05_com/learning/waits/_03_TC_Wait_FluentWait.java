package __05_com.learning.waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_TC_Wait_FluentWait extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://the-internet.herokuapp.com/dynamic_loading/1");

		System.out.println("Clicking on Start");
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();

		// Fluent wait

		// Wait for 30 seconds max, do polling in every 3 seconds
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		fluentWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {

				WebElement element_helloWorld = driver.findElement(By.xpath(" //h4[contains(text(),'Hello World!')]"));
				if (element_helloWorld.isDisplayed()) {
					System.out.println("Element Text : " + element_helloWorld.getText());
					return element_helloWorld;
				} else {
					return null;
				}
			}
		});
		quitDriver(driver);
	}
}
