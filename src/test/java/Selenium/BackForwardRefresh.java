package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("http://www.01bytesoft.com/");
      driver.manage().window().maximize();//maximize the page
      driver.navigate().to("http://www.Amazon.com/");
      driver.navigate().refresh();
      driver.navigate().forward();
      driver.navigate().back();
      driver.manage().window().minimize();//minimize the page
      driver.close();
	}

}
