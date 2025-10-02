package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesoriframes {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.navigate().to("https://ui.vision/demo/webtest/frames/");    
    driver.manage().window().maximize();
    //Switch to frame 1
    WebElement Frame1=driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));//frame always return webElement value
    driver.switchTo().frame(Frame1);//pass frame as webElement
    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
    driver.switchTo().defaultContent();//return back to main page
    //Switch to Frame 2
    WebElement Frame2=driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
    driver.switchTo().frame(Frame2);
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("I am Subhakanta Pattanaik");
    driver.switchTo().defaultContent();
    //Switch to frame 3
    WebElement Frame3=driver.findElement(By.xpath(" //frame[@src='frame_3.html']"));
    driver.switchTo().frame(Frame3);
    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Subhakanta Pattanaik");
    driver.switchTo().frame(0);
    driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
    List<WebElement> chbox=driver.findElements(By.xpath("//div[@class='ulDsOb']//span[@class='aDTYNe snByac n5vBHf OIC90c']"));
    for(int i=1;i<=chbox.size();i++)
    {
    	chbox.get(i).click();
    }
   
    driver.switchTo().defaultContent();
    Thread.sleep(5000);
    //witch to frame 4
    WebElement frame4=driver.findElement(By.xpath("/html/frameset/frame[2]]"));
    driver.switchTo().frame(frame4);
    driver.findElement(By.xpath("//input[@name='mytext5'")).sendKeys("From Odisha");
    driver.switchTo().frame(0);
    driver.findElement(By.xpath(" //a[normalize-space()='https://a9t9.com']")).click();
    Thread.sleep(5000);
    driver.close();
    
	}

}
