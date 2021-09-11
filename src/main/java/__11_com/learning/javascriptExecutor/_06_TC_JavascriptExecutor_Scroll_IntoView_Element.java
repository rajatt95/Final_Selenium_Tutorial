package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _06_TC_JavascriptExecutor_Scroll_IntoView_Element extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		doSearchInGoogle(driver);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement element = driver
				.findElement(By.xpath("//h3[contains(text(),'Full Stack QA in 2020 | Software Testing | EuroSTA')]"));

		System.out.println("Scroll to Element");
		jse.executeScript("arguments[0].scrollIntoView(true);", element);

		holdScript(2);

		System.out.println("Click on Element");
		jse.executeScript("arguments[0].click();", element);
		holdScript(2);
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Current URL: " + driver.getCurrentUrl());

		quitDriver(driver);}

}
