package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserwindowmethod {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	      
	    //String str=driver.getWindowHandle();return single unique identifer of webpage
	    //System.out.println(str);
	    //Approach-1:
//	    Set<String> WindowId=driver.getWindowHandles();//return multiple unique identifier and return set value
//	    List<String> WindowsId=new ArrayList<>(WindowId);//Converting Set to list
//	    String PId= WindowsId.get(0);
//	    String CId=WindowsId.get(1);
//	    //Switch to child browser
//	    driver.switchTo().window(CId);
//	    System.out.println(driver.getTitle());
//	    driver.navigate().refresh();
//	    //Switch to parent browser
//	    driver.switchTo().window(PId);
//	    System.out.println(driver.getTitle());
//	    //driver.close();
//	    driver.quit();
	    
	    //Approach-2:
	    Set<String> WindowsId=driver.getWindowHandles();
	    List<String> WindId=new ArrayList<>(WindowsId);
	    for(String WId:WindId)
	    {
	      String title=driver.switchTo().window(WId).getTitle();
	      if(title.equals("OrangeHRM"))
	      {
	    	 System.out.println("The Current url is:"+driver.getCurrentUrl()); 
	      }
	     
	    }
	    
	    
	    //driver.close();
	     driver.quit();

	}
	
}