package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatafromexcelfile {

	public static void main(String[] args) throws IOException {
		//Read data from excel open excel using fileInputStream() class
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		//get into the excel workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//get into the excel worksheet
		XSSFSheet sheet=workbook.getSheet("sheet1");
		//get total rows in sheet
		int totalrows=sheet.getLastRowNum();
		//get total cells in the sheet
		int totalcells=sheet.getRow(0).getLastCellNum();
		System.out.println("the toal number of rows:"+totalrows);
		System.out.println("The total number of cells:"+totalcells);
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println("\t");
		}
		
	}

}
