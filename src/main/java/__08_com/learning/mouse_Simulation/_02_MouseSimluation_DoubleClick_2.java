package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_MouseSimluation_DoubleClick_2 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "http://demo.guru99.com/test/simple_context_menu.html");

		// Double click the button to launch an alertbox
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		System.out.println("Double click on Button to see Alert");
		action.doubleClick(link).perform();

		holdScript(3);

		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" + alert.getText());
		alert.accept();

		quitDriver(driver);
	}

}
