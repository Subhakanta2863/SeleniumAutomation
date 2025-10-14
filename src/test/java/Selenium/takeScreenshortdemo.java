package Selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshortdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Screenshot of full page
//		TakesScreenshot ts=(TakesScreenshot)driver;//TakesScreenshot interface and type casting it with child class as we are storing parent class value into child class
//		File sourceFile =ts.getScreenshotAs(OutputType.FILE);//getScreenshotAs() always return file class variable
//		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshot\\bytesoft1.png");//file location with file name with file format
//		sourceFile.renameTo(targetFile);//Storing sourceFile in targetFile location
		//Screenshot of specific are of page
		WebElement specificFile=driver.findElement(By.xpath("//img[@title=\"01 Bytesoft\"]"));
		File sourceFile =specificFile.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshot\\bytesoft2.png");
		sourceFile.renameTo(targetFile);
		Thread.sleep(5000);
		driver.close();
		

	}

}
