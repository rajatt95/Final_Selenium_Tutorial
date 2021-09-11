package __05_com.learning.waits;

import java.util.concurrent.TimeUnit;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_TC_Wait_ImplicitWait extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
//		preSetup(driver);

		getBrowserInfo(driver);
		System.out.println("Navigating to: '" + url + "'");
		driver.get(url);
		System.out.println("Maximizing Browser window");
		driver.manage().window().maximize();

		// Implicit wait
		// The Implicit Wait in Selenium is used to tell the web driver to wait for a
		// certain amount of time before it throws a "No Such Element Exception".

		// The default setting is 0. Once we set the time, the web driver will wait for
		// the
		// element for that time before throwing an exception.

		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);

		System.out.println("Title: " + driver.getTitle());

		quitDriver(driver);
	}
}