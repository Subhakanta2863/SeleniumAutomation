package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMWithoutPageFactory {

	WebDriver driver;
	
	//constructor
	POMWithoutPageFactory(WebDriver driver)
	{
		this.driver=driver;//storing local variable data in global webdriver variable
	}
	
	//Capture Locators
	
	By user_Txt=By.xpath("//input[@placeholder='Username']");
	By pass_Txt=By.xpath("//input[@placeholder='Password']");
	By btn=By.xpath("//button[normalize-space()='Login']");
	
	//Create Action method for each locators
	
	public void username(String user) {
		driver.findElement(user_Txt).sendKeys(user);
	}
	public void password(String pass) {
		driver.findElement(pass_Txt).sendKeys(pass);
	}
	public void lnbtn() {
		driver.findElement(btn).click();
	}
}

