package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getDashboardlink() {
		return dashboardlink;
	}


	@FindBy(xpath="//span[text()='My Profile']")
	private WebElement myprofilelink;
	@FindBy(xpath="//span[text()='Grade']")
	private WebElement gradelink;
	@FindBy(xpath="//span[text()='Subject']")
	private WebElement subjectlink;
	@FindBy(xpath="//span[text()='Teacher']")
	private WebElement teacherlink;                             
	@FindBy(xpath="//span[text()='Subject Routing']")
	private WebElement subjectRoutelink;
	@FindBy(xpath="//span[text()='Timetable']")
	private WebElement timetablelink;
	@FindBy(xpath="//span[text()='Event']")
	private WebElement eventlink;
	@FindBy(xpath="//a[text()=' Add Teacher']")
	private WebElement addteacherlink;
	@FindBy(xpath="//a[text()=' All Teacher']")
	private WebElement allteacherlink;
	@FindBy(xpath="//a[text()=' Add Student']")
	private WebElement addstudentlink;
	@FindBy(xpath="//a[text()=' My Events']")
	private WebElement myeventslink;
	@FindBy(xpath="//a[text()=' All Student']")
	private WebElement allstudentlink;
	@FindBy(xpath="//a[text()=' All Events']")
	private WebElement alleventslink;
	@FindBy(xpath="//img[@class='user-image']")                         
	private WebElement profilelink;
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement logoutlink;
	@FindBy(xpath="//span[text()='Student']")
	private WebElement studentEdt;
	@FindBy(xpath="//a[text()=' Create Event ']")
	private WebElement createeventBtn;
	
	public WebElement getCreateeventBtn() {
		return createeventBtn;
	}
	public WebElement getStudentEdt() {
		return studentEdt;
	}
	public WebElement getMyprofilelink() {
		return myprofilelink;
	}
	public WebElement getProfilelink() {
		return profilelink;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public WebElement getGradelink() {
		return gradelink;
	}
	public WebElement getSubjectlink() {
		return subjectlink;
	}
	public WebElement getTeacherlink() {
		return teacherlink;
	}
	public WebElement getSubjectRoutelink() {
		return subjectRoutelink;
	}
	public WebElement getTimetablelink() {
		return timetablelink;
	}
	public WebElement getEventlink() {
		return eventlink;
	}
	public WebElement getAddteacherlink() {
		return addteacherlink;
	}
	public WebElement getAllteacherlink() {
		return allteacherlink;
	}
	public WebElement getAddstudentlink() {
		return addstudentlink;
	}
	public WebElement getMyeventslink() {
		return myeventslink;
	}
	public WebElement getAllstudentlink() {
		return allstudentlink;
	}
	public WebElement getAlleventslink() {
		return alleventslink;
	}
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboardlink;
	
	
	

}
