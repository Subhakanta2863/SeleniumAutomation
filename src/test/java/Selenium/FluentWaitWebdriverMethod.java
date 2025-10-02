package Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitWebdriverMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Wait<WebDriver> myWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5)).
				ignoring(NoSuchElementException.class);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    WebElement txtusername=myWait.until(WebDriver -> driver.findElement(By.xpath("//input[@placeholder='Username']")));
	    txtusername.sendKeys("Admin");
	    WebElement password=myWait.until(WebDriver ->driver.findElement(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		WebElement btn=myWait.until(WebDriver ->driver.findElement(By.cssSelector("button[type='submit']")));
		btn.click();
		Thread.sleep(5000);
	    driver.close();
	}   

}
