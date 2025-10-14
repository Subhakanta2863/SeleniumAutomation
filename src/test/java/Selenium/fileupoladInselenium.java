package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupoladInselenium {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver =new ChromeDriver();
	    driver.navigate().to("https://davidwalsh.name/demo/multiple-file-upload.php");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
//	    //upload single file
//	    
//	    driver.findElement(By.xpath(" //input[@id=\"filesToUpload\"]")).sendKeys("C:\\Users\\subha\\Downloads");
//	    if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("age.txt"))
//	    {
//	    	System.out.println("the file uploaded successfully");
//	    }
//	    else {
//	    	System.out.println("the file uploaded not successfully");
//	    }
	    //Multiple file upload
	    String file1="C:\\Users\\subha\\Downloads";
	    String file2="C:\\Users\\subha\\Downloads";
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	    if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("age")&&(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("name")))
	    		{
	    	 System.out.println("the file uploaded successfully");
         }
	    else {
	 	    	System.out.println("the file uploaded not successfully");
 	    	}
	    Thread.sleep(15000);
	    driver.close();
	}

}
