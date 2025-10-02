package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class locstorbyClassName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.01bytesoft.com/");
		driver.manage().window().maximize();
		//WebElement csname=driver.findElement(By.className("entry-content"));//FindElement webelement using className locator so the return type is single element 
		WebElement csname=driver.findElement(By.className("ent-content"));//FindElement webelement using className locator but locator not matching with webelement so the return type is NosuchElementException
		csname.click();//Perform click operation
		System.out.println(csname);
		driver.close();
		
	}

}
