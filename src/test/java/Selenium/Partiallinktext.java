package Selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class Partiallinktext {
	
public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    //driver.findElement(By.partialLinkText("Ho")).click();//FindElement webelement using partiallinktext locator so the return type is single element 
		//WebElement link=driver.findElement(By.partialLinkText("Hex"));//FindElement webelement using partiallinktext locator but locator not matching with webelement so the return type is NosuchElementException
		//List<WebElement> link=driver.findElements(By.partialLinkText("Ho"));//FindElements Webelement using partiallinktext locator so the return type is single element list<WebElement>
		List<WebElement> link=driver.findElements(By.partialLinkText("T-REX"));//Find listWebelement using partiallinktext locator so the return type is null list<WebElement>
		link.size();
		System.out.println(link);
		driver.close();

	}

}
