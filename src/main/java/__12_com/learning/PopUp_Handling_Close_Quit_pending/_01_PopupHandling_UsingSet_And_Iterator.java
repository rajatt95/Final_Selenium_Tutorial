package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_PopupHandling_UsingSet_And_Iterator {

	public static void main(String[] args) throws InterruptedException {

		// We are setting the property of Chrome Browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"F:\\Work_in_local_machine\\Softwares\\Drivers\\WIN\\chromedriver.exe");

		// Launching Chrome Browser instance
		WebDriver driver = new ChromeDriver();

		navigateToURL(driver, "https://www.naukri.com");

		Thread.sleep(4000);

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		System.out.println("Total windows opened: " + windows.size());

		Iterator<String> iterate = windows.iterator();

		// String window1 = iterate.next();
		String window2 = iterate.next();
		String window3 = iterate.next();
		String window4 = iterate.next();

		// Print the Title of Popup Window 2
		System.out.println("Switching to Window 2");
		driver.switchTo().window(window2);// Alphanumeric ID of Window 2
		System.out.println(driver.getTitle());
		driver.close();

		Thread.sleep(3000);
		// Print the Title of Popup Window 3
		System.out.println("Switching to Window 3");
		driver.switchTo().window(window3);// Alphanumeric ID of Window 3
		System.out.println(driver.getTitle());
		driver.close();

		Thread.sleep(3000);
		// Print the Title of Popup Window 4
		System.out.println("Switching to Window 4");
		driver.switchTo().window(window4);// Alphanumeric ID of Window 3
		System.out.println(driver.getTitle());
		// driver.close();

		Thread.sleep(3000);
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