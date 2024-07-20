package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExamPage {
	WebDriver driver;
	public ExamPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Exam']")
	private WebElement Examlink;
	@FindBy(xpath="//a[text()='Create Exam']")
	private WebElement createExamlink;
	@FindBy(xpath="//a[@href='#modalInsertform']")
	private WebElement ExamAddBtn;
	@FindBy(id="name")
	private WebElement ExamnameEdt;
	@FindBy(id="btnSubmit")
	private WebElement submitBtn;
	 @FindBy(xpath="//a[text()=' Exam Timetable']")
	 private WebElement createTimetablelink;
	public WebElement getExamAddBtn() {
		return ExamAddBtn;
	}
	public WebElement getCreateTimetablelink() {
		return createTimetablelink;
	}
	@FindBy(id="grade")
	private WebElement gradedropdown;
	@FindBy(id="exam")
	private WebElement examdropdown;
	@FindBy(xpath="//button[text()='Next']")
	private WebElement NextBtn;
	@FindBy(xpath="//a[@onclick=\"showModal(this)\"]")
	private WebElement TTaddBtn;
	@FindBy(id="day")
	private WebElement daydropdownlink;;
	@FindBy(id="subject")
	private WebElement subjectdropdownlink;
	@FindBy(id="classroom")
	private WebElement classdropdownlink;
	@FindBy(id="start_time")
	private WebElement starttimeEdt;
	@FindBy(id="end_time")
	private WebElement endtimeEdt;
	@FindBy(id="btnSubmit")
	private WebElement TTsubmitBtn;
	public WebElement getExamlink() {
		return Examlink;
	}
	public WebElement getCreateExamlink() {
		return createExamlink;
	}
	public WebElement getExamaddBtn() {
		return ExamAddBtn;
	}
	public WebElement getExamnameEdt() {
		return ExamnameEdt;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public WebElement getGradedropdown() {
		return gradedropdown;
	}
	public WebElement getExamdropdown() {
		return examdropdown;
	}
	public WebElement getNextBtn() {
		return NextBtn;
	}
	public WebElement getTTaddBtn() {
		return TTaddBtn;
	}
	public WebElement getDaydropdownlink() {
		return daydropdownlink;
	}
	public WebElement getSubjectdropdownlink() {
		return subjectdropdownlink;
	}
	public WebElement getClassdropdownlink() {
		return classdropdownlink;
	}
	public WebElement getStarttimeEdt() {
		return starttimeEdt;
	}
	public WebElement getEndtimeEdt() {
		return endtimeEdt;
	}
	public WebElement getTTsubmitBtn() {
		return TTsubmitBtn;
	}
	
	
	

}
