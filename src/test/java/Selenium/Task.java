package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String ele=driver.findElement(By.tagName("h1")).getText();
		System.out.println(ele);
		WebElement drop1=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dropdownlist=new Select(drop1);
		dropdownlist.selectByVisibleText("Boston");
		List<WebElement> options=dropdownlist.getOptions();
	    System.out.println("City From:"+options.size());
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		WebElement drop2=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select dropdown=new Select(drop2);
		dropdown.selectByIndex(4);
	    List<WebElement> options1=dropdown.getOptions();
	    System.out.println("The number of the city:"+options1.size());
	    for(int j=0;j<options1.size();j++)
	    {
	    	
	    	System.out.println(options1.get(j).getText());
	    	
	    }
	    driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	    Thread.sleep(3000);
	    int rows=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
	    System.out.println("The total number of rows is:"+rows);
	    int colms=driver.findElements(By.xpath("//table[@class='table']//th")).size();
	    System.out.println("The total number of column is:"+colms);
	    String particularrecord=driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[6]")).getText();
	    System.out.println("The Particular Record id:"+particularrecord);
	    System.out.println("Choose"+"\t"+"Flight#"+"\t"+"Airline"+"\t"+"Departs"+"\t"+"Arrives"+"\t"+"Price");
	    for(int a=1;a<rows;a++)
	    {
	    	for(int b=1;b<=colms;b++)
	    	{
	    	  String value=driver.findElement(By.xpath("//table[@class='table']//tr["+a+"]//td["+b+"]")).getText();
	    	  System.out.print(value+"\t");
	    	}
	    	System.out.println();
	    }
	    double totalprice=0;
	   
	    for(int c=2;c<rows;c++)
	    { 
	    	String price=driver.findElement(By.xpath("//table[@class='table']//tr["+c+"]//td[6]")).getText().replace("$", " ").trim();
	    	totalprice=totalprice+ Double.parseDouble(price);
	    	
	    }
	    System.out.println("The Total Price of flight is:"+totalprice);
	    
	    List<WebElement> priceElements = driver.findElements(By.xpath("//table[@class='table']//tr/td[6]"));

        double lowestPrice = Double.MIN_VALUE;
        int lowestRowIndex = -1;

        for (int i = 0; i < priceElements.size(); i++) {
            // Remove $ and convert to double
            String priceText = priceElements.get(i).getText().replace("$", "").trim();
            double price = Double.parseDouble(priceText);
            
            lowestPrice=Math.max(price, lowestPrice);
            lowestRowIndex = i + 1;
        }
            System.out.println("Lowest price found: $" + lowestPrice);
         // Click the button in the same row (assuming button is in 1st column)
        WebElement selectButton = driver.findElement(By.xpath("//table[@class='table']//tr[" + (lowestRowIndex ) + "]//input[@type='submit']")
        );
        selectButton.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Subhakanta Pattanaik");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("At-Pentha(Kulasahi),Po-Mehendhinagar,PS-patkura");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bhubaneswar");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Odisha");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("754244");
        WebElement cards=driver.findElement(By.xpath("//select[@id='cardType']"));
        Select card =new Select(cards);
        card.selectByValue("amex");
        driver.findElement(By.xpath(" //input[@id='creditCardNumber']")).sendKeys("3436486456784567898");
        driver.findElement(By.xpath(" //input[@id='nameOnCard']")).sendKeys("SUBHAKANTA PATTANAIK");
        driver.findElement(By.xpath(" //input[@id='rememberMe']")).click();
        driver.findElement(By.xpath(" //input[@value='Purchase Flight']")).click();
        boolean dis=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).isDisplayed();
        System.out.println(dis);
        String dis1=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
        System.out.println(dis1);
		Thread.sleep(5000);
		driver.close();

	} 

}
