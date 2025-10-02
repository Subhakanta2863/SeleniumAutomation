package Selenium;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getCurrentURL {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("http://Amazon.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().deleteAllCookies();
		String url=driver.getCurrentUrl();
		System.out.println("The url is:"+" "+url);
		
	    driver.close();
		

	}

}
