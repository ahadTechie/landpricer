package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddPayerPage extends BaseTest {

	WebDriver driver;

	// constructor
	public AddPayerPage(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/button")
	WebElement addPayerButton;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement ssnRadio;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	WebElement tinField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	WebElement rtnField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/input[1]")
	WebElement payerNameField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[5]/div[1]/input[1]")
	WebElement payerNameLine2Field;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement exemptForSalesTaxRadio;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[7]/div[1]/input[1]")
	WebElement address1Field;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[8]/div[1]/input[1]")
	WebElement address2Field;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[9]/select[1]")
	WebElement countryDropdownField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[10]/select[1]")
	WebElement cityDropdownField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[11]/select[1]")
	WebElement stateDropdownField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[12]/div[1]/input[1]")
	WebElement zipCodeField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[13]/div[1]/input[1]")
	WebElement phoneField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[14]/div[1]/input[1]")
	WebElement emailField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement contactNameField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/input[1]")
	WebElement signatureTitleField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[3]/div[1]/input[1]")
	WebElement faxField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[4]/select[1]")
	WebElement kindOfPayerDropdownField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[5]/select[1]")
	WebElement kindOfEmployeeDropdownField;

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/input[1]")
	WebElement establishmentNumberField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[2]/div[7]/div[1]/input[1]")
	WebElement OtherEinUsedField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement thirdPartySickPayField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/div[1]/input[1]")
	WebElement box13Field;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/div[1]/input[1]")
	WebElement incomeTaxWithHeldByThirdPartyPayer;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]")
	WebElement nameField;
	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/div[2]/div[1]/input[1]")
	WebElement titleField;
	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button[2]")
	WebElement saveButton;

	public void ClickingOnAddPayerButton() {
		addPayerButton.click();
	}

	public void ClickingOnSsnRadio() {
		ssnRadio.click();
	}

	public void enteringTin(String tinNumber) {
		tinField.sendKeys(tinNumber);
	}

	public void enteringRtn(String rtnNumber) {
		rtnField.sendKeys(rtnNumber);
	}

	public void enteringPayerName(String payerName) {
		payerNameField.sendKeys(payerName);
	}

	public void enteringPayerNameLine2(String payerName2) {
		payerNameLine2Field.sendKeys(payerName2);
	}

	
	public void clickingOnExemptForSalesTaxRadio() {
		exemptForSalesTaxRadio.click();
	}

	public void enteringAddress1(String address1) {
		address1Field.sendKeys(address1);
	}

	public void enteringAddress2(String address2) {
		address2Field.sendKeys(address2);
	}

	public void selectingCountryFromDropDown(String countryOption) {
		Select dropdown = new Select(countryDropdownField);
		dropdown.selectByVisibleText(countryOption);
	}

	public void selectingStateFromDropDown(String stateOption) {
		Select dropdown = new Select(stateDropdownField);
		dropdown.selectByVisibleText(stateOption);
	}

	public void selectingCityFromDropDown(String cityOption) {
		Select dropdown = new Select(cityDropdownField);
		dropdown.selectByVisibleText(cityOption);
	}
	public void enteringZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}

	public void enteringPhoneNumber(String phoneNumber) {
		phoneField.sendKeys(phoneNumber);
	}

	public void enteringEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enteringContactName(String contactName) {
		contactNameField.sendKeys(contactName);
	}

	public void enteringSignatureTitleField(String signatureTitle) {
		signatureTitleField.sendKeys(signatureTitle);
	}

	public void enteringFax(String faxNumber) {
		faxField.sendKeys(faxNumber);
	}

	public void selectingKindOfPayerFromDropdown(String kindOfPayerOption) {
		Select dropdown = new Select(kindOfPayerDropdownField);
		dropdown.selectByVisibleText(kindOfPayerOption);

	}

	public void selectingKindOfEmployerFromDropdown(String kindofEmployer) {
		Select dropdown = new Select(kindOfEmployeeDropdownField);
		dropdown.selectByVisibleText(kindofEmployer);
	}

	public void enteringestablishmentNumber(String establishmentNumber) {
		establishmentNumberField.sendKeys(establishmentNumber);
	}

	public void enteringOtherEinUsed(String OtherEinUsed) {
		OtherEinUsedField.sendKeys(OtherEinUsed);
	}

	public void enteringThirdPartySickPayField() {
		thirdPartySickPayField.click();
		
	}

	public void enteringBox13Text(String box13Text) {
		box13Field.sendKeys(box13Text);
	}

	public void enteringincomeTaxWithHeldByThirdPartyPayerAmount(
			String thirdPincomeTaxWithHeldByThirdPartyPayerAmount) {
		incomeTaxWithHeldByThirdPartyPayer.sendKeys(thirdPincomeTaxWithHeldByThirdPartyPayerAmount);
	}

	public void enteringNameText(String nameText) {
		nameField.sendKeys(nameText);
	}

	public void enteringtitleText(String titleText) {
		titleField.sendKeys(titleText);
	}

	public void clickingOnSaveButton() {
		saveButton.click();
	}

}
