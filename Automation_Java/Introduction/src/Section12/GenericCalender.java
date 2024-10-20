package Section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		
		
		// create browser object
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
	// select 23 Aug
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("april"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}
		Thread.sleep(5000);
		
		List <WebElement> dates=driver.findElements(By.className("day"));
		
		// grab a common attributes and put it into a list and iterate i.e check
		
		int count =driver.findElements(By.className("day")).size();
		for (int i = 0; i <count; i++) 
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("25"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
}}
