package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectcodeLoginPage 
{
	WebDriver driver;
	public ProjectcodeLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By signin=By.xpath("//*[@id=\'ctl00_STM\']/div/div/div[3]/span/span/a");
	By username=By.cssSelector("#ctl00_MC_MemberLogOn_CurrentEmail");
	
By Pwd=By.name("ctl00$MC$MemberLogOn$CurrentPassword");
By Go=By.id("ctl00_MC_MemberLogOn_SignInButton");

public WebElement clickSignIn()
{
	return driver.findElement(signin);
}

public WebElement email()
{
	return driver.findElement(username);
}

public WebElement password()
{
	return driver.findElement(Pwd);
}
public WebElement submit()
{
	return driver.findElement(Go);
}



}
