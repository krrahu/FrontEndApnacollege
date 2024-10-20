package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectcodeHomePage 
{
	WebDriver driver;
	public ProjectcodeHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By searchtopic=By.xpath("//input[@class='search subdue']");
	By clickok=By.xpath("//input[@src='https://codeproject.freetls.fastly.net/images/search.gif']");
	By clickonsearch=By.cssSelector("[id='ctl00_MC_Results_ctl00_DocTitle']");
	
public WebElement keyword()
{
	return driver.findElement(searchtopic);
}
public WebElement search()
{
	return driver.findElement(clickok);
}

public WebElement Againsearch()
{
	return driver.findElement(clickonsearch);
}





}
