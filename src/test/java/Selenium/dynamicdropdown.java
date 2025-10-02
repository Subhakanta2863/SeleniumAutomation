package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/?zx=1758822013731&no_sw_cr=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("PlayWright");
		List<WebElement> lists=driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		System.out.println(lists.size());
//		for(WebElement list:lists)
//		{
//			System.out.println(list.getText());
//		}
		for(int i=0;i<lists.size();i++)
		{
			System.out.println(lists.get(i).getText());
			if(lists.get(i).getText().equals("playwright mcp"))
			{
				lists.get(i).click();
				
				break;
				
				
			}
		
		}
		Thread.sleep(5000);
		driver.close();
	}

}
