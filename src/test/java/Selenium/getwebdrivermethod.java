package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwebdrivermethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.01bytesoft.com/");//open the url by passing the url as argument
		driver.manage().window().maximize();
		String str=driver.getCurrentUrl();
		System.out.println("The current url is:"+ str);//get the url of the page
		String page=driver.getPageSource();//get the page source of page
		System.out.println("The Page is:"+ page);
		String title=driver.getTitle();//return the title of page. evey page contains a title
		System.out.println("The title is:"+ title);
		String window=driver.getWindowHandle();//It return current window unique identifier and its a dynamic property it return a string value
		System.out.println("The Window is:"+ window);
		Set<String> wind=driver.getWindowHandles();//It return all the current window unique identifier and its a dynamic property and it return set value
		System.out.println(wind);
		Thread.sleep(5000);
		driver.close();
		

	}

}
