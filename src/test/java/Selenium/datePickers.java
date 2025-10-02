package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickers {

	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://jqueryui.com/datepicker/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
      driver.switchTo().frame(0);//As the date picker is inside a frame so first we need to switch to frame
      //driver.findElement(By.xpath("//input[@class='hasDatepicker']")).sendKeys("10/02/2025");//pass date in normal input field
      driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
      //Create date variable
      String Month="April";
      String Year="2026";
      String Day="20";
      while(true)
      {
         String Months=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//Store Month in a object 
         String Years=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//Store Year in a object
         if(Months.equals(Month)&&Years.equals(Year)) {
        	 break;
         }
        	 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//click next year
      }
        	 //driver.findElement(By.xpath("//a[@title='Prev']")).click();//click previous year
        	 List<WebElement> Days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));//Store date in a object
        	 for(WebElement date:Days)
        	 {
        		 if(date.getText().equals(Day))
        		 {
        			 date.click();
        			 break;
        		 }
        	 }
      Thread.sleep(5000);
      driver.close();
	}
      
 }
