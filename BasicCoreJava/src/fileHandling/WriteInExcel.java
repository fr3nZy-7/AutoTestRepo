package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\AutoTestRepo\\AutoTestRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xls");

		HSSFWorkbook wb = new HSSFWorkbook(file);

		HSSFSheet sheet = wb.getSheet("Sheet2");

		HSSFRow row = sheet.getRow(0);
		
		if(row ==null) {
			row = sheet.createRow(0);
		}

		HSSFCell cell = row.getCell(3);
		
		if(cell ==null) {
			cell=row.createCell(3);
		}
		
		cell.setCellValue("Amey");
		
		FileOutputStream file2 = new FileOutputStream("C:\\AutoTestRepo\\AutoTestRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		
		wb.write(file2);
		

	}

}

/*
 * homework
 * 
 * get total row count 
 * get total col count 
 * get cell data 
 * set cell data
 */