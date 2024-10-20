package Section_8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section8_EndToEnd {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		
		// create browser object
		WebDriver driver = new ChromeDriver();
// open the browser
		driver.get("https://www.spicejet.com");
	
		// tap on from drop down
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//click one one way
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	    //  select city from  drop down 
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		 
		// select to city from drop down (traveling from parent to child i.e parent child relationship X-path)
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		// selecting current date only
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("its's enabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		Thread.sleep(2000);
		
//		for loop
		for (int i = 1; i < 4; i++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		// click on serach button 
		driver.findElement(By.cssSelector("#ctl00$mainContent$btn_FindFlights")).click();
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.xpath("//input[type='submit']")).click();
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
