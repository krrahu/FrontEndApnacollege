package rahulshettyacademy.ExtendReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.aventstack.ExtendReports.reporter.ExtentSparkReporter
public class ExtendReportsDemo 
{
	@BeforeTest
	public void config()
	{
		//ExtentReports,ExtentSparkReporter
		// here user.dir means --> C:\Automation_Java\ExtendReports and inside it it will create a folder name as reports  
		String path = System.getProperty("user.dir")+"\\reports\\index.html"; //
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
	
	
		
	}
	
	
	
	@Test
	public void Reports()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void Android()
	{
		//System.out.println(" Appium is used only mobile Application automation");
	}

}
