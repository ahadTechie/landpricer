package com.automation.testcases;

import java.io.*;
import java.nio.file.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.page.AdminLoginPage;
import com.automation.page.BaseTest;
import com.automation.page.LpUserSgnupPage;
import com.automation.utility.HelperMethods;

public class LpUserSignupTest extends BaseTest {

	@Test
	public void LpAccountCreation() throws InterruptedException {
		LpUserSgnupPage lpUserSignupPage = new LpUserSgnupPage(driver);
		// Utility Method to Handle Count File
		int count = getCountAndIncrement("count.txt");

		// Dynamic Test Data
		String email = "testinguser" + count + "@yopmail.com";
		String fullName = "Test User";
		String password = "Password@1";
		String stripeCardNumber = "4242424242424242";
		String stripeCardExpiryDate = "0228";
		String stripeCardCvc = "123";
		String stripeCardHolderName = "Abdul Ahad";

		// Step 1: Enter Full Name
		lpUserSignupPage.enterFullName(fullName);
		String actualFullNameErrorMessage = lpUserSignupPage.getFullNameError();
		Assert.assertEquals(actualFullNameErrorMessage, "", "There is an issue with the Full Name field!");

		// Step 2: Enter Email
		lpUserSignupPage.enterEmail(email);
		String actualEmailErrorMessage = lpUserSignupPage.getEmailError();
		Assert.assertEquals(actualEmailErrorMessage, "", "There is an issue with the Email field!");
		Thread.sleep(2000);

		// Step 3: Navigate through Signup Steps
		lpUserSignupPage.clickFirstNextButton();
		lpUserSignupPage.clickFirstNextButton();
		lpUserSignupPage.clickFirstNextButton();
		String actualStepTwoHeadingText = lpUserSignupPage.getStepTwoHeading();
		Assert.assertEquals(actualStepTwoHeadingText, "Create Password",
				"Test case didn't proceed to Step 2 due to an issue in Step 1!");

		// Step 4: Enter Password and Confirm Password
		lpUserSignupPage.enterPassword(password);
		lpUserSignupPage.enterConfirmPassword(password);
		Thread.sleep(2000);

		// Step 5: Navigate to Step 3
		lpUserSignupPage.clickSecondNextButton();
		Thread.sleep(2000);
		String actualStepThirdHeadingText = lpUserSignupPage.GetStepThreeHeading();
		Assert.assertEquals(actualStepThirdHeadingText, "PERFECT",
				"Test case didn't proceed to Step 3 due to an issue in Step 2!");

		// Step 6: Complete Signup and Payment Process
		lpUserSignupPage.clickSignUpButton();
		lpUserSignupPage.clickYearlyPlanView();
		lpUserSignupPage.clickSecondYearlyPlan();
		lpUserSignupPage.selectCardCheckout();
		lpUserSignupPage.enterStripeCard(stripeCardNumber);
		lpUserSignupPage.enterStripeExpiryDate(stripeCardExpiryDate);
		lpUserSignupPage.enterStripeCvc(stripeCardCvc);
		lpUserSignupPage.enterStripeCardHolderName(stripeCardHolderName);
		lpUserSignupPage.clickStripeSubscribeButton();

		// Step 7: Validate Landing Page URL
		boolean isUrlCorrect = wait
				.until(ExpectedConditions.urlToBe("https://dev.d3dgb06idadf3m.amplifyapp.com/user/chat"));
		String actualTitle = HelperMethods.getCurrentPageUrl(driver);
		Assert.assertEquals(actualTitle, "https://dev.d3dgb06idadf3m.amplifyapp.com/user/chat",
				"The landing URL of the chat page is not correct!");
	}

	// Utility Method to Read and Increment Count
	private int getCountAndIncrement(String filePath) {
		int count = 0;

		try {
			Path path = Paths.get(filePath);
			if (Files.exists(path)) {
				String content = Files.readString(path).trim();
				count = Integer.parseInt(content);
			}
			count++;
			Files.writeString(path, String.valueOf(count));
			System.out.println("Updated count saved to file: " + count);
		} catch (IOException | NumberFormatException e) {
			System.out.println("Error handling count file: " + e.getMessage());
		}

		return count;
	}
}
