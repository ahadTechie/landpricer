package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	@SuppressWarnings("deprecation")
	public static WebDriver startApplication(WebDriver driver, String browserName, String appUrl) {

		if (browserName.equals("Chrome")) {
//			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
//			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("We do not support this browser ");
		}

		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;

	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
