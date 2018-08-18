package com.durgasoft.selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelDataByColName {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;

	@Test
	public void f() throws Exception {
		fi = new FileInputStream("D:\\LiveProject_18_JUNE_930AM\\Selenium_Maven\\testdata\\login.xlsx");
		fo = null;
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet("Sheet1");
		row = null;
		cell = null;
		int colNum=-1;
		row=sheet.getRow(0);
		
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().equals("Results"))
			{
				colNum=i;
			}
		}
		row=sheet.getRow(2);
		if(row==null)
			row=sheet.createRow(2);
		
		cell=row.getCell(colNum);
		if(cell==null)
			cell=row.createCell(colNum);
		
		cell.setCellValue("BLOCKED");
		fo = new FileOutputStream("D:\\LiveProject_18_JUNE_930AM\\Selenium_Maven\\testdata\\login.xlsx");
		workbook.write(fo);
		fo.close();
	}
}












