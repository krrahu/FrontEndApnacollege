import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		// setting the path for driver
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Automation_Java\\Introduction\\src\\Drivers\\geckodriver.exe");
		
		
		// create browser object
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("rahul.baliyase46@gmail.com");
  driver.findElement(By.name("pass")).sendKeys("rahul123");
 // driver.findElement(By.className(""));
//driver.findElement(By.id("loginbutton")).click();
	
	driver.findElement(By.linkText("Forgotten password")).click();;
	driver.quit();
	
	}}