package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSample {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String readStringData(int row,int col) throws IOException {
		f=new FileInputStream("D:\\Navamy\\StudentMark.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(row);  //doubt-why not declared static used in both methods like the f and w ?
		XSSFCell c=r.getCell(col);
		return c.getStringCellValue();
	}
	public static String readIntegerData(int row,int col) throws IOException {
		f=new FileInputStream("D:\\Navamy\\StudentMark.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(row);
		XSSFCell c=r.getCell(col);
		int val=(int)c.getNumericCellValue();
		return String.valueOf(val);
	}
	
	
}
