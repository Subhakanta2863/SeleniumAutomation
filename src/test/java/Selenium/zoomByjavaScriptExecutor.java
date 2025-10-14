package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomByjavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver =new ChromeDriver();
	    driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("document.body.style.zoom='89%'");
	    Thread.sleep(5000);
	    driver.close();
	    		
	}

}
