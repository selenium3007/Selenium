package com.durgasoft.selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataToExcelByIndex {
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
		row = sheet.getRow(9);
		if (row == null)
			row = sheet.createRow(9);
		cell = row.getCell(2);
		if (cell == null)
			cell = row.createCell(2);
		cell.setCellValue("FAILED");
		fo = new FileOutputStream("D:\\LiveProject_18_JUNE_930AM\\Selenium_Maven\\testdata\\login.xlsx");
		workbook.write(fo);
		fo.close();
	}
}



