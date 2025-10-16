package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessModeTesting {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();//ChromeOptions class 
		options.addArguments("--headless=new");//addArguments() for using headless execution --headless=new
		WebDriver driver =new ChromeDriver(options);//passing chromeoptions variable into webdriver
		driver.navigate().to("https://www.01bytesoft.com/");
		Thread.sleep(5000);
		driver.close();

	}

}
