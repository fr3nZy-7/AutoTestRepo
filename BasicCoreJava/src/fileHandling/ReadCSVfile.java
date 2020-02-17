package fileHandling;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVfile {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("C:\\AutoTestRepo\\AutoTestRepo\\BasicCoreJava\\src\\fileHandling\\SampleData.csv"));
		
		sc.useDelimiter(","); //sets delimiter pattern
		
		while(sc.hasNext()) {
			System.out.print(sc.next()+" ");
		}

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