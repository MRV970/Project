package com.StudentManagement.WebdriverUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver {
	WebDriver driver;
	public void waitToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void waitToelement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void selectbyIndex(WebElement ele,int index ) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	public void selectbyValue(WebElement ele,String Value) {
		Select s=new Select(ele);
		s.selectByValue(Value);
	}
	public void selectbyText(WebElement ele,String Text) {
		Select s=new Select(ele);
		s.selectByValue(Text);
	}
	public void switchToTabOnUrl(WebDriver driver,String partialURL) {
    	Set<String> set=	driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String windowID=it.next();
			driver.switchTo().window(windowID);
			String actUrl=driver.getCurrentUrl();
			if(actUrl.contains(partialURL)) {
				break;
			}
		}
    }
		public void switchToTabOnTitle(WebDriver driver,String partialTitle) {
	    	Set<String> set=	driver.getWindowHandles();
			Iterator<String> it=set.iterator();
			while(it.hasNext()) {
				String windowID=it.next();
				driver.switchTo().window(windowID);
				String actUrl=driver.getCurrentUrl();
				if(actUrl.contains(partialTitle)) {
					break;
				}
			}
		}
}
