package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


/*
 open application
 test logo
 test login
 test logout
 * */

public class OrangeHRMTest {
	WebDriver driver;
  @Test(priority=1)
  public void openapplication() {
	  driver=new ChromeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
  }
  
  @Test(priority=2)
   public void testLogo() throws InterruptedException {
	  Thread.sleep(5000);
	  boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("The logo is present:"+status);
  }
  
  
   @Test(priority=3)
   public void login() throws InterruptedException {
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	 Thread.sleep(5000);
	   
  }

   @Test(priority=4)
   public void logout() {
	   driver.close();
	   
	  
  }
}
