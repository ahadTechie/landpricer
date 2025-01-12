package com.automation.page;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigDataProviders;
import com.automation.utility.ReadExcelFile;

public class BaseTest {

	public static WebDriver driver;
	public ConfigDataProviders config;
	public ReadExcelFile excel;
	public WebDriverWait wait;

	@BeforeSuite
	public void setUpSuite() {
		config = new ConfigDataProviders();
		excel = new ReadExcelFile();
	}

	@BeforeClass
	public void setUp() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingUrl());
		wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait up to 30 seconds

	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}

	public void captureScreenShot(WebDriver driver, String testName) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		// Step 2 :call getScreenshotAs method to capture image file

		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File srcpath = new File("." + "//Screenshots//" + testName + ".png");

		// Step 3 : copy image file to destination
		FileUtils.copyFile(src, srcpath);

	}

}
