package loan;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	
	public ExcelDataConfig(String excelpath)throws Exception
	{
		File src=new File(excelpath);
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheetAt(0);
	  String  data=sheet.getRow(0).getCell(0).getStringCellValue();
		}
	
	
	public int getrow(int sheetindex)
	{
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return sheetindex;
}


	public String GetStringcelldata(int row,int column,int sheetnumber)
	{
		sheet=wb.getSheetAt(sheetnumber);
		String GetStringcelldata=sheet.getRow(row).getCell(column).getStringCellValue();
		return GetStringcelldata;
	}
	
	public int Numericcelldata(int row,int column,int sheetnumber)
	{
		sheet=wb.getSheetAt(sheetnumber);
		double Numericcelldata=sheet.getRow(row).getCell(column).getNumericCellValue();
		return (int) Numericcelldata;
	}
}