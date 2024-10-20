package Resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtendReportsNG {
	static ExtentReports extent;
	
	public static ExtentReports getReport()
	{
		//ExtentReports,ExtentSparkReporter
		// here user.dir means --> C:\Automation_Java\ExtendReports and inside it it will create a folder name as reports  
		String path = System.getProperty("user.dir")+"\\Reports\\index.html"; //
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation results");
		
		reporter.config().setDocumentTitle("Test Results");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "rahul kumar");
		return extent;
	}
	

	
	
}
