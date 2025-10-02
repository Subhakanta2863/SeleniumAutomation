package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlealerorpopupwithoutswitchmethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" //button[normalize-space()='Click for JS Confirm']")).click();
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());//WeBDriverWait with alertcondition
		System.out.println(myalert.getText());
		myalert.accept();
		Thread.sleep(4000);
		driver.close();

	}

}
