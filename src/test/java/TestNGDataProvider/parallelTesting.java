package TestNGDataProvider;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTesting {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String browser, String url) throws InterruptedException {
		
		switch(browser.toLowerCase()) {
		case "chrome": driver=new ChromeDriver();
		break;
		case "edge": driver=new EdgeDriver();
		break;
		case "firefox": driver=new FirefoxDriver();
		break;
		default:
			System.out.println("Invalid browser");
			return;
		}
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test(priority=1)
	void testlogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	@Test(priority=2,dataProvider="logindata")
	void testlogin(String user, String pass) throws InterruptedException {
		driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(true);
	}
	@Test(priority=3)
	void logout() throws InterruptedException {
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
	
	@AfterClass()
	void tearDown() {
		driver.quit();
	}
	@DataProvider(name="logindata",indices={2})
	Object[] [] loginData(){
		Object[] [] data= {{"subha20@gmail.com","Subha@2863"},
                           {"sp000198@gmail.com","madha@287655"},
                           {"Admin","admin123"},
                           {"SP@gmail.com","Subha@5358"}};
		
		return data;
	}
	
	
}
