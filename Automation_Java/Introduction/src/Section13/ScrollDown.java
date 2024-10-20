package Section13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		//js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		js.executeScript("document.querySelector('.tableFixHead').scrollBy=5000");
		System.out.println("scroll by 5000");
		//$(".tableFixHead td:nth-child(4)")
		List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

	int sum=0;
	for (int i = 0; i < values.size(); i++) 
	{
		//System.out.println(values.get(i).getText());
		// get text method will give o/p in string so we need convert it into integer
		sum = sum +Integer.parseInt(values.get(i).getText());
	}
	System.out.println(sum);
// verify output with portal
	
	int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	Assert.assertEquals(sum,total);
	
	
}}
