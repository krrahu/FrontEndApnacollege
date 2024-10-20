package Section38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
WebDriver driver = new ChromeDriver();
//https://the-internet.herokuapp.com/
driver.get("https://the-internet.herokuapp.com/");
//  handling windowsAuthentication pop-up 
// driver.get("http://UN:PWD@siteURL/");
driver.get("https://admin:admin@the-internet.herokuapp.com/");
//driver.findElement(By.linkText(""));

	}

}
