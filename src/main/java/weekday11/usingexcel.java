package weekday11;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class usingexcel {

	public  static String[][] excel (String filename) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook Wbook = new XSSFWorkbook("./excelfile/"+filename+".xlsx");
		
		XSSFSheet sheet = Wbook.getSheetAt(0);
		
			
	
		
		int rowcount = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		String [][] data = new String [rowcount][lastCellNum];
		for (int i = 1; i <=rowcount ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);;
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(data);
			}
		
		}
		return data;
		
		
		
			
			
		}
		
	

}
