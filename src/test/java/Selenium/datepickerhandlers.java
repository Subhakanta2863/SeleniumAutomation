package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerhandlers {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.close();

	}

}
