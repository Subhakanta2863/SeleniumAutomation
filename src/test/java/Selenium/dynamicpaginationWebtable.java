package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicpaginationWebtable {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("https://testautomationpractice.blogspot.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  //total page
	  int total_page=driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
	  System.out.println(total_page);
	  WebElement title=driver.findElement(By.xpath("//h2[normalize-space()=\"Pagination Web Table\"]"));
	  System.out.println(title.isDisplayed());
	  //count rows of all page
	  int rows=driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
	  System.out.println("The number of row is:"+rows);
	  //count all the column of the pages
	  int columns=driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
	  System.out.println("The number of row is:"+columns);
	  System.out.println("ID"+"\t"+"Name"+"\t"+"Price"+"\t"+"Select");
	  //perform click operation on every page
	  for(int p=1;p<=total_page;p++)
	  {
		  if(p>1)
		  {
			 WebElement page= driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]"));
			 Thread.sleep(2000);
			 page.click();
			  
		  }
		 
		  //all the rows and columns
		  for(int r=1;r<rows;r++)
		  {
			  for(int c=1;c<=columns;c++)
			  {
				  String table_value=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+c+"]")).getText();
				  System.out.print(table_value+"\t");
				  
				  
			  }
			  //click on all check boxes
			  WebElement chbox=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td["+4+"]//input[@type='checkbox']"));
			  chbox.click();
			  System.out.println();
			  
		  }
	  }
	  Thread.sleep(5000);
	  driver.close();
	}

}
