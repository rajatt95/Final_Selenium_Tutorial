package __07_com.learning.dropdown_pending;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _03_Dropdown_Way_2_Select_Class_Recommended {

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

		// 2nd way
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropdown);

		System.out.println("select.getFirstSelectedOption().getText(): " + select.getFirstSelectedOption().getText());

		// Select value using index
		select.selectByIndex(2);
		System.out.println("selectByIndex(2): " + select.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		// Select value using value

		// org.openqa.selenium.NoSuchElementException -
		// select.selectByValue("option3fdgfd");
		select.selectByValue("option3");
		System.out.println("selectByValue(\"option3\"):  " + select.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		// Select value using Visible Text
		select.selectByVisibleText("Option1");
		System.out.println("selectByVisibleText(\"Option1\"): " + select.getFirstSelectedOption().getText());
		Thread.sleep(3000);

		// driver.close();

		// Close the all browser instances
		// quit() -> destroys the WebDriver instance
		driver.quit();
	}
}