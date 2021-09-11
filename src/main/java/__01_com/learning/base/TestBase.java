package __01_com.learning.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {

	// Manual
	protected final static String chromeDriver = "webdriver.chrome.driver";
	protected final static String chromeDriverPath = "F:\\Work_in_local_machine\\Softwares\\Drivers\\WIN\\chromedriver.exe";

	protected final static String firefoxDriver = "webdriver.gecko.driver";
	protected final static String firefoxDriverPath = "F:\\Work_in_local_machine\\Softwares\\Drivers\\WIN\\geckodriver.exe";

	protected final static String edgeDriver = "webdriver.edge.driver";
	protected final static String edgeDriverPath = "F:\\Work_in_local_machine\\Softwares\\Drivers\\WIN\\msedgedriver.exe";

	// MAC
	// public final static String chromeDriverPath =
	// "//Users//Rajat//Downloads//chromedriver";

	protected final static String searchBox_Name = "q";
	protected final static String searchBox_textToEnter = "Full Stack Test Automation Engineer";

	protected final static String url = "https://www.google.com/";
	protected final static int implicitWait = 10;

	protected final static String message_success = "Success";

	protected static void preSetup(WebDriver driver) {
		getBrowserInfo(driver);

		System.out.println("Navigating to: '" + url + "'");
		driver.get(url);

		System.out.println("Maximizing Browser window");
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);

	}

	protected static void getBrowserInfo(WebDriver driver) {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		String os = cap.getPlatform().toString();
		String version = cap.getVersion().toString();

		System.out.println("===============================");
		System.out.println("Operating System: " + os);
		System.out.println("Browser: " + browserName.toUpperCase() + " - " + version);
		System.out.println("===============================");
		holdScript(2);
	}

	protected static void navigateToURL(WebDriver driver, String url) {
		System.out.println("Navigating to: '" + url + "'");
		driver.get(url);
		holdScript(2);
	}

	protected static void doSearchInGoogle(WebDriver driver) {

		WebElement searchBox = driver.findElement(By.name(searchBox_Name));
		System.out.println("Google search box: " + searchBox_textToEnter);
		searchBox.sendKeys(searchBox_textToEnter);
		System.out.println("Hit Enter");
		searchBox.sendKeys(Keys.ENTER);

		holdScript(2);
	}

	protected static void setDimensionOfBowserWindow(WebDriver driver, int width, int height) {
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
		holdScript(1);

	}

	protected static void quitDriver(WebDriver driver) {
		holdScript(3);
		System.out.println(message_success);
		driver.quit();
	}

	protected static void holdScript(int seconds) {
		System.out.println("------------------------------------------Wait for: " + seconds + " seconds");
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
