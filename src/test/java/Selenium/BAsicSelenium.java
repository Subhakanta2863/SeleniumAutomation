package Selenium;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BAsicSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.01bytesoft.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		String title1=driver.getTitle();
		System.out.println("The title1 is:"+" "+title1);
		String page1=driver.getPageSource();
		//System.out.println("The page2 is:"+" "+page1);
		String Url1=driver.getCurrentUrl();
		System.out.println("The Url2 is:"+" "+Url1);
		driver.navigate().refresh();
		driver.navigate().to("http://flipkart.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.navigate().back();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		String title2=driver.getTitle();
		System.out.println("The title2 is:"+" "+title2);
		String page2=driver.getPageSource();
		//System.out.println("The page2 is:"+" "+page2);
		String Url2=driver.getCurrentUrl();
		System.out.println("The Url2 is:"+" "+Url2);
		Dimension d=new Dimension(15,300);
		driver.manage().window().setSize(d);
		System.out.println("The browser size is:"+" "+driver.manage().window().getSize());
		Point p=new Point(50,150);
		driver.manage().window().setPosition(p);
		System.out.println("The browser position is:"+" "+driver.manage().window().getPosition());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		//driver.quit();
	
		
	}

}
 