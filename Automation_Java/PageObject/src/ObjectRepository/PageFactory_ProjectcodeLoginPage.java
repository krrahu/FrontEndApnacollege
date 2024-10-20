package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_ProjectcodeLoginPage 
{
	WebDriver driver;
	public PageFactory_ProjectcodeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	/*
	 * By signin=By.xpath("//*[@id=\'ctl00_STM\']/div/div/div[3]/span/span/a"); By
	 * username=By.cssSelector("#ctl00_MC_MemberLogOn_CurrentEmail");
	 * 
	 * By Pwd=By.name("ctl00$MC$MemberLogOn$CurrentPassword"); By
	 * Go=By.id("ctl00_MC_MemberLogOn_SignInButton");
	 */
	
	//  
	@FindBy(xpath=".//*[@id=\'ctl00_STM\']/div/div/div[3]/span/span/a")
	WebElement signin;
	@FindBy(css="#ctl00_MC_MemberLogOn_CurrentEmail")
	WebElement username;
	@FindBy(name="ctl00$MC$MemberLogOn$CurrentPassword")
	WebElement Pwd;
	@FindBy(id="ctl00_MC_MemberLogOn_SignInButton")
	WebElement Go;

public WebElement clickSignIn()
{
	return signin;
}

public WebElement email()
{
	return username;
}

/* public WebElement email()
{
	return driver.findElement(username);
}*/
public WebElement password()
{
	return Pwd;
}
public WebElement submit()
{
	return Go;
}



}
