package Section11;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section11 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/"); 
		// Explicit wait
				WebDriverWait w= new WebDriverWait(driver, 6);
		
		
		Actions a = new Actions(driver);
		// moveing the mouse and clicjing abd entering the keywords for search 
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		//move to specific element
		a.moveToElement(driver.findElement(By.xpath("a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(5000);
		
		///move to specific element and do right click 
	//	a.moveToElement(driver.findElement(By.xpath("a[@id='nav-link-accountList']"))).contextClick().build().perform();
	//	WebElement move=driver.findElement(By.id("a[@id='nav-link-accountList']")); 
		//a.moveToElement(move).build().perform();
		
		// click on sign in 
		driver.findElement((By.cssSelector(".nav-action-inner"))).click();
	}

}
