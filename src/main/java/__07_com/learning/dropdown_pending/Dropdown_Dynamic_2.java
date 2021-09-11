package __07_com.learning.dropdown_pending;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Dynamic_2 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		holdScript(2);

//		(//a[@value='MAA']) - Origin : Chennai  
		// (//a[@value='BLR'])[2] - Destination : Benguluru

		driver.findElement(By.xpath("(//a[@value='MAA'])")).click();
		holdScript(2);

		// driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

		// If Client doesn't allow to use indexing
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']"))
				.click();

		holdScript(2);

		System.out.println(message_success);
		driver.quit();

	}

}