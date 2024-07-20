package New;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.ExamPage;

public class VeriftyTimeTableTest extends Baseclass {
	String timetable;
	String grade;
	    @Test
	    public void createtimetableTest() throws EncryptedDocumentException, IOException, InterruptedException {
	    	
	    
	    	ExamPage ep=new ExamPage(driver);
	    	ep.getExamlink().click();
	    	ep.getCreateExamlink().click();
	    	ep.getExamaddBtn().click();
	    	String exam=eLib.getDataFromExcel("sheet1", 10, 0)+jLib.getRandomNo();
	    	ep.getExamnameEdt().sendKeys(exam);
	    	ep.getSubmitBtn().click();
	    	wLib.waitToLoad(driver);
	    	Thread.sleep(3000);
	    	ep.getExamlink().click();
	    	ep.getCreateTimetablelink().click();
	 WebElement gradedrop=   	ep.getGradedropdown();
	    	gradedrop.click();
	    	List<WebElement> options=driver.findElements(By.xpath("//select[@id='grade']/option"));
			for(WebElement grades:options) {
				 grade=grades.getText();
			}
	    	wLib.selectbyText(gradedrop, "Grade 3");
	 WebElement examdrop=   	ep.getExamdropdown();
	 examdrop.click();
	 wLib.selectbyText(examdrop, exam);
	   ep.getNextBtn().click();
	     ep.getExamAddBtn().click();
	WebElement daydrop=     ep.getDaydropdownlink();
	daydrop.click();
	  wLib.selectbyIndex(daydrop, 6);
	  WebElement subdrop =ep.getSubjectdropdownlink();
	  subdrop.click();
	  wLib.selectbyIndex(subdrop, 1);
	  WebElement classdrop=ep.getClassdropdownlink();
	  classdrop.click();
	  wLib.selectbyIndex(classdrop, 2);
	  String stime=eLib.getDataFromExcel("sheet1", 10, 2);
	  ep.getStarttimeEdt().sendKeys(stime);
	  String etime=eLib.getDataFromExcel("sheet1", 10, 3);
	  ep.getEndtimeEdt().sendKeys(etime);
	  ep.getSubmitBtn().click();
	  List<WebElement> list=driver.findElements(By.xpath("//td"));
		for(WebElement event:list) {
			timetable=event.getText();
		
		System.out.println(timetable);
	  
		}
		if(timetable.contains(exam)) {
			System.out.println("Timetable is created");
		}else {
			System.out.println("Timetable is  not created");
		}
	    	
	    	
	    }

}
