package Selenium;

import java.time.Duration;
import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//select[@id='country']")).click();
        //select in single element from dropdown
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
        Select drop=new Select(dropdown);//create instance of select class and pass drop down variable in i
        //drop.selectByVisibleText("India");//select drop down with selectvisibletext
        //drop.selectByValue("usa");//Select drop down with selectByValue
        //drop.selectByIndex(5);//Select drop down with selectByIndex
        //Capture option from dropdown so we use getOptions()
        List<WebElement> dlist=drop.getOptions();//To get all dropdown options we use getOptions() in dropdown for select drop down method
        for(int i=0;i<dlist.size();i++)
        {
        	System.out.println(dlist.get(i).getText());
          	System.out.println(dlist.get(i).getLocation());//get location of options
        }
        for(WebElement lists:dlist)//getoptions using enhanced for loop
        {
        	System.out.println(lists.getTagName());
        }
        Thread.sleep(5000);
        driver.close();
        
	}

}
