package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToWebpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver =new FirefoxDriver();
		//driver.get("https://www.01bytesoft.com/");
		driver.navigate().to("https://www.01bytesoft.com/");
		//get("url")-To load url and navigate()-To move forward and backward and refresh and navigate().to("url")-To launch url
		driver.close();

	}

}
