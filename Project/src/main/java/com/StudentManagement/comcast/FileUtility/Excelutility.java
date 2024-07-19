package com.StudentManagement.comcast.FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Excelutility {

	public String getDataFromExcel(String project,int rowNum,int celNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\RAGHAVAMMA\\Desktop\\Excel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data=	wb.getSheet(project).getRow(rowNum).getCell(celNum).getStringCellValue();
		wb.close();
		return data;
	}
	public int getRowcount(String project) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\RAGHAVAMMA\\Desktop\\Excel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		int rowCount=	wb.getSheet(project).getLastRowNum();
		wb.close();
		return rowCount;
	}
	public int getcolcount(String project,int rowNum) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\RAGHAVAMMA\\Desktop\\Excel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		int colCount=	wb.getSheet(project).getRow(rowNum).getLastCellNum();

		wb.close();
		return colCount;
	}

	public void setDataIntoExcel(String project,int rowNum,int celNum,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\RAGHAVAMMA\\Desktop\\Excel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(project).getRow(rowNum).createCell(celNum);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\RAGHAVAMMA\\Desktop\\Excel.xlsx");
		wb.write(fos);
		wb.close();


	}


}