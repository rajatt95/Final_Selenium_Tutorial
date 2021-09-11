package __10_com.learning.frame;

import org.openqa.selenium.By;
//org.openqa.selenium - Package
//WebDriver - Interface
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_SwitchFrame_ClickOn_Close extends TestBase {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		preSetup(driver);

		navigateToURL(driver, "https://paytm.com/");
		holdScript(2);

		System.out.println("Clicking on Log In/Sign Up");
		driver.findElement(By.xpath("//div[contains(text(),'Log In/Sign Up')]")).click();
		holdScript(2);

		switchToLoginFrame(driver);

		WebElement watchVideo = driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]"));
		System.out.println("Clicking on Watch Video");
		watchVideo.click();
		holdScript(2);
		WebElement close = driver.findElement(By.xpath("//span[contains(text(),'close')]"));
		System.out.println("Clicking on Close text");
		close.click();
		holdScript(2);

		// driver.switchTo().parentFrame();
		System.out.println("Switch back to default content");
		driver.switchTo().defaultContent();
		System.out.println("Clicking on Close icon");
		driver.findElement(By.xpath("//img[@alt='close']")).click();

		quitDriver(driver);
	}

	private static void switchToLoginFrame(WebDriver driver) {
		// Total no. of frames
		System.out.println("Total frames: " + driver.findElements(By.tagName("iframe")).size());

		WebElement loginFrame = driver.findElement(By.xpath("//iframe[contains(@src,'/v1/api/login')]"));
		System.out.println("Switch to Frame");
		driver.switchTo().frame(loginFrame);

	}

}