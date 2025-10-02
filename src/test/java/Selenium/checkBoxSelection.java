package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkBoxSelection {
	
  public static void main(String[] args) throws InterruptedException {
	  WebDriver driver =new ChromeDriver();
	  driver.navigate().to("https://testautomationpractice.blogspot.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  //Select specific checkbox
	  //driver.findElement(By.xpath("//input[@id='sunday']")).click();
	  //Select multiple checkbox
	  List<WebElement> chbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//	  for(int i=0;i<chbox.size();i++)//forloop
//	  {
//		  chbox.get(i).click();
//	  }
//	  for(WebElement Checkbox:chbox)//enhanced forloop
//	  {
//		  Checkbox.click();
//	  }
	  //select last 3 checkboxes
	  for(int i=4; i<chbox.size();i++)
	  {
		  chbox.get(i).click();
	  }
	  
	  Thread.sleep(5000);
	  for(int i=4; i<chbox.size();i++)
	  {
		  if(chbox.get(i).isSelected())
		  {
		  chbox.get(i).click();
		  }
	  }
	  Thread.sleep(5000);
	  driver.close();
  }
}