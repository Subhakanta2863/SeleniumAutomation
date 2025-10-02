package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getPageSourceInselenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.01bytesoft.com/");
		driver.manage().window().maximize();
		String str=driver.getPageSource();
		System.out.println(str);
		driver.close();

	}

}
