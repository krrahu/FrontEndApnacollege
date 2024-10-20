package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_ProjectcodeHomePage 
{
	WebDriver driver;
	public PageFactory_ProjectcodeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//  By searchtopic=By.xpath("//input[@class='search subdue']"); 
	//  By clickok=By.xpath( "//input[@src='https://codeproject.freetls.fastly.net/images/search.gif']");
	 // By clickonsearch=By.cssSelector("[id='ctl00_MC_Results_ctl00_DocTitle']");
	 
	@FindBy(xpath="//input[@class='search subdue']")
	WebElement searchtopic;
	@FindBy(xpath="//input[@src='https://codeproject.freetls.fastly.net/images/search.gif']")
	WebElement clickok;
	@FindBy(css="[id='ctl00_MC_Results_ctl00_DocTitle']")
	WebElement clickonsearch;
	
public WebElement keyword()
{
	return searchtopic;
}
public WebElement search()
{
	return clickok;
}

public WebElement Againsearch()
{
	return clickonsearch;
}





}
