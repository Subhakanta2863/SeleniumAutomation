package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinkTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//get all the links
		int nosoflinks=0;
		List<WebElement> taglist=driver.findElements(By.tagName("a"));
		for(WebElement lists:taglist)
		{
			//convert list into string 
		
			String tags=lists.getAttribute("href");
			if(tags==null||tags.isEmpty())
			{
				System.out.println("This is not a broken link");
				continue;
			}
			
           try {
		   //connect to the server
		       URL geturls=new URL(tags);
		       HttpURLConnection httpsconnects=(HttpURLConnection)geturls.openConnection();
		       httpsconnects.connect();
		       if(httpsconnects.getResponseCode()>=400)
		       {  
			      System.out.println(geturls+"---->"+"The link is broken");
			      nosoflinks++;
		       }
		       else {
		          System.out.println(geturls+"---->"+"The link is not broken");
		       }
		      
		       
           }catch(Exception e) {
			
		   }
		   }
		System.out.println("The number of link is:"+ nosoflinks);
		Thread.sleep(5000);
		driver.close();
	}
}
		

