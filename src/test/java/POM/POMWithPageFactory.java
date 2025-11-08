package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMWithPageFactory {

	WebDriver driver;
	
	//Constructor
	POMWithPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		//Locators
	}

     @FindBy(xpath="//input[@placeholder='Username']")
     WebElement username;
     @FindBy(xpath="//input[@placeholder='Password']")
     WebElement password;
     @FindBy(xpath="//button[normalize-space()='Login']")
     WebElement btn;
     @FindBy(tagName="a")
     List<WebElement> links;
     
     //Action Method
     public void setUserName(String user) {
    	 username.sendKeys(user);
     }
     public void setPassword(String pass) {
    	 password.sendKeys(pass);
     }
     public void lnbtn() {
    	 btn.click();
     }
     public void taglinks() {
    	 for(int i=0; i<links.size();i++) {
    		 System.out.println(links.get(i).getTagName());
    		 System.out.println(links.get(i).getText());
    	 }
     }
}
