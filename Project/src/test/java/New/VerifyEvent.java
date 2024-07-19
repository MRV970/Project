package New;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.EventPage;
import com.StudentManagement.comcast.ObjectRepository.HomePage;
import com.StudentManagement.comcast.ObjectRepository.TeacherPage;

public class VerifyEvent extends Baseclass {
     @Test
     public void verificationEvent() throws EncryptedDocumentException, IOException, InterruptedException {
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
     }
}
