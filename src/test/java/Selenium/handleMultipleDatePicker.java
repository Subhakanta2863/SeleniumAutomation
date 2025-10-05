package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMultipleDatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
	}

}
