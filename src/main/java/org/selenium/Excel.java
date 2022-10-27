package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel  extends SeleniumDriver{


	public static void setCellData(String sheetName,int rownum,int colnum,String data) throws Throwable {
		
		File excelWrite = new File("C:\\Users\\RIESH\\eclipse-workspace\\SeleniumTask\\src\\main\\resources\\DataStorage.xlsx");
		Workbook w;
		try(FileInputStream f1 = new FileInputStream(excelWrite)) {
			w = new XSSFWorkbook(f1); 	
			Sheet s = w.getSheet(sheetName);
			Row r = s.createRow(rownum);
//			Row r = s.getRow(rownum);
			Cell c = r.createCell(colnum);
			c.setCellValue(data);		
		}
		
		try(FileOutputStream f2 = new FileOutputStream(excelWrite)){
			w.write(f2);
		}
		
		
		
	}

}
