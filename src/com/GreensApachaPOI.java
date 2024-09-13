package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GreensApachaPOI {
/*
	public Cell readExcel1() throws IOException {
	
		try 
		{
		//file path path or loc
		File file = new File("C:\\Automation\\guvi\\ReadMe.xlsx");
		//Reading the data from the file
		FileInputStream strm = new FileInputStream(file);
		//Opening of the workbook
		Workbook wb = new XSSFWorkbook(strm);
		//getting into the sheet 
		Sheet sheet = wb.getSheet("Sheet1");
		//getting into the row 
		Row row = sheet.getRow(0);
		
		Cell cell= row.getCell(0);
		return cell;
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}	
		
	}*/
	public static void main(String[] args) throws IOException {
		
//	Apachapoi1 obj = new Apachapoi1();
//	
//		String objread = obj.readExcel1();
//		System.out.println(objread);
		
		File file = new File("C:\\Automation\\guvi\\ReadMe.xlsx");
		FileInputStream strm = new FileInputStream(file);
		//Opening of the workbook
		Workbook book = new XSSFWorkbook(strm);
		//getting into the sheet 
		Sheet sheet = book.getSheet("Sheet1");
		//getting into the row 
		Row row = sheet.getRow(0);
		
		Cell cell= row.getCell(0);
		System.out.println(cell);
	}

}
