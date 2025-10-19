 package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dynamicvaluewritinginexcel {

	public static void main(String[] args) throws IOException {
		 FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_latest.xlsx");
		 XSSFWorkbook workbook =new XSSFWorkbook();
		 XSSFSheet sheet= workbook.createSheet("dynamicsheet");
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Eneter how many rows you want?");
		 int totalrows=sc.nextInt();
		 System.out.println("Enter how many cells you want");
		 int totalcells=sc.nextInt();
		 for(int r=0; r<totalrows;r++)
		 {
			 XSSFRow currentrow=sheet.createRow(r);
			 for(int c=0; c<totalcells; c++)
			 {
				 XSSFCell cell=currentrow.createCell(c);
				 cell.setCellValue(sc.next());
				 cell.toString();
			 }
		 }
		 System.out.println("File Uploaded Sucessfully");
		 workbook.write(file);
		 workbook.close();
		 file.close();
		}

}
