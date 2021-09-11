package __04_com.learning.loadURL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_TC_Load_URL_Using_NAVIGATE extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// preSetup(driver);

		getBrowserInfo(driver);

		System.out.println("Maximizing Browser window");
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);

		String url = "https://www.toolsqa.com";
		System.out.println("Navigating to: '" + url + "' using navigate().to() method.");
		driver.navigate().to(url);

		quitDriver(driver);
	}

}
