package com.automation.testcases;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.page.BaseTest;
import com.automation.utility.HelperMethods;
import com.automation.page.AdminLoginPage;

public class AdminLoginTest extends BaseTest {

	AdminLoginPage adminLoginPage;

	@BeforeMethod
	public void gettingStarted() {
		adminLoginPage = new AdminLoginPage(driver);
		HelperMethods.cookiesClear(driver);
		HelperMethods.refreshPage(driver);
		
	}

	@Test
	public void redirectToTheAdminLogin() {
		driver.get("https://shelters.catalystpet.com/adminLogin");
		Assert.assertEquals(HelperMethods.getCurrentPageUrl(driver), "https://shelters.catalystpet.com/adminLogin");
	}

	@Test
	public void submitWithoutAnyInfo() throws InterruptedException {
		adminLoginPage.clickOnSignin();
		Thread.sleep(2000);
		System.out.println(HelperMethods.getCurrentPageUrl(driver));
	}

	@Test
	public void testingEachFieldRegex() {
		// Use methods from AdminLoginPage for interactions
		adminLoginPage.enterEmail("invalidemail");
		adminLoginPage.enterPassword("invalidpassword");
		adminLoginPage.clickOnSignin();// Add necessary assertions or action

	}

	@Test
	public void testingRequiredFieldRegex() {
		System.out.println("testingRequiredFieldRegex");
		// Add test logic and assertions
	}

//	@Test
//	public void submitCorrectAdminCreds() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.get("https://shelters.catalystpet.com/adminLogin");
//		adminLoginPage.enterEmail("catalystpet@gmail.com");
//		adminLoginPage.enterPassword("Pellets3!");
//		adminLoginPage.clickOnSignin();// Add necessary assertions or action
//		System.out.println("submitCorrectAdminCreds");
//		Thread.sleep(5000);
//		HelperMethods.cookiesClear(driver);
//		Thread.sleep(2000);
//		HelperMethods.refreshPage(driver);
//		Thread.sleep(40000);
//
//	}

	@Test
	public void confirmingAdminLogin() {
		System.out.println("confirmingAdminLogin");
		Assert.assertEquals(HelperMethods.getCurrentPageUrl(driver),
				"https://shelters.catalystpet.com/admin/dashboard");
	}

	@Test
	public void submitCorrectAdminCreds() throws InterruptedException {
		adminLoginPage.enterEmail("catalystpet@gmail.com");
		adminLoginPage.enterPassword("Pellets3!");
		adminLoginPage.clickOnSignin();
	}
	

}
