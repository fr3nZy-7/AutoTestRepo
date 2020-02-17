package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelXLSReader {

	final FileInputStream file = new FileInputStream(
			"C:\\AutoTestRepo\\AutoTestRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xls");

	HSSFWorkbook wb = new HSSFWorkbook(file);

	HSSFSheet sheet;// = wb.getSheet("Sheet1");
	
	public ExcelXLSReader() throws IOException {

	}

	public ExcelXLSReader(String path, String sheetName) throws IOException {

		FileInputStream file = new FileInputStream(path);

		HSSFWorkbook wb = new HSSFWorkbook(file);

		HSSFSheet sheet = wb.getSheet(sheetName);

	}

	public int getRowCount(String sheetName) {

		sheet = wb.getSheet(sheetName);

		int rows = sheet.getLastRowNum();

		return rows;
	}

	public int getColCount(String sheetName) {

		sheet = wb.getSheet(sheetName);

		int cols = sheet.getRow(0).getLastCellNum();

		return cols;
	}

	public String getValueofCell(String sheetName, int rid, int cid) {

		sheet = wb.getSheet(sheetName);

		String cellvalue = sheet.getRow(rid).getCell(cid).getStringCellValue();

		return cellvalue;
	}

	public void setValueofCell(String sheetName, String data, int rid, int cid) {

		sheet = wb.getSheet(sheetName);

		HSSFRow row = sheet.createRow(rid);

		HSSFCell cell = row.createCell(cid);

		cell.setCellValue(data);
	}

}
