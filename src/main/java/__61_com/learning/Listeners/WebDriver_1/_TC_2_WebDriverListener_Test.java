package __61_com.learning.Listeners.WebDriver_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _TC_2_WebDriverListener_Test extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		/*---- Creating the instance of EventFiringWebDriver Class----*/
		EventFiringWebDriver eventRecorder = new EventFiringWebDriver(driver);

		/*---- Creating the instance of parent class "WebdriverListeners" class----*/
		WebDriverListeners eCapture = new WebDriverListeners();

		/* The below step registers the listeners for logging purpose */
		eventRecorder.register(eCapture);

		// Event One
		System.out.println("This is recording Event-One");
		eventRecorder.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		holdScript(2);

		eventRecorder.findElement(By.id("name")).sendKeys("Rajat!");
		holdScript(2);

		eventRecorder.findElement(By.id("alertbtn")).click();
		holdScript(2);

		eventRecorder.switchTo().alert().accept();

		holdScript(3);
		System.out.println(message_success);
		eventRecorder.quit();

	}

}