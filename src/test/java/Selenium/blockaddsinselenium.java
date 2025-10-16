package Selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class blockaddsinselenium {
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options =new ChromeOptions();
	File fs=new File("D:\\Eclipse\\project\\SeleniumAutomation\\uBlock-Chrome-Web-Store.crx");
	options.addExtensions(fs);
	WebDriver driver =new ChromeDriver(options);
	driver.navigate().to("https://text-compare.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	}
}
