package __61_com.learning.Listeners.WebDriver_1;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listeners_Tests extends WebDriverListeners {

	static WebElement e;
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		/* Setting the capabilities of Chrome Driver */
		try {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			Proxy proxy = new Proxy();
			String proxyServer = String.format("AProxyIDontWantToDisplay", System.getenv("proxy.username"),
					System.getenv("proxy.password"));
			proxy.setHttpProxy(proxyServer);
			capabilities.setCapability("proxy", proxy);
			ChromeOptions options = new ChromeOptions();
			options.addArguments(Arrays.asList("--no-sandbox", "--ignore-certificate-errors", "--homepage=about:blank",
					"--no-first-run"));
			options.addArguments("disable-infobars");
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(capabilities);
		}

		catch (Exception e) {

			throw new Error(e);
		}

		/*---- Creating the instance of EventFiringWebDriver Class----*/

		EventFiringWebDriver eventRecorder = new EventFiringWebDriver(driver);

		/*---- Creating the instance of parent class "WebdriverListeners" class----*/

		WebDriverListeners eCapture = new WebDriverListeners();

		/* The below step registers the listeners for logging purpose */

		eventRecorder.register(eCapture);

		// Event One
		System.out.println("This is recording Event-One");
		eventRecorder.navigate().to("https://www.google.com");

		// Event Two
		System.out.println("This is recording Event-Two");
		eventRecorder.findElement(By.xpath("//a[text()='Sign in']")).click();

		// Event Three
		System.out.println("This is recording Event-Three");
		eventRecorder.findElement(By.id("identifierId")).clear();

		Thread.sleep(5000);

		// Event Four
		System.out.println("This is recording Event-Four");
		eventRecorder.findElement(By.id("identifierId")).sendKeys("abc@gmail.com");

		Thread.sleep(5000);

		// Event Five
		System.out.println("This is recording Event-Five");
		eventRecorder.navigate().back();

		// Event Six
		System.out.println("This is recording Event-Six");
		eventRecorder.navigate().forward();

		// Event Seven
		System.out.println("This is recording Event-Seven");
		eventRecorder.navigate().refresh();

		// Event Eight
		System.out.println("This is recording Event-Eight");
		eventRecorder.get("https://www.irctc.co.in/eticketing/loginHome.jsf");

		// Event Nine
		System.out.println("This is recording Event-Nine");
		eventRecorder.findElement(By.id("loginbutton")).click();

		try {
			Alert alert = eventRecorder.switchTo().alert();

			// check if alert exists
			// TODO find better way
			alert.getText();

			// Event Ten
			System.out.println("This is recording Event-Ten");
			alert.accept();
		} catch (Exception e) {
		}
		Thread.sleep(3000);
		eventRecorder.findElement(By.id("loginbutton")).click();
		try {
			Alert alert = eventRecorder.switchTo().alert();

			// check if alert exists
			// TODO find better way
			alert.getText();

			// Event Eleven
			System.out.println("This is recording Event-Eleven");
			alert.dismiss();
		} catch (Exception e) {
		}

		// Intentionally giving wrong id so it triggers onException Listener--> Event
		// Twelve
		System.out.println("This is recording Event-Twelve");
		eventRecorder.findElement(By.id("loginbutn")).click();

	}

}