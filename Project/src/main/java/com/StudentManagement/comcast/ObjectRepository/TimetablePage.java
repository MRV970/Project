package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimetablePage {
	WebDriver driver;
	public TimetablePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="grade")
	private WebElement gradeEdt;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitBtn;
	@FindBy(xpath="//a[text()='Add ']")
	private WebElement AddBtn;
	@FindBy(id="day")
	private WebElement dayEdt;
	@FindBy(id="subject")
	private WebElement subjectEdt;
	@FindBy(id="teacher")
	private WebElement teacherEdt;
	@FindBy(id="classroom")
	private WebElement classroomEdt;
	@FindBy(id="start_time")
	private WebElement starttimeEdt;
	@FindBy(id="end_time")
	private WebElement endtimeEdt;
	@FindBy(id="btnSubmit")
	private WebElement srsubmitBtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getGradeEdt() {
		return gradeEdt;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getAddBtn() {
		return AddBtn;
	}
	public WebElement getDayEdt() {
		return dayEdt;
	}
	public WebElement getSubjectEdt() {
		return subjectEdt;
	}
	public WebElement getTeacherEdt() {
		return teacherEdt;
	}
	public WebElement getClassroomEdt() {
		return classroomEdt;
	}
	public WebElement getStarttimeEdt() {
		return starttimeEdt;
	}
	public WebElement getEndtimeEdt() {
		return endtimeEdt;
	}
	public WebElement getSrsubmitBtn() {
		return srsubmitBtn;
	}
	
	
	

}
