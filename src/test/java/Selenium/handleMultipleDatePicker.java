package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMultipleDatePicker {
static void selectFutureDate(WebDriver driver, String Years, String Months, String Days)	{
	 while(true)
     {
     	String currentYears=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
     	String currentMonths=driver.findElement(By.xpath(" //span[@class='ui-datepicker-month']")).getText();
     	if(currentYears.equals(Years)&&currentMonths.equals(Months))
     	{
     		break;
     	}
     	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
     }
      List<WebElement> currentDays=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
      for(WebElement actualDay:currentDays )
      {
     	 if(actualDay.getText().equals(Days))
     	 {
     		actualDay.click();
     		break;
     	 }
      }
}
static void selectBackDate(WebDriver driver, String Years, String Months, String Days)	{
	 while(true)
    {
    	String currentYears=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
    	String currentMonths=driver.findElement(By.xpath(" //span[@class='ui-datepicker-month']")).getText();
    	if(currentYears.equals(Years)&&currentMonths.equals(Months))
    	{
    		break;
    	}
    	driver.findElement(By.xpath(" //span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    }
     List<WebElement> currentDays=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
     for(WebElement actualDay:currentDays )
     {
    	 if(actualDay.getText().equals(Days))
    	 {
    		actualDay.click();
    		break;
    	 }
     }
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        //driver.findElement(By.xpath(" //input[@id='datepicker']")).sendKeys("06/10.2025");
        driver.findElement(By.xpath(" //input[@id='datepicker']")).click();
        String Years="2025";
        String Months="April";
        String Days="20";
        //selectFutureDate(driver, Years, Months, Days);
        selectBackDate(driver, Years, Months, Days);
        Thread.sleep(5000);
        driver.close();
	}

}
