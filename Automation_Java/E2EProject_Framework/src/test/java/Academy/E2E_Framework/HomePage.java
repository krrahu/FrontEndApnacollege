package Academy.E2E_Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resource.base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base
{
	public WebDriver driver; // creating a local when we run the test case for parallel execution
	private static Logger logs=LogManager.getLogger(ValidateTitles.class.getName());
	
	/*@Test 
	public void basePageNavigation() throws IOException
	{
		
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com/");
		// two ways we access the methods of other --1. by inheritance 2. creating object of that class
		LandingPage lp=new LandingPage(driver);
		lp.getloginpage().click();
		LoginPage p= new LoginPage(driver);
		p.getemailid().sendKeys("wd");
		p.getPassword().sendKeys("safsf");
		p.submit().click();
		System.out.println(test);
	}*/
	
	// in case when user wants to use data provider method
	
	@Test (dataProvider="getdata")
	public void basePageNavigation(String UN,String Pwd,String text ) throws IOException
	{
		
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com/");
		// two ways we access the methods of other --1. by inheritance 2. creating object of that class
		LandingPage lp=new LandingPage(driver);
		lp.getTitle().getText();
		lp.getloginpage().click();
		
		LoginPage p= new LoginPage(driver);
		p.getemailid().sendKeys(UN);
		p.getPassword().sendKeys(Pwd);
		p.submit().click();
		//System.out.println(text);
		logs.info("used data from driver provider testNG test method ");
	}
	@DataProvider
	private Object[][] getdata() {
		// row stand for how many different data types test should run
		//coulmn stand for how many values per each test
		// Array size is 2
		//0,1
		Object[][] data= new Object[2][3]; // row size =2 , column size=3 , value will respective to index based 
		// 0 th Row
		data [0][0]="nonrestricted@test.com";
		data [0][1]="12345";
		//data [0][2]=" non restricted user";
		
		// 1 th Row
				data [1][0]="restricted@test.com";
				data [1][1]="12345";
				//data [1][2]="restricted user";
		
		return data;
		
	}
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
}
