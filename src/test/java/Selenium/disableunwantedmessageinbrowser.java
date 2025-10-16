package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disableunwantedmessageinbrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
		WebDriver driver =new ChromeDriver(options);
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}

}
