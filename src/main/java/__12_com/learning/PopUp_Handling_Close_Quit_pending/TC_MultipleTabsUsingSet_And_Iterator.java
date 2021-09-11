package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_MultipleTabsUsingSet_And_Iterator extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://accounts.google.com/signup?hl=en");

		System.out.println("Title : " + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

		
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		iterate.next();
		String second_window = iterate.next();
		System.out.println("second_window: " + second_window);
		driver.switchTo().window(second_window);

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
