package __34_com.learning.Handle_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Cookies_Baeldung_Read extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://baeldung.com");

		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie ck : cookies) {
			System.out.println("Cookie: ck - " + ck);
			System.out.println("Cookie: ck.getName() - " + ck.getName());
			System.out.println("Cookie: ck.getDomain() - " + ck.getDomain());
			System.out.println("Cookie: ck.getPath() - " + ck.getPath());
			System.out.println("Cookie: ck.getValue() - " + ck.getValue());
			System.out.println("Cookie: ck.getExpiry() - " + ck.getExpiry());

		}

		// System.out.println("cookies: " + cookies);
		quitDriver(driver);
	}

}
