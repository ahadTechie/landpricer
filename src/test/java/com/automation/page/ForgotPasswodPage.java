package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswodPage extends BaseTest {

	WebDriver driver;

	// constructor
	public ForgotPasswodPage(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "@FindBy(xpath = \"\")\n" + "	WebElement x;")
	WebElement emailField;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/p")
	WebElement emailFieldError;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/form/center/button")
	WebElement sentButton;

	public void enterEmail(String emailText) {
		emailField.sendKeys(emailText);
	}

	public String getErrorMessage() {
		return emailFieldError.getText();
	}

	public void clickingSentButton(String emailText) {
		sentButton.click();
	}

}
