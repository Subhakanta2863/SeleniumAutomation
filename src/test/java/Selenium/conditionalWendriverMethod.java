package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalWendriverMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//IsDisplaed() method will return boolean value
		WebElement logo=driver.findElement(By.xpath("//img[@title='01 Bytesoft']"));
		System.out.println("The logo is:"+logo.isDisplayed());
		boolean img =driver.findElement(By.xpath("(//img[@fetchpriority='high'])[1]")).isDisplayed();//group index xpath
		System.out.println("The img is:"+img);
		//IsEnabled() method will return boolean value
		WebElement input=driver.findElement(By.xpath("//div[@class='get-in-touch-form']//input[@placeholder='Email ID']"));
		System.out.println("The input is:"+input.isEnabled());
		boolean input1 =driver.findElement(By.xpath("//textarea[@placeholder='Your Message']")).isEnabled();
		System.out.println("The input1 is:"+input1);
		//IsSelected() method will return boolean value
		WebElement chbox=driver.findElement(By.xpath("//div[@class='get-in-touch-form']//input[@placeholder='Email ID']"));
		System.out.println("The chbox is:"+chbox.isSelected());
		boolean chbox1 =driver.findElement(By.xpath("//textarea[@placeholder='Your Message']")).isSelected();
		System.out.println("The chobx1 is:"+chbox1);
		Thread.sleep(5000);
		driver.close();
		

	}

}
