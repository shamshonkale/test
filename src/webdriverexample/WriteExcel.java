package webdriverexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class WriteExcel 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("E:\\NARESH IT\\SOFTWARE TESTING\\EXCEL\\ReadExcel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Test1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before Update: "+sheet.getRow(2).getCell(1));
		XSSFCell cell=sheet.getRow(2).getCell(1);
		cell.setCellValue("Test123");
		fis.close();
		FileOutputStream fos=new FileOutputStream("E:\\NARESH IT\\SOFTWARE TESTING\\EXCEL\\ReadExcel.xlsx");
		workbook.write(fos);
		System.out.println("After Update: "+cell.getStringCellValue());
		fos.close();
	}
}
