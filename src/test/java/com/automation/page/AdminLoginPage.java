package com.automation.page;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage extends BaseTest {

	WebDriver driver;

	// constructor
	public AdminLoginPage(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/div[1]/input")
	WebElement emailField;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/div/span/form/div[2]/input")
	WebElement passwordField;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/div/span/form/p[3]/a")
	WebElement forgotPasswordTextLink;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/div/span/form/center/button")
	WebElement signInButton;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/p[1]")
	WebElement emailFieldError;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/div/span/form/p[2]")
	WebElement passwordFieldError;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/div/span/form/div[2]/div[2]")
	WebElement passwordEye;

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnSignin() {
		signInButton.click();
	}

	public void clickOnForgotPasswordTextLink() {
		forgotPasswordTextLink.click();
	}

	public void clickOnpasswordEye() {
		passwordEye.click();
	}

	public String getEmailFieldError() {
		return emailFieldError.getText();
	}

	public String getPasswordFieldError() {
		return passwordFieldError.getText();
	}

}
