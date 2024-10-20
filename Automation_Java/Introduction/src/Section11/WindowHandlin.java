package Section11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set <String> windows=driver.getWindowHandles(); // store of values parent, child, sub child index based
		Iterator<String> it=windows.iterator();
		String first=it.next();
		String second=it.next();
		driver.switchTo().window(second);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(first);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
}}
