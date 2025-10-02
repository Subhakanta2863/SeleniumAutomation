package Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locatorbylinktext {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    //WebElement link=driver.findElement(By.linkText("Home"));//FindElement webelement using linktext locator so the return type is single element 
		WebElement link=driver.findElement(By.linkText("Homes"));//FindElement webelement using linktext locator but locator not matching with webelement so the return type is NosuchElementException
        link.click();
        System.out.println(link);
	    driver.close();

	}

}
