package com.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShelterSginupPage extends BaseTest {

	WebDriver driver;

	// constructor
	public ShelterSginupPage(WebDriver lDriver) {
		this.driver = lDriver;
		
		PageFactory.initElements(driver, this);
	}
	
}
