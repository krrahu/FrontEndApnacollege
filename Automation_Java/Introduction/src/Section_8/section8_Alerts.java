package Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class section8_Alerts {
	public static void main(String[] args) throws InterruptedException {
		String value = "test";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		// create browser object
		WebDriver driver = new ChromeDriver();
// open the browser
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(value);
		// driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}
}
