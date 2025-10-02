package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countlinkinwebpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("The number of tag is:"+link.size());//get the total count of tag
		for(WebElement links:link)
		{
			System.out.println("The link is:"+links.getText()+"->"+links.getAttribute("href"));
			
		}
		driver.close();

	}

}
