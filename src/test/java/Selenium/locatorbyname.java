package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class locatorbyname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().window().maximize();
		//boolean namelocator=driver.findElement(By.name("robots")).isDisplayed();//FindElement webelement using name locator so the return type is single element 
		//isDisplayed() method is used to get the element is present or not and it returns true false value 
		boolean namelocator=driver.findElement(By.name("robotss")).isDisplayed();//FindElement webelement using name locator but locator not matching with webelement so the return type is NosuchElementException
		System.out.println(namelocator);
		driver.close();

	}

}
