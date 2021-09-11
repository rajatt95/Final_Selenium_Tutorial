package __12_com.learning.PopUp_Handling_Close_Quit_pending;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewTab_UsingJavaScriptExecutor extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		((JavascriptExecutor) driver).executeScript("window.open()");

		holdScript(2);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());

		holdScript(3);
		System.out.println(message_success);
		// driver.close();
		driver.quit();
	}

}
