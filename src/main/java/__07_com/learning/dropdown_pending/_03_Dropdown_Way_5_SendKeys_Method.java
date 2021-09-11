package __07_com.learning.dropdown_pending;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Dropdown_Way_5_SendKeys_Method {

	public static void main(String[] args) throws InterruptedException {

		// We are setting the property of Chrome Browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"F:\\Work_in_local_machine\\Softwares\\Drivers\\WIN\\chromedriver.exe");

		// Launching Chrome Browser instance
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);

		System.out.println("driver.getCurrentUrl(): " + driver.getCurrentUrl());
		System.out.println("driver.getTitle(): " + driver.getTitle());
		System.out.println("-----------------------------");

		// 5th way
		WebElement options = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		// If Optiddsadsaon1 is not available, then, it will not throw any Exception
		options.sendKeys("Optiddsadsaon1");
		// options.sendKeys("Option1");
		Thread.sleep(2000);
		// driver.close();

		// Close the all browser instances
		// quit() -> destroys the WebDriver instance
		driver.quit();
	}
}