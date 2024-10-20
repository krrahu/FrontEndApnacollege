package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
	public WebDriver driver;
	By signin=By.xpath("//div/nav/ul/li[4]/a/span");
	By title=By.xpath("//section[1]/div/div");
	By navbar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	// creating constructor just to use  driver argument or parameter in other class just to avoid null pointer exception
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getloginpage()
	{
		return driver.findElement(signin);
		}
	public WebElement getTitle()
	{
		return driver.findElement(title);
		}
	public WebElement getNavBar()
	{
		return driver.findElement(navbar);
		}


}
