package __38_com.learning.Zoom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_Zoomin_ZoomOut_UsingRobotClass extends TestBase {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://www.softwaretestingmaterial.com");

		holdScript(3);

		Robot robot = new Robot();
		System.out.println("-----------------");
		System.out.println("About to zoom in");
		for (int i = 0; i < 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		holdScript(3);
		System.out.println("-----------------");
		System.out.println("About to zoom out");
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		quitDriver(driver);
	}
}
