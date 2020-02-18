package fileHandling;

import java.io.IOException;

public class User {

	public static void main(String[] args) throws IOException {
		
		ExcelXLSReader reader = new ExcelXLSReader();
		
		//ExcelXLSReader reader = new ExcelXLSReader("C:\\AutoTestRepo\\AutoTestRepo\\BasicCoreJava\\src\\fileHandling\\TestData.xls","Sheet2");
		
		System.out.println("Column count is "+reader.getColCount("Sheet1"));
		
		System.out.println("Row count is "+reader.getRowCount("Sheet1"));
		
		System.out.println(reader.getValueofCell("Sheet2",0, 3));
		
		reader.setValueofCell("Sheet1", "Amey", 17, 4);
		
		System.out.println(reader.getValueofCell("Sheet1", 17, 4));
		
		
	}

}
