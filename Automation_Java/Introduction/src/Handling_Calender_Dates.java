import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_Calender_Dates {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		
		
		// create browser object
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com");
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		 
		//traveling from parent to child i.e parent child relationship X-path
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	// select round trip radio button
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
{
	System.out.println("its's disabled"); // in case of one way trip
	Assert.assertTrue(true);
	
}
else
{
	Assert.assertTrue(false);
}


//driver.findElement(By.xpath("//input[name='ctl00$mainContent$rbtnl_Trip']")).click();
		

}}
