package __61_com.learning.Listeners.WebDriver_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

/**
 * AbstractWebDriverEventListener Class which provides us with the facility of
 * implementing only those methods in which we are interested.
 */
public class AbstractWebDriverListeners extends AbstractWebDriverEventListener {

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
}