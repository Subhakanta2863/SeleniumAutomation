package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class getpositionofthebrowser {

	public static void main(String[] args) {
		
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("http://www.Amazon.com/");
      driver.manage().window().maximize();
     
      Point p =new Point(30,150);
      driver.manage().window().setPosition(p);
      System.out.println(driver.manage().window().getPosition().getX());
      System.out.println(driver.manage().window().getPosition().getY());
      
      driver.close();
      
      
	}

}
