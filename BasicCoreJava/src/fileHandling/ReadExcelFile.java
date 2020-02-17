package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\AutoTestRepo\\AutoTestRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook(file);
		
		HSSFSheet sheet = wb.getSheet("Sheet1");
		
		/*HSSFRow row = sheet.getRow(0);
		
		HSSFCell cell = row.getCell(0);			//return types of functions are objects
		
		String data = cell.getStringCellValue();*/
		
		//String data = sheet.getRow(0).getCell(0).getStringCellValue();
		
		//System.out.println(data);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
	//	System.out.println(rows); // we get one less row as first row is considered as a header
	//	System.out.println(cols); // this doesn't happen for column
		
		for(int i=0;i<=rows;i++) {	 // therefore we give i<=rows, or we can give i<row+1
			for(int j=0;j<cols;j++) { // if we do the same with column we will get null pointer exception as columns for will run for 3 times and it will not get the data for the 3rd column
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		
		
		wb.close();

	}

}



/*
 *	.xls						.xlsx
 *	HSSFWorkbook	Workbook	XSSFWorkbook
 *	HSSFSheet		Worksheet	XSSFSheet 
 * 	HSSFRow			Row			XSSFRow
 * 	HSSFCell		Cell		XSSFCell
 * 					Data
*/