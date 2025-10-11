package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActionsrightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(" //span[@class=\"context-menu-one btn btn-neutral\"]"));
		act.contextClick(ele).build().perform();//performing right click actions by using contextClick() method
		driver.findElement(By.xpath("//span[normalize-space()=\"Quit\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
		
	}

}
