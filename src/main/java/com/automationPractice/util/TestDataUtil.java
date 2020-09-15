package com.automationPractice.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestDataUtil {

	public WebDriver driver;
	public TestDataUtil(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}	
	
	
	public Object [][] getTestdata(String sheetName) throws IOException{
		
		FileInputStream file=null;
		file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\automationPractice\\qa\\TestData\\Test Data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet(sheetName);
		
		int rowCount= sheet.getLastRowNum();
		int cellCount= sheet.getRow(0).getLastCellNum();
		
		Object[][] data= new Object[rowCount][cellCount];
		for (int i=0;i<rowCount;i++) {
			for (int j=0; j<cellCount; j++) {
				data[i][j]= sheet.getRow(i+1).getCell(j).toString();
				}
			System.out.println(data);
			}
		return data;

	}
}
