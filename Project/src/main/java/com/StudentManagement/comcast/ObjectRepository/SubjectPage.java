package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectPage {
	WebDriver driver;
	public SubjectPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='subject.php']")
	private WebElement subjectlink;
    public WebElement getSubjectlink() {
		return subjectlink;
	}
	@FindBy(xpath="//input[@placeholder='Enter Subject name']")
    private WebElement enterSubEdt;
    @FindBy(xpath="//button[text()='Submit']")
    		
    private WebElement Submitbtn;
	public WebElement getEnterSubEdt() {
		return enterSubEdt;
	}
	public WebElement getSubmitbtn() {
		return Submitbtn;
	}
    
}
