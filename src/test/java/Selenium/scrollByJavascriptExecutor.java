package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollByJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver =new ChromeDriver();
	    driver.navigate().to("https://www.worldometers.info/geography/flags-of-the-world/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    //Scroll by value
//	    js.executeScript("window.scrollBy(0,1500)");
//	    System.out.println("The Scroll value is:"+js.executeScript("return window.pageYoffset"));
	    //Scroll to specific element
//	    WebElement ele=driver.findElement(By.xpath(" //body//div//div[79]"));
//	    js.executeScript("arguments[0].scrollIntoView()",ele);
//	    js.executeScript("return window.pageYoffset");
//	    js.executeScript("arguments[0].clcik()",ele);
	    //Scroll to the end of the window
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println("The Scroll value is:"+js.executeScript("return window.pageYoffse"));
	    Thread.sleep(5000);
	    driver.close();
	    		

	}

}
