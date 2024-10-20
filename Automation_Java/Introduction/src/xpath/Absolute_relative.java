package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_relative 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		// implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// Explicit wait
		//WebDriverWait w= new WebDriverWait(driver, 6);


		

}}
