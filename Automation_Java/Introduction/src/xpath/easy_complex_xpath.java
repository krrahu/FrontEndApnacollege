package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class easy_complex_xpath {


		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.rediff.com/");
			driver.findElement(By.xpath("//a[@class='signin']")).click();
			driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
			

	}

}
 