package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
		/*XSSFSheet sheet;
		public ExcelUtility() throws IOException {
			File path=new File("C:\\Users\\anjuc\\OneDrive\\Desktop\\JAVA TRAINING\\Homework TestData\\TestData.xlsx");
			FileInputStream file=new FileInputStream(path);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			sheet=workbook.getSheet("Radio buttons Demo");
		}
		public String readData(int i,int j) {
			Row row=sheet.getRow(i);
			Cell cell=row.getCell(j);
			return cell.getStringCellValue();
		}*/
	public static XSSFSheet sh;
	public static XSSFWorkbook workbook;
	public static FileInputStream input;
	
	public String readData(int i,int j,String filepath,String sheet) throws IOException {
		input=new FileInputStream(System.getProperty("user.dir")+filepath);
		workbook=new XSSFWorkbook(input);
		sh=workbook.getSheet(sheet);
		Row row=sh.getRow(i);
		Cell cell=row.getCell(j);
		return cell.getStringCellValue();
	}
	
		

}
