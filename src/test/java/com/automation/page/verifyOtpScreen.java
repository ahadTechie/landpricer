package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyOtpScreen extends BaseTest {

	WebDriver driver;

	// constructor
	public verifyOtpScreen(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/div/center/div/div/input[1]")
	WebElement otpField;
	@FindBy(xpath = "//*[@id=\"1\"]/div[1]/div[2]")
	WebElement toasterErrorMessage;
	@FindBy(xpath = "//*[@id=\"GeneralRow\"]/div/div/div[2]/div/div/div/span/div/center/button")
	WebElement doneButton;

	public void enterOtpCode(String otpText) {
		otpField.sendKeys(otpText);
	}

	public String getErrorMessage() {
		return toasterErrorMessage.getText();
	}

	public void clickingDoneButton() {
		doneButton.click();
	}

}
