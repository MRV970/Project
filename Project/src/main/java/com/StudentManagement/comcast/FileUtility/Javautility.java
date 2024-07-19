package com.StudentManagement.comcast.FileUtility;

import java.util.Random;

public class Javautility {
	
	public int getRandomNo() {
		Random rn=new Random();
		int rint=rn.nextInt(1000);
		
		return rint;
	}

}
