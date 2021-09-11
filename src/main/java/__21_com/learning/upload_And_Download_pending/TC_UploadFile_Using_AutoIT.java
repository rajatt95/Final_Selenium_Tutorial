package __21_com.learning.upload_And_Download_pending;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_UploadFile_Using_AutoIT extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();
		holdScript(4);
		try {
			Runtime.getRuntime().exec(".//src//test//resources//fileUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		holdScript(3);
		System.out.println(message_success);
		driver.quit();
	}

}