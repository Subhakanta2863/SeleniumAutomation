package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AleartsorPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
     	//Normal alert with ok button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		Alert myalert=driver.switchTo().alert();//switch to alert/popup
//		System.out.println(myalert.getText());//print the text of popup/alert
//		myalert.accept();//accept/click ok the alert/popup 
		//Confirmation Alert/popup
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		Alert myalert=driver.switchTo().alert();//switch to alert/popup
//		System.out.println(myalert.getText());//print the text of popup/alert
//		myalert.dismiss();//dismiss the popup/alert or cancel the alert/popup
		//input alret with ok with cancel button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();//switch to alert/popup
		System.out.println(myalert.getText());//print the text of popup/alert
		myalert.sendKeys("Welcome");//input data  in popup/alert input field
		//myalert.dismiss();//dismiss the popup/alert or cancel the alert/popup
		myalert.accept();//accept/click ok the alert/popup 
		Thread.sleep(5000);
		driver.close();

	}

}
