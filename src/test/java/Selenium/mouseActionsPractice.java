package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement btn=driver.findElement(By.xpath("//button[normalize-space()=\"Point Me\"]"));
		WebElement ele2=driver.findElement(By.xpath("//a[normalize-space()=\"Mobiles\"]"));
		act.moveToElement(btn).moveToElement(ele2).click().build().perform();//perform hoverover on element
		Thread.sleep(5000);
		WebElement input1=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
		input1.clear();
		input1.sendKeys("myFamily");
		WebElement input2=driver.findElement(By.xpath("//input[@id=\"field2\"]"));
		WebElement clickbtn=driver.findElement(By.xpath("//button[normalize-space()=\"Copy Text\"]"));
		act.doubleClick(clickbtn).build().perform();//perform doubleClick()method
		String text=input2.getAttribute("value");//get attribute value and store into a variable 
		if(text.equals("myFamily"))
		{
			System.out.println("The value is:"+text);
			
		}
		else {
			System.out.println("invalid Value");
		}
		Thread.sleep(5000);
		WebElement d1=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement d2=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		act.dragAndDrop(d1, d2).build().perform();//perform dragAndDrop() method
		Thread.sleep(5000);
		driver.close();

	}

}
