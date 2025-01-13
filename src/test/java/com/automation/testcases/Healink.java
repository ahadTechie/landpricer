package com.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Healink {
	@Test
	public static void  main(){
		// Set the path to your WebDriver executable

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		try {
			// Step 1: Open the web page
			String url = "https://mvp.healink.ai/signIn/"; // Replace with your target URL
			driver.get(url);
			System.out.println("Page opened: " + url);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/button[2]")).click();
			WebElement emailField = driver.findElement(By.xpath(
					"/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/form/div/div/div[1]/div/input"));
			emailField.sendKeys("ahmaddoctor@yopmail.com");
			WebElement passwordField = driver.findElement(By.xpath(
					"/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/form/div/div/div[2]/div/input"));
			passwordField.sendKeys("Password@1");
			driver.findElement(
					By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/form/div/div/button"))
					.click();
			Thread.sleep(5000);
			// Step 2: Wait for 6 minutes (360 seconds)
			System.out.println("Waiting for 6 minutes...");
			Thread.sleep(360_000); // 360,000 ms = 6 minutes

//			// Step 3: Refresh the page
//			System.out.println("Refreshing the page...");
//			driver.navigate().refresh();

			// Step 4: Get the current page URL
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current URL after refresh: " + currentUrl);

			// Step 5: Assert the URL
			Assert.assertEquals(currentUrl, url, "The page URL did not match the expected URL!");
			System.out.println("Test Passed: URL matches the expected value.");
		} catch (Exception e) {
			// Handle exceptions
			e.printStackTrace();
		} finally {
			// Close the browser
			if (driver != null) {
				driver.quit();
			}
		}
	}
}
