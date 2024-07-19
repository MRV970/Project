package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentPage {
	WebDriver driver;
	public StudentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='my_profile.php']")
	private WebElement myprofileEdt;
	@FindBy(xpath="//div[@class='box-header']")
	private WebElement headerEdt;
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboardEdt;
	@FindBy(xpath="//i[@class=\"fa fa-calendar\"]/ancestor::td/following-sibling::td[4]/child::h5[contains(.,'18')]")
	private WebElement eventEdt;
	@FindBy(xpath="//a[@onclick=\"showNotifyEvent(23)\"]")
	private WebElement notifyeventEdt;
	@FindBy(xpath="//div[@class=\"panel\"]")
	private WebElement panelEdt;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getMyprofileEdt() {
		return myprofileEdt;
	}
	public WebElement getHeaderEdt() {
		return headerEdt;
	}
	public WebElement getDashboardEdt() {
		return dashboardEdt;
	}
	public WebElement getEventEdt() {
		return eventEdt;
	}
	public WebElement getNotifyeventEdt() {
		return notifyeventEdt;
	}
	public WebElement getPanelEdt() {
		return panelEdt;
	}
	
	
}
