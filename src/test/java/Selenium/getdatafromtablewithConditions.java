package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdatafromtablewithConditions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("The number of row is:"+rows);
		int colmns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("The number of column is:"+colmns);
		String ele=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
		System.out.println(ele);
//	    System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
//		for(int r=2;r<=rows;r++)
//		{
//			for(int c=1;c<=colmns;c++)
//			{
//				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value+"\t");
//				
//			}
//			System.out.println();
//		}
		 //get the book name which Author is Mahesh //conditional statement
		for(int r=2;r<=rows;r++)
		{
			String Authors=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();//get Author name
			if(Authors.equals("Mukesh"))//search name Mukesh
			{
				String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();//get Book Nmae
				System.out.print(BookName+"\t"+Authors);
			}
			System.out.println();
		}
		//get the all price of books and
		//add those price
		int  total=0;
		for(int s=2;s<=rows;s++)
		{
			String price =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+s+"]//td[4]")).getText();
			total= total+Integer.parseInt(price);//Converting string value to integer
			
		}
		//System.out.println(...) moved outside the for loop → so it only prints once after adding all rows.Inside loop, we just keep updating total.
		System.out.println("The sum of price of book is:"+total);
		Thread.sleep(5000);
		driver.close();	}

}
