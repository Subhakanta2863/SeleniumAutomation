package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//xpath with contains means we use partial name instead of completename for dynamic content we use contains() method xpath
		//driver.findElement(By.xpath("//input[\"contains(@placeholder,'sea')\"]")).sendKeys("Mobiles");
		//xpath with starts-with means we use partial name instead of complete name for dynamic content we use starts-with() method xpath
		driver.findElement(By.xpath("//input[\"starts-with(@placeholder,'sea')\"]")).sendKeys("Mobiles");
		String str=driver.findElement(By.xpath("//input[\"contains(@placeholder,'sea')\"]")).getTagName();
		System.out.println(str);
		Thread.sleep(5000);
		driver.close();
		

	}

}
