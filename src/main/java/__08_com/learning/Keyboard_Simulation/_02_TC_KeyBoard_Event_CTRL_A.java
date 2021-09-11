package __08_com.learning.Keyboard_Simulation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_KeyBoard_Event_CTRL_A extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://demoqa.com/text-box");

		// Enter the Full Name
		System.out.println("Enter the Full Name");
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.Peter Haynes");

		// Enter the Email
		System.out.println("Enter the Email");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("PeterHaynes@toolsqa.com");

		// Enter the Current Address
		System.out.println("Enter the Current Address");
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");

		// Copy the Current Address
		System.out.println("Select the Current Address");
		currentAddress.sendKeys(Keys.CONTROL, "A"); // Select all
		holdScript(1);
		System.out.println("Copy the Current Address");
		currentAddress.sendKeys(Keys.CONTROL, "C"); // Copy
		holdScript(1);

		// Press the TAB Key to Switch Focus to Permanent Address
		System.out.println("Press the TAB Key to Switch Focus to Permanent Address");
		currentAddress.sendKeys(Keys.TAB);

		// Paste the Address in the Permanent Address field
		System.out.println("Paste the Address in the Permanent Address field");
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		holdScript(1);
		permanentAddress.sendKeys(Keys.CONTROL, "V"); // Paste

		quitDriver(driver);
	}

}
