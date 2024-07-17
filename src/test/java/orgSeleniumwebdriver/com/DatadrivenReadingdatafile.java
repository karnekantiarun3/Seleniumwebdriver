package orgSeleniumwebdriver.com;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DatadrivenReadingdatafile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\praveen\\workspace\\Seleniumwebdriver\\Testdata\\data.xlsx");
		
				 

		/* Workbook workbook = new XSSFWorkbook(file); */
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet =  workbook.getSheet("sheet1");
		 
		int totalrows= sheet.getLastRowNum();
		int totalcells=   sheet.getRow(3).getLastCellNum();
		System.out.println("total no.of rows:"+totalrows);
		System.out.println("total no.of cells:"+totalcells);
		
		workbook.close();
		file.close();
	}
	}
		 

