package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ExcelUtilities {
	
	private static Workbook book;
	private static Sheet sheet;
	public static final String TEST_DATA_PATH="C:\\Users\\LENOVO\\eclipse-workspace\\OpenCartFrontEnd\\src\\main\\java\\TestData\\Test Data.xlsx";

	int a=100;
	final int b=200;
	
	
	
	
	
	
	public static Object[][] getTestDat(String sheetName) {
		Object data[][] = null;
		try {
			FileInputStream ip= new FileInputStream(TEST_DATA_PATH);
			book=WorkbookFactory.create(ip);
			sheet=book.getSheet(sheetName);
		
			data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(InvalidFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return data;
		
	}
	
	
	
}
