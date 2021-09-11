package __09_com.learning.webTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_WebTable_Column_Sorting extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://rahulshettyacademy.com/seleniumPractise/#/offers");

		System.out.println("Clicking on: Veg/fruit name");
		driver.findElement(By.xpath("//span[normalize-space()='Veg/fruit name']")).click();
		
		holdScript(1);
		
		System.out.println("Clicking on: Veg/fruit name");
		driver.findElement(By.xpath("//span[normalize-space()='Veg/fruit name']")).click();

		List<WebElement> elements = driver.findElements(By.xpath("//tr//td[1]"));

		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++) {
			// System.out.println(elements.get(i).getText());
			originalList.add(elements.get(i).getText());
		}

		System.out.println("===============");
		System.out.println("Before Sort");
		System.out.println(originalList);

		Collections.sort(originalList);
		System.out.println("===============");
		System.out.println("After Sort");

		System.out.println("Asc. order : " + originalList);

		Collections.reverse(originalList);
		System.out.println("Desc. order : " + originalList);
		System.out.println("======================");
		System.out.println("Comparison result of 2 Lists : " + elements.equals(originalList));

		quitDriver(driver);
	}

}
