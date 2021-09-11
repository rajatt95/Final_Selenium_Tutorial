package __37_com.learning.Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_Navigate_To_Back_Forward extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);

		System.out.println("navigate().to(): 'https://www.flipkart.com/'");
		driver.navigate().to("https://www.flipkart.com/");
		holdScript(2);

		System.out.println("driver.getTitle(): " + driver.getTitle());
		System.out.println("navigate().back()");
		driver.navigate().back();

		holdScript(2);
		System.out.println("driver.getTitle(): " + driver.getTitle());

		System.out.println("navigate().forward()");
		driver.navigate().forward();

		holdScript(2);
		System.out.println("driver.getTitle(): " + driver.getTitle());

		quitDriver(driver);
	}
}
