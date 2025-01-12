package com.automation.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.page.AddPayerPage;
import com.automation.page.BaseTest;

public class AddPayerTestCase extends BaseTest {
	WebDriver driver;
	AddPayerPage addPayerPage;

	@BeforeMethod
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.d13u4vpittmlh2.amplifyapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("testinghelper04@yopmail.com");
		driver.findElement(By.xpath(
				"//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("Password@1");
		driver.findElement(By.xpath(
				"//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]"))
				.click();
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/a[2]/span[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addPayerPage = new AddPayerPage(driver);
	}

	@Test
	public void testAddPayerForm() {
		for (int i = 0; i < 100; i++) {
//			HelperMethods.cookiesClear(driver);
//			HelperMethods.refreshPage(driver);

			// Click the add payer button
			driver.navigate().refresh();
			driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/a[2]/span[1]")).click();

			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[1]/button")).click();

			// Select SSN radio button
			addPayerPage.ClickingOnSsnRadio();

			// Enter values in the form fields
			addPayerPage.enteringTin("123456789");
			addPayerPage.enteringRtn("987654321");
			addPayerPage.enteringPayerName("John Doe");
			addPayerPage.enteringPayerNameLine2("John Doe Line 2");
			addPayerPage.clickingOnExemptForSalesTaxRadio();
			addPayerPage.enteringAddress1("123 Main St");
			addPayerPage.enteringAddress2("Apt 4B");
			addPayerPage.selectingCountryFromDropDown("US");
			addPayerPage.selectingStateFromDropDown("US");
			addPayerPage.selectingCityFromDropDown("US");
			addPayerPage.enteringZipCode("10011");
			addPayerPage.enteringPhoneNumber("2345678904");
			addPayerPage.enteringEmail("john.doe@example.com");
			addPayerPage.enteringContactName("John Doe");
			addPayerPage.enteringSignatureTitleField("Manager");
			addPayerPage.enteringFax("0987654321");
			addPayerPage.selectingKindOfPayerFromDropdown("Payer 1");
			addPayerPage.selectingKindOfEmployerFromDropdown("Employer 1");
			addPayerPage.enteringestablishmentNumber("1234");
			addPayerPage.enteringOtherEinUsed("5678");
			addPayerPage.enteringThirdPartySickPayField();
			addPayerPage.enteringBox13Text("Yes");
			addPayerPage.enteringincomeTaxWithHeldByThirdPartyPayerAmount("test");
			addPayerPage.enteringNameText("John Doe");
			addPayerPage.enteringtitleText("Manager");

			// Submit the form
			addPayerPage.clickingOnSaveButton();

			// Wait for a few seconds to allow form submission to complete
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Optionally, you can add a check to verify if the form submission was
			// successful
			// For example, checking for a success message or a specific element on the page
			// Assert.assertTrue(driver.getPageSource().contains("Form submitted
			// successfully"));
		}
	}

	@AfterMethod
	@AfterClass
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}
}
