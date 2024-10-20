package Academy.E2E_Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resource.base;
import pageObjects.LandingPage;

public class ValidateNavigation extends base
{
	public WebDriver driver; // creating a local when we run the test case for parallel execution
	private static Logger logs=LogManager.getLogger(ValidateTitles.class.getName());
	@BeforeTest
	public void Openbrowser() throws IOException
	{
		driver=initializeDriver();
		//driver.get(prop.getProperty("URL"));
		driver.get("http://qaclickacademy.com/");
	}
	
	@Test 
	public void basePageNavigation() throws IOException
	{
	
		// two ways we access the methods of other --1. by inheritance 2. creating object of that class
		LandingPage lp=new LandingPage(driver);
		//lp.getNavBar().isDisplayed();
	System.out.println("navbar");
		Assert.assertTrue(lp.getNavBar().isDisplayed());
		
		logs.info("nav bar valiadtion ");
	}
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
}
