package __22_com.learning.browser.element.size;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ElementSize extends TestBase {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		WebElement textBox_Search = driver.findElement(By.name("q"));
		System.out.println("textBox_Search.getSize().getHeight(): " + textBox_Search.getSize().getHeight());
		System.out.println("textBox_Search.getSize().getWidth(): " + textBox_Search.getSize().getWidth());

		WebElement button_googleSearch = driver
				.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		System.out.println("button_googleSearch.getSize().getHeight(): " + button_googleSearch.getSize().getHeight());
		System.out.println("button_googleSearch.getSize().getWidth(): " + button_googleSearch.getSize().getWidth());

		quitDriver(driver);
	}

}
