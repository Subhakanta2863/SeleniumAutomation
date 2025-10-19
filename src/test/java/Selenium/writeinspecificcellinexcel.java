package Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeinspecificcellinexcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\specificcell.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("mysheet");
		XSSFRow row1=sheet.createRow(5);
		XSSFCell cell=row1.createCell(4);
		cell.setCellValue("Subhakanta");
		cell.toString();
		workbook.write(file);
		workbook.close();
		file.close();
	}

}
