package __05_com.learning.waits;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Wait_ExplicitWait_1 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		ArrayList<String> listOfItems = getListOfItems();

		selectItem(driver, listOfItems);

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();

		// Explicit - WebDriverWait
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);

		// The Explicit Wait in Selenium is used to tell the Web Driver to wait for
		// certain conditions (Expected Conditions - Class) or maximum time exceeded
		// before throwing "ElementNotVisibleException" exception. It is an intelligent
		// kind of wait, but it can be applied only for specified elements. It gives
		// better options than implicit wait as it waits for dynamically loaded Ajax
		// elements.
		
		// Wait for this message and them, go ahead
		explicitWait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Code applied ..!')]")));

		System.out.println("Code Applied : "
				+ driver.findElement(By.xpath("//span[contains(text(),'Code applied ..!')]")).getText());

		quitDriver(driver);
	}

	private static ArrayList<String> getListOfItems() {
		ArrayList<String> listOfItems = new ArrayList<String>();
		listOfItems.add("Cucumber");
		listOfItems.add("Brocolli");
		listOfItems.add("Beetroot");
		listOfItems.add("Cauliflower");
		return listOfItems;
	}

	private static void selectItem(WebDriver driver, ArrayList<String> listOfItems) {
		// h4[text()='Cucumber - 1Kg']
		for (String item : listOfItems) {
			WebElement btn_addToCart = driver
					.findElement(By.xpath("//h4[contains(text(),'" + item + "')]/following-sibling::div/button"));
			btn_addToCart.click();
			holdScript(1);
		}

	}
}
