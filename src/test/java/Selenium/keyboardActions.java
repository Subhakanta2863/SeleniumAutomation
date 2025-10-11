package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(" //textarea[@id=\"inputText1\"]"));
		ele.sendKeys("Subhakanta");
		act.keyDown(Keys.CONTROL).click(ele).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();//perform copy and select all
		Thread.sleep(5000);
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();//performn tab operation using keyboard.
		WebElement ele1=driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();//perform pate in input box
		Thread.sleep(5000);
		driver.close();

	}

}
