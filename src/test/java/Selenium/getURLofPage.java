package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class getURLofPage {
	public static void Main(String[]args)
	{
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.01bytesoft.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println("The url is:"+" "+url);
		driver.close();
		
	}

}
