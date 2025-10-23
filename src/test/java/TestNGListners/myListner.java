package TestNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListner implements ITestListener {
	
	 public void onStart(ITestContext context) {
		 
		   System.out.println("This is onStart method and it will execute once before starting of all test");
		   
	  }

	  public  void onTestStart(ITestResult result) {
		  
		  System.out.println("This is onTestStart method and it will execute multiple times before starting of all test");
		  
		  }
	  
	  public  void onTestSuccess(ITestResult result) {
		  
		  System.out.println("This is onTestSucess method and it will execute whenever my test will pass");
		  
		  }
	  
	  public void onTestFailure(ITestResult result) {
		  
		  System.out.println("This is onTestfailure method and it will execute whenever my test will fail");
		  
	  }
	  
	  public void onTestSkipped(ITestResult result) {
		  
		  System.out.println("This is onTestSkipped method and it will execute whenever my test will skip");
		  
		  }
	  
	 
	  
	  public void onFinish(ITestContext context) {
		   
		  System.out.println("This is onTestSucess method and it will execute whenever my test will pass");
		  
		  }
	  
	
}
