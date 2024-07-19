package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTeacherPage {
	WebDriver driver;
	public AddTeacherPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="index_number")
	private WebElement indexEdt;
	@FindBy(id="full_name")
	private WebElement fullnameEdt;
	@FindBy(id="i_name")
	private WebElement initialEdt;
	@FindBy(id="address")
	private WebElement addressEdt;
	@FindBy(id="gender")
	private WebElement genderEdt;
	@FindBy(xpath="//option[text()='Male']")
	private WebElement MaleEdt;
	@FindBy(id="//option[text()='Female']")
	private WebElement FemaleEdt;
	@FindBy(id="phone")
	private WebElement phoneEdt;
	@FindBy(id="email")
	private WebElement emailEdt;
	@FindBy(xpath="//form[@role='form']/div/div[8]/div[2]/input[@type='file']")
	
	private WebElement fileEdt;
//	@FindAll({@FindBy(id="fileToUpload"),@FindBy(name="fileToUpload")})
//	private WebElement fileEdt;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitEdt;
	public WebElement getIndexEdt() {
		return indexEdt;
	}
	public WebElement getFullnameEdt() {
		return fullnameEdt;
	}
	public WebElement getInitialEdt() {
		return initialEdt;
	}
	public WebElement getAddressEdt() {
		return addressEdt;
	}
	public WebElement getGenderEdt() {
		return genderEdt;
	}
	public WebElement getMaleEdt() {
		return MaleEdt;
	}
	public WebElement getFemaleEdt() {
		return FemaleEdt;
	}
	public WebElement getPhoneEdt() {
		return phoneEdt;
	}
	public WebElement getEmailEdt() {
		return emailEdt;
	}
	public WebElement getFileEdt() {
		return fileEdt;
	}
	public WebElement getSubmitEdt() {
		return submitEdt;
	}

}
