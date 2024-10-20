package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	
	public WebDriver driver;
	By email=By.xpath("//input[@id='user_email']");
	By Pwd= By.id("user_password");
	By Login= By.xpath("//input[@type='submit']");
	
	
	// creating constructor just to use  driver argument or parameter in other class just to avoid null pointer exception
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}

	
	public WebElement getemailid()
	{
		return driver.findElement(email);
		}
	
	public WebElement getPassword()
	{
		return driver.findElement(Pwd);
		}
	public WebElement submit()
	{
		return driver.findElement(Login);
		}

	
}
