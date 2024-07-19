package New;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.AddTeacherPage;
import com.StudentManagement.comcast.ObjectRepository.GradePage;
import com.StudentManagement.comcast.ObjectRepository.HomePage;
import com.StudentManagement.comcast.ObjectRepository.SubjectPage;
import com.StudentManagement.comcast.ObjectRepository.SubjectRoutingPage;

public class SubjectRoutingTest extends Baseclass {
	@Test
	public void createSubjectRouting() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.getGradelink().click();
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
		Thread.sleep(4000);
		hp.getTeacherlink().click();
		
		hp.getAddteacherlink().click();
		AddTeacherPage atp=new AddTeacherPage(driver);
		String Index=eLib.getDataFromExcel("Sheet1",7,7)+jLib.getRandomNo();
		atp.getIndexEdt().sendKeys(Index);
		atp.getFullnameEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,2));
		atp.getInitialEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,8));
		atp.getAddressEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,9));
		atp.getGenderEdt().click();
		atp.getMaleEdt().click();
		atp.getPhoneEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,10));
		atp.getEmailEdt().sendKeys(eLib.getDataFromExcel("Sheet1",7,11));
		String Image=fLib.getdatafromPropertiesfile("image");
		atp.getFileEdt().sendKeys(Image);
	WebElement submit=	atp.getSubmitEdt();
	wLib.waitToelement(driver, submit);
		SubjectRoutingPage srp=new SubjectRoutingPage(driver);
		hp.getSubjectRoutelink().click();
		srp.getAddBtn().click();
		wLib.waitToLoad(driver);
		Thread.sleep(4000);
	WebElement gradedrop=	srp.getGradedropdown();
	wLib.waitToelement(driver, gradedrop);
	gradedrop.click();
	    wLib.selectbyIndex(gradedrop, 4);
	
		
	WebElement subdrop=	srp.getSubjectDropdown();
	subdrop.click();
		wLib.selectbyIndex(subdrop, 1);
	WebElement Tecdrop=	srp.getTeacherdropdown();
	     Tecdrop.click();
		wLib.selectbyIndex(Tecdrop, 6);
		String fee=eLib.getDataFromExcel("sheet1", 7, 3);
		srp.getFeeEdt().sendKeys(fee);
		srp.getSubmitBtn().click();
		Thread.sleep(4000);
		srp.getSearchEdt().sendKeys(sub);
	String actSub=	srp.getSubEdt().getText();
		if(actSub.equals(sub)) {
			System.out.println("subjectRouting is created");
		}
		else {
			System.out.println("subjectRouting is  not created");
		}
	}
}

	


