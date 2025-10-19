package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int totalRowCount(String xfile, String xlsheet) throws IOException {
    	fi=new FileInputStream(xfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	int rowCount=ws.getLastRowNum();
    	wb.close();
    	return rowCount;
    }
    public static int totalCellCount(String xfile, String xlsheet) throws IOException {
    	fi=new FileInputStream(xfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	int cellCount=ws.getLastRowNum();
    	wb.close();
    	fi.close();
    	return cellCount;
    }
    public static String getCellData(String xfile, String Xlsheet, int rownum, int cellnum) throws IOException {
    	fi=new FileInputStream(xfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(Xlsheet);
    	row=ws.getRow(rownum);
    	cell=row.getCell(cellnum);
    	
    	String data;
    	try {
    		//Data=cell.toString();//Store data in string format
    	    DataFormatter formatter=new DataFormatter();
    	    data=formatter.formatCellValue(cell);//store data in string format as .toString() method
    	}catch(Exception e) {
    	    data="";
    	}
    	    wb.close();
    	    fi.close();
    	    return data;
    }
    public static void setCellData(String xfile, String Xlsheet, int rownum, int cellnum, String data) throws IOException {
    	
    	fi=new FileInputStream(xfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(Xlsheet);
    	row=ws.getRow(rownum);
    	cell=row.createCell(cellnum);
    	cell.setCellValue(data);
    	fo=new FileOutputStream(xfile);
    	wb.write(fo);
    	wb.close();
    	fi.close();
    	fo.close();
    }
    public static void fillGreenColor(String xfile, String Xlsheet, int rownum, int cellnum) throws IOException {
    	
    	fi=new FileInputStream(xfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(Xlsheet);
    	row=ws.getRow(rownum);
    	cell=row.getCell(cellnum);
    	style=wb.createCellStyle();
    	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	cell.setCellStyle(style);
    	fo=new FileOutputStream(xfile);
    	wb.write(fo);
    	wb.close();
    	fi.close();
    	fo.close();
    }
    public static void fillRedColor(String xfile, String Xlsheet, int rownum, int cellnum) throws IOException {
    	fi=new FileInputStream(xfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(Xlsheet);
    	row=ws.getRow(rownum);
    	cell=row.getCell(cellnum);
    	style=wb.createCellStyle();
    	style.setFillForegroundColor(IndexedColors.RED.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	cell.setCellStyle(style);
    	fo=new FileOutputStream(xfile);
    	wb.write(fo);
    	wb.close();
    	fi.close();
    	fo.close();
    }
}
    	
 


