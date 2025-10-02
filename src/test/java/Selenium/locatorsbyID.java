package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locatorsbyID {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().window().maximize();
		//WebElement idname=driver.findElement(By.id("post-9));//FindElement webelement using Id locator so the return type is single element 
		WebElement idname=driver.findElement(By.id("post-99"));//FindElement webelement using id locator but locator not matching with webelement so the return type is NosuchElementException
		System.out.println("The id is:"+idname);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		 
		

	}

}
