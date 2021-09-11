package __23_com.learning.GetCoordinates;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Get_Coordinates extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");
		Point point = driver.findElement(By.xpath("//img[@class='logoClass']")).getLocation();

		holdScript(1);
		System.out.println("point.x: " + point.x);
		System.out.println("point.y: " + point.y);
		quitDriver(driver);
	}

}
