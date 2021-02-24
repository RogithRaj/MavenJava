package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		
		File loc = new File("C:\\Users\\91908\\eclipse-workspace\\MavenJava\\src\\test\\resources\\Datas.xlsx");
		
		FileInputStream f= new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet sheet = w.getSheet("sheet1");
		Row r = sheet.getRow(1);
		Cell c= r.getCell(1);
		System.out.println(c);
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0; j<row.getPhysicalNumberOfCells();j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
			int type = cell.getCellType();
			System.out.println(type);
			
			if (type==1) {
				
				String value= cell.getStringCellValue();
				System.out.println(value);
			}
				
			else if (DateUtil.isCellInternalDateFormatted(cell)) {
				
				Date date= cell.getDateCellValue();
				SimpleDateFormat sf= new SimpleDateFormat("dd-MMMM-yyy");
				String value = sf.format(date);
				System.out.println(value);
			
			}
			else {
				
				double db = cell.getNumericCellValue();
				long lg= (long) db;
				String value = String.valueOf(lg);
				System.out.println(value);
				
				
				
			}
			}
			}
			
			
			
		}
		
		
		
		
	}

