package com.StudentManagement.comcast.ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameEdt;
	
	@FindBy(id = "password")
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
public void loginToapp(String Url,String Username,String Password) {
		
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		usernameEdt.sendKeys(Username);
		passwordEdt.sendKeys(Password);
		loginBtn.click();
	}




}
