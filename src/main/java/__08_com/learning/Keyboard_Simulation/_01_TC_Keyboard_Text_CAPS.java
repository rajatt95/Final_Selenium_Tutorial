package __08_com.learning.Keyboard_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_TC_Keyboard_Text_CAPS extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		WebElement searchBox = driver.findElement(By.name("q"));
		System.out.println("Google search: full stack Automation test engineer");

		// This text will be sent in Upper Letters
		searchBox.sendKeys(Keys.SHIFT, "full stack Automation test engineer");

		searchBox.sendKeys(Keys.ENTER);

		quitDriver(driver);
	}

}
