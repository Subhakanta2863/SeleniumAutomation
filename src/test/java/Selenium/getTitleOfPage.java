package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleOfPage {

	public static void main(String[] args) {
		
 WebDriver driver=new ChromeDriver();
 driver.navigate().to("http://www.01bytesoft.com/");
 driver.manage().window().maximize();
 String title=driver.getTitle();
 if(title.equals("01 Bytesoft"))
	 System.out.println("Test Passed");
 else
 {
	System.out.println("Test Failed");
 }
 //System.out.println(title);
 driver.close();
 
 }

}
