package New;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.GradePage;
import com.StudentManagement.comcast.ObjectRepository.HomePage;
import com.StudentManagement.comcast.ObjectRepository.SubjectPage;
import com.StudentManagement.comcast.ObjectRepository.SubjectRoutingPage;

public class VerifyGrade extends Baseclass {
	String grade;
	  @Test
	  public void gradeverification() throws EncryptedDocumentException, IOException, InterruptedException {
		  HomePage hp=new HomePage(driver);
		  hp.getGradelink().click();
		  SubjectRoutingPage srp=new SubjectRoutingPage(driver);
		  GradePage gp=new GradePage(driver);
			String Grade=eLib.getDataFromExcel("Sheet1",7,0)+jLib.getRandomNo();
			gp.getGradeNameEdt().sendKeys(Grade);
			gp.getAdmissionFeeEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,3));
			gp.getHallchargeEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,4));
			gp.getNextBtn().click();
			gp.getRangeEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,5));
			gp.getGradeEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,6));
			gp.getSubmitBtn().click();
			SubjectPage sp=new SubjectPage(driver);
			wLib.waitToLoad(driver);
			Thread.sleep(4000);
		WebElement subject=	sp.getSubjectlink();
		wLib.waitToelement(driver, subject);
			hp.getSubjectlink().click();
			String sub=eLib.getDataFromExcel("Sheet1",7,1);
			sp.getEnterSubEdt().sendKeys(sub);
			sp.getSubmitbtn().click();
			wLib.waitToLoad(driver);
			Thread.sleep(4000);
			hp.getSubjectRoutelink().click();
			srp.getAddBtn().click();
			wLib.waitToLoad(driver);
			Thread.sleep(4000);
		WebElement gradedrop=	srp.getGradedropdown();
		wLib.waitToelement(driver, gradedrop);
		gradedrop.click();
		List<WebElement> options=driver.findElements(By.xpath("//select[@id='grade']/option"));
		for(WebElement grades:options) {
			
		
		 grade=grades.getText();
		 System.out.println(grade);
		 
		}
		System.out.println(grade);
		if(grade.contains(Grade)) {
			System.out.println("grade is created");
		}
		else {
			System.out.println("grade is not created");
		
	  }
	  }

}
