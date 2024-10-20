package Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 
{

	// global variable
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties(); 
// it will pull the values from data.properties file but this file do not have knoledge about where file is kept we use load method  i.e p.load()//
		//FileInputStream fis= new FileInputStream("C:\\Automation_Java\\E2EProject_Framework\\src\\main\\java\\Academy\\E2E_Framework\\data.properties");
		FileInputStream fis= new FileInputStream("C:\\Automation_Java\\E2EProject_Framework\\src\\main\\java\\Resource\\data.properties");
		
		prop.load(fis);
	String browserName=	prop.getProperty("browser");
	if (browserName.equalsIgnoreCase("chrome"))
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
 driver = new ChromeDriver();


	}
	else if (browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
driver = new FirefoxDriver();
	}
	else if (browserName.equalsIgnoreCase("IE"))
	{
	// code for IE
		
	}
	else 
	{
	System.out.println("selected browser is not in scope");	
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	public String getscreenshot(String TestCaseName,WebDriver driver) throws IOException 
	{
TakesScreenshot ts= (TakesScreenshot) driver;
File source=ts.getScreenshotAs(OutputType.FILE);
String destfile=System.getProperty("user.dir")+"\\screenshots\\"+TestCaseName+".png";
FileUtils.copyFile(source,new File(destfile));
return destfile;
		
	}

}
