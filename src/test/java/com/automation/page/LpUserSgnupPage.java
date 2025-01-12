package com.automation.page;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class LpUserSgnupPage extends BaseTest {
	WebDriver driver;

	// Constructor
	public LpUserSgnupPage(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div[1]/p/a")
	WebElement loginButton;

	// Step 1: Email and Full Name
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")
	WebElement fullNameField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/p[1]")
	WebElement fullNameFieldError;

	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement emailField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[4]/p[1]")
	WebElement emailFieldError;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/form/div/div[2]/div/div[2]/svg")
	WebElement showPasswordIcon;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/form/div/div[5]/button")
	WebElement firstNextButton;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/form/div/div[2]/h2")
	WebElement stepOneHeading;

	// Step 1 Methods
	public void enterFullName(String fullName) {
		System.out.println("Entering full name: " + fullName);
		fullNameField.sendKeys(fullName);
	}

	public String getFullNameError() {
		String error = fullNameFieldError.getText();
		System.out.println("Full Name Error: " + error);
		return error;
	}

	public void enterEmail(String email) {
		System.out.println("Entering email: " + email);
		emailField.sendKeys(email);
	}

	public String getEmailError() {
		String error = emailFieldError.getText();
		System.out.println("Email Error: " + error);
		return error;
	}

	public void clickShowPassword() {
		System.out.println("Clicking on Show Password icon");
		showPasswordIcon.click();
	}

	public void clickFirstNextButton() {
		System.out.println("Clicking on First Next button");
		firstNextButton.click();
		System.out.println("First Next button clicked successfully");
	}

	public String getStepOneHeading() {
		System.out.println("Going to get the Step one heading and returning it");
		return stepOneHeading.getText();

	}

	// Step 2: Password and Confirm Password
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")
	WebElement passwordField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[3]/p[1]")
	WebElement passwordFieldError;

	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement confirmPasswordField;

	@FindBy(xpath = "")
	WebElement confirmPasswordFieldError;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/form/div/div[5]/button")
	WebElement secondNextButton;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/form/div/div[2]/h2")
	WebElement stepTwoHeading;

	// Step 2 Methods
	public void enterPassword(String password) {
		System.out.println("Entering password");
		passwordField.sendKeys(password);
	}

	public String getPasswordError() {
		String error = passwordFieldError.getText();
		System.out.println("Password Error: " + error);
		return error;
	}

	public void enterConfirmPassword(String confirmPassword) {
		System.out.println("Entering confirm password");
		confirmPasswordField.sendKeys(confirmPassword);
	}

	public String getConfirmPasswordError() {
		String error = confirmPasswordFieldError.getText();
		System.out.println("Confirm Password Error: " + error);
		return error;
	}

	public void clickSecondNextButton() {
		System.out.println("Clicking on Second Next button");
		secondNextButton.click();
		System.out.println("Second Next button clicked successfully");
	}

	public String getStepTwoHeading() {
		System.out.println("Going to get the Step two heading and returning it");
		return stepTwoHeading.getText();
	}

	// Step 3: Sign-Up Button
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/form/div/div[2]/div/button")
	WebElement lastStepSignUpButton;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div/form/div/div[2]/h1")
	WebElement stepThreeHeading;

	public void clickSignUpButton() {
		System.out.println("Clicking on Sign-Up button");
		lastStepSignUpButton.click();
	}

	public String GetStepThreeHeading() {
		System.out.println("Going to get the Step Three Heading");
		return stepThreeHeading.getText();
	}

	// Plan Selection Page
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
	WebElement monthlyPlanView;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/button")
	WebElement yearlyPlanView;

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div[3]/div/div/div[2]/div/div[3]/button")
	WebElement secondYearlyPlan;

	// Plan Selection Methods
	public void clickMonthlyPlanView() {
		System.out.println("Clicking on Monthly Plan View");
		monthlyPlanView.click();
	}

	public void clickYearlyPlanView() {
		System.out.println("Clicking on Yearly Plan View");
		yearlyPlanView.click();
	}

	public void clickSecondYearlyPlan() {
		System.out.println("Clicking on Second Yearly Plan");
		secondYearlyPlan.click();
	}

	// Stripe Flow
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/main/div/form/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div")
	WebElement cardCheckout;

	@FindBy(xpath = "//*[@id=\"cardNumber\"]")
	WebElement stripeCardField;

	@FindBy(xpath = "//*[@id=\"cardExpiry\"]")
	WebElement stripeExpiryDateField;

	@FindBy(xpath = "//*[@id=\"cardCvc\"]")
	WebElement stripeCvcField;

	@FindBy(xpath = "//*[@id=\"billingName\"]")
	WebElement stripeCardHolderNameField;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[3]/button")
	WebElement stripeSubscribeButton;

	// Stripe Methods
	public void selectCardCheckout() {
		System.out.println("Selecting Card Checkout");
		cardCheckout.click();
	}

	public void enterStripeCard(String stripeCard) {
		System.out.println("Entering Stripe Card: " + stripeCard);
		stripeCardField.sendKeys(stripeCard);
	}

	public void enterStripeExpiryDate(String expiryDate) {
		System.out.println("Entering Stripe Expiry Date: " + expiryDate);
		stripeExpiryDateField.sendKeys(expiryDate);
	}

	public void enterStripeCvc(String cvc) {
		System.out.println("Entering Stripe CVC: " + cvc);
		stripeCvcField.sendKeys(cvc);
	}

	public void enterStripeCardHolderName(String cardHolderName) {
		System.out.println("Entering Stripe Card Holder Name: " + cardHolderName);
		stripeCardHolderNameField.sendKeys(cardHolderName);
	}

	public void clickStripeSubscribeButton() throws InterruptedException {
		new Actions(driver).scrollToElement(stripeSubscribeButton).perform();
		Thread.sleep(2000);
		System.out.println("Clicking on Stripe Subscribe button");
		stripeSubscribeButton.click();
	}
}
