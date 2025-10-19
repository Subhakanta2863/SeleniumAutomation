package Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedatatoexcelworkbook {

	public static void main(String[] args) throws IOException {
		
       FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
       XSSFWorkbook workbook=new XSSFWorkbook();
       XSSFSheet sheet=workbook.createSheet("mysheet");
       XSSFRow myrow1=sheet.createRow(0);
       myrow1.createCell(0).setCellValue("Name");
       myrow1.createCell(1).setCellValue("Age");
       myrow1.createCell(2).setCellValue("Address");
       myrow1.createCell(3).setCellValue("ID");
       XSSFRow myrow2=sheet.createRow(1);
       myrow2.createCell(0).setCellValue("Subhakanta");
       myrow2.createCell(1).setCellValue("28");
       myrow2.createCell(2).setCellValue("Odisha");
       myrow2.createCell(3).setCellValue("1082307");
       XSSFRow myrow3=sheet.createRow(2);
       myrow3.createCell(0).setCellValue("Sidhant");
       myrow3.createCell(1).setCellValue("27");
       myrow3.createCell(2).setCellValue("Odisha");
       myrow3.createCell(3).setCellValue("1082310");
       XSSFRow myrow4=sheet.createRow(3);
       myrow4.createCell(0).setCellValue("Saubhagya");
       myrow4.createCell(1).setCellValue("28");
       myrow4.createCell(2).setCellValue("Odisha");
       myrow4.createCell(3).setCellValue("1082311");
       workbook.write(file);
       System.out.println("The file written sucessfully");
       workbook.close();
       file.close();
       
       
	}
       
}
