package __34_com.learning.Handle_Cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.baeldung.com/java-selenium-webdriver-cookies
public class _01_TC_Cookies_FacebookLogin_Read extends TestBase {

	// driver.manage().getCookies(); // Return The List of all Cookies
	// driver.manage().getCookieNamed(arg0); //Return specific cookie according to
	// name
	// driver.manage().addCookie(arg0); //Create and add the cookie
	// driver.manage().deleteCookie(arg0); // Delete specific cookie
	// driver.manage().deleteCookieNamed(arg0); // Delete specific cookie according
	// Name
	// driver.manage().deleteAllCookies(); // Delete all cookies

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.facebook.com/");

		System.out.println("Clicking on English (UK)");
		driver.findElement(By.xpath("//a[text()='English (UK)']")).click();

		System.out.println("Enter 'abc@gmail.com' in Email field");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Wait for Password and fill data

		System.out.println("Enter 'xyz_password' in Password field");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("xyz_password");

		// Wait for Login button and click
		System.out.println("Clicking on Sign in button");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Log In']")))
				.click();

		for (Cookie ck : driver.manage().getCookies()) {
			System.out.println("--------------------");
			System.out.println(ck.getName());
			System.out.println(ck.getDomain());
			System.out.println(ck.getValue());
			System.out.println(ck.getPath());
			System.out.println(ck.getExpiry());
			System.out.println(ck.isSecure());

		}
		quitDriver(driver);
	}

}
