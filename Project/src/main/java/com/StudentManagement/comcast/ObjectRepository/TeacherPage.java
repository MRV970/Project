package com.StudentManagement.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherPage {
	

	
		
		WebDriver driver;
		public TeacherPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//ul[@class=\'menu\']")
		private WebElement menuEdt;
		
		public WebElement getMenuEdt() {
			return menuEdt;
		}
		@FindBy(xpath="//td[@id='title1']")
		private WebElement titleEdt;
		public WebElement getTitleEdt() {
			return titleEdt;
		}
		@FindBy(xpath = "//span[text()='My Profile']")
		private WebElement myProfileLink;
		@FindBy(xpath = "//span[text()='Timetable']")
		private WebElement timeTableLink;
		@FindBy(xpath = "//a[@href='my_timetable2.php']")
		private WebElement myTimeTableBtn;
		@FindBy(xpath = "//span[text()='Events']")
		private WebElement eventsLink;
		@FindBy(xpath = "//a[@href='my_events2.php']")
		private WebElement myEventslink;
		@FindBy(xpath = "//a[@href='all_events2.php']")
		private WebElement allEventsLink;
		@FindBy(xpath = "//small[text()='Preview']")
		private WebElement previewLink;
		@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
		private WebElement NotificationIcon;
		@FindBy(xpath = "(//a[@href='#'])[3]")
		private WebElement eventlist;
		@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
		private WebElement closeBtn;
		@FindBy(id="title1")
		private WebElement tieleEdt;
		@FindBy(xpath="//input[@type='search']")
		private WebElement searchEdt;
		@FindBy(xpath="//td[@id='td1_29']")
		private WebElement nameEdt;
		@FindBy(id="hname")
		private WebElement proName;
		public WebElement getProName() {
			return proName;
		}
		public WebElement getNameEdt() {
			return nameEdt;
		}
		public WebElement getSearchEdt() {
			return searchEdt;
		}
		public WebElement getTieleEdt() {
			return tieleEdt;
		}
		public WebElement getNotificationIcon() {
			return NotificationIcon;
		}
		public WebElement getEventlist() {
			return eventlist;
		}
		public WebElement getCloseBtn() {
			return closeBtn;
		}
		public WebElement getPreviewLink() {
			return previewLink;
		}
         @FindBy(id="id=hname")
         private WebElement hnameEdt;
		public WebElement getHnameEdt() {
			return hnameEdt;
		}

		@FindBy(xpath = "//table[@class='cal-table']/tr[4]/td[6]/a[@id='event_']")
		private WebElement eventIcon;
		
		public WebElement getMyProfileLink() {
			return myProfileLink;
		}
		public WebElement getTimeTableLink() {
			return timeTableLink;
		}
		public WebElement getMyTimeTableBtn() {
			return myTimeTableBtn;
		}
		public WebElement getEventsLink() {
			return eventsLink;
		}
		public WebElement getMyEventslink() {
			return myEventslink;
		}
		public WebElement getAllEventsLink() {
			return allEventsLink;
		}
		public WebElement getEventIcon() {
			return eventIcon;
		}
	}


