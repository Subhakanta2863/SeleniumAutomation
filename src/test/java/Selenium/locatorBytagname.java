package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;

public class locatorBytagname {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().window().maximize();
		//WebElement tagname=driver.findElement(By.tagName("a"));//FindElement webelement using TagName locator so the return type is single element //Perform click operation
		//WebElement tagname=driver.findElement(By.tagName("abc"));//FindElement webelement using TagName locator but locator not matching with webelement so the return type is NosuchElementException
		//List<WebElement> tagname=driver.findElements(By.tagName("a"));//FindElements Webelement using Tagname locator so the return type is multiple element list<WebElement>
		List<WebElement> tagname=driver.findElements(By.tagName("r"));////Find listWebelement using partiallinktext locator so the return type is null list<WebElement>
		int count=tagname.size();//Size() method return numbers of values
		System.out.println(tagname);
		System.out.println(count);
		driver.close();

	}

}
