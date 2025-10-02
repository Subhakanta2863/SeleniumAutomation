package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//get table name
		WebElement ele=driver.findElement(By.xpath(" //h2[normalize-space()=\"Static Web Table\"]"));
		System.out.println(ele.getText());
		//get nos of rows in table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(columns);
     	//get sepecific data from table
	  String eles=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
       System.out.println(eles);
		//get all data from data table
    	System.out.println("BookName"+ "\t" + "Author"+"\t"+"Subject"+"\t"+"Price");//header of the web table //th
		for(int r=2;r<=rows;r++)//loop for rows
		{
			for(int c=1;c<=columns;c++)//loop for columns
			{
				//storing rows and columns into a string variable and get all the text
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
