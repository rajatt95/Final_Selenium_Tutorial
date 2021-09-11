package __07_com.learning.dropdown_pending;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_GetAllValues extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);

		driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='selType']")));

		// getting the list of options in the dropdown with getOptions()
		List<WebElement> listOfOptions = select.getOptions();
		int size = listOfOptions.size();
		for (int optionsIndex = 0; optionsIndex < size; optionsIndex++) {
			String options = listOfOptions.get(optionsIndex).getText();
			System.out.println(options);
		}
		System.out.println(message_success);
		driver.quit();

	}

}