package __08_com.learning.mouse_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_MouseSimulation_RightClick_2 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		// Launch the Application Under Test (AUT)
		navigateToURL(driver, "http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		// Right click the button to launch right click menu options
		System.out.println("Right click the button to launch right click menu options");
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(link).perform();

		holdScript(2);
		// Click on Edit link on the displayed menu options
		System.out.println("Click on Edit link on the displayed menu options");
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();

		holdScript(1);
		// Accept the alert displayed
		System.out.println("Accept the alert displayed");
		driver.switchTo().alert().accept();
		quitDriver(driver);
	}

}
