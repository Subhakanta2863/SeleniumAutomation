


package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytext {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        // xpath with inner text having link text
        // driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']")).click();
        // driver.findElement(By.xpath("//span[.='Mobiles & Tablets']")).click();
        
        // xpath with inner text not having link text
        boolean displayedStatus = driver.findElement(By.xpath("//div[text()='Top Deals']")).isDisplayed();
        System.out.println(displayedStatus);
        
        String text = driver.findElement(By.xpath("//div[text()='Top Deals']")).getText();
        System.out.println( text);
        
        Thread.sleep(5000);
        driver.close();
    }
}

