package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {
	WebDriver driver;
	public EventPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()=' Create Event ']")
	private WebElement createeventBtn;
	@FindBy(id="title")
	private WebElement titleEdt;
	@FindBy(id="category")
	private WebElement categoryEdt;
	@FindBy(id="reservationtime")
	private WebElement reservetimeEdt;
	@FindBy(id="note")
	private WebElement noteEdt;
	@FindBy(id="colorF")
	private WebElement colorEdt;
	@FindBy(id="btnSubmit3")
	private WebElement submitBtn;
	@FindBy(xpath="(//td[@data-title='r2c6'])[1]")
	private WebElement fromEdt;
	@FindBy(xpath="(//td[@data-title='r2c6'])[2]")
	private WebElement toEdt;
	@FindBy(xpath="//button[text()='Apply']")
	private WebElement applyBtn;
	
	public WebElement getFromEdt() {
		return fromEdt;
	}

	public WebElement getToEdt() {
		return toEdt;
	}

	public WebElement getApplyBtn() {
		return applyBtn;
	}

	public WebElement getTitleEdt() {
		return titleEdt;
	}

	public WebElement getCategoryEdt() {
		return categoryEdt;
	}

	public WebElement getReservetimeEdt() {
		return reservetimeEdt;
	}

	public WebElement getNoteEdt() {
		return noteEdt;
	}

	public WebElement getColorEdt() {
		return colorEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getCreateeventBtn() {
		return createeventBtn;
	}

}
