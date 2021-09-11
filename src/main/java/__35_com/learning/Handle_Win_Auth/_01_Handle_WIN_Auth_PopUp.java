package __35_com.learning.Handle_Win_Auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_Handle_WIN_Auth_PopUp extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		String username = "admin";
		String password = "admin";
		String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/";
		/*
		 * driver.get("https://the-internet.herokuapp.com/");
		 */

		navigateToURL(driver, URL);

		System.out.println("Clicking on Basic Auth");
		driver.findElement(By.linkText("Basic Auth")).click();

		WebElement congratsMessage = driver
				.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]"));

		System.out.println("Congratulations message status: " + congratsMessage.isDisplayed());
		System.out.println("Congratulations message text: " + congratsMessage.getText());

		quitDriver(driver);
	}

}