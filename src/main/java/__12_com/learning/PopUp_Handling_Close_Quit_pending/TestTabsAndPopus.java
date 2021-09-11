package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsAndPopus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hdfcbank.com/");

		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("=======Generating window IDs from First window=======");
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();

		String first_window = iterate.next();
		System.out.println(first_window);

		driver.findElement(By.xpath("//*[@id=\"custom-button\"]/button")).click();

		// 2nd window

		System.out.println("=======Generating window IDs from second window=======");
		windows = driver.getWindowHandles();
		iterate = windows.iterator();

		System.out.println(iterate.next());// first window
		String second_window = iterate.next();// second window
		System.out.println(second_window);

		driver.switchTo().window(second_window);
		driver.findElement(
				By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[1]"))
				.click();

		System.out.println("Success");

		Thread.sleep(6000);
		driver.quit();
	}

}
