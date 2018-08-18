package com.durgasoft.selenium.excel;

import org.testng.annotations.Test;

public class ReadExcelDataDriverClass {
  @Test
  public void f() throws Exception {
	  ExcelAPI e=new ExcelAPI("D:\\LiveProject_18_JUNE_930AM\\Selenium_Maven\\testdata\\login.xlsx");
	
	  /*System.out.println("---------Read excel data by using column number-----------");
	  System.out.println(e.getCellValue("Sheet1", 0, 1));
	  System.out.println(e.getCellValue("Sheet1", 1, 1));
	  System.out.println(e.getCellValue("Sheet1", 2, 1));
	  
	  System.out.println("*****************************************************");
	  System.out.println("---------Read excel data by using column name-----------");
	  System.out.println(e.getCellValue("Sheet1", "User Name", 1));
	  System.out.println(e.getCellValue("Sheet1", "Password", 1));
	  System.out.println(e.getCellValue("Sheet1", "Results", 1));*/
	  //e.setCellData("Sheet1", 2, 3, "PASSED");
	  e.setCellData("Sheet1", "Results", 5, "SKIPPED");
  }
}









