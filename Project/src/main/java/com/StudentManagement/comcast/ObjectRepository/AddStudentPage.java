package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddStudentPage {
	WebDriver driver;
	public AddStudentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="index_number")
	private WebElement indexEdt;
	@FindBy(id="full_name")
	private WebElement fullnameEdt;
	@FindBy(id="i_name")
	private WebElement intialEdt;
	@FindBy(id="address")
	private WebElement addressEdt;
	@FindBy(id="email")
	private WebElement emailEdt;
	@FindBy(id="phone")
	private WebElement phoneEdt;
	@FindBy(id="b_date")
	private WebElement bdateEdt;
	@FindBy(id="gender")
	private WebElement genderEdt;
	@FindBy(xpath="//option[text()='Male']")
	private WebElement maleEdt;
	@FindBy(xpath="//option[text()='Female']")
	private WebElement femaleEdt;
	@FindBy(id="fileToUpload")
	private WebElement fileEdt;
	@FindBy(id="g_full_name")
	private WebElement gfullnameEdt;
	@FindBy(id="g_i_name")
	private WebElement ginitialEdt;
	@FindBy(id="g_address")
	private WebElement gaddressEdt;
	@FindBy(id="g_email")
	private WebElement gemailEdt;
	@FindBy(id="g_phone")
	private WebElement gphoneEdt;
	@FindBy(id="g_b_date")
	private WebElement gbdateEdt;
	@FindBy(id="g_gender")
	private WebElement ggenderEdt;
	@FindBy(id="g_fileToUpload")
	private WebElement gfileEdt;
//	@FindBy(xpath="//button[@type='submit']")
//	private WebElement NextBtn;
	@FindAll({@FindBy(id="btnSubmit"),@FindBy(xpath="//button[@type='submit']")})
	private WebElement NextBtn;
	
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement gradedropdown;
	
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	private WebElement submitbtn;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chechbox;
	@FindBy(xpath = "(//span[@aria-hidden='true'])[23]")
	private WebElement closeBtn;
	public WebElement getGradedropdown() {
		return gradedropdown;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public WebElement getChechbox() {
		return chechbox;
	}
	@FindBy(xpath = "//button[@onclick='addSPayment(this)']")
	private WebElement paidbtn;
	
	public WebElement getPaidbtn() {
		return paidbtn;
	}
	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getIndexEdt() {
		return indexEdt;
	}
	public WebElement getFullnameEdt() {
		return fullnameEdt;
	}
	public WebElement getIntialEdt() {
		return intialEdt;
	}
	public WebElement getAddressEdt() {
		return addressEdt;
	}
	public WebElement getEmailEdt() {
		return emailEdt;
	}
	public WebElement getPhoneEdt() {
		return phoneEdt;
	}
	public WebElement getBdateEdt() {
		return bdateEdt;
	}
	public WebElement getGenderEdt() {
		return genderEdt;
	}
	public WebElement getMaleEdt() {
		return maleEdt;
	}
	public WebElement getFemaleEdt() {
		return femaleEdt;
	}
	public WebElement getFileEdt() {
		return fileEdt;
	}
	public WebElement getGfullnameEdt() {
		return gfullnameEdt;
	}
	public WebElement getGinitialEdt() {
		return ginitialEdt;
	}
	public WebElement getGaddressEdt() {
		return gaddressEdt;
	}
	public WebElement getGemailEdt() {
		return gemailEdt;
	}
	public WebElement getGphoneEdt() {
		return gphoneEdt;
	}
	public WebElement getGbdateEdt() {
		return gbdateEdt;
	}
	public WebElement getGgenderEdt() {
		return ggenderEdt;
	}
	public WebElement getGfileEdt() {
		return gfileEdt;
	}
	public WebElement getNextBtn() {
		return NextBtn;
	}
	

}
