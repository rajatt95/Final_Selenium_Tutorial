package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MultipleTabsUsing_Set_And_ForLoop extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://accounts.google.com/signup?hl=en");

		System.out.println("Title : " + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

		Set<String> windows = driver.getWindowHandles();

		System.out.println("Windows: " + windows);

		System.out.println("===================");
		for (String window : windows) {
			System.out.println("window : " + window);
			driver.switchTo().window(window);
		}

		holdScript(3);
		System.out.println("Title : " + driver.getTitle());
		driver.findElement(By.linkText("Community")).click();
		holdScript(3);
		System.out.println("Title : " + driver.getTitle());
		holdScript(3);
		System.out.println(message_success);
		// driver.close();
		driver.quit();
	}

}
