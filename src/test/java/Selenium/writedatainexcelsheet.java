package Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedatainexcelsheet {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\data2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("test1");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Name");
		row1.createCell(1).setCellValue("Age");
		row1.createCell(2).setCellValue("Address");
		row1.createCell(3).setCellValue("Experience");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Subhakanta");
		row2.createCell(1).setCellValue("28");
		row2.createCell(2).setCellValue("Odisha");
		row2.createCell(3).setCellValue("4");
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("Vansh");
		row3.createCell(1).setCellValue("24");
		row3.createCell(2).setCellValue("Lucknow");
		row3.createCell(3).setCellValue("2");
		XSSFRow row4=sheet.createRow(3);
		row4.createCell(0).setCellValue("Vansh");
		row4.createCell(1).setCellValue("24");
		row4.createCell(2).setCellValue("Lucknow");
		row4.createCell(3).setCellValue("2");
		
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
