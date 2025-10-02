package Selenium;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizeofBrowser {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("http://www.01bytesoft.com/");
		 //driver.manage().window().getSize();
		 Dimension d= new Dimension(600,300);
         driver.manage().window().setSize(d);
         System.out.println(driver.manage().window().getSize());
         driver.close();
	}

}
