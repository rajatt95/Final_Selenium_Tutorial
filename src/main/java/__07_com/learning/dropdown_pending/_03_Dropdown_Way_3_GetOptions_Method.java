package __07_com.learning.dropdown_pending;

import java.util.List;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _03_Dropdown_Way_3_GetOptions_Method {

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

		// 3rd way
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropdown);

		List<WebElement> dropdownValues = select.getOptions();

		System.out.println("Dropdown values: " + dropdownValues.size());
		for (WebElement element : dropdownValues) {
			System.out.println(element.getText());
		}

		// driver.close();

		// Close the all browser instances
		// quit() -> destroys the WebDriver instance
		driver.quit();
	}
}