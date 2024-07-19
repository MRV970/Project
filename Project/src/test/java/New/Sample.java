package New;

import org.testng.annotations.Test;

import com.StudentManagement.comcast.BaseUtility.Baseclass;
import com.StudentManagement.comcast.ObjectRepository.HomePage;

public class Sample extends Baseclass {
	@Test
	public void add() {
		HomePage hp=new HomePage(driver);
		hp.getSubjectlink().click();
	}
	

}
