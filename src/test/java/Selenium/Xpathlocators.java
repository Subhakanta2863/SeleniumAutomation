package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Xpath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobiles");
        //Xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More'][@name='q']")).sendKeys("Mobiles");
		//xpath with multiple attribute with And operator
		//driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More' and @name='q']")).sendKeys("Mobiles");
		//xpath with multiple attribute with or operator
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, nds and More' or @name='q']")).sendKeys("Mobiles");
		Thread.sleep(5000);
		driver.close();
		

	}

}
