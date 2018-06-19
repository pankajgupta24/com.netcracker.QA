package Bulk_scenario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class newdata {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream ("C:\\Users\\paku0817\\Desktop\\AT\\ICCID.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheet("SIM");
		//String ps=d.
		
		//String line=sheet.getRow(1).createCell(0).setCellValue(ps);

}
}