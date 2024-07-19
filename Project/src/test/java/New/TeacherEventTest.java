package New;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.EventPage;
import com.StudentManagement.comcast.ObjectRepository.HomePage;
import com.StudentManagement.comcast.ObjectRepository.LoginPage;
import com.StudentManagement.comcast.ObjectRepository.TeacherPage;

public class TeacherEventTest extends Baseclass{
	String title;
	@Test
	public void createEvent() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.getEventlink().click();
		hp.getMyeventslink().click();
		EventPage ep=new EventPage(driver);
		ep.getCreateeventBtn().click();
		String title=eLib.getDataFromExcel("sheet1", 1, 9);
		String Note=eLib.getDataFromExcel("sheet1", 1, 10);
		String color=eLib.getDataFromExcel("sheet1", 1, 11);
		
		
		ep.getTitleEdt().sendKeys(title);
	WebElement category=	ep.getCategoryEdt();
	wLib.selectbyIndex(category, 2);
	ep.getReservetimeEdt().click();
	ep.getFromEdt().click();
	ep.getToEdt().click();
	ep.getApplyBtn().click();
	ep.getNoteEdt().sendKeys(Note);
	ep.getColorEdt().sendKeys(color);
	ep.getSubmitBtn().click();
	hp.getProfilelink().click();
	hp.getLogoutlink().click();
	
	String Email=fLib.getdatafromPropertiesfile("teacher2email");
	String Password=fLib.getdatafromPropertiesfile("teacher2password");
	
	
    LoginPage lp=new LoginPage(driver);
	lp.getUsernameEdt().sendKeys(Email);
	lp.getPasswordEdt().sendKeys(Password);
	lp.getLoginBtn().click();
	  
	   TeacherPage tp=new TeacherPage(driver);
	   tp.getNotificationIcon().click();
              
			tp.getEventlist().click();
			Thread.sleep(2000);
			String names=tp.getTitleEdt().getText();
	if(names.equals(title))
	{
		System.out.println("event is   created");
	}
	else {
		System.out.println("event is  not created");
	}
	//tp.getCloseBtn().click();
	
	   
	
	
		
	}

}
