package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http:/flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("All cookies are deleted");
		driver.close();		

	}

}
