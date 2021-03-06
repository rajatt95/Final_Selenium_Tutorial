package __39_com.learning.shadowDoms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_ShadowDom_Elements extends TestBase {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		navigateToURL(driver, "https://books-pwakit.appspot.com/");

		fillValueInSearchBooks(driver);

		quitDriver(driver);
	}

	// Code generated by SelectorsHub
	private static void fillValueInSearchBooks(WebDriver driver) throws InterruptedException {
		// This Element is inside single shadow DOM.
		// String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
		Thread.sleep(1000);
		WebElement shadowDomHostElement = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		WebElement last = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",
				shadowDomHostElement);
		Thread.sleep(1000);
		WebElement searchBook = last.findElement(By.cssSelector("input[aria-label='Search Books']"));
		searchBook.sendKeys("Rockstar");
	}

}
