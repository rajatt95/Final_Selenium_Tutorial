package __21_com.learning.upload_And_Download_pending;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_UploadFile_Using_SendKeys_NotWorking extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://smallpdf.com/pdf-to-jpg");

		/*
		 * driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();
		 * 
		 * holdScript(4);
		 * 
		 * 
		 * try { Runtime.getRuntime().exec(".//src//test//resources//fileUpload.exe"); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 */

		String baseUrl = "http://demo.guru99.com/test/upload/";
		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys(".//src//test//resources//uploadFile//3-6 Years - 01-Feb.pdf");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
		holdScript(3);
		System.out.println(message_success);
		driver.quit();
	}

}