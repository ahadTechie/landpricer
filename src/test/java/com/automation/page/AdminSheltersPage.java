package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSheltersPage extends BaseTest {

	WebDriver driver;

	// constructor
	public AdminSheltersPage(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[1]/div/p")
	WebElement totalShelterCount;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div[2]/div/div[3]/button")
	WebElement addShelterButton;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/span/div/input")
	WebElement searchByEmailField;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[1]")
	WebElement shelterNameFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[2]")
	WebElement shelterEmailFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[3]")
	WebElement shelterStateFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[4]")
	WebElement shelterInvitesSentCountFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[5]")
	WebElement shelterRedeemedCountFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[6]")
	WebElement shelterRedeemedPercentFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[6]")
	WebElement shelterRepeatCountFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[6]")
	WebElement shelterSubscriptionsCountFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[9]/span")
	WebElement shelterStatusFromTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/a/div")
	WebElement shelterActionsButton;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[1]")
	WebElement shelterDetail;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[2]")
	WebElement viewOrderHistory;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[3]")
	WebElement manageSubscription;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[4]")
	WebElement showAdopters;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[5]")
	WebElement resentInvite;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[6]")
	WebElement editRatio;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[7]")
	WebElement blockShelter;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/table/tbody/tr/td[10]/span/div/div/button[8]")
	WebElement activateShelter;

	public String getTotalShelterCount() {
		return totalShelterCount.getText();
	}

	public void clickingOnAddShelter() {
		addShelterButton.click();
	}

	public void searchingByEmailField(String email) {
		searchByEmailField.sendKeys(email);
	}

	public String getShelterName() {
		return shelterNameFromTable.getText();
	}

	public String getShelterEmail() {
		return shelterEmailFromTable.getText();

	}

	public String getShelterState() {
		return shelterStateFromTable.getText();

	}

	public String getShelterInvitesSentCount() {
		return shelterInvitesSentCountFromTable.getText();

	}

	public String getShelterRedeemedCount() {
		return shelterRedeemedCountFromTable.getText();
	}

	public String getShelterRedeemedPercent() {
		return shelterRedeemedPercentFromTable.getText();
	}

	public String getShelterRepeatCount() {
		return shelterRepeatCountFromTable.getText();
	}

	public String getShelterSubscriptionCount() {
//		return shelterSubcriptionCountFromText.getText();
		return "";
	}

	public String getShelterStatus() {
		return shelterNameFromTable.getText();

	}

}
