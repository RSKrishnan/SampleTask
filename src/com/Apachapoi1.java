package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apachapoi1 {

	public String readExcel1() throws IOException {
		String data =" ";
		try 
		{
		//file path path or loc
		File file = new File("C:\\Automation\\guvi\\Util\\ReadMe.xlsx");
		//Reading the data from the file
		FileInputStream strm = new FileInputStream(file);
		//Opening of the workbook
		XSSFWorkbook wb = new XSSFWorkbook(strm);
		//getting into the sheet 
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//getting into the row 
		XSSFRow row = sheet.getRow(0);
		
		data= row.getCell(0).getStringCellValue();
		
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}	
		return data;
	}
	public static void main(String[] args) throws IOException {
		
	Apachapoi1 obj = new Apachapoi1();
	
		String objread = obj.readExcel1();
		System.out.println(objread);	
	}
}
