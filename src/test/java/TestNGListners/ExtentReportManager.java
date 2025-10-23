package TestNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
    
	public ExtentSparkReporter sparkreporter;//For Ui of the report
	public ExtentReports extent;//For populate common info in report
	public ExtentTest test;//created testcase entry in report
	
	public void onStart(ITestContext context) {
	    
		sparkreporter =new ExtentSparkReporter(System.getProperty("user.dir")+"\\myReports\\ExtendReport.xml");//Store the report
		sparkreporter.config().setDocumentTitle("Selenium Automation Report");
		sparkreporter.config().setReportName("Functional Testing");
		sparkreporter.config().setTheme(Theme.STANDARD);
		
		extent =new ExtentReports();
		extent.attachReporter(sparkreporter);
		extent.setSystemInfo("Computer name", "DELL Latitude");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester Name", "Subhakanta Pattanaik");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("BrowserName", "Chrome");
	  }
	
    public void onTestSuccess(ITestResult result) {
	    test=extent.createTest(result.getName());
	    test.log(Status.PASS, "The Test is Passed:"+result.getName());
	 }
    
	public void onTestFailure(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.FAIL, "The Test is failed:"+result.getName());
		 test.log(Status.FAIL,"The test case is failed:"+result.getThrowable());
	 }
	
	public void onTestSkipped(ITestResult result) {
		    test=extent.createTest(result.getName());
		    test.log(Status.SKIP,"The test is skipped:"+result.getName());
		    
      }
	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }
}
