package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPasswordScreen extends BaseTest {

	WebDriver driver;

	// constructor
	public NewPasswordScreen(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/div[1]/input")
	WebElement passwordField;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/div[1]/div[2]/svg")
	WebElement passwordFieldEyeIcon;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/p[1]")
	WebElement passwordFieldErrorMessage;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/div[2]/input")
	WebElement confirmPasswordField;
	@FindBy(xpath = "")
	WebElement confirmPasswordFieldEyeIcon;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/p[2]")
	WebElement confirmPasswordFieldErrorMessage;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/center/button")
	WebElement saveButton;

	public void enterPassworText(String password) {
		passwordField.sendKeys(password);
	}

	public String getPasswordFieldErrorMessage() {
		return passwordFieldErrorMessage.getText();
	}

	public void enterConfirmPassworText(String confirmPassword) {
		passwordField.sendKeys(confirmPassword);
	}

	public String getConfirmPasswordFieldErrorMessage() {
		return confirmPasswordFieldErrorMessage.getText();
	}

	public void clickingPasswordFieldEyeIcon() {
		passwordFieldEyeIcon.click();
	}

	public void clickingConfirmPasswordFieldEyeIcon() {
		confirmPasswordFieldEyeIcon.click();
	}

	public void clickingSaveButton() {
		saveButton.click();
	}

}
