package __08_com.learning.Keyboard_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_TC_KeyBoard_Event_CTRL_R_NW extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		WebElement searchBox = driver.findElement(By.name("q"));

		holdScript(3);
		// Refresh the Browser
		System.out.println("Refresh the Browser");

		String refreshKey = Keys.chord(Keys.CONTROL, "R");

		searchBox.sendKeys(refreshKey);

		// searchBox.sendKeys(Keys.CONTROL, "R");

		quitDriver(driver);
	}

}
