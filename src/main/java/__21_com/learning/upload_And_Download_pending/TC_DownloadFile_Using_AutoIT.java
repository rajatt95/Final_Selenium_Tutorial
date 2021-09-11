package __21_com.learning.upload_And_Download_pending;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DownloadFile_Using_AutoIT extends TestBase {

	public static void main(String[] args) {

		deleteFileIfPresent_Inside_DownloadFolder();

		String downloadPath = System.getProperty("user.dir") + "\\src\\test\\resources\\downloadFile\\";
		WebDriver driver = doConfiguration_ChromeBrowser(downloadPath);

		driver.get("https://smallpdf.com/pdf-to-jpg");

		uploadFile(driver);

		downloadConvertedFile(driver);

		checkWhether_FileIsDownloaded_AtGivenLocationOrNot(downloadPath);

		holdScript(3);
		System.out.println(message_success);
		driver.quit();
	}

	private static void deleteFileIfPresent_Inside_DownloadFolder() {

		String directoryPath = ".\\src\\test\\resources\\downloadFile\\";

		File directory = new File(directoryPath);

		// Get all files in directory

		File[] files = directory.listFiles();
		for (File file : files) {
			// Delete each file
			if (!file.delete()) {
				// Failed to delete file
				System.out.println("Failed to delete " + file);
			}
		}
		System.out.println("Files Deleted successfully");
	}

	private static void checkWhether_FileIsDownloaded_AtGivenLocationOrNot(String downloadPath) {
		File file = new File(downloadPath + "/3-6 Years - 01-Feb-images.zip");

		if (file.exists()) {
			System.out.println("File has been successfully downloaded");
		}
	}

	private static WebDriver doConfiguration_ChromeBrowser(String downloadPath) {

		WebDriverManager.chromedriver().setup();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);
		preSetup(driver);
		return driver;
	}

	private static void downloadConvertedFile(WebDriver driver) {
		// Explicit - WebDriverWait
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='kov65o-0 iPohUv']//div[1]//label[1]//div[1]")));
		driver.findElement(By.xpath("//div[@class='kov65o-0 iPohUv']//div[1]//label[1]//div[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Choose option']")).click();
		driver.findElement(By.xpath("//span[@class='wnolmd-2 etrSPs']")).click();

		holdScript(4);
	}

	private static void uploadFile(WebDriver driver) {
		driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();

		holdScript(4);
		try {
			Runtime.getRuntime().exec(".//src//test//resources//fileUpload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}