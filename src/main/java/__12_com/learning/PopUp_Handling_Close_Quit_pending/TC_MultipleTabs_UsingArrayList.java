package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MultipleTabs_UsingArrayList extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://accounts.google.com/signup?hl=en");

		System.out.println("Title : " + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

		/*
		 * Set<String> windows = driver.getWindowHandles(); Iterator<String> iterate =
		 * windows.iterator(); iterate.next(); String second_window = iterate.next();
		 * driver.switchTo().window(second_window);
		 */

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		System.out.println("tabs2.get(1):  " + tabs2.get(10));
		System.out.println("Title : " + driver.getTitle());
		driver.findElement(By.linkText("Community")).click();
		holdScript(2);
		System.out.println("Title : " + driver.getTitle());
		holdScript(2);
		driver.close();
		holdScript(2);
		driver.switchTo().window(tabs2.get(0));
		System.out.println("tabs2.get(0): " + tabs2.get(0));
		holdScript(1);
		System.out.println("Title : " + driver.getTitle());

		System.out.println(message_success);
		// driver.close();
		driver.quit();
	}

}
