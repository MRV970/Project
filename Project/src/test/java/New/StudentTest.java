package New;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.AddStudentPage;
import com.StudentManagement.comcast.ObjectRepository.HomePage;
import com.StudentManagement.comcast.ObjectRepository.LoginPage;
import com.StudentManagement.comcast.ObjectRepository.StudentPage;

public class StudentTest extends Baseclass {
	String fname;
	String email;
	@Test(invocationCount = 2)
	public void createStudent() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp=new  HomePage(driver);
		hp.getStudentEdt().click();
		hp.getAddstudentlink().click();
		String index=eLib.getDataFromExcel("sheet1", 3, 5);
		String fname=eLib.getDataFromExcel("sheet1", 3, 3);
		String initialname=eLib.getDataFromExcel("sheet1", 3, 4);
		String address=eLib.getDataFromExcel("sheet1", 3, 6);
		String email=eLib.getDataFromExcel("sheet1", 3, 7);
		String phone=eLib.getDataFromExcel("sheet1", 3, 8);
		
		AddStudentPage asp=new AddStudentPage(driver);
		asp.getIndexEdt().sendKeys(index);
		asp.getFullnameEdt().sendKeys(fname);
		asp.getIntialEdt().sendKeys(initialname);
		
		asp.getAddressEdt().sendKeys(address);
		asp.getEmailEdt().sendKeys(email);
		asp.getPhoneEdt().sendKeys(phone);
		asp.getBdateEdt().sendKeys("1/2/20");
		
		WebElement gender=asp.getGenderEdt();
		wLib.selectbyIndex(gender, 2);
		String Image=fLib.getdatafromPropertiesfile("image");
		asp.getFileEdt().sendKeys(Image);
	   String gfname=eLib.getDataFromExcel("sheet1", 4, 2);
	   String ginitialname=eLib.getDataFromExcel("sheet1", 4, 4);
	   String gaddress=eLib.getDataFromExcel("sheet1", 4, 6);
	   String aemail=eLib.getDataFromExcel("sheet1", 4, 7);
	   String gphone=eLib.getDataFromExcel("sheet1", 4, 8);
	   
		
		asp.getGfullnameEdt().sendKeys(gfname);
		asp.getGinitialEdt().sendKeys(ginitialname);
		asp.getGaddressEdt().sendKeys(gaddress);
		asp.getGemailEdt().sendKeys(aemail);
		asp.getGphoneEdt().sendKeys(gphone);
		asp.getGbdateEdt().sendKeys("2/2/20");
		wLib.waitToLoad(driver);
		WebElement ggender=asp.getGgenderEdt();
		wLib.selectbyIndex(ggender, 2);
		//wLib.selectbyIndex(gender1, 1);
		String Image1=fLib.getdatafromPropertiesfile("image");
		asp.getGfileEdt().sendKeys(Image1);
		Actions act =new Actions(driver);
		
	WebElement next=	driver.findElement(By.xpath("//button[@id='btnSubmit']"));
	act.scrollToElement(next).perform();
		try {
 WebElement next1 	=	asp.getNextBtn();
	    
 wLib.waitToelement(driver, next1);
		}catch(Exception e) {
			
		}
		//asp.getNextBtn().click();
		WebElement grade=asp.getGradedropdown();
		wLib.selectbyIndex(grade, 2);
		//wLib.selectbyText(grade, "Grade 3");
		asp.getChechbox().click();
		asp.getSubmitbtn().click();
		asp.getPaidbtn().click();
		hp.getProfilelink().click();
		hp.getLogoutlink().click();
	
		//String Url=fLib.getdatafromPropertiesfile("url");
		String Email=fLib.getdatafromPropertiesfile("email");
		String Password=fLib.getdatafromPropertiesfile("studentpassword");
		LoginPage lp=new LoginPage(driver);
		//lp.loginToapp(Url, email, Password);
		StudentPage sp=new StudentPage(driver);
		sp.getMyprofileEdt().click();
   String actName=		sp.getHeaderEdt().getText();
   if(actName.equals(fname)) {
	   System.out.println("Student is created");
   }
   else {
	   System.out.println("Student not created");
   }
   
   
		
   
		
	}

}
