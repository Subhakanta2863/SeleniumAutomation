package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathlocatorAbsolute {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.01bytesoft.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	WebElement img=driver.findElement(By.xpath("/html/body/div[1]/div/div/main/article/div/div/div/section[5]/div/div[2]/div/div/div/img"));
	//Absolute X-path with root node and get the element  
	System.out.println(img);
	Thread.sleep(5000);
	driver.close();
	
	

	}

}
