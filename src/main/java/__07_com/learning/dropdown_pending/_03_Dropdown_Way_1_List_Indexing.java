package __07_com.learning.dropdown_pending;

import java.util.List;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Dropdown_Way_1_List_Indexing {

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

		// 1st way
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));
		System.out.println("options.size(): " + options.size());
		System.out.println("options.get(2).isEnabled(): " + options.get(2).isEnabled());
		options.get(2).click();

		Thread.sleep(2000);

		// driver.close();

		// Close the all browser instances
		// quit() -> destroys the WebDriver instance
		driver.quit();
	}
}