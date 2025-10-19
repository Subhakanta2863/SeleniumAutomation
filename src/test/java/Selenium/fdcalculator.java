package Selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fdcalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String filepath=System.getProperty("user.dir")+"\\testdata\\testData_calculator.xlsx";
		int rows=Excelutils.totalRowCount(filepath, "sheet1");
		for(int r=1; r<=rows;r++)
		{
			//Read all data from excels
			String princple=Excelutils.getCellData(filepath, "Sheet1", r,0);
			String ROI=Excelutils.getCellData(filepath, "Sheet1", r,1);
			String periods1=Excelutils.getCellData(filepath, "Sheet1", r,2);
			String periods2=Excelutils.getCellData(filepath, "Sheet1", r,3);
			String frequency=Excelutils.getCellData(filepath, "Sheet1", r,4);
			String act_mValue=Excelutils.getCellData(filepath, "Sheet1", r,5);
			
			//perform UI operation
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princple);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ROI);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(periods1);
			Select periods_dropdown=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			periods_dropdown.selectByVisibleText(periods2);
			Select frequency_dropdown=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frequency_dropdown.selectByVisibleText(frequency);
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			//validation part
		    String exp_value=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		    if(Double.parseDouble(act_mValue)==Double.parseDouble(exp_value))
		    {
		    	System.out.println("The Test is passed");
		    	Excelutils.setCellData(filepath, "Sheet1", r,7,"Passed");
		    	Excelutils.fillGreenColor(filepath, "Sheet1",r,7);
		    }
		    else
		    {
		    	System.out.println("The Test is failed");
		    	Excelutils.setCellData(filepath, "Sheet1", r,7,"failed");
		    	Excelutils.fillRedColor(filepath, "Sheet1",r,7);
		    }
		    driver.findElement(By.xpath("//img[@class='PL5']")).click();
		    Thread.sleep(3000);
			
		}
		Thread.sleep(5000);
		driver.close();
	}

}
