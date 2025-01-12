//package com.automation.page;
//
//import static org.testng.Assert.assertEquals;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPage extends BaseTest {
//
//	WebDriver driver;
//
//	// constructor
//	public LoginPage(WebDriver lDriver) {
//		this.driver = lDriver;
//
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]") WebElement emailFIeld;
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/p[1]") WebElement emailFieldError;
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/input[1]") WebElement passwordField;
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/p[1]") WebElement passwordFieldError;
//	@FindBy(xpath = "//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div[2]/div[2]/form/div/div[2]/div/div[2]/svg") WebElement showPasswordIcon;
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]") WebElement keepMeLoggedInCheckbox;
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/p[1]/a[1]") WebElement forgotPasswordTextbutton;
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[4]/button[1]") WebElement signInButton;
//	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/a[1]") WebElement signUpTextbutton;
//
//	public void loginToPortal(String userEmail, String userPwd) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//}
