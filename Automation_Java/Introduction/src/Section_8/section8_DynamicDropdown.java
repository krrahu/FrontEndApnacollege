package Section_8;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class section8_DynamicDropdown {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		
			
			
			// create browser object
			WebDriver driver = new ChromeDriver();
	
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//			
//			driver.findElement(By.xpath("//a[@value='BLR']")).click();
//			Thread.sleep(2000);
//			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();  
//
//			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//			
			
			//traveling from parent to child i.e parent child relationship X-path
			//--->  //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']
			//--->  //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
			
			
			
			// Auto Suggestive drop down
//			driver.findElement(By.id("autosuggest")).sendKeys("ind");
//			List <WebElement> Alloptions= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//			System.out.println("All potions");
//			Thread.sleep(3000);
//			for (WebElement option:Alloptions) 
//			{
//				if (option.getText().equalsIgnoreCase("India"))
//				//	System.out.println(" text value of all options");
//				{
//				
//					option.click();
//					System.out.println("India selected");
//					break;
//				}
//				
//			}
			
			
			// handling the check boxes and getting the size
			// * user for pratial value 
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
		// count of no of check boxes
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			//System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
			
		// calender 	handling
			
			
	}

}
