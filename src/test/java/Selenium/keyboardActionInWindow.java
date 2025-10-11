package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActionInWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement reglink=driver.findElement(By.xpath(" //a[normalize-space()='Register']"));
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		//Set<String> wids=driver.getWindowHandles();//getWindow handles always return set type string data but we cannot get the index of element as set does not foillow indexing technique so we need to convert te window to list format
		//System.out.println(wids);
		List<String>mylist=new ArrayList<>(driver.getWindowHandles());//Converting set to list
		driver.switchTo().window(mylist.get(1));
		System.out.println(mylist);
		driver.findElement(By.xpath(" //input[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath(" //input[@id=\"FirstName\"]")).sendKeys("Subhakanta");
		driver.findElement(By.xpath(" //input[@id=\"LastName\"]")).sendKeys("Pattanaik");
		driver.findElement(By.xpath(" //input[@id=\"Email\"]")).sendKeys("subhakantapattanaik20@gmail.com");
		Thread.sleep(5000);
		driver.switchTo().window(mylist.get(0));
		driver.findElement(By.xpath(" //input[@id=\"small-searchterms\"]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("  //button[normalize-space()=\"Search\"]")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
	}

}
