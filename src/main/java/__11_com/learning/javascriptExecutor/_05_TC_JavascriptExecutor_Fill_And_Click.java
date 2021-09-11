package __11_com.learning.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _05_TC_JavascriptExecutor_Fill_And_Click extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://en-gb.facebook.com/");

		JavascriptExecutor jse = ((JavascriptExecutor) driver);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		// email.sendKeys("abcd@gmail.com");

		// arguments[0].value='---your email id---'; -> Javascript code
		System.out.println("Fill Email address");
		jse.executeScript("arguments[0].value='abcd@gmail.com';", email);
		holdScript(1);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println("Fill Password");
		jse.executeScript("arguments[0].value='abc323656121254';", pass);

		holdScript(1);
		WebElement button_login = driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		System.out.println("Click on Login button");
		jse.executeScript("arguments[0].click();", button_login);

		quitDriver(driver);	}

}
