package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
  WebDriver driver;
 
  @BeforeClass
 void setup() {
	 driver=new ChromeDriver();
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	 
  }
  
     @Test
	 void login() throws InterruptedException {
		 //LoginPage2 lp=new LoginPage2(driver);//passing the driver instance in Pom classes am dcreayte objevct of POM class
    	 POMWithPageFactory lp=new POMWithPageFactory(driver);
	     lp.setUserName("Admin");
	     lp.setPassword("admin123");
	     lp.lnbtn();
	     lp.taglinks();
	     Thread.sleep(5000);
	     Assert.assertEquals(driver.getTitle(), "OrangeHRM");
   }
	 
	 @AfterClass
	 void tearDown() {
		 driver.quit();
	 }
	
	 
}


