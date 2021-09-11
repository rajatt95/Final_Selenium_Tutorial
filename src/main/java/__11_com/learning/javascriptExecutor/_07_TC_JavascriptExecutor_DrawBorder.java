package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _07_TC_JavascriptExecutor_DrawBorder extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
		holdScript(2);
		System.out.println("Drawing Border over Searchbox");
		jse.executeScript("arguments[0].style.border='3px solid red'", element);
		quitDriver(driver);
	}

}