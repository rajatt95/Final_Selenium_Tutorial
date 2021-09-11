package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_PopupHandling_UsingArrayList {

	public static void main(String[] args) throws InterruptedException {

		// We are setting the property of Chrome Browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"F:\\Work_in_local_machine\\Softwares\\Drivers\\WIN\\chromedriver.exe");

		// Launching Chrome Browser instance
		WebDriver driver = new ChromeDriver();

		navigateToURL(driver, "https://www.naukri.com");
		Thread.sleep(4000);

		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows);
		System.out.println("Total windows opened: " + windows.size());
		System.out.println("------------------------------------------");

		for (int i = 0; i < windows.size(); i++) {
			int windowNumber = i + 1;
			System.out.println("Window number : " + windowNumber);
			driver.switchTo().window(windows.get(i));
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}

		quitDriver(driver);
	}

	private static void quitDriver(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("------------");
		System.out.println("Success");
		driver.quit();
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