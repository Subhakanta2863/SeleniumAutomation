package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bootStrapdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.jquery-az.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle text-white']")).click();
		//select single dropdown
//		WebElement drop=driver.findElement(By.xpath("//a[text()='Python']"));
//		drop.click();
//		System.out.println(drop.getText());
		//select single and getall options //*[@id="navbarCollapse"]/div[1]/div[1]/a
		List<WebElement> options=driver.findElements(By.xpath(" //a[normalize-space()='Programming']"));
	    for(WebElement opt:options)
	    {
	    	System.out.println(opt.getText());
	    
	     	System.out.println(opt.getSize());
	     	
	    }
		Thread.sleep(5000);
		driver.close();

	}

}
