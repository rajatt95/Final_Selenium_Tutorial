package __61_com.learning.Listeners.WebDriver_1;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * WebDriverEventListener which is an interface that has some predefined methods
 * for tracking the Webdriver events. It requires us to implement ALL the
 * methods predefined in the Interface.
 */

public class WebDriverListeners implements WebDriverEventListener {

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Alert Accept " + arg0.toString());
	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Alert Dismiss " + arg0);

	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("After value change of" + arg0);

	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After clicked" + arg0);
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("After Find By" + arg1);

	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Back");
	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("After Navigate Forward");
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("On Navigating Refresh");
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("On Navigating To" + arg0);

	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After Script");
	}

	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Alert Accept");
	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Alert Dismiss");
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("Before Change Value of" + arg0);
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Before Click on" + arg0);
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Before Find By" + arg0);
	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigate Back");
	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigate Forward");
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigate Refresh");
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigate To" + arg0);
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Before Script");
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("On Exception" + arg0);
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub

	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub

	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub

	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub

	}

}