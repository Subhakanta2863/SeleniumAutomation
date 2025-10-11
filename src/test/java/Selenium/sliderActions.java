package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions act = new Actions(driver);//Actions class
		WebElement min_Slider=driver.findElement(By.xpath(" //span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("The slider position is:"+min_Slider.getLocation());//get the  location of slider by using getLoction();
		System.out.println("The slider position is:"+min_Slider.getLocation().getX());//get the location of x-co-ordinates
		System.out.println("The slider position is:"+min_Slider.getLocation().getY());//get the location of y-co-ordinate
		act.dragAndDropBy(min_Slider, 100, 256).perform();//perform slide using dragAndDropBy() method
		System.out.println("the current slider position is:"+min_Slider.getLocation());
		Thread.sleep(5000);
		//WebElement mid_Slider=driver.findElement(By.xpath(" //span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		act.dragAndDropBy(min_Slider, -100, 256);
		System.out.println("the current slider position is:"+min_Slider.getLocation());
		Thread.sleep(5000);
		WebElement max_Slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("The slider position is:"+max_Slider.getLocation());//get the  location of slider by using getLoction();
		System.out.println("The slider position is:"+max_Slider.getLocation().getX());//get the location of x-co-ordinates
		System.out.println("The slider position is:"+max_Slider.getLocation().getY());//get the location of y-co-ordinate
		act.dragAndDropBy(max_Slider, 59, 56).perform();//perform slide using dragAndDropBy() method
		System.out.println("the current slider position is:"+max_Slider.getLocation());
		Thread.sleep(5000);
		driver.close();
		
	}

}
