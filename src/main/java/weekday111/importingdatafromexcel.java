package weekday111;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class importingdatafromexcel {
	
	public void main() throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook Wbook = new XSSFWorkbook("./excelfile/Book1.xlsx");
		
		XSSFSheet sheet = Wbook.getSheetAt(0);
			
	
		
		int rowcount = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <=rowcount ; i++) {
			XSSFRow row = sheet.getRow(i);
			//System.out.println(row);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				
			}
		}
	}}


