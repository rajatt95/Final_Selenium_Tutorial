package __24_com.learning.cloud;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC_SauceLabs {

	public static final String USERNAME = "Your_Username";

	public static final String ACCESS_KEY = "xxxxxxx";

	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "51.0");
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL(URL), caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("Full Stack Test Automation Engineer");
		searchBox.sendKeys(Keys.ENTER);

	}

}
