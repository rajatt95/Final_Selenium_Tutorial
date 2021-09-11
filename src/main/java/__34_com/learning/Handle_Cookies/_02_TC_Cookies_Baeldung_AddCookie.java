package __34_com.learning.Handle_Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.baeldung.com/java-selenium-webdriver-cookies
public class _02_TC_Cookies_Baeldung_AddCookie extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://baeldung.com");

		Cookie cookie = new Cookie("foo", "bar");
		driver.manage().addCookie(cookie);
		Cookie driverCookie = driver.manage().getCookieNamed("foo");

		System.out.println("driverCookie.getValue(): " + driverCookie.getValue());

		// System.out.println("cookies: " + cookies);
		quitDriver(driver);
	}

}
