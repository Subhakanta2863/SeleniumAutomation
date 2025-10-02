package Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchloginpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	try {
		driver.findElement(By.xpath(" //button[normalize-space()='Continue shopping']")).click();
		driver.findElement(By.xpath(" //span[@class='nav-line-2 ']")).click();
		driver.findElement(By.xpath(" //input[@id='ap_email_login']")).sendKeys("8328980028");
		driver.findElement(By.xpath(" //input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(" //input[@type='submit'][1]")).click();
		driver.findElement(By.xpath(" //input[@type='submit'] ")).sendKeys("Shrishti Saxena");
		driver.findElement(By.xpath(" //input[@id='ap_password']")).sendKeys("Shrishti@2002");
		driver.findElement(By.xpath(" //input[@id='continue']")).click();
	    System.out.println("Account created Successfully");
    } catch (NoSuchElementException e) {
        System.out.println("Account creation failed:" + e.getMessage());
    }
		Thread.sleep(5000);
		driver.close();
  }
	
}

