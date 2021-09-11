package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MultipleWindows_UsingArrayList_Pending extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://toolsqa.com/automation-practice-switch-windows/");
		WebElement clickElement = driver.findElement(By.id("windowButton"));

		for (int i = 0; i < 3; i++) {
			clickElement.click();
			holdScript(3);
		}

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			System.out.println("Switching to window - > " + handle);
			System.out.println("Navigating to google.com");
			driver.switchTo().window(handle); // Switch to the desired window first and then execute commands using
												// driver
			driver.get("https://google.com");
			Dimension dim = new Dimension(850, 700);
			driver.manage().window().setSize(dim);
		}

		System.out.println(message_success);
		// driver.close();
		driver.quit();
	}

}
