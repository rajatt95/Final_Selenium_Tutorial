package __07_com.learning.dropdown_pending;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Static_1 extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.spicejet.com/");

		driver.findElement(By.id("divpaxinfo")).click();
		holdScript(2);
		WebElement adultsCountDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select select = new Select(adultsCountDropdown);
		holdScript(2);

		select.selectByValue("5");
		holdScript(2);

		select.selectByIndex(2);
		// select.deselectByIndex(2);

		quitDriver(driver);
	}

}