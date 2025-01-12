package com.automation.utility;

import java.util.Dictionary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HelperMethods {

	public static void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
		System.out.println("Page refreshed");
	}

	public static String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl().toString();
		
	}

	public static String getCurrentTabTitle(WebDriver driver) {
		return driver.getTitle();
		
	}

	public static void cookiesClear(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.localStorage.clear();");
		js.executeScript("window.sessionStorage.clear();");
		System.out.println("Local storage and session storage cleared");
		driver.manage().deleteAllCookies(); 
		System.out.println("Cookies Cleared");


	}
}