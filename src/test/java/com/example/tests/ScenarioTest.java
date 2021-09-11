package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.example.base.TestSuiteBase;

public class ScenarioTest extends TestSuiteBase {

	@Test
	public void executeSession() {
		// First session of WebDriver

		// Goto guru99 site
		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium WebDriver");
		searchBox.sendKeys(Keys.ENTER);

		System.out.println(driver.getTitle());
		// System.out.println(driver.getTitle());

	}
}
