package New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.EventPage;
import com.StudentManagement.comcast.ObjectRepository.HomePage;
import com.StudentManagement.comcast.ObjectRepository.TimetablePage;

public class Sample extends Baseclass {
	String events;
	@Test
	public void add() {
		HomePage hp=new HomePage(driver);
		
		hp.getDashboardlink().click();
		hp.getTimetablelink().click();
		EventPage ep=new EventPage(driver);
		TimetablePage ttp=new TimetablePage(driver);
		WebElement grade=    ttp.getGradeEdt();
		grade.click();
		    //wLib.selectbyText(grade, "Grade 3");
		wLib.selectbyIndex(grade, 3);
		    ttp.getSubmitBtn().click();
		    
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='div-event-c']"));
		for(WebElement event:list) {
			events=event.getText();
		
		System.out.println(events);
	}}
	

}
////div[@class=\"div-event-c\"]
