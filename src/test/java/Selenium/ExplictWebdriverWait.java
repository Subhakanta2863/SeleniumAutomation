package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWebdriverWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));//Declaration of Explicit wait 
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		WebElement txtusername=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));//Use of explict wait using webdriverWait class object .until() method with ExpectedConditions.Functionwith locator
		txtusername.sendKeys("Admin");
		WebElement password=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		WebElement btn=myWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
		btn.click();
		Thread.sleep(5000);
		driver.close();

	}

}
