package com.durgasoft.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MapWithDataProvider {
	@Test(dataProvider = "testdata")
	public void test(Map<Object, Object> mapdata) {
		System.out.println("--------------Test Started-------------------");
		System.out.println(mapdata.get("UserName"));
		System.out.println(mapdata.get("Password"));
		System.out.println(mapdata.get("DOB"));
		/*for(Map.Entry m:mapdata.entrySet())
			System.out.println(m.getKey() +" "+ m.getValue());*/
		System.out.println("--------------TestEnded--------------------");
	}
	
	@DataProvider(name = "testdata")
	public  Object[][] readExcelData() throws Exception {
		String filepath = "D:\\LiveProject_18_JUNE_930AM\\Selenium_Maven\\testdata\\login.xlsx";
		File file = new File(filepath);
		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[rowCount][1];
		for (int i = 0; i < rowCount; i++) {
			HashMap<Object, Object> datamap = new HashMap<Object, Object>();
			for (int j = 0; j < colCount; j++) {
				datamap.put(sheet.getRow(0).getCell(j), sheet.getRow(i + 1).getCell(j));
			}
			obj[i][0] = datamap;
		}
		wb.close();
		return obj;
	}
}










