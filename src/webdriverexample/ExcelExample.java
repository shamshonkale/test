package webdriverexample;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelExample 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream file=new FileInputStream("E:\\NARESH IT\\SOFTWARE TESTING\\EXCEL\\ReadExcel1.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		int rows=st.getRows();
		System.out.println("Total Number of Rows: "+rows);
		for(int i=1;i<rows;i++)
		{
			String empNo=st.getCell(0,i).getContents();
			String empName=st.getCell(1,i).getContents();
			System.out.println(empNo +" "+empName);
		}
	}
}
