package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ssltestinginselenium {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.setAcceptInsecureCerts(true);//accept ssl certificate by setAcceptInsecureCerts(true)
		WebDriver driver =new ChromeDriver(options);
		driver.navigate().to("https://expired.badssl.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();

	}

}
