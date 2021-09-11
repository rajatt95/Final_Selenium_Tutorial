package __34_com.learning.Handle_Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Cookies_Baeldung_SearchSpecific extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://baeldung.com");

		Cookie lpCookie = driver.manage().getCookieNamed("_drip_client_9539554");
		System.out.println("lpCookie: " + lpCookie);
		System.out.println("lpCookie.getDomain(): " + lpCookie.getDomain());
		System.out.println("lpCookie.getPath(): " + lpCookie.getPath());
		System.out.println("lpCookie.getValue(): " + lpCookie.getValue());
		System.out.println("lpCookie.getExpiry(): " + lpCookie.getExpiry());

		quitDriver(driver);
	}

}
