package __34_com.learning.Handle_Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_TC_Cookies_TutorialsPoint extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.tutorialspoint.com/index.htm");

		// cookie set with name and value
		Cookie ck = new Cookie("Automation", "QA");

		// cookie newly added
		driver.manage().addCookie(ck);

		// get all cookies
		Set<Cookie> cks = driver.manage().getCookies();
		// iterate the cookies
		for (Cookie cook : cks) {
			System.out.println("Cookie name is: " + cook.getName());
			System.out.println("Cookie Value is : " + cook.getValue());
		}
		// delete all
		driver.manage().deleteAllCookies();

		// get cookies
		Set<Cookie> chs = driver.manage().getCookies();
		System.out.println("Cookie count after delete: " + chs.size());

		quitDriver(driver);
	}

}
