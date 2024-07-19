package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GradePage {
		
		WebDriver driver;
		public GradePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//input[@placeholder='Enter name']")
		private WebElement gradeNameEdt;
		
		@FindBy(xpath = "//input[@id='admission_fee']")
		private WebElement admissionFeeEdt;
		
		@FindBy(xpath = "//input[@id='hall_charge']")
		private WebElement hallchargeEdt;
		
		@FindBy(xpath = "//input[@id='mark_range_text_1']")
		private WebElement RangeEdt;
		
		@FindBy(xpath = "//input[@placeholder='A']")
		private WebElement GradeEdt;
		
		@FindBy(xpath = "(//button[@id='btnSubmit1'])[1]")
		private WebElement submitBtn;
		
		@FindBy(xpath = "//button[text()='Next']")
		private WebElement NextBtn;
		public WebElement getGradeNameEdt() {
			return gradeNameEdt;
		}

		public WebElement getAdmissionFeeEdt() {
			return admissionFeeEdt;
		}

		public WebElement getHallchargeEdt() {
			return hallchargeEdt;
		}

		public WebElement getRangeEdt() {
			return RangeEdt;
		}

		public WebElement getGradeEdt() {
			return GradeEdt;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}

		public WebElement getNextBtn() {
			return NextBtn;
		}
		
	}


