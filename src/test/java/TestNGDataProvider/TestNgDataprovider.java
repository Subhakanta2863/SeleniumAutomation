package TestNGDataProvider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataprovider {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="loginSetData")
	void login(String name, String pass) throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		boolean logo=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if(logo==true) {
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//li"));
			for(int i=0; i<ele.size();i++) {
				if(ele.get(i).getText().equals("Logout")){
				 ele.get(i).click();
				 Assert.assertTrue(true);
				 Thread.sleep(5000);
				}
			}
		}
		else {
			Assert.fail();
		}
			
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	@DataProvider(name="loginSetData", indices= {0,2})
    Object[][] logindata() {
    	
    	Object [] [] data= {{"subha20@gmail.com","Subha@2863"},
                            {"sp000198@gmail.com","madha@287655"},
                            {"Admin","admin123"},
                            {"SP@gmail.com","Subha@5358"}};
    	
    	return data;
	  
  }
}
