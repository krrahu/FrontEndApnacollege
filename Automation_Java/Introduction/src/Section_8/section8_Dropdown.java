package Section_8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class section8_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
	//System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
	
	
	// create browser object
	WebDriver driver = new ChromeDriver();
	//WebDriver FFdriver = new FirefoxDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
//	// drop with select tag --> static drop down
//	WebElement StaticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//	Select  Dropdown= new Select(StaticDropdown);
//	Dropdown.selectByIndex(3);
//	System.out.println(Dropdown.getFirstSelectedOption().getText());
//	//System.out.println(Dropdown.selectByVisibleText("AED"));
//	Dropdown.selectByVisibleText("AED");
//	System.out.println(Dropdown.getFirstSelectedOption().getText());
//	Dropdown.selectByValue("INR");
//	System.out.println(Dropdown.getFirstSelectedOption().getText());
	
	// passengers drop down 
	driver.findElement(By.id("divpaxinfo")).click();
	//driver.findElement(By.id("hrefIncAdt")).click();// if we write it n time then it will select n passengers so it is not good practice us loop intead of it
	//driver.findElement(By.id("hrefIncAdt")).click();
	try 
	{
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
//	int i =1;
//	while (i<6)
//	{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//	}
	Thread.sleep(2000);
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//	for loop
	for (int i = 1; i < 4; i++) 
	{
		driver.findElement(By.id("hrefIncAdt")).click();	
	}
	
	Thread.sleep(2000);
	driver.findElement(By.id("btnclosepaxoption")).click();
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	//String text =driver.findElement(By.id("divpaxinfo")).getText();
	//System.out.println(text);
	
	//driver.quit();
}}