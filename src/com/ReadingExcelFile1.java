package com;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile1 {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		File src = new File("Util\\mydata.xlsx");
		//opening the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(src);
		//opening the sheet 
		XSSFSheet sheet1 = workbook.getSheetAt(0);//If we have any name we need to use getSheet method	
		int size = sheet1.getLastRowNum(); // reads the number of total rows in the sheet
		for (int i = 0; i <= size; i++) {
			XSSFRow row = sheet1.getRow(i);
			int lastCellNum = row.get
			for (int j = 0; j <= lastCellNum; j++)
			{
				String data = row.getCell(j).getStringCellValue();
				System.out.println(data);
			}			
		}
		workbook.close();
	}
}
