package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class AdminDashboardPage extends BaseTest {

	WebDriver driver;

	// constructor
	public AdminDashboardPage(WebDriver lDriver) {
		this.driver = lDriver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[1]/div/div[2]/center/p[1]")
	WebElement totalSheltersCount;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[2]/div/div[2]/center/p[1]")
	WebElement redemptionRateCount;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[2]/div/div[2]/center/p[2]")
	WebElement redemptionRatePercent;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[3]/div/div[2]/center/p[1]")
	WebElement invitesSentCount;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[4]/div/div[2]/center/p[1]Ï")
	WebElement totalPoundDonated;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[4]/div/div[2]/center/p[1]Ï")
	WebElement overalRepeatCount;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[4]/div/div[2]/center/p[1]Ï")
	WebElement shelterGiveAwayCount;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[4]/div/div[2]/center/p[1]Ï")
	WebElement adoptersGiveAwayCount;
	@FindBy(xpath = "//*[@id=\"dashboard\"]/div[2]/div[4]/div/div[2]/center/p[1]Ï")
	WebElement totalOverallGiveAwayCount;

	public String getTotalShelterCount() {
		return totalSheltersCount.getText();
	}

	public String getRedemptionRateCount() {
		return redemptionRateCount.getText();
	}

	public String getRedemptionRatePercent() {
		return redemptionRatePercent.getText();
	}

	public String getInvitesSentCount() {
		return invitesSentCount.getText();
	}

	public String getTotalPoundDonated() {
		return totalPoundDonated.getText();
	}

	public String getOveralRepeatCount() {
		return overalRepeatCount.getText();
	}

	public String getShelterGiveAwayCount() {
		return shelterGiveAwayCount.getText();
	}

	public String getAdoptersGiveAwayCount() {
		return adoptersGiveAwayCount.getText();
	}

	public String getTotalOverallGiveAwayCount() {
		return totalOverallGiveAwayCount.getText();
	}

}
