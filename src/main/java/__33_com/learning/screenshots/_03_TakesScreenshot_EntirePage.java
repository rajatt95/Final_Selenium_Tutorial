package __33_com.learning.screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class _03_TakesScreenshot_EntirePage extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.airbnb.co.in/s/India/");

		// take screenshot of the entire page
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		try {
			Date date = new Date();
			String fileName = "Entire Screen_" + date.toString().replace(":", "_").replace(" ", "_") + ".jpg";
			System.out.println("Entire Screen Screenshot name: " + fileName);
			ImageIO.write(screenshot.getImage(), "PNG", new File(".//screenshot//" + fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}

		quitDriver(driver);

	}

}
