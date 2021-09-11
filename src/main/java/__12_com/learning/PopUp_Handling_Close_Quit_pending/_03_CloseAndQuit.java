package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.concurrent.TimeUnit;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {

		// We are setting the property of Chrome Browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"F:\\Work_in_local_machine\\Softwares\\Drivers\\WIN\\chromedriver.exe");

		// Launching Chrome Browser instance
		WebDriver driver = new ChromeDriver();

		navigateToURL(driver, "https://www.google.com");

		quitDriver(driver);
	}

	private static void quitDriver(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("------------");
		System.out.println("Success");

		driver.quit();
		// driver.close();
	}

	private static void navigateToURL(WebDriver driver, String url) {

		// Introduce Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(url);

		System.out.println("driver.getCurrentUrl(): " + driver.getCurrentUrl());
		System.out.println("driver.getTitle(): " + driver.getTitle());
		System.out.println("-----------------------------");
	}
}