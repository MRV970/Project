package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.StudentManagement.comcast.BaseUtility.Baseclass;

public class SubjectRoutingPage extends Baseclass {
		
		WebDriver driver;
		public SubjectRoutingPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//a[@data-id='1']")
		private WebElement AddBtn;
		
		@FindAll({@FindBy(id="grade"),@FindBy(name="grade_id")})
		private WebElement gradedropdown;
		
		@FindBy(xpath = "//select[@id='subject']")
		private WebElement subjectDropdown;
		
		@FindBy(xpath = "//select[@id='teacher']")
		private WebElement teacherdropdown;
		
		@FindBy(xpath = "//input[@id='fee']")
		private WebElement feeEdt;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement submitBtn;
		public WebElement getAddBtn() {
			return AddBtn;
		}

		public WebElement getGradedropdown() {
			return gradedropdown;
		}

		public WebElement getSubjectDropdown() {
			return subjectDropdown;
		}

		public WebElement getTeacherdropdown() {
			return teacherdropdown;
		}

		public WebElement getFeeEdt() {
			return feeEdt;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}
		@FindBy(xpath="//input[@class='form-control input-sm']")
		private WebElement searchEdt;
		@FindBy(id="td2_87")
		private WebElement subEdt;
		public WebElement getSearchEdt() {
			return searchEdt;
		}

		public WebElement getSubEdt() {
			return subEdt;
		}
		
		
	}


