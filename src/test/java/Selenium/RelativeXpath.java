package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement img=driver.findElement(By.xpath("//img[@class='attachment-large size-large']"));
		//Relative x-path using attribute name and attribute value
		System.out.println(img);
		Thread.sleep(5000);
		driver.close();
		

	}

}
