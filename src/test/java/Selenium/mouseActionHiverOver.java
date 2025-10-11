package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActionHiverOver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id=\"menu-item-1191\"]//a[@href=\"#\"][normalize-space()=\"Services\"]")).click();
		//Create Actions Class and pass driver
		Actions act =new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//li[@id=\"menu-item-692\"]//a[contains(text(),\"Machine Learning, and AI\")]"));
		WebElement ele2=driver.findElement(By.xpath("//li[@id=\"menu-item-690\"]//a[contains(text(),\"Cloud Adoption\")]"));
		act.moveToElement(ele2).moveToElement(ele2).click().build().perform();//mouse hoverover on element using moveToElement and always used .build ().perform() method to perform the build actions
		Thread.sleep(5000);
		driver.close();
	}

}
