import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		// setting the path for driver
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
		
		
		// create browser object
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
	//driver.get("https://timetracker.ctepl.com/actitime/login.do");
		driver.get("https://www.amazon.in/"); 
		// move the mouse and tap on Account and Lists 
		
		
		// click on Sign in [ if we have move the mouse to sign in button and then click --> how to handle]
		
				
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span[1]")).click();
		
		
		// Enter Email or mobile phone number
		//*[@id="ap_email"]
	
		//driver.findElement(By.id("ap_email")).sendKeys("rahul.baliyase46@gmail.com");
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("rahul.baliyase46@gmail.com");
		
		// click on continue
		driver.findElement(By.id("continue")).click();
		
		// Enter the password and
		driver.findElement(By.id("ap_password")).sendKeys("U11et030@15");
		//  click on login button
		driver.findElement(By.id("signInSubmit")).click();
		
		// approved link is sent on message aprroved it  [ how to handle this type of code] 
		
		
		// sign out [ need to handle drop down for sign out --. how to do?]
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[2]/a[13]/span")).click();
		
		
		// close the browser
		
	driver.quit();
		
	

	
	}}


