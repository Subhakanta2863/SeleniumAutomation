package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
     WebDriver driver=new ChromeDriver();
     driver.navigate().to("https://www.01bytesoft.com/");
     driver.manage().window().maximize();
     //WebElement css=driver.findElement(By.cssSelector("nav[aria-label='Mobile Toggle']"));//css selector with tag & Attribute
     //WebElement css=driver.findElement(By.cssSelector("[aria-label='Mobile Toggle']"));//css selector with tag & Attribute
     //WebElement css=driver.findElement(By.cssSelector("#masthead"));//css selector with tag & ID
     //WebElement css=driver.findElement(By.cssSelector("header#masthead"));//css selector with tag & ID
     //WebElement css=driver.findElement(By.cssSelector("input.wp-block-search__input"));//css selector with tag & Classname
     //WebElement css=driver.findElement(By.cssSelector(".wp-block-search__input"));//css selector with tag & Classname
     //WebElement css=driver.findElement(By.cssSelector("input.wp-block-search__input[name='s']"));//css selector with tag & class and Attribute
     WebElement css=driver.findElement(By.cssSelector(".wp-block-search__input[name='s']"));//css selector with tag & class and Attribute
     //css.sendKeys("Subhakanta Pattanaik");
     //css.click();
     System.out.println(css);
     driver.close();
     
	}

}
