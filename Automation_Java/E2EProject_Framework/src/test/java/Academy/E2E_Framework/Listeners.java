package Academy.E2E_Framework;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resource.ExtendReportsNG;
import Resource.base;

public class Listeners extends base implements  ITestListener{
// for extent reports
	// ThreadLocal is used when user wants to run test cases paralley just to over come to override issues
	ExtentTest test;
	ExtentReports extent=ExtendReportsNG.getReport();
	ThreadLocal <ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) 
	{
		ExtentTest test=extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);

	}

	public void onTestSuccess(ITestResult result) {
		//test.log(Status.PASS, "test got paased"); // for extent reports
		extentTest.get().log(Status.PASS, "test got paased");
	
	}

	public void onTestFailure(ITestResult result)
	{
		
		//test.log(Status.FAIL, "test got failed");//  for extent reports
		extentTest.get().fail(result.getThrowable());
		//test.fail(result.getThrowable()); //in reports file we can see the failure logs 
	// screenshot
		WebDriver driver =null;
		
		String testmethodname=result.getMethod().getMethodName(); // to get title of test case 
		try 
		{
		driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());	
		}
		catch (Exception e) {}
		
		try
		{
			extentTest.get().addScreenCaptureFromPath(getscreenshot(testmethodname, driver), result.getMethod().getMethodName());
			getscreenshot(testmethodname, driver);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {	 
		// TODO Auto-generated method stub
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	

}
