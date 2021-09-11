package __11_com.learning.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_TC_Scroll_Down_Using_SendKeys extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		doSearchInGoogle(driver);

		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys(Keys.PAGE_DOWN);

		quitDriver(driver);
	}

}
