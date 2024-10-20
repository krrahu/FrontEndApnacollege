package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.PageFactory_ProjectcodeHomePage;
import ObjectRepository.ProjectcodeHomePage;
import ObjectRepository.ProjectcodeLoginPage;

public class LoginFeature 
{

		@Test
		public void login() 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
			
			
			// create browser object
			WebDriver driver = new ChromeDriver();
	//		WebDriver driver = new FirefoxDriver();
			
	
			driver.get("https://www.codeproject.com/"); 
			// =======Below  test case will by following normal  class without page factory =========//
			ProjectcodeLoginPage pil= new ProjectcodeLoginPage(driver);
			pil.clickSignIn().click();
			pil.email().sendKeys("rahul.baliyase46@gmail.com");
			pil.password().sendKeys("U11et030@15");
			pil.submit().click();
			
			// =======Below  test case will by following normal  class without page factory =========//
			//ProjectcodeHomePage pig=new ProjectcodeHomePage(driver);
			//pig.keyword().sendKeys("testing");
			//pig.search().click();
			//pig.Againsearch().click();
			
			// =======Below  test case will by  following for Page factory  class===========//
			
			PageFactory_ProjectcodeHomePage pg=new PageFactory_ProjectcodeHomePage(driver);
			pg.keyword().sendKeys("testing");
			pg.search().click();
			pg.Againsearch().click();
			
			
			
		}
		
		

	}


