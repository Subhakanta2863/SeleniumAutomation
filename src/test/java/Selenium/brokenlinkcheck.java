package Selenium;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class brokenlinkcheck {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File("D:\\Eclipse\\project\\SeleniumAutomation\\Screenshot\\brlink1.png");
		sourcefile.renameTo(targetFile);
		int nosoflink=0;
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement linklists: links)
		{
			String taglink=linklists.getAttribute("href");
			if(taglink==null || taglink.isEmpty())
			{
				System.out.println("The link is not a broken");
				continue;
			}
			try {
			URL getURL=new URL(taglink);
			HttpURLConnection httpsconnects=(HttpURLConnection)getURL.openConnection();
			httpsconnects.connect();
			if(httpsconnects.getResponseCode()>=400)
			{
				System.out.println(getURL+"----->"+"Broken Link");
				nosoflink++;
			}
			else {
				System.out.println(getURL+"----->"+"Not a Broken Link");
			}
			}catch(Exception e) {
				
			}
		}
		
		System.out.println("The total number iof link is:"+nosoflink);
		Thread.sleep(5000);
		driver.close();

	}

}
