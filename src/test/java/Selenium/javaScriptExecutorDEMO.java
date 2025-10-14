package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorDEMO {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver =new ChromeDriver();
    driver.navigate().to("https://testautomationpractice.blogspot.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    WebElement ele=driver.findElement(By.xpath(" //input[@id=\"name\"]"));
    WebElement ele2=driver.findElement(By.xpath("//input[@id=\"email\"]"));
    WebElement btn=driver.findElement(By.xpath(" //button[normalize-space()=\"START\"]"));
    JavascriptExecutor js =(JavascriptExecutor)driver;//upTypecasting as storing child parent value in a child class
    js.executeScript("arguments[0].setAttribute('value','Subhakanta')",ele);//passing values using excuteScript()method
    js.executeScript("arguments[0].setAttribute('value','subhakantapattanaik20@gmail.com')",ele2);
    js.executeScript("arguments[0].click()",btn);
    Thread.sleep(5000);
    driver.close();
    		
	}

}
