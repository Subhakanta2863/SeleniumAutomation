package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationWebdriverMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getTitle();
		System.out.println("The title is:"+title);
		driver.navigate().back();
		driver.navigate().refresh();
		String title1=driver.getTitle();
		System.out.println("The title1 is:"+title1);
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
